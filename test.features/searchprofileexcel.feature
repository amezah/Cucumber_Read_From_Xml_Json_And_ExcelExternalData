Feature: Search Profile
	As a Facebook user
	I want to search profiles 
	to find my friends
	
	Scenario Outline: Search the profiles in the list personas
		Given that the user opened her facebook account		
		When he searches for '<name>' on fb		
		Then he should find the profiles		
		
	Examples:
		| 		name 			|
		##@externaldata@./src/test/resources/Book1.xlsx@Sheet1
|Sebastian Baron Caicedo|
|Luis Carlos Covilla Yarce|
       
                                                  
  
 
 
		
