package gov.dhs.nppd.humanreview.cukes;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;
import java.util.stream.Collectors;

import org.openapitools.client.model.HumanReviewItem;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gov.dhs.nppd.humanreview.serenity.ApiCaller;
import net.thucydides.core.annotations.Steps;

public class UpdateHRitem {

	private HumanReviewItem hrItem;
	@Steps
	ApiCaller apiCaller;
	private String authToken;

	@Given("^I have an existing Human Review Item with the following information:$")
	public void i_have_an_existing_Human_Review_Item_with_the_following_information(List<HumanReviewItem> hrItems)
			throws Exception {
		this.hrItem = hrItems.get(0);

		authToken = apiCaller.calls_userPut_method(System.getProperty("hr.regular.username"),
				System.getProperty("hr.regular.password"));
		List<HumanReviewItem> hrPendingItems = apiCaller.get_human_pending_list(authToken);

		List<HumanReviewItem> actualHrItems = hrPendingItems.stream()
				.filter(item -> item.getStixId().equals(hrItem.getStixId())).collect(Collectors.toList());

		actualHrItems = actualHrItems.stream().filter(item -> item.getFieldName().equals(hrItem.getFieldName()))
				.collect(Collectors.toList());

		if (actualHrItems.isEmpty()) {
			throw new Exception("Cannot locate the item to be updated!");
		}

		if (!actualHrItems.get(0).getFieldValue().replaceAll("\n", "").equals(hrItem.getFieldValue())) {
			throw new Exception(String.format("Field value is not as expected - \nexpected %s \nbut got %s",
					hrItem.getFieldValue(), actualHrItems.get(0).getFieldValue()));
		}

		// We would like to use a create API so that we can create an item for our test
		// to be independent.
		// Otherwise, we are going to need to manage it manually and our test is
		// fragile.
	}

	@When("^I edit the field value to \"([^\"]*)\"$")
	public void i_edit_the_field_value_to(String acceptedValue) throws Exception {
		apiCaller.edit_field_value(authToken, hrItem, acceptedValue);
	}

	@When("^I update Not PII field value to \"([^\"]*)\"$")
	public void i_update_Not_PII_field_value_to(String acceptedValue) throws Exception {
		apiCaller.not_pii(authToken, hrItem, acceptedValue);
	}

	@Then("^the item should be as follow:$")
	public void the_item_should_be_as_follow(List<HumanReviewItem> expectedHrItems) throws Exception {

		List<HumanReviewItem> hrPendingItems = apiCaller.get_human_pending_list(authToken);

		List<HumanReviewItem> actualHrItems = hrPendingItems.stream()
				.filter(item -> item.getStixId().equals(hrItem.getStixId())).collect(Collectors.toList());

		actualHrItems = actualHrItems.stream().filter(item -> item.getFieldName().equals(hrItem.getFieldName()))
				.collect(Collectors.toList());

		if (actualHrItems.isEmpty()) {
			throw new Exception("Cannot locate the item to verify!");
		}

		apiCaller.edit_field_value(authToken, hrItem, hrItem.getFieldValue());

		assertThat(actualHrItems.get(0).getFieldValue().replaceAll("\n", ""),
				equalTo(expectedHrItems.get(0).getFieldValue()));
	}
}
