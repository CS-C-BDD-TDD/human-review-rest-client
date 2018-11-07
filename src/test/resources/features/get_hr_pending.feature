Feature: Get HR Pending 
	As a backend developer, 
	I need to implement the HR Pending List API specification, 
	so that I can provide the data to HR Pending List to frontend.

Scenario: Get pending list 
	Given I want to retrieve a pending list of fields 
	And there exists at least one field 
	When I retrieve the pending list 
	Then The list should not be empty