// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.json;

import java.io.IOException;

/**
 * Represents a JSON null value. 
 * 
 * @see TODO
 */
public final class JsonNull extends JsonElement {
    private static final JsonNull INSTANCE = new JsonNull();
    private final String nullValue = "null";

    private JsonNull() {
    }

    /**
     * Returns the single instance of the JsonNull class.
     *
     * @return The JsonNull instance, representing the JsonNull Object.
     */
    public static JsonNull getInstance() { 
        return INSTANCE;
    }

    /**
     * Returns the String representation of the JsonNull object.
     *
     * @return The String representation of the JsonNull object.
     */
    @Override
    public String toString() { 
        return this.nullValue; 
    }

    /**
     * Identifies if a JsonElement is of type JsonNull.
     * 
     * @return A boolean value of whether a JsonElement is null.
     */
    @Override
    public boolean isNull() { 
        return true; 
    }

    /**
     * JsonNull as an element in a JsonArray.
     * <p>
     * TODO Javadoc comment
     * 
     * @return A JsonArray with a JsonNull instance as its first element.
     */
    @Override
    public JsonArray asArray() {
        JsonArray output = new JsonArray();
        output.addElement(this);
        return output;
    }

    /**
     * JsonNull as a property in a JsonObject.
     * <p>
     * TODO Javadoc comment
     * 
     * @return The JsonObject with the JsonNull value as a property.
     */
    @Override
    public JsonObject asObject() {
        JsonObject output = new JsonObject();
        output.setProperty("Value", this);
        return output;
    }

    /**
     * Converts JsonNull value to type JsonString.
     * 
     * @return The JsonString representation of a JsonNull object.
     */
    @Override
    public JsonString asString() { 
        return new JsonString(nullValue); 
    }

    /**
     * Writes the JsonSerializable object JsonNull. 
     * 
     * @param jsonWriter JsonWriter that the serialized JsonNull is written to.
     * @return JsonWriter state after the serialized JsonNull has been written to it.
     * @throws IOException Thrown when JsonWriter.writeNull call throws an IOException.
     */
    @Override
    public JsonWriter serialize(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeNull();
        return jsonWriter;
    }
}
