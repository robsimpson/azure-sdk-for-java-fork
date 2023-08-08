// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A copy activity Parquet sink. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("ParquetSink")
@Fluent
public final class ParquetSink extends CopySink {
    /*
     * Parquet store settings.
     */
    @JsonProperty(value = "storeSettings")
    private StoreWriteSettings storeSettings;

    /*
     * Parquet format settings.
     */
    @JsonProperty(value = "formatSettings")
    private ParquetWriteSettings formatSettings;

    /** Creates an instance of ParquetSink class. */
    public ParquetSink() {}

    /**
     * Get the storeSettings property: Parquet store settings.
     *
     * @return the storeSettings value.
     */
    public StoreWriteSettings getStoreSettings() {
        return this.storeSettings;
    }

    /**
     * Set the storeSettings property: Parquet store settings.
     *
     * @param storeSettings the storeSettings value to set.
     * @return the ParquetSink object itself.
     */
    public ParquetSink setStoreSettings(StoreWriteSettings storeSettings) {
        this.storeSettings = storeSettings;
        return this;
    }

    /**
     * Get the formatSettings property: Parquet format settings.
     *
     * @return the formatSettings value.
     */
    public ParquetWriteSettings getFormatSettings() {
        return this.formatSettings;
    }

    /**
     * Set the formatSettings property: Parquet format settings.
     *
     * @param formatSettings the formatSettings value to set.
     * @return the ParquetSink object itself.
     */
    public ParquetSink setFormatSettings(ParquetWriteSettings formatSettings) {
        this.formatSettings = formatSettings;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ParquetSink setWriteBatchSize(Object writeBatchSize) {
        super.setWriteBatchSize(writeBatchSize);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ParquetSink setWriteBatchTimeout(Object writeBatchTimeout) {
        super.setWriteBatchTimeout(writeBatchTimeout);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ParquetSink setSinkRetryCount(Object sinkRetryCount) {
        super.setSinkRetryCount(sinkRetryCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ParquetSink setSinkRetryWait(Object sinkRetryWait) {
        super.setSinkRetryWait(sinkRetryWait);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ParquetSink setMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.setMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }
}
