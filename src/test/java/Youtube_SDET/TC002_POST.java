package Youtube_SDET;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC002_POST {

    @Test
    public void registration(){

        RestAssured.baseURI = "http://restapi.demoqa.com/customer/";

        RequestSpecification requestSpecification = RestAssured.given();
        JSONObject requestParameter = new JSONObject();

        requestParameter.put("FirstName","Bon");
        requestParameter.put("LastName","Jovi");
        requestParameter.put("UserName","Jovi123");
        requestParameter.put("Password","bon123@");
        requestParameter.put("Email","bonjovi@gmail.com");

        requestSpecification.header("Content-Type","application/json");
        requestSpecification.body(requestParameter.toJSONString()); // attach data to the request


        Response response = requestSpecification.request(Method.POST,"/register");
        String responseBody = response.getBody().asString();
        System.out.println(responseBody);
        //status code validation
        int statusCode=response.getStatusCode();
        System.out.println("Status code is: "+statusCode);
        Assert.assertEquals(statusCode, 201);

        //success code validation
        String successCode=response.jsonPath().get("SuccessCode");
        System.out.println(successCode);
        Assert.assertEquals(successCode, "OPERATION_SUCCESS");
    }
}
