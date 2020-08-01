package com.xzkingdee.json;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Objects;

/**
 * @author qy
 * @date Created in 2020/8/1
 **/
public class JsonPointerLearn {

    public static void testJsonPointer(){
        String testJson = "{\n" +
                "    \"firstName\": \"John\",\n" +
                "    \"lastName\": \"Doe\",\n" +
                "    \"address\": {\n" +
                "        \"street\": \"21 2nd Street\",\n" +
                "        \"city\": \"New York\",\n" +
                "        \"postalCode\": \"10021-3100\",\n" +
                "        \"coordinates\": {\n" +
                "            \"latitude\": 40.7250387,\n" +
                "            \"longitude\": -73.9932568\n" +
                "        }\n" +
                "    },\n" +
                "    \"phone\": [\n" +
                "        \"139\",\n" +
                "        \"137\"\n" +
                "    ],\n" +
                "    \"grade\": [\n" +
                "        {\n" +
                "            \"name\": \"math\",\n" +
                "            \"score\": 99\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"english\",\n" +
                "            \"score\": 97\n" +
                "        }\n" +
                "    ]\n" +
                "}";
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = null;
        try {
            jsonNode = mapper.readTree(testJson);
        } catch (IOException e) {
            e.getMessage();
        }

        JsonNode firstName = Objects.requireNonNull(jsonNode).at("/firstName");
        System.out.println("firstName:"+firstName.toString());
    }
}
