package me.insanitydev.utils;

import java.awt.*;
import java.util.Random;

public class ColorUtils {

    private static final Random random = new Random();

    //Utility classes are not meant to be instantiated.
    private ColorUtils() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Creates a random color with additional brightness.
     *
     * @param brightnessIncrease Defines how much brighter the color is.
     * @return The random color.
     */
    public static Color randomColor(float brightnessIncrease) {
        float red = random.nextFloat() + brightnessIncrease;
        float green = random.nextFloat() + brightnessIncrease;
        float blue = random.nextFloat() + brightnessIncrease;

        return new Color(red, green, blue);
    }

    /**
     * Creates a random color with no additional brightness.
     *
     * @return The random color.
     */
    public static Color randomColor() {
        return new Color(random.nextFloat(), random.nextFloat(), random.nextFloat());
    }

}
