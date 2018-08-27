Feature: Search Profile
	As a Facebook user
	I want to search profiles 
	to find my friends
	
	Scenario: Search the profiles in the list personas
		Given that the user opened the page
		And he had a list of friends		
		When he searches for his friends
		Then he should see his friends