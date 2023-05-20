package org.example.DAO;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.example.Coordinate;
import org.json.JSONArray;
import org.json.JSONObject;

public class CoordinateDAOUnirestImpl implements CoordinateDAO {


//    @Override
//    public void sendCoordinate(double latitude, double longitude) {
//        JSONObject jsonBody = new JSONObject();
//        jsonBody.put("latitudine", latitude);
//        jsonBody.put("longitudine", longitude);
//        System.out.println("Chest è o jsonBody: " + jsonBody);
//        try {
//            HttpResponse<JsonNode> response = Unirest.post("http://localhost:8080/sendMessage")
//                    .header("accept", "application/json")
//                    .field("topic", "myTopic")
//                    .field("message", jsonBody)
//                    .asJson();
//            System.out.println("Response status: " + response.getStatus());
//        } catch (UnirestException e) {
//            throw new RuntimeException(e);
//        }
//    }

    @Override
    public void sendCoordinata(Coordinate coordinate) {
        try {
            System.out.println("In questo momento, le coordinate sono: " + coordinate);
            HttpResponse<JsonNode> response = Unirest.post("http://localhost:8080/sendMessage")
                    .header("accept", "application/json")
                    .field("latitude", coordinate.getLatitude())
                    .field("longitude", coordinate.getLongitude())
                    .field("topic", "myTopic")
//                    .field("categoria", piatto.getCategoria())
                    .asJson();
        } catch (UnirestException e) {
            throw new RuntimeException(e);
        }
    }

//    @Override
//    public void sendCoordinate(double latitude, double longitude) {
//        JSONObject jsonBody = new JSONObject();
//        jsonBody.put("latitude", latitude);
//        jsonBody.put("longitude", longitude);
//        try {
//            HttpResponse<JsonNode> response = Unirest.post("http://localhost:8080/sendMessage")
//                    .header("accept", "application/json")
////                    .field("latitude", latitude)
////                    .field("longitude", longitude)
//                    .body(jsonBody.toString())
//                    .asJson();
//            System.out.println("Response status: " + response.getStatus());
//        } catch (UnirestException e) {
//            throw new RuntimeException(e);
//        }
//    }

//    @Override
//    public void sendCoordinate(double latitude, double longitude) {
//        try {
////            in alternativa a JSONArray
//
////            JsonObject coordinateObject = new JsonObject();
////            coordinateObject.addProperty("latitude", latitude);
////            coordinateObject.addProperty("longitude", longitude);
//            JSONArray coordinateObject = new JSONArray();
//            coordinateObject.put("latitude", latitude);
//            coordinateObject.put("longitude", longitude);
//
//            JsonObject mqttMessage = new JsonObject();
//            mqttMessage.add("message", coordinateObject);
//            mqttMessage.addProperty("topic", "myTopic");
//
//            Gson gson = new Gson();
//            String jsonMessage = gson.toJson(mqttMessage);
//
//            HttpResponse<JsonNode> response = Unirest.post("http://localhost:8080/sendMessage/coordinateObject")
//                    .header("accept", "application/json")
//                    .header("Content-Type", "application/json")
//                    .body(jsonMessage)
//                    .asJson();
//        } catch (UnirestException e) {
//            throw new RuntimeException(e);
//        }
//    }

}
