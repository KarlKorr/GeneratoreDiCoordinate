package org.example;

import java.util.Random;

public class GeneratoreCoordinate {

    public static double generateLatitude(){
        Random random = new Random();
        double minLatitude = -90.0;
        double maxLatitude = 90.0;
        System.out.println(minLatitude + (maxLatitude - minLatitude) * random.nextDouble());
        return minLatitude + (maxLatitude - minLatitude) * random.nextDouble();
    }

    public static double generateLongitude(){
        Random random = new Random();
        double minLongitude = -180.0;
        double maxLongitude = 180.0;
        System.out.println(minLongitude + (maxLongitude - minLongitude) * random.nextDouble());
        return minLongitude + (maxLongitude - minLongitude) * random.nextDouble();
    }


}
