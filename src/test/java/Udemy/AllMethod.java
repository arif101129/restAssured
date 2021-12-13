package Udemy;
import files.Payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class AllMethod {

        public static void main (String [] args) {


            RestAssured.baseURI = "https://rahulshettyacademy.com";
            //POST
            String postResponse =given().log().all().queryParam("key","qaclick123").header("Content-Type", "application/json").
                    body(Payload.addPayload()).
                    when().post("maps/api/place/add/json").
                    then().log().all().statusCode(200).body("scope",equalTo("APP")).header("server", "Apache/2.4.18 (Ubuntu)").
                    extract().response().asString();
            //System.out.println(response);

            JsonPath json = new JsonPath(postResponse);
            String placeId = json.getString("place_id");
            System.out.println("The Place_Id is: "+placeId);

            //PUT // Update
            String newAddress = "Fort Hamilton Florida";
            given().log().all().queryParam("key","qaclick123").header("Content-Type", "application/json").
                    body("{\r\n" +
                            "\"place_id\":\""+placeId+"\",\n" +
                            "\"address\":\""+newAddress+"\",\n" +
                            "\"key\":\"qaclick123\"\n" +
                            "}").
                    when().put("maps/api/place/update/json").
                    then().assertThat().statusCode(200).body("msg",equalTo("Address successfully updated"));
            // GET

            String getResponse = given().log().all().queryParam("key", "qaclick123").queryParam("place_id",placeId).
                    when().get("maps/api/place/get/json").
                    then().assertThat().log().all().statusCode(200).extract().response().asString();

//            JsonPath json1 = new JsonPath(getResponse);
//            String actualAddress = json1.getString(newAddress);
//            System.out.println(actualAddress);
//            Assert.assertEquals(newAddress, actualAddress);


            //DELETE

            given().log().all().queryParam("key","qaclick123").queryParam("place-id",placeId).
                    when().delete("maps/api/place/delete/json").
                    then().assertThat().log().all().statusCode(200);//.body("status",equalTo(""))

        }

    }
