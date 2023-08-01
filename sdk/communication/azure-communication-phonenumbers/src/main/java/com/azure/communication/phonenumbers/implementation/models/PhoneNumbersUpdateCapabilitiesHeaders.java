// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.phonenumbers.implementation.models;

import com.azure.communication.phonenumbers.CodeCoverageAnnotation.Generated;
import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The PhoneNumbersUpdateCapabilitiesHeaders model. */
@Fluent
@Generated
public final class PhoneNumbersUpdateCapabilitiesHeaders {
    /*
     * The capabilities-id property.
     */
    @JsonProperty(value = "capabilities-id")
    private String capabilitiesId;

    /*
     * The operation-id property.
     */
    @JsonProperty(value = "operation-id")
    private String operationId;

    /*
     * The Operation-Location property.
     */
    @JsonProperty(value = "Operation-Location")
    private String operationLocation;

    /*
     * The Location property.
     */
    @JsonProperty(value = "Location")
    private String location;

    /**
     * Get the capabilitiesId property: The capabilities-id property.
     *
     * @return the capabilitiesId value.
     */
    public String getCapabilitiesId() {
        return this.capabilitiesId;
    }

    /**
     * Set the capabilitiesId property: The capabilities-id property.
     *
     * @param capabilitiesId the capabilitiesId value to set.
     * @return the PhoneNumbersUpdateCapabilitiesHeaders object itself.
     */
    public PhoneNumbersUpdateCapabilitiesHeaders setCapabilitiesId(String capabilitiesId) {
        this.capabilitiesId = capabilitiesId;
        return this;
    }

    /**
     * Get the operationId property: The operation-id property.
     *
     * @return the operationId value.
     */
    public String getOperationId() {
        return this.operationId;
    }

    /**
     * Set the operationId property: The operation-id property.
     *
     * @param operationId the operationId value to set.
     * @return the PhoneNumbersUpdateCapabilitiesHeaders object itself.
     */
    public PhoneNumbersUpdateCapabilitiesHeaders setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }

    /**
     * Get the operationLocation property: The Operation-Location property.
     *
     * @return the operationLocation value.
     */
    public String getOperationLocation() {
        return this.operationLocation;
    }

    /**
     * Set the operationLocation property: The Operation-Location property.
     *
     * @param operationLocation the operationLocation value to set.
     * @return the PhoneNumbersUpdateCapabilitiesHeaders object itself.
     */
    public PhoneNumbersUpdateCapabilitiesHeaders setOperationLocation(String operationLocation) {
        this.operationLocation = operationLocation;
        return this;
    }

    /**
     * Get the location property: The Location property.
     *
     * @return the location value.
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * Set the location property: The Location property.
     *
     * @param location the location value to set.
     * @return the PhoneNumbersUpdateCapabilitiesHeaders object itself.
     */
    public PhoneNumbersUpdateCapabilitiesHeaders setLocation(String location) {
        this.location = location;
        return this;
    }
}
