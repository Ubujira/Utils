package me.insanitydev.utils;

public class MathUtils {

    //Utility classes are not meant to be instantiated.
    private MathUtils() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Makes sure that the provided integer is within a defined range.
     * This does the exact same thing that {@link MathUtils#clamp(int, int, int)} does.
     *
     * @param value The integer to check.
     * @param min   The minimum value it must be.
     * @param max   The maximum value it can be.
     * @return The same value or a value at minimum or maximum.
     */
    public static int ensureRange(int value, int min, int max) {
        return clamp(value, min, max);
    }

    /**
     * Makes sure that the provided integer is within a defined range.
     *
     * @param value The integer to check.
     * @param min   The minimum value it must be.
     * @param max   The maximum value it can be.
     * @return The same value or a value at minimum or maximum.
     */
    public static int clamp(int value, int min, int max) {
        return Math.min(Math.max(value, min), max);
    }

    /**
     * Makes sure that the provided float is within a defined range.
     *
     * @param value The float to check.
     * @param min   The minimum value it must be.
     * @param max   The maximum value it can be.
     * @return The same value or a value at minimum or maximum.
     */
    public static float clamp(float value, float min, float max) {
        return Math.min(Math.max(value, min), max);
    }

    /**
     * Checks if the integer is within the defined range.
     *
     * @param value The integer to check.
     * @param min   The minimum value.
     * @param max   The maximum value.
     * @return Whether the value is between the minimum and maximum value.
     */
    public static boolean isInRange(int value, int min, int max) {
        return (value <= max) && (value >= min);
    }

}
