// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The check availability result. */
@Fluent
public class CheckNameAvailabilityResponse {
    /*
     * Indicates if the resource name is available.
     */
    @JsonProperty(value = "nameAvailable")
    private Boolean nameAvailable;

    /*
     * The reason why the given name is not available.
     */
    @JsonProperty(value = "reason")
    private CheckNameAvailabilityReason reason;

    /*
     * Detailed reason why the given name is available.
     */
    @JsonProperty(value = "message")
    private String message;

    /** Creates an instance of CheckNameAvailabilityResponse class. */
    public CheckNameAvailabilityResponse() {
    }

    /**
     * Get the nameAvailable property: Indicates if the resource name is available.
     *
     * @return the nameAvailable value.
     */
    public Boolean nameAvailable() {
        return this.nameAvailable;
    }

    /**
     * Set the nameAvailable property: Indicates if the resource name is available.
     *
     * @param nameAvailable the nameAvailable value to set.
     * @return the CheckNameAvailabilityResponse object itself.
     */
    public CheckNameAvailabilityResponse withNameAvailable(Boolean nameAvailable) {
        this.nameAvailable = nameAvailable;
        return this;
    }

    /**
     * Get the reason property: The reason why the given name is not available.
     *
     * @return the reason value.
     */
    public CheckNameAvailabilityReason reason() {
        return this.reason;
    }

    /**
     * Set the reason property: The reason why the given name is not available.
     *
     * @param reason the reason value to set.
     * @return the CheckNameAvailabilityResponse object itself.
     */
    public CheckNameAvailabilityResponse withReason(CheckNameAvailabilityReason reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Get the message property: Detailed reason why the given name is available.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: Detailed reason why the given name is available.
     *
     * @param message the message value to set.
     * @return the CheckNameAvailabilityResponse object itself.
     */
    public CheckNameAvailabilityResponse withMessage(String message) {
        this.message = message;
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
