Feature: Log In on Facebook
	
	Scenario: Start session as Alvaro Meza
		Given that the user opened the facebook page		
		When he types his account data		
		Then he should see his name 'Alvaro Meza Herazo' in the main page
