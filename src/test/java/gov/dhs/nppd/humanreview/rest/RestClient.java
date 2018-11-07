package gov.dhs.nppd.humanreview.rest;

import java.io.IOException;

import org.openapitools.client.JSON;
import org.openapitools.client.model.AuthCredentials;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

public class RestClient {
	private static final Logger log = LoggerFactory.getLogger(RestClient.class);
	private OkHttpClient client = new OkHttpClient();
	private String hostUrl;
	public static final MediaType JSON = MediaType.parse("application/json");

	public RestClient(String hostUrl) {
		this.hostUrl = hostUrl;
	}

	public String getAuthToken(String username, String password) throws IOException {
		AuthCredentials authCredentials = new AuthCredentials();
		authCredentials.setPassword(password);
		authCredentials.setUsername(username);

		RequestBody body = RequestBody.create(JSON, new JSON().serialize(authCredentials));
		Request request = new Request.Builder().url(hostUrl + "/api/v1/user").put(body).build();

		Response response = client.newCall(request).execute();
		return response.body().string();
	}

//	public boolean createHrItem(String authToken, HumanReviewItem newHrItem) {
//		RequestBody body = RequestBody.create(JSON, new JSON().serialize(newHrItem));
//		Request request = new Request.Builder().url(hostUrl + "/api/v1/humanreview/").put(body).build();
//
//		Response response = client.newCall(request).execute();
//		return response.body().string().contains("New record created");
//	}

}
