package org.example;

import org.example.DAO.CoordinateDAO;
import org.example.DAO.CoordinateDAOUnirestImpl;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Coordinate coordinate = new Coordinate();
        coordinate.setLatitude(GeneratoreCoordinate.generateLatitude());
        coordinate.setLongitude(GeneratoreCoordinate.generateLongitude());

        System.out.println("CHEST SO E CORDINAT: " + coordinate);

//        double latitude = GeneratoreCoordinate.generateLatitude();
//        double longitude = GeneratoreCoordinate.generateLongitude();

        CoordinateDAO coordinateDAO = new CoordinateDAOUnirestImpl();
        coordinateDAO.sendCoordinata(coordinate);

//        coordinateDAO.sendCoordinate(latitude, longitude);
//
//        System.out.println("Latitude: " + latitude);
//        System.out.println("Longitude: " + longitude);

    }

//    private static double generateLatitude(){
//        Random random = new Random();
//        double minLatitude = -90.0;
//        double maxLatitude = 90.0;
//        System.out.println(minLatitude + (maxLatitude - minLatitude) * random.nextDouble());
//        return minLatitude + (maxLatitude - minLatitude) * random.nextDouble();
//    }
//
//    private static double generateLongitude(){
//        Random random = new Random();
//        double minLongitude = -180.0;
//        double maxLongitude = 180.0;
//        System.out.println(minLongitude + (maxLongitude - minLongitude) * random.nextDouble());
//        return minLongitude + (maxLongitude - minLongitude) * random.nextDouble();
//    }


}