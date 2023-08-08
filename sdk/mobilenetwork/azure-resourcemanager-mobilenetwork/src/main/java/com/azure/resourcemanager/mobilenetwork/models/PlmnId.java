// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Public land mobile network (PLMN) ID. */
@Fluent
public final class PlmnId {
    /*
     * Mobile country code (MCC).
     */
    @JsonProperty(value = "mcc", required = true)
    private String mcc;

    /*
     * Mobile network code (MNC).
     */
    @JsonProperty(value = "mnc", required = true)
    private String mnc;

    /** Creates an instance of PlmnId class. */
    public PlmnId() {
    }

    /**
     * Get the mcc property: Mobile country code (MCC).
     *
     * @return the mcc value.
     */
    public String mcc() {
        return this.mcc;
    }

    /**
     * Set the mcc property: Mobile country code (MCC).
     *
     * @param mcc the mcc value to set.
     * @return the PlmnId object itself.
     */
    public PlmnId withMcc(String mcc) {
        this.mcc = mcc;
        return this;
    }

    /**
     * Get the mnc property: Mobile network code (MNC).
     *
     * @return the mnc value.
     */
    public String mnc() {
        return this.mnc;
    }

    /**
     * Set the mnc property: Mobile network code (MNC).
     *
     * @param mnc the mnc value to set.
     * @return the PlmnId object itself.
     */
    public PlmnId withMnc(String mnc) {
        this.mnc = mnc;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (mcc() == null) {
            throw LOGGER
                .logExceptionAsError(new IllegalArgumentException("Missing required property mcc in model PlmnId"));
        }
        if (mnc() == null) {
            throw LOGGER
                .logExceptionAsError(new IllegalArgumentException("Missing required property mnc in model PlmnId"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PlmnId.class);
}
