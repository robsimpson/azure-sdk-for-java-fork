// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** An error that occurred when autoscaling a pool. */
@Fluent
public final class AutoScaleRunError {
    /*
     * An identifier for the error. Codes are invariant and are intended to be consumed programmatically.
     */
    @JsonProperty(value = "code", required = true)
    private String code;

    /*
     * A message describing the error, intended to be suitable for display in a user interface.
     */
    @JsonProperty(value = "message", required = true)
    private String message;

    /*
     * Additional details about the error.
     */
    @JsonProperty(value = "details")
    private List<AutoScaleRunError> details;

    /** Creates an instance of AutoScaleRunError class. */
    public AutoScaleRunError() {
    }

    /**
     * Get the code property: An identifier for the error. Codes are invariant and are intended to be consumed
     * programmatically.
     *
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code property: An identifier for the error. Codes are invariant and are intended to be consumed
     * programmatically.
     *
     * @param code the code value to set.
     * @return the AutoScaleRunError object itself.
     */
    public AutoScaleRunError withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message property: A message describing the error, intended to be suitable for display in a user
     * interface.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: A message describing the error, intended to be suitable for display in a user
     * interface.
     *
     * @param message the message value to set.
     * @return the AutoScaleRunError object itself.
     */
    public AutoScaleRunError withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the details property: Additional details about the error.
     *
     * @return the details value.
     */
    public List<AutoScaleRunError> details() {
        return this.details;
    }

    /**
     * Set the details property: Additional details about the error.
     *
     * @param details the details value to set.
     * @return the AutoScaleRunError object itself.
     */
    public AutoScaleRunError withDetails(List<AutoScaleRunError> details) {
        this.details = details;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (code() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property code in model AutoScaleRunError"));
        }
        if (message() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property message in model AutoScaleRunError"));
        }
        if (details() != null) {
            details().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AutoScaleRunError.class);
}
