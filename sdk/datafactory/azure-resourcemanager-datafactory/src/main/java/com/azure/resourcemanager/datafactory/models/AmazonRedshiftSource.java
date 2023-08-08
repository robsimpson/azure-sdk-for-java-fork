// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A copy activity source for Amazon Redshift Source. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AmazonRedshiftSource")
@Fluent
public final class AmazonRedshiftSource extends TabularSource {
    /*
     * Database query. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "query")
    private Object query;

    /*
     * The Amazon S3 settings needed for the interim Amazon S3 when copying from Amazon Redshift with unload. With
     * this, data from Amazon Redshift source will be unloaded into S3 first and then copied into the targeted sink
     * from the interim S3.
     */
    @JsonProperty(value = "redshiftUnloadSettings")
    private RedshiftUnloadSettings redshiftUnloadSettings;

    /** Creates an instance of AmazonRedshiftSource class. */
    public AmazonRedshiftSource() {
    }

    /**
     * Get the query property: Database query. Type: string (or Expression with resultType string).
     *
     * @return the query value.
     */
    public Object query() {
        return this.query;
    }

    /**
     * Set the query property: Database query. Type: string (or Expression with resultType string).
     *
     * @param query the query value to set.
     * @return the AmazonRedshiftSource object itself.
     */
    public AmazonRedshiftSource withQuery(Object query) {
        this.query = query;
        return this;
    }

    /**
     * Get the redshiftUnloadSettings property: The Amazon S3 settings needed for the interim Amazon S3 when copying
     * from Amazon Redshift with unload. With this, data from Amazon Redshift source will be unloaded into S3 first and
     * then copied into the targeted sink from the interim S3.
     *
     * @return the redshiftUnloadSettings value.
     */
    public RedshiftUnloadSettings redshiftUnloadSettings() {
        return this.redshiftUnloadSettings;
    }

    /**
     * Set the redshiftUnloadSettings property: The Amazon S3 settings needed for the interim Amazon S3 when copying
     * from Amazon Redshift with unload. With this, data from Amazon Redshift source will be unloaded into S3 first and
     * then copied into the targeted sink from the interim S3.
     *
     * @param redshiftUnloadSettings the redshiftUnloadSettings value to set.
     * @return the AmazonRedshiftSource object itself.
     */
    public AmazonRedshiftSource withRedshiftUnloadSettings(RedshiftUnloadSettings redshiftUnloadSettings) {
        this.redshiftUnloadSettings = redshiftUnloadSettings;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AmazonRedshiftSource withQueryTimeout(Object queryTimeout) {
        super.withQueryTimeout(queryTimeout);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AmazonRedshiftSource withAdditionalColumns(Object additionalColumns) {
        super.withAdditionalColumns(additionalColumns);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AmazonRedshiftSource withSourceRetryCount(Object sourceRetryCount) {
        super.withSourceRetryCount(sourceRetryCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AmazonRedshiftSource withSourceRetryWait(Object sourceRetryWait) {
        super.withSourceRetryWait(sourceRetryWait);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AmazonRedshiftSource withMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.withMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AmazonRedshiftSource withDisableMetricsCollection(Object disableMetricsCollection) {
        super.withDisableMetricsCollection(disableMetricsCollection);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (redshiftUnloadSettings() != null) {
            redshiftUnloadSettings().validate();
        }
    }
}
