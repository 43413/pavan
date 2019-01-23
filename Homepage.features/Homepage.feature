Feature: This feature is design to validate register user functionality
      
        
@test1
Scenario: this scenario is design to validate wheter the given user id is resigstered in the application
 Given launch the chrome browser and pass the url
    When Browser is launched , click on signin
    Then verify Authentication page is opened 
    And close the browser
 

