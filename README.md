# Human Review Service API Automated Acceptance Tests

This project contains automated acceptance tests for the publicly available Human Review REST API. These tests are written in Gherkin and automated by Java using Serenity/Cucumber libraries. In addition, the UI activities are tested by the REST API client software components.

The current tests:

- authentication - 1 scenario
- get pending hr items -  1 scenario
- update hr item - 4 scenarios (Edit, Not PII, Confirm Risk, and Redact).

To run all tests, use this command:

Use this command to run all the serenity tests:

```bash
mvn clean -Dtest=gov.dhs.nppd.humanreview.SerenityTest -Dhuman.review.rest.url=http://localhost:8080/api/v1 -Dhr.regular.username=User1 -Dhr.regular.password=Pass1 test
```
Then, you want to generate a Serenity report using this command:

```bash
mvn -DskipTests verify
```
Then, the report can be view (like a website) under folder `target/site/serenity`. This folder contains the index.html file so that it can be launched and viewed by a browser.
