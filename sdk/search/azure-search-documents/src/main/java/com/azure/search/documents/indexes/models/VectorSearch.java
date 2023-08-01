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
import java.util.List;

/** Contains configuration options related to vector search. */
@Fluent
public final class VectorSearch implements JsonSerializable<VectorSearch> {
    /*
     * Contains configuration options specific to the algorithm used during indexing time.
     */
    private List<VectorSearchAlgorithmConfiguration> algorithmConfigurations;

    /** Creates an instance of VectorSearch class. */
    public VectorSearch() {}

    /**
     * Get the algorithmConfigurations property: Contains configuration options specific to the algorithm used during
     * indexing time.
     *
     * @return the algorithmConfigurations value.
     */
    public List<VectorSearchAlgorithmConfiguration> getAlgorithmConfigurations() {
        return this.algorithmConfigurations;
    }

    /**
     * Set the algorithmConfigurations property: Contains configuration options specific to the algorithm used during
     * indexing time.
     *
     * @param algorithmConfigurations the algorithmConfigurations value to set.
     * @return the VectorSearch object itself.
     */
    public VectorSearch setAlgorithmConfigurations(List<VectorSearchAlgorithmConfiguration> algorithmConfigurations) {
        this.algorithmConfigurations = algorithmConfigurations;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField(
                "algorithmConfigurations",
                this.algorithmConfigurations,
                (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VectorSearch from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of VectorSearch if the JsonReader was pointing to an instance of it, or null if it was
     *     pointing to JSON null.
     * @throws IOException If an error occurs while reading the VectorSearch.
     */
    public static VectorSearch fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    VectorSearch deserializedVectorSearch = new VectorSearch();
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("algorithmConfigurations".equals(fieldName)) {
                            List<VectorSearchAlgorithmConfiguration> algorithmConfigurations =
                                    reader.readArray(reader1 -> VectorSearchAlgorithmConfiguration.fromJson(reader1));
                            deserializedVectorSearch.algorithmConfigurations = algorithmConfigurations;
                        } else {
                            reader.skipChildren();
                        }
                    }

                    return deserializedVectorSearch;
                });
    }
}
