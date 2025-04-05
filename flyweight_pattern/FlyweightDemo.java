package com.example.flyweight_pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FlyweightDemo {
    public static void main(String[] args) {
        List<LocationMarker> allMarkers = new ArrayList<>();
        String[] types = {"Hospital", "Restaurant", "GasStation"};
        Random random = new Random();

        for (int i = 0; i < 10000; i++) {
            String type = types[random.nextInt(types.length)];
            String color = switch (type) {
                case "Hospital" -> "Red";
                case "Restaurant" -> "Green";
                case "GasStation" -> "Blue";
                default -> "Gray";
            };

            String labelStyle = "Bold";

            MarkerStyle style = MarkerStyleFactory.getStyle(type, color, labelStyle);

            LocationMarker marker = new LocationMarker(
                    type + " #" + (i + 1),
                    random.nextDouble() * 90,
                    random.nextDouble() * 180,
                    style
            );

            allMarkers.add(marker);
        }

        for (int i = 0; i < 5; i++) {
            allMarkers.get(i).render();
        }

        System.out.println("\nЖалпы маркерлер саны: " + allMarkers.size());
        System.out.println("Уникалды стиль объектілері: " + MarkerStyleFactory.getUniqueStyleCount());
    }
}
