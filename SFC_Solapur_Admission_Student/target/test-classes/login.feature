Feature: Login Page

  Scenario Outline: Validate login username and password
    Given User should be on the login page
    Then User enters "<username_email>" and "<user_pass>"
    And User should be logged in successfully

    Examples: 
      | username_email              | user_pass |
      | festtest@edulab.in          | Ajay@123  |
      | ajaybalajikadam69@gmail.com | edulab321 |
      | test@gmail.com              | edulab321 |
      | festtest@edulab.in          | Ajay@123  |
      | student@example.com         | pass1234  |
      | student_without_at.com      | pass1234  |
      | student@.com                | pass1234  |
      | student@example.com         | wrongpass |
      | empty                       | pass1234  |
      | student@example.com         | empty     |
      | empty                       | empty     |
