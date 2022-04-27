package starter.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class GET {
    public static String url = "https://reqres.in/api/";

    @Step("I set GET api endpoints")
    public String setApiEndpoints(){
        return url + "users/2";
    }

    @Step("I sent GET HTTP request")
    public void sendGetHttpRequest(){
        SerenityRest.given().get(setApiEndpoints());
    }

    @Step("I receive valid http response code 200")
    public void validHttpResponseCode(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for detail user")
    public void receiveValidData(){
        restAssuredThat(response -> response.body("'data'.'id'", equalTo(2)));
        restAssuredThat(response -> response.body("'data'.'first_name'", equalTo("Janet")));
    }
}
