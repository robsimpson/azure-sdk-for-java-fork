// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents an index alias, which describes a mapping from the alias name to an index. The alias name can be used in
 * place of the index name for supported operations.
 */
@Fluent
public final class SearchAlias implements JsonSerializable<SearchAlias> {
    /*
     * The name of the alias.
     */
    private final String name;

    /*
     * The name of the index this alias maps to. Only one index name may be specified.
     */
    private final List<String> indexes;

    /*
     * The ETag of the alias.
     */
    private String eTag;

    /**
     * Creates an instance of SearchAlias class.
     *
     * @param name the name value to set.
     * @param indexes the indexes value to set.
     */
    public SearchAlias(String name, List<String> indexes) {
        this.name = name;
        this.indexes = indexes;
    }

    /**
     * Get the name property: The name of the alias.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the indexes property: The name of the index this alias maps to. Only one index name may be specified.
     *
     * @return the indexes value.
     */
    public List<String> getIndexes() {
        return this.indexes;
    }

    /**
     * Get the eTag property: The ETag of the alias.
     *
     * @return the eTag value.
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The ETag of the alias.
     *
     * @param eTag the eTag value to set.
     * @return the SearchAlias object itself.
     */
    public SearchAlias setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeArrayField("indexes", this.indexes, (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("@odata.etag", this.eTag);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SearchAlias from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of SearchAlias if the JsonReader was pointing to an instance of it, or null if it was
     *     pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SearchAlias.
     */
    public static SearchAlias fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    boolean nameFound = false;
                    String name = null;
                    boolean indexesFound = false;
                    List<String> indexes = null;
                    String eTag = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("name".equals(fieldName)) {
                            name = reader.getString();
                            nameFound = true;
                        } else if ("indexes".equals(fieldName)) {
                            indexes = reader.readArray(reader1 -> reader1.getString());
                            indexesFound = true;
                        } else if ("@odata.etag".equals(fieldName)) {
                            eTag = reader.getString();
                        } else {
                            reader.skipChildren();
                        }
                    }
                    if (nameFound && indexesFound) {
                        SearchAlias deserializedSearchAlias = new SearchAlias(name, indexes);
                        deserializedSearchAlias.eTag = eTag;

                        return deserializedSearchAlias;
                    }
                    List<String> missingProperties = new ArrayList<>();
                    if (!nameFound) {
                        missingProperties.add("name");
                    }
                    if (!indexesFound) {
                        missingProperties.add("indexes");
                    }

                    throw new IllegalStateException(
                            "Missing required property/properties: " + String.join(", ", missingProperties));
                });
    }
}
