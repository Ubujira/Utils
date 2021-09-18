package me.insanitydev.utils;

import com.google.gson.*;

import java.io.*;

public class JsonUtils {

    //Utility classes are not meant to be instantiated.
    private JsonUtils() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Reads json from a file.
     *
     * @param file The file to read from.
     * @return The Json element.
     * @throws FileNotFoundException If the file doesn't exist.
     */
    public static JsonElement readJsonFromFile(File file) throws FileNotFoundException {
        if (file.exists()) {
            return JsonParser.parseReader(new FileReader(file));
        }
        return null;
    }

    /**
     * Writes a Json object to a file.
     * @param file The file to write to.
     * @param jsonObject The json object to write to the file.
     * @throws IOException If the file can't be written to.
     */
    public static void writeJsonObjectToFile(File file, JsonObject jsonObject) throws IOException {
        try (Writer writer = new FileWriter(file)) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(jsonObject, writer);
        }
    }

}
