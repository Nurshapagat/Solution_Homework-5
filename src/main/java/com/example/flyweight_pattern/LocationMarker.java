package com.example.flyweight_pattern;

public class LocationMarker {
    private final String name;
    private final double latitude;
    private final double longitude;
    private final MarkerStyle style;  // Shared flyweight

    public LocationMarker(String name, double latitude, double longitude, MarkerStyle style) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.style = style;
    }

    public void render() {
        style.applyStyle(name + " @ [" + latitude + ", " + longitude + "]");
    }
}
