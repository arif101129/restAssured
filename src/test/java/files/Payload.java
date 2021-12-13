package files;

public class Payload {

        public static String addPayload(){

            return "{\r\n" +
                    "  \"location\": {\n" +
                    "    \"lat\": -38.383494,\n" +
                    "    \"lng\": 33.427362\n" +
                    "  },\n" +
                    "  \"accuracy\": 70,\n" +
                    "  \"name\": \"shammo house\",\n" +
                    "  \"phone_number\": \"347 893 6329\",\n" +
                    "  \"address\": \"29, side layout, cohen\",\n" +
                    "  \"types\": [\n" +
                    "    \"shoe park\",\n" +
                    "    \"shop\"\n" +
                    "  ],\n" +
                    "  \"website\": \"http://google.com/shamoo\",\n" +
                    "  \"language\": \"English\"\n" +
                    "}";

        }
        public static String complexPayload(){
            return"{\n" +
                    "\n" +
                    "\"dashboard\": {\n" +
                    "\n" +
                    "\"purchaseAmount\": 910,\n" +
                    "\n" +
                    "\"website\": \"rahulshettyacademy.com\"\n" +
                    "\n" +
                    "},\n" +
                    "\n" +
                    "\"courses\": [\n" +
                    "\n" +
                    "{\n" +
                    "\n" +
                    "\"title\": \"Selenium Python\",\n" +
                    "\n" +
                    "\"price\": 50,\n" +
                    "\n" +
                    "\"copies\": 6\n" +
                    "\n" +
                    "},\n" +
                    "\n" +
                    "{\n" +
                    "\n" +
                    "\"title\": \"Cypress\",\n" +
                    "\n" +
                    "\"price\": 40,\n" +
                    "\n" +
                    "\"copies\": 4\n" +
                    "\n" +
                    "},\n" +
                    "\n" +
                    "{\n" +
                    "\n" +
                    "\"title\": \"RPA\",\n" +
                    "\n" +
                    "\"price\": 45,\n" +
                    "\n" +
                    "\"copies\": 10\n" +
                    "\n" +
                    "}\n" +
                    "\n" +
                    "]\n" +
                    "\n" +
                    "}\n" +
                    "\n";
        }
    }
