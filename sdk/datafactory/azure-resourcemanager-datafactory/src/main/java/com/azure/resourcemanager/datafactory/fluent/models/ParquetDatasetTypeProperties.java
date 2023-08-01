// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.DatasetLocation;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Parquet dataset properties. */
@Fluent
public final class ParquetDatasetTypeProperties {
    /*
     * The location of the parquet storage.
     */
    @JsonProperty(value = "location", required = true)
    private DatasetLocation location;

    /*
     * The data compressionCodec. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "compressionCodec")
    private Object compressionCodec;

    /** Creates an instance of ParquetDatasetTypeProperties class. */
    public ParquetDatasetTypeProperties() {
    }

    /**
     * Get the location property: The location of the parquet storage.
     *
     * @return the location value.
     */
    public DatasetLocation location() {
        return this.location;
    }

    /**
     * Set the location property: The location of the parquet storage.
     *
     * @param location the location value to set.
     * @return the ParquetDatasetTypeProperties object itself.
     */
    public ParquetDatasetTypeProperties withLocation(DatasetLocation location) {
        this.location = location;
        return this;
    }

    /**
     * Get the compressionCodec property: The data compressionCodec. Type: string (or Expression with resultType
     * string).
     *
     * @return the compressionCodec value.
     */
    public Object compressionCodec() {
        return this.compressionCodec;
    }

    /**
     * Set the compressionCodec property: The data compressionCodec. Type: string (or Expression with resultType
     * string).
     *
     * @param compressionCodec the compressionCodec value to set.
     * @return the ParquetDatasetTypeProperties object itself.
     */
    public ParquetDatasetTypeProperties withCompressionCodec(Object compressionCodec) {
        this.compressionCodec = compressionCodec;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (location() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property location in model ParquetDatasetTypeProperties"));
        } else {
            location().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ParquetDatasetTypeProperties.class);
}
