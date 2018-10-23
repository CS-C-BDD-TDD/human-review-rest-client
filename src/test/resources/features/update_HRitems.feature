Feature: Update HR Items 
	As a Human Review API User, 
	I want to update an existing human review item, 
	so that I can complete my dissimination process.


Scenario: Edit existing HR Items with valid contents 
	Given I have an existing Human Review Item with the following information: 
		| stix id 							   | field name        | field value   																									| 
		| 5d614e45-2d52-4d4b-94ed-897b3e86502c | Short_Description | Package with single indicator NCCIC:Indicator-f83b16c8-f32a-41d3-8d02-93ad0d37016f at 2016-08-05T10:59:23Z |
	When I edit the field value to "**** New Package with single indicator NCCIC:Indicator-f83b16c8-f32a-41d3-8d02-93ad0d37016f at 2016-08-05T10:59:23Z" 
	Then the item should be as follow: 
		| stix id                              | field name        | field value      | 
		| 5d614e45-2d52-4d4b-94ed-897b3e86502c | Short_Description | **** New Package with single indicator NCCIC:Indicator-f83b16c8-f32a-41d3-8d02-93ad0d37016f at 2016-08-05T10:59:23Z |
		

Scenario: No Change in Field Value when Not PII 
	Given I have an existing Human Review Item with the following information: 
		| stix id 							   | field name        | field value   																									| 
		| 5d614e45-2d52-4d4b-94ed-897b3e86502c | Short_Description | Package with single indicator NCCIC:Indicator-f83b16c8-f32a-41d3-8d02-93ad0d37016f at 2016-08-05T10:59:23Z |
	When I update Not PII field value to "**** New Package with single indicator NCCIC:Indicator-f83b16c8-f32a-41d3-8d02-93ad0d37016f at 2016-08-05T10:59:23Z" 
	Then the item should be as follow: 
		| stix id                              | field name        | field value      | 
		| 5d614e45-2d52-4d4b-94ed-897b3e86502c | Short_Description | Package with single indicator NCCIC:Indicator-f83b16c8-f32a-41d3-8d02-93ad0d37016f at 2016-08-05T10:59:23Z |
		
@Pawan_WIP 		
Scenario: No Change in Field Value when Confirm Risk 
	Given I have an existing Human Review Item with the following information: 
		| stix id 							   | field name        | field value   																									| 
		| 5d614e45-2d52-4d4b-94ed-897b3e86502c | Short_Description | Package with single indicator NCCIC:Indicator-f83b16c8-f32a-41d3-8d02-93ad0d37016f at 2016-08-05T10:59:23Z |
	When I update Confirm Risk field value to "**** New Package with single indicator NCCIC:Indicator-f83b16c8-f32a-41d3-8d02-93ad0d37016f at 2016-08-05T10:59:23Z" 
	Then the item should be as follow: 
		| stix id                              | field name        | field value      | 
		| 5d614e45-2d52-4d4b-94ed-897b3e86502c | Short_Description | Package with single indicator NCCIC:Indicator-f83b16c8-f32a-41d3-8d02-93ad0d37016f at 2016-08-05T10:59:23Z |