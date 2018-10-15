package gov.dhs.nppd.humanreview.cukes;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNull.notNullValue;

import java.util.List;

import org.openapitools.client.model.HumanReviewItem;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gov.dhs.nppd.humanreview.serenity.ApiCaller;
import net.thucydides.core.annotations.Steps;

public class GetHrPending {
	@Steps
	private ApiCaller apiCaller;

	private List<HumanReviewItem> listofPending;

	@Given("^I want to retrieve a pending list of fields$")
	public void i_want_to_retrieve_a_pending_list_of_fields() throws Exception {
	}

	@Given("^there exists at least one field$")
	public void there_exists_at_least_one_field() throws Exception {
		// Make sure that the list is not empty
	}

	@When("^I retrieve the pending list$")
	public void i_retrieve_the_pending_list() throws Exception {
		this.listofPending = apiCaller.get_human_pending_list();
	}

	@Then("^The list should not be empty$")
	public void the_list_should_not_be_empty() throws Exception {
		assertThat(listofPending, notNullValue());
	}
}
