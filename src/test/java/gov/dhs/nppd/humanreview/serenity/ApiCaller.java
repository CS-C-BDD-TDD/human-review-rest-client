package gov.dhs.nppd.humanreview.serenity;

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.api.DefaultApi;
import org.openapitools.client.model.AuthCredentials;
import org.openapitools.client.model.HumanReviewItem;
import org.openapitools.client.model.ListOfHumanReviewItems;

import net.thucydides.core.annotations.Step;

public class ApiCaller {
	private static final long MAX_DELAY = 2000L;
	private final DefaultApi api = new DefaultApi();

	@Step
	public String calls_userPut_method(String username, String password) {
		delay(MAX_DELAY);
		ApiClient apiClient = new ApiClient();
		apiClient.setBasePath(System.getProperty("human.review.rest.url"));

		api.setApiClient(apiClient);
		try {
			AuthCredentials authCredentials = new AuthCredentials();
			authCredentials.setUsername(username);
			authCredentials.setPassword(password);
			return api.userPut(authCredentials);
		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}

	@Step
	public ListOfHumanReviewItems get_human_pending_list(String authenticatedToken) {
		delay(MAX_DELAY);
		ApiClient apiClient = new ApiClient();
		apiClient.setBasePath(System.getProperty("human.review.rest.url"));

		apiClient.addDefaultHeader("token", authenticatedToken);

		api.setApiClient(apiClient);
		try {
			return api.humanreviewPendingGet();
		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ListOfHumanReviewItems();
	}

	@Step
	public void edit_field_value(String authToken, HumanReviewItem hrItem, String acceptedValue) {
		delay(MAX_DELAY);
		ApiClient apiClient = new ApiClient();
		apiClient.setBasePath(System.getProperty("human.review.rest.url"));

		apiClient.addDefaultHeader("token", authToken);

		api.setApiClient(apiClient);
		try {
			api.humanreviewStixIdFieldPut(hrItem.getStixId(), hrItem.getFieldName(), hrItem.getFieldValue(),
					acceptedValue, hrItem.getFieldName(), "Edit");
		} catch (ApiException e) {
			e.printStackTrace();
		}
	}

	@Step
	public void not_pii(String authToken, HumanReviewItem hrItem, String acceptedValue) {
		delay(MAX_DELAY);
		ApiClient apiClient = new ApiClient();
		apiClient.setBasePath(System.getProperty("human.review.rest.url"));

		apiClient.addDefaultHeader("token", authToken);

		api.setApiClient(apiClient);
		try {
			api.humanreviewStixIdFieldPut(hrItem.getStixId(), hrItem.getFieldName(), hrItem.getFieldValue(),
					acceptedValue, hrItem.getFieldName(), "Not PII");
		} catch (ApiException e) {
			e.printStackTrace();
		}

	}

	public void confirm_risk(String authToken, HumanReviewItem hrItem, String acceptedValue) {
		delay(MAX_DELAY);
		ApiClient apiClient = new ApiClient();
		apiClient.setBasePath(System.getProperty("human.review.rest.url"));

		apiClient.addDefaultHeader("token", authToken);

		api.setApiClient(apiClient);
		try {
			api.humanreviewStixIdFieldPut(hrItem.getStixId(), hrItem.getFieldName(), hrItem.getFieldValue(),
					acceptedValue, hrItem.getFieldName(), "Confirm Risk");
		} catch (ApiException e) {
			e.printStackTrace();
		}

	}

	public void redact_field(String authToken, HumanReviewItem hrItem) {
		delay(MAX_DELAY);
		ApiClient apiClient = new ApiClient();
		apiClient.setBasePath(System.getProperty("human.review.rest.url"));

		apiClient.addDefaultHeader("token", authToken);

		api.setApiClient(apiClient);
		try {
			api.humanreviewStixIdFieldPut(hrItem.getStixId(), hrItem.getFieldName(), hrItem.getFieldValue(), "",
					hrItem.getFieldName(), "Redact");
			;
		} catch (ApiException e) {
			e.printStackTrace();
		}

	}

	/**
	 * We are providing this delay because the backend seems to not be able to keep
	 * up with the speedy requests. Maybe it is over a slow internet.
	 * 
	 * We got intermitten and random errors.
	 * 
	 * @param delayInMiliseconds
	 */
	private void delay(long delayInMiliseconds) {
		try {
			Thread.sleep(delayInMiliseconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
