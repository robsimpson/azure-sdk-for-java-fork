package com.azure.json;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 * Class representing the JSON array type
 */
public class JsonArray extends JsonElement {
    /**
     * Stores the JsonElements nested in this JsonArray object.
     * Each of these elements should be one of the following valid JSON types:
     * object, array, string, number, boolean, and null.
     */
    List<JsonElement> elements = new ArrayList<>();


    /**
     * Adds a JsonElement object as a nested element within the JsonArray object,
     * appending it to the end.
     *
     * @param element a JsonElement object representing one of the valid JSON
     * types: object, array, string, number, boolean, and null
     * @return JsonArray object representing the new state of the JsonArray object
     * after the addition of the new JsonElement object appended.
     */
    public JsonArray addElement(JsonElement element) {
        this.elements.add(element);
        return this;
    }

    /**
     * Adds a JsonElement object as a nested element within the JsonArray object
     * at a particular index, shifting the existing elements from that index to
     * the right.
     *
     * @param element a JsonElement object representing one of the valid JSON
     * types: object, array, string, number, boolean, and null
     * @param index the element index within the JsonArray to add the new JsonElement
     * object and where to shift from
     * @return JsonArray object representing the new state of the JsonArray object
     * after the addition of the new JsonElement object.
     * TODO: throws error(s) relating to the index in respect to the current state
     * of the elements ArrayList
     */
    public JsonArray addElement(int index, JsonElement element) {
        // TODO: check for out of bounds
        this.elements.add(index, element);
        return this;
    }

    /**
     * Sets the index of the JsonArray to the specified JsonElement object,
     * replacing the existing JsonElement object at this index.
     *
     * @param element a JsonElement object representing one of the valid JSON
     * types: object, array, string, number, boolean, and null
     * @param index the element index within the JsonArray to replace the current
     * JsonElement with the newly specified JsonElement object
     * @return JsonArray object representing the new state of the JsonArray object
     * after the setting of the new JsonElement object at index.
     *
     * TODO: maybe rename this to replaceElement due to the nature of the
     * ArrayList.set() method
     * TODO: throws error(s) relating to the index in respect to the current state
     * of the elements ArrayList
     */
    public JsonArray setElement(int index, JsonElement element) {
        // TODO: check for out of bounds
        this.elements.set(index, element);
        return this;
    }

    /**
     * Returns a specified JsonElement object from the JsonArray by index
     *
     * @param index the index specifying which JsonElement from the JsonArray
     * object to return.
     * @return the JsonElement by index from the JsonArray
     *
     * TODO: throws error(s) relating to the index in respect to the current state
     * of the elements ArrayList
     */
    public JsonElement getElement(int index) {
        // TODO: check for index out of bounds
        return this.elements.get(index);
    }

    /**
     * Removes a specified JsonElement object from the JsonArray
     *
     * @param index the index specifying which JsonElement from the JsonArray
     * object to remove.
     *
     * TODO: may want to change the return to returning the removed JsonElement
     * object.
     *
     * TODO: throws error(s) relating to the index in respect to the current state
     * of the elements ArrayList
     */
    public JsonElement removeElement(int index) {
        // TODO: check for index out of bounds
        this.elements.remove(index);
        return this;
    }

    /**
     * Returns the String representation of the JsonArray object
     *
     * @return String representation of the JsonArray object
     */
    public String toJson() {
        // String reference that will store the resulting JSON string output to
        // be returned by toJson
        String jsonOutput = "";

        // Iterating over all JsonElement objects in the elements JsonArray object,
        // appending each JsonElement to jsonOutput
        for(Iterator<JsonElement> itr = this.elements.iterator(); itr.hasNext();) {
            // Get the next JsonElement from the elements JsonArray object
            JsonElement element = itr.next();

            // Case: element is a JsonObject, therefore the whole JSON object can
            // be stringified via its toJson method, then appended to jsonOutput
            if(element instanceof JsonObject) {
                jsonOutput += ((JsonObject)element).toJson();
            }
            // Case: element is a JsonArray, therefore the nested JSON array can
            // be stringified via recursively calling toJson and then appending
            // the returned String to jsonOutput
            else if(element instanceof JsonArray) {
                jsonOutput += ((JsonArray)element).toJson();
            }
            // Case: element is not a JsonObject or JsonArray, therefore it can
            // be simply converted to a String object and appended to jsonOutput
            else { jsonOutput += element; }

            // Case: haven't reached the end of the JSON array, therefore more
            // elements must be converted to String objects and appended to the
            // jsonOutput
            // Elements are separated by commas.
            if(itr.hasNext()) { jsonOutput += ", "; }
        }

        // Returning the resulting String representation of the JsonArray object
        // JSON arrays are delimited by opening and closing square brackets.
        return "[" + jsonOutput + "]";
    }

    /**
     * @return boolean of whether this JsonElement object is of type JsonArray.
     */
    @Override
    public boolean isArray() { return true; }

    /**
     * @return String representation of the JsonArray. This functionality is
     * defined within the toJson method.
     */
    @Override
    public String toString() { return this.toJson();}
}
