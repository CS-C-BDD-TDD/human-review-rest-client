package gov.dhs.nppd.humanreview.cukes;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gov.dhs.nppd.humanreview.serenity.ApiCaller;
import net.thucydides.core.annotations.Steps;

public class AuthenticatingUsers {

	@Steps
	private ApiCaller apiCaller;
	private String username;
	private String password;
	private String actualToken;

	@Given("^I am have a valid credential as \"([^\"]*)\" and \"([^\"]*)\" for Human Review backend$")
	public void i_am_have_a_valid_credential_as_and_for_Human_Review_backend(String username, String password)
			throws Exception {
		this.username = username;
		this.password = password;
	}

	@When("^I invoke user authentication$")
	public void i_invoke_user_authentication() throws Exception {
		actualToken = apiCaller.calls_userPut_method(username, password);
	}

	@Then("^I should get a valid access token\\.$")
	public void i_should_get_a_valid_access_token() throws Exception {
		assertThat(actualToken, containsString("Random"));
	}

}
