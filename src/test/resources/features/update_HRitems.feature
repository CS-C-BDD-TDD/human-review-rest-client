Feature: Update HR Items 
	As a Human Review API User, 
	I want to update an existing human review item, 
	so that I can complete my dissimination process.

@Kiet_WIP 
Scenario: Edit existing HR Items with valid contents 
	Given I have an existing Human Review Item with the following information: 
		| stix id 							   | field name        | field value   																									| 
		| 169abb82-9a89-483c-a89d-56fe39b97adc | Short_Description | Single Indicator: NCCIC:Indicator-f83b16c8-f32a-41d3-8d02-93ad0d37016f |
	When I edit the field value to "**** New Single Indicator: NCCIC:Indicator-f83b16c8-f32a-41d3-8d02-93ad0d37016f" 
	Then the item should be as follow: 
		| stix id                              | field name        | field value      | 
		| 169abb82-9a89-483c-a89d-56fe39b97adc | Short_Description | **** New Single Indicator: NCCIC:Indicator-f83b16c8-f32a-41d3-8d02-93ad0d37016f |
		
		
Scenario: No Change in Field Value when Not PII 
	Given I have an existing Human Review Item with the following information: 
		| stix id 							   | field name        | field value   																									| 
		| 169abb82-9a89-483c-a89d-56fe39b97adc | Short_Description | Single Indicator: NCCIC:Indicator-f83b16c8-f32a-41d3-8d02-93ad0d37016f |
	When I update Not PII field value to "**** New Single Indicator: NCCIC:Indicator-f83b16c8-f32a-41d3-8d02-93ad0d37016f" 
	Then the item should be as follow: 
		| stix id                              | field name        | field value      | 
		| 169abb82-9a89-483c-a89d-56fe39b97adc | Short_Description | Single Indicator: NCCIC:Indicator-f83b16c8-f32a-41d3-8d02-93ad0d37016f |
		
		
Scenario: No Change in Field Value when Confirm Risk 
	Given I have an existing Human Review Item with the following information: 
		| stix id 							   | field name        | field value   																									| 
		| 169abb82-9a89-483c-a89d-56fe39b97adc | Short_Description | Single Indicator: NCCIC:Indicator-f83b16c8-f32a-41d3-8d02-93ad0d37016f |
	When I update Confirm Risk field value to "**** New Single Indicator: NCCIC:Indicator-f83b16c8-f32a-41d3-8d02-93ad0d37016f" 
	Then the item should be as follow: 
		| stix id                              | field name        | field value      | 
		| 169abb82-9a89-483c-a89d-56fe39b97adc | Short_Description | Single Indicator: NCCIC:Indicator-f83b16c8-f32a-41d3-8d02-93ad0d37016f |
		
		
		
		
		