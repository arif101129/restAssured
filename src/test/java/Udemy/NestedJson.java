package Udemy;

import files.Payload;
import io.restassured.path.json.JsonPath;

import static java.lang.System.*;

public class NestedJson {

    public static void main(String[] args) {

        JsonPath jsonPath = new JsonPath(Payload.complexPayload());
        int totalCourses = jsonPath.getInt("courses.size()");
        out.println(totalCourses);
        out.println(jsonPath.getInt("dashboard.purchaseAmount"));
        out.println(jsonPath.getString("courses[0].title"));
        out.println(jsonPath.getString("courses[1].title"));
        out.println(jsonPath.getString("courses[2].title"));

        for (int i = 0; i < totalCourses; i++) {
            String courseName = jsonPath.get("courses["+i+"].title");
            out.println(courseName);
        }
        System.out.println("******************************");

        for(int j = 0; j<totalCourses; j++){
            String courses = jsonPath.get("courses["+j+"].title");
            if(courses.equalsIgnoreCase("cypress")){
                System.out.println(jsonPath.get("courses["+j+"].copies").toString());
                break;
            }
        }
    }
}