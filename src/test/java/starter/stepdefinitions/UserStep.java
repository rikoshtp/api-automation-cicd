package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.User.GET;
import starter.User.POST;

public class UserStep {
    @Steps
    GET get;

    @Steps
    POST post;

    @Given("I set GET api endpoints")
    public void getApiEndpoints(){
        get.setApiEndpoints();
    }

    @When("I sent GET HTTP request")
    public void getHttpRequest(){
        get.sendGetHttpRequest();
    }

    @Then("I receive valid http response code 200")
    public void receiveValidHttpResponseCode(){
        get.validHttpResponseCode();
    }

    @And("I receive valid data for detail user")
    public void dataForDetailUser(){
        get.receiveValidData();
    }

    @Given("I set POST api endpoints")
    public void setPostApiEndpoints() {
        post.setPostApiEndpoint();
    }
    @When("I send POST HTTP request")
    public void sendPostHttpRequest() {
        post.sendPostHttpRequest();
    }

    @Then("I receive valid HTTP response code 201")
    public void receiveValidHttp201(){
        post.receiveHttpResponseCode201();
    }

    @And("I receive valid data for new user")
    public void validateDataNewUser() {
        post.validateDatanewUser();
    }
}
