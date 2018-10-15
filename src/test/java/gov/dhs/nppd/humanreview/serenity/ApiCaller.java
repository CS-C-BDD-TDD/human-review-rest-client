package gov.dhs.nppd.humanreview.serenity;

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.api.DefaultApi;
import org.openapitools.client.model.AuthCredentials;
import org.openapitools.client.model.ListOfHumanReviewItems;

import net.thucydides.core.annotations.Step;

public class ApiCaller {
	private final DefaultApi api = new DefaultApi();

	@Step
	public String calls_userPut_method(String username, String password) {
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
	public ListOfHumanReviewItems get_human_pending_list() {
		ApiClient apiClient = new ApiClient();
		apiClient.setBasePath(System.getProperty("human.review.rest.url"));

		api.setApiClient(apiClient);
		try {
			return api.humanreviewPendingGetWithHttpInfo().getData();
		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ListOfHumanReviewItems();
	}

}
