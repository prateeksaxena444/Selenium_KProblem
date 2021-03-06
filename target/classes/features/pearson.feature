Feature: Yotta Cloud Sanity Suite
 
 #Scenario Outline: Check All three languages by asserting continue button on https://mypedia.pearson.com/
    #Given I go to "<pmp_URL>"
    #And Check three languages in drop down
    #When If i Choose "<language>"
    #Then Check Continue_language
    #And close browser
    #
    #Examples:
#	| pmp_URL | language |
#	| https://mypedia.pearson.com/ | English |
#	| https://mypedia.pearson.com/ | Hindi    |
#	| https://mypedia.pearson.com/ | Espanol |
    
    
  Scenario Outline: Create parent account on https://mypedia.pearson.com/ and check create account button is disabled till all the details are filled
    Given I go to "<pmp_URL>"
    And Go to new registration page
    When I fill "<FirstName>", "<FirstName>", "<FirstName>", "<FirstName>", "<FirstName>" and "<FirstName>"
    Then create account button should still be disabled
    And close browser
    
    Examples:
	| pmp_URL | language |
	| https://mypedia.pearson.com/ | English |