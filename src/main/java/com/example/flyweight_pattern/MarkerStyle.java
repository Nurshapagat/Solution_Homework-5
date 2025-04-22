package com.example.flyweight_pattern;

public class MarkerStyle {
    private final String iconType;
    private final String color;
    private final String labelStyle;

    public MarkerStyle(String iconType, String color, String labelStyle) {
        this.iconType = iconType;
        this.color = color;
        this.labelStyle = labelStyle;
    }

    public void applyStyle(String locationName) {
        System.out.println("Rendering " + locationName +
                " with icon: " + iconType +
                ", color: " + color +
                ", label style: " + labelStyle);
    }
}
