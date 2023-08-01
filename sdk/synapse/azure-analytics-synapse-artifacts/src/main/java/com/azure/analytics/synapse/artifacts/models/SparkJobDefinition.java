// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** Spark job definition. */
@Fluent
public final class SparkJobDefinition {
    /*
     * The description of the Spark job definition.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Big data pool reference.
     */
    @JsonProperty(value = "targetBigDataPool", required = true)
    private BigDataPoolReference targetBigDataPool;

    /*
     * The spark configuration of the spark job.
     */
    @JsonProperty(value = "targetSparkConfiguration")
    private SparkConfigurationReference targetSparkConfiguration;

    /*
     * The required Spark version of the application.
     */
    @JsonProperty(value = "requiredSparkVersion")
    private String requiredSparkVersion;

    /*
     * The language of the Spark application.
     */
    @JsonProperty(value = "language")
    private String language;

    /*
     * The properties of the Spark job.
     */
    @JsonProperty(value = "jobProperties", required = true)
    private SparkJobProperties jobProperties;

    /*
     * The folder that this Spark job definition is in. If not specified, this Spark job definition will appear at the
     * root level.
     */
    @JsonProperty(value = "folder")
    private SparkJobDefinitionFolder folder;

    /*
     * Spark job definition.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /** Creates an instance of SparkJobDefinition class. */
    public SparkJobDefinition() {}

    /**
     * Get the description property: The description of the Spark job definition.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: The description of the Spark job definition.
     *
     * @param description the description value to set.
     * @return the SparkJobDefinition object itself.
     */
    public SparkJobDefinition setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the targetBigDataPool property: Big data pool reference.
     *
     * @return the targetBigDataPool value.
     */
    public BigDataPoolReference getTargetBigDataPool() {
        return this.targetBigDataPool;
    }

    /**
     * Set the targetBigDataPool property: Big data pool reference.
     *
     * @param targetBigDataPool the targetBigDataPool value to set.
     * @return the SparkJobDefinition object itself.
     */
    public SparkJobDefinition setTargetBigDataPool(BigDataPoolReference targetBigDataPool) {
        this.targetBigDataPool = targetBigDataPool;
        return this;
    }

    /**
     * Get the targetSparkConfiguration property: The spark configuration of the spark job.
     *
     * @return the targetSparkConfiguration value.
     */
    public SparkConfigurationReference getTargetSparkConfiguration() {
        return this.targetSparkConfiguration;
    }

    /**
     * Set the targetSparkConfiguration property: The spark configuration of the spark job.
     *
     * @param targetSparkConfiguration the targetSparkConfiguration value to set.
     * @return the SparkJobDefinition object itself.
     */
    public SparkJobDefinition setTargetSparkConfiguration(SparkConfigurationReference targetSparkConfiguration) {
        this.targetSparkConfiguration = targetSparkConfiguration;
        return this;
    }

    /**
     * Get the requiredSparkVersion property: The required Spark version of the application.
     *
     * @return the requiredSparkVersion value.
     */
    public String getRequiredSparkVersion() {
        return this.requiredSparkVersion;
    }

    /**
     * Set the requiredSparkVersion property: The required Spark version of the application.
     *
     * @param requiredSparkVersion the requiredSparkVersion value to set.
     * @return the SparkJobDefinition object itself.
     */
    public SparkJobDefinition setRequiredSparkVersion(String requiredSparkVersion) {
        this.requiredSparkVersion = requiredSparkVersion;
        return this;
    }

    /**
     * Get the language property: The language of the Spark application.
     *
     * @return the language value.
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * Set the language property: The language of the Spark application.
     *
     * @param language the language value to set.
     * @return the SparkJobDefinition object itself.
     */
    public SparkJobDefinition setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Get the jobProperties property: The properties of the Spark job.
     *
     * @return the jobProperties value.
     */
    public SparkJobProperties getJobProperties() {
        return this.jobProperties;
    }

    /**
     * Set the jobProperties property: The properties of the Spark job.
     *
     * @param jobProperties the jobProperties value to set.
     * @return the SparkJobDefinition object itself.
     */
    public SparkJobDefinition setJobProperties(SparkJobProperties jobProperties) {
        this.jobProperties = jobProperties;
        return this;
    }

    /**
     * Get the folder property: The folder that this Spark job definition is in. If not specified, this Spark job
     * definition will appear at the root level.
     *
     * @return the folder value.
     */
    public SparkJobDefinitionFolder getFolder() {
        return this.folder;
    }

    /**
     * Set the folder property: The folder that this Spark job definition is in. If not specified, this Spark job
     * definition will appear at the root level.
     *
     * @param folder the folder value to set.
     * @return the SparkJobDefinition object itself.
     */
    public SparkJobDefinition setFolder(SparkJobDefinitionFolder folder) {
        this.folder = folder;
        return this;
    }

    /**
     * Get the additionalProperties property: Spark job definition.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Spark job definition.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the SparkJobDefinition object itself.
     */
    public SparkJobDefinition setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void setAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }
}
