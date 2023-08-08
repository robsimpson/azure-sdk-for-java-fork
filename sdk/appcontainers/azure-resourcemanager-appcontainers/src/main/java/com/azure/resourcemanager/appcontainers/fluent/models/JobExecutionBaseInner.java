// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Container App's Job execution name. */
@Fluent
public final class JobExecutionBaseInner {
    /*
     * Job execution name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Job execution Id.
     */
    @JsonProperty(value = "id")
    private String id;

    /** Creates an instance of JobExecutionBaseInner class. */
    public JobExecutionBaseInner() {
    }

    /**
     * Get the name property: Job execution name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Job execution name.
     *
     * @param name the name value to set.
     * @return the JobExecutionBaseInner object itself.
     */
    public JobExecutionBaseInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the id property: Job execution Id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Job execution Id.
     *
     * @param id the id value to set.
     * @return the JobExecutionBaseInner object itself.
     */
    public JobExecutionBaseInner withId(String id) {
        this.id = id;
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
