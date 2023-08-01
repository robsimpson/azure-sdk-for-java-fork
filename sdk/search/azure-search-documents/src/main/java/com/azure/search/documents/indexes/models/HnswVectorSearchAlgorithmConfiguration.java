// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Contains configuration options specific to the hnsw approximate nearest neighbors algorithm used during indexing
 * time.
 */
@Fluent
public final class HnswVectorSearchAlgorithmConfiguration extends VectorSearchAlgorithmConfiguration {
    /*
     * The name of the kind of algorithm being configured for use with vector search. Only `hnsw` is supported in the
     * current preview.
     */
    private static final String KIND = "hnsw";

    /*
     * Contains the parameters specific to hnsw algorithm.
     */
    private HnswParameters parameters;

    /**
     * Creates an instance of HnswVectorSearchAlgorithmConfiguration class.
     *
     * @param name the name value to set.
     */
    public HnswVectorSearchAlgorithmConfiguration(String name) {
        super(name);
    }

    /**
     * Get the parameters property: Contains the parameters specific to hnsw algorithm.
     *
     * @return the parameters value.
     */
    public HnswParameters getParameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Contains the parameters specific to hnsw algorithm.
     *
     * @param parameters the parameters value to set.
     * @return the HnswVectorSearchAlgorithmConfiguration object itself.
     */
    public HnswVectorSearchAlgorithmConfiguration setParameters(HnswParameters parameters) {
        this.parameters = parameters;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind", KIND);
        jsonWriter.writeStringField("name", getName());
        jsonWriter.writeJsonField("hnswParameters", this.parameters);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of HnswVectorSearchAlgorithmConfiguration from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of HnswVectorSearchAlgorithmConfiguration if the JsonReader was pointing to an instance of
     *     it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     *     polymorphic discriminator.
     * @throws IOException If an error occurs while reading the HnswVectorSearchAlgorithmConfiguration.
     */
    public static HnswVectorSearchAlgorithmConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    boolean nameFound = false;
                    String name = null;
                    HnswParameters parameters = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("kind".equals(fieldName)) {
                            String kind = reader.getString();
                            if (!KIND.equals(kind)) {
                                throw new IllegalStateException(
                                        "'kind' was expected to be non-null and equal to '"
                                                + KIND
                                                + "'. The found 'kind' was '"
                                                + kind
                                                + "'.");
                            }
                        } else if ("name".equals(fieldName)) {
                            name = reader.getString();
                            nameFound = true;
                        } else if ("hnswParameters".equals(fieldName)) {
                            parameters = HnswParameters.fromJson(reader);
                        } else {
                            reader.skipChildren();
                        }
                    }
                    if (nameFound) {
                        HnswVectorSearchAlgorithmConfiguration deserializedHnswVectorSearchAlgorithmConfiguration =
                                new HnswVectorSearchAlgorithmConfiguration(name);
                        deserializedHnswVectorSearchAlgorithmConfiguration.parameters = parameters;

                        return deserializedHnswVectorSearchAlgorithmConfiguration;
                    }
                    List<String> missingProperties = new ArrayList<>();
                    if (!nameFound) {
                        missingProperties.add("name");
                    }

                    throw new IllegalStateException(
                            "Missing required property/properties: " + String.join(", ", missingProperties));
                });
    }
}
