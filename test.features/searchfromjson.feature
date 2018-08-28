Feature: Search Profile from Json
	As a Facebook user
	I want to search profiles 
	to find my friends
	
	Scenario: Search the profiles in the list personas
		Given that the user is in fb page
		And he has a list of friends to look for		
		When he searches for them
		Then he should see the profiles
