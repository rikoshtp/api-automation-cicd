Feature: As an admin, I want to see list of Users, so that i can create new user.

    Scenario: GET - As admin i have to able to get detail user
        Given I set GET api endpoints
        When I sent GET HTTP request
        Then I receive valid http response code 200
        And I receive valid data for detail user

    Scenario: POST - As admin I have be able to create new user
        Given I set POST api endpoints
        When I send POST HTTP request
        Then I receive valid HTTP response code 201
        And I receive valid data for new user

