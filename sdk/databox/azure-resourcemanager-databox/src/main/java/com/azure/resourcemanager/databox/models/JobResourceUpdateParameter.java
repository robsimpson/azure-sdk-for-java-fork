// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.databox.fluent.models.UpdateJobProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The JobResourceUpdateParameter. */
@Fluent
public final class JobResourceUpdateParameter {
    /*
     * Properties of a job to be updated.
     */
    @JsonProperty(value = "properties")
    private UpdateJobProperties innerProperties;

    /*
     * The list of key value pairs that describe the resource. These tags can be used in viewing and grouping this
     * resource (across resource groups).
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * Msi identity of the resource
     */
    @JsonProperty(value = "identity")
    private ResourceIdentity identity;

    /** Creates an instance of JobResourceUpdateParameter class. */
    public JobResourceUpdateParameter() {
    }

    /**
     * Get the innerProperties property: Properties of a job to be updated.
     *
     * @return the innerProperties value.
     */
    private UpdateJobProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the tags property: The list of key value pairs that describe the resource. These tags can be used in viewing
     * and grouping this resource (across resource groups).
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: The list of key value pairs that describe the resource. These tags can be used in viewing
     * and grouping this resource (across resource groups).
     *
     * @param tags the tags value to set.
     * @return the JobResourceUpdateParameter object itself.
     */
    public JobResourceUpdateParameter withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the identity property: Msi identity of the resource.
     *
     * @return the identity value.
     */
    public ResourceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Msi identity of the resource.
     *
     * @param identity the identity value to set.
     * @return the JobResourceUpdateParameter object itself.
     */
    public JobResourceUpdateParameter withIdentity(ResourceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the details property: Details of a job to be updated.
     *
     * @return the details value.
     */
    public UpdateJobDetails details() {
        return this.innerProperties() == null ? null : this.innerProperties().details();
    }

    /**
     * Set the details property: Details of a job to be updated.
     *
     * @param details the details value to set.
     * @return the JobResourceUpdateParameter object itself.
     */
    public JobResourceUpdateParameter withDetails(UpdateJobDetails details) {
        if (this.innerProperties() == null) {
            this.innerProperties = new UpdateJobProperties();
        }
        this.innerProperties().withDetails(details);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
    }
}
