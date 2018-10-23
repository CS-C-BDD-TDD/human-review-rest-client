# openapi-java-client

Human Review
- API version: 1.0.0
  - Build date: 2018-10-11T15:52:26.790-04:00[America/New_York]

And API for manipulating Thread Indicator documents in STIX format

  For more information, please visit [https://github.com/InfoSec812](https://github.com/InfoSec812)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Serenity Tests and Reports:

Use this command to run all the serenity tests:

```bash
mvn clean -Dtest=gov.dhs.nppd.humanreview.SerenityTest -Dhuman.review.rest.url=http://localhost:8080/api/v1 -Dhr.regular.username=User1 -Dhr.regular.password=Pass1 test
```
Then, you want to generate a Serenity report using this command:

```bash
mvn -DskipTests verify
```

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.openapitools.client.*;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        
        DefaultApi apiInstance = new DefaultApi();
        ActionList actionList = new ActionList(); // ActionList | A new `ActionList` to be created.
        try {
            apiInstance.createActionList(actionList);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#createActionList");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://humanreview-labs-dev.apps.domino.rht-labs.com/api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**createActionList**](docs/DefaultApi.md#createActionList) | **POST** /actionLists | Create a ActionList
*DefaultApi* | [**deleteActionList**](docs/DefaultApi.md#deleteActionList) | **DELETE** /actionLists/{actionListId} | Delete a ActionList
*DefaultApi* | [**getActionList**](docs/DefaultApi.md#getActionList) | **GET** /actionLists/{actionListId} | Get a ActionList
*DefaultApi* | [**getActionLists**](docs/DefaultApi.md#getActionLists) | **GET** /actionLists | List All ActionLists
*DefaultApi* | [**humanreviewPendingGet**](docs/DefaultApi.md#humanreviewPendingGet) | **GET** /humanreview/pending | 
*DefaultApi* | [**humanreviewPendingOptions**](docs/DefaultApi.md#humanreviewPendingOptions) | **OPTIONS** /humanreview/pending | Return endpoint API documents
*DefaultApi* | [**humanreviewStixIdFieldPut**](docs/DefaultApi.md#humanreviewStixIdFieldPut) | **PUT** /humanreview/{stix_id}/{field} | 
*DefaultApi* | [**humanreviewStixIdPut**](docs/DefaultApi.md#humanreviewStixIdPut) | **PUT** /humanreview/{stix_id} | 
*DefaultApi* | [**updateActionList**](docs/DefaultApi.md#updateActionList) | **PUT** /actionLists/{actionListId} | Update a ActionList
*DefaultApi* | [**userPut**](docs/DefaultApi.md#userPut) | **PUT** /user | 


## Documentation for Models

 - [APIEndpointParameters](docs/APIEndpointParameters.md)
 - [APIOptionsResultList](docs/APIOptionsResultList.md)
 - [APIOptionsVerb](docs/APIOptionsVerb.md)
 - [ActionList](docs/ActionList.md)
 - [AuthCredentials](docs/AuthCredentials.md)
 - [FieldUpdatePutBody](docs/FieldUpdatePutBody.md)
 - [GroupAction](docs/GroupAction.md)
 - [HumanReviewItem](docs/HumanReviewItem.md)
 - [ListOfHumanReviewItems](docs/ListOfHumanReviewItems.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

deven.phillips@redhat.com

