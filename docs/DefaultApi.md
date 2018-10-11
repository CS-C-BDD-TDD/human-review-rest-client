# DefaultApi

All URIs are relative to *https://humanreview-labs-dev.apps.domino.rht-labs.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createActionList**](DefaultApi.md#createActionList) | **POST** /actionLists | Create a ActionList
[**deleteActionList**](DefaultApi.md#deleteActionList) | **DELETE** /actionLists/{actionListId} | Delete a ActionList
[**getActionList**](DefaultApi.md#getActionList) | **GET** /actionLists/{actionListId} | Get a ActionList
[**getActionLists**](DefaultApi.md#getActionLists) | **GET** /actionLists | List All ActionLists
[**humanreviewPendingGet**](DefaultApi.md#humanreviewPendingGet) | **GET** /humanreview/pending | 
[**humanreviewPendingOptions**](DefaultApi.md#humanreviewPendingOptions) | **OPTIONS** /humanreview/pending | Return endpoint API documents
[**humanreviewStixIdFieldPut**](DefaultApi.md#humanreviewStixIdFieldPut) | **PUT** /humanreview/{stix_id}/{field} | 
[**humanreviewStixIdPut**](DefaultApi.md#humanreviewStixIdPut) | **PUT** /humanreview/{stix_id} | 
[**updateActionList**](DefaultApi.md#updateActionList) | **PUT** /actionLists/{actionListId} | Update a ActionList
[**userPut**](DefaultApi.md#userPut) | **PUT** /user | 


<a name="createActionList"></a>
# **createActionList**
> createActionList(actionList)

Create a ActionList

Creates a new instance of a &#x60;ActionList&#x60;.

### Example
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
ActionList actionList = new ActionList(); // ActionList | A new `ActionList` to be created.
try {
    apiInstance.createActionList(actionList);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#createActionList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **actionList** | [**ActionList**](ActionList.md)| A new &#x60;ActionList&#x60; to be created. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="deleteActionList"></a>
# **deleteActionList**
> deleteActionList(actionListId)

Delete a ActionList

Deletes an existing &#x60;ActionList&#x60;.

### Example
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String actionListId = "actionListId_example"; // String | A unique identifier for a `ActionList`.
try {
    apiInstance.deleteActionList(actionListId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteActionList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **actionListId** | **String**| A unique identifier for a &#x60;ActionList&#x60;. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getActionList"></a>
# **getActionList**
> ActionList getActionList(actionListId)

Get a ActionList

Gets the details of a single instance of a &#x60;ActionList&#x60;.

### Example
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String actionListId = "actionListId_example"; // String | A unique identifier for a `ActionList`.
try {
    ActionList result = apiInstance.getActionList(actionListId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getActionList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **actionListId** | **String**| A unique identifier for a &#x60;ActionList&#x60;. |

### Return type

[**ActionList**](ActionList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getActionLists"></a>
# **getActionLists**
> List&lt;ActionList&gt; getActionLists()

List All ActionLists

Gets a list of all &#x60;ActionList&#x60; entities.

### Example
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    List<ActionList> result = apiInstance.getActionLists();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getActionLists");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ActionList&gt;**](ActionList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="humanreviewPendingGet"></a>
# **humanreviewPendingGet**
> ListOfHumanReviewItems humanreviewPendingGet()



### Example
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    ListOfHumanReviewItems result = apiInstance.humanreviewPendingGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#humanreviewPendingGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListOfHumanReviewItems**](ListOfHumanReviewItems.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="humanreviewPendingOptions"></a>
# **humanreviewPendingOptions**
> APIOptionsResultList humanreviewPendingOptions()

Return endpoint API documents

When requested, this endpoint/verb combination returns documentation explainin how this API endpoint works

### Example
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    APIOptionsResultList result = apiInstance.humanreviewPendingOptions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#humanreviewPendingOptions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**APIOptionsResultList**](APIOptionsResultList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="humanreviewStixIdFieldPut"></a>
# **humanreviewStixIdFieldPut**
> humanreviewStixIdFieldPut(stixId, field, originalValue, acceptedValue, fieldName, actionType)



update to support individual review

### Example
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String stixId = "stixId_example"; // String | The unique identifier of the STIX document
String field = "field_example"; // String | The field to be updated
String originalValue = "null"; // String | 
String acceptedValue = "null"; // String | 
String fieldName = "null"; // String | 
String actionType = "null"; // String | 
try {
    apiInstance.humanreviewStixIdFieldPut(stixId, field, originalValue, acceptedValue, fieldName, actionType);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#humanreviewStixIdFieldPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stixId** | **String**| The unique identifier of the STIX document |
 **field** | **String**| The field to be updated |
 **originalValue** | **String**|  | [default to null]
 **acceptedValue** | **String**|  | [default to null]
 **fieldName** | **String**|  | [default to null]
 **actionType** | **String**|  | [default to null]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="humanreviewStixIdPut"></a>
# **humanreviewStixIdPut**
> humanreviewStixIdPut(stixId)



### Example
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String stixId = "stixId_example"; // String | The ID of the STIX document
try {
    apiInstance.humanreviewStixIdPut(stixId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#humanreviewStixIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stixId** | **String**| The ID of the STIX document |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="updateActionList"></a>
# **updateActionList**
> updateActionList(actionListId, actionList)

Update a ActionList

Updates an existing &#x60;ActionList&#x60;.

### Example
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String actionListId = "actionListId_example"; // String | A unique identifier for a `ActionList`.
ActionList actionList = new ActionList(); // ActionList | Updated `ActionList` information.
try {
    apiInstance.updateActionList(actionListId, actionList);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateActionList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **actionListId** | **String**| A unique identifier for a &#x60;ActionList&#x60;. |
 **actionList** | [**ActionList**](ActionList.md)| Updated &#x60;ActionList&#x60; information. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="userPut"></a>
# **userPut**
> String userPut(authCredentials)



### Example
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
AuthCredentials authCredentials = new AuthCredentials(); // AuthCredentials | Allow the user to submit their credentials and on success return a token for use in making other REST calls
try {
    String result = apiInstance.userPut(authCredentials);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#userPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authCredentials** | [**AuthCredentials**](AuthCredentials.md)| Allow the user to submit their credentials and on success return a token for use in making other REST calls |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain

