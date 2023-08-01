// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Job output definition container information on where to find job output/logs. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "jobOutputType",
    defaultImpl = JobOutput.class)
@JsonTypeName("JobOutput")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "custom_model", value = CustomModelJobOutput.class),
    @JsonSubTypes.Type(name = "mlflow_model", value = MLFlowModelJobOutput.class),
    @JsonSubTypes.Type(name = "mltable", value = MLTableJobOutput.class),
    @JsonSubTypes.Type(name = "triton_model", value = TritonModelJobOutput.class),
    @JsonSubTypes.Type(name = "uri_file", value = UriFileJobOutput.class),
    @JsonSubTypes.Type(name = "uri_folder", value = UriFolderJobOutput.class)
})
@Fluent
public class JobOutput {
    /*
     * Description for the output.
     */
    @JsonProperty(value = "description")
    private String description;

    /** Creates an instance of JobOutput class. */
    public JobOutput() {
    }

    /**
     * Get the description property: Description for the output.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description for the output.
     *
     * @param description the description value to set.
     * @return the JobOutput object itself.
     */
    public JobOutput withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
