package gov.dhs.nppd.humanreview.cukes;

import java.util.List;

import org.openapitools.client.model.HumanReviewItem;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gov.dhs.nppd.humanreview.rest.RestClient;
import gov.dhs.nppd.humanreview.util.TestUtil;

public class CreateHRItem {

	private HumanReviewItem newHrItem;
	private String hostUrl = System.getProperty("hr.host.url");
	private String username = System.getProperty("hr.regular.username");
	private String password = System.getProperty("hr.regular.password");
	private RestClient restClient = new RestClient(System.getProperty("hr.host.url"));

	@Given("^I have the following HR item to be reviewed:$")
	public void i_have_the_following_HR_item_to_be_reviewed(List<HumanReviewItem> hrItems) throws Exception {
		newHrItem = TestUtil.makeHrItem();
		newHrItem.setFieldName(hrItems.get(0).getFieldName());
		newHrItem.setFieldValue(hrItems.get(0).getFieldValue());
	}

	@When("^I create this HR item$")
	public void i_create_this_HR_item() throws Exception {
		String authToken = restClient.getAuthToken(username, password);

		if ("invalid credential".equalsIgnoreCase(authToken)) {
			throw new Exception("Invalid Credential!");
		}
		
//		boolean success = restClient.createHrItem(authToken, newHrItem);
	}

	@Then("^I should be able to retrieve it\\.$")
	public void i_should_be_able_to_retrieve_it() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

}
