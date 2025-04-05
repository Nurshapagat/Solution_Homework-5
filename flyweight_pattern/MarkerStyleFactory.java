package com.example.flyweight_pattern;

import java.util.HashMap;
import java.util.Map;

public class MarkerStyleFactory {
    private static final Map<String, MarkerStyle> styleCache = new HashMap<>();

    public static MarkerStyle getStyle(String iconType, String color, String labelStyle) {
        String key = iconType + "_" + color + "_" + labelStyle;

        if (!styleCache.containsKey(key)) {
            styleCache.put(key, new MarkerStyle(iconType, color, labelStyle));
        }

        return styleCache.get(key);
    }

    public static int getUniqueStyleCount() {
        return styleCache.size();
    }
}
