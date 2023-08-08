// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The LinkTableRequestTarget model. */
@Fluent
public final class LinkTableRequestTarget {
    /*
     * Target table table name
     */
    @JsonProperty(value = "tableName")
    private String tableName;

    /*
     * Target table schema name
     */
    @JsonProperty(value = "schemaName")
    private String schemaName;

    /*
     * Target table distribution options for link table request
     */
    @JsonProperty(value = "distributionOptions")
    private LinkTableRequestTargetDistributionOptions distributionOptions;

    /*
     * Target table structure options for link table request
     */
    @JsonProperty(value = "structureOptions")
    private LinkTableRequestTargetStructureOptions structureOptions;

    /** Creates an instance of LinkTableRequestTarget class. */
    public LinkTableRequestTarget() {}

    /**
     * Get the tableName property: Target table table name.
     *
     * @return the tableName value.
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * Set the tableName property: Target table table name.
     *
     * @param tableName the tableName value to set.
     * @return the LinkTableRequestTarget object itself.
     */
    public LinkTableRequestTarget setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * Get the schemaName property: Target table schema name.
     *
     * @return the schemaName value.
     */
    public String getSchemaName() {
        return this.schemaName;
    }

    /**
     * Set the schemaName property: Target table schema name.
     *
     * @param schemaName the schemaName value to set.
     * @return the LinkTableRequestTarget object itself.
     */
    public LinkTableRequestTarget setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * Get the distributionOptions property: Target table distribution options for link table request.
     *
     * @return the distributionOptions value.
     */
    public LinkTableRequestTargetDistributionOptions getDistributionOptions() {
        return this.distributionOptions;
    }

    /**
     * Set the distributionOptions property: Target table distribution options for link table request.
     *
     * @param distributionOptions the distributionOptions value to set.
     * @return the LinkTableRequestTarget object itself.
     */
    public LinkTableRequestTarget setDistributionOptions(
            LinkTableRequestTargetDistributionOptions distributionOptions) {
        this.distributionOptions = distributionOptions;
        return this;
    }

    /**
     * Get the structureOptions property: Target table structure options for link table request.
     *
     * @return the structureOptions value.
     */
    public LinkTableRequestTargetStructureOptions getStructureOptions() {
        return this.structureOptions;
    }

    /**
     * Set the structureOptions property: Target table structure options for link table request.
     *
     * @param structureOptions the structureOptions value to set.
     * @return the LinkTableRequestTarget object itself.
     */
    public LinkTableRequestTarget setStructureOptions(LinkTableRequestTargetStructureOptions structureOptions) {
        this.structureOptions = structureOptions;
        return this;
    }
}
