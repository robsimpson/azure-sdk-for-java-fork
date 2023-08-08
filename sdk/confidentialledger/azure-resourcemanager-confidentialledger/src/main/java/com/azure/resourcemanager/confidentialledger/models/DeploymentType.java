// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confidentialledger.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DeploymentType
 *
 * <p>Object representing DeploymentType for Managed CCF.
 */
@Fluent
public final class DeploymentType {
    /*
     * Unique name for the Managed CCF.
     */
    @JsonProperty(value = "languageRuntime")
    private LanguageRuntime languageRuntime;

    /*
     * Source Uri containing ManagedCCF code
     */
    @JsonProperty(value = "appSourceUri")
    private String appSourceUri;

    /** Creates an instance of DeploymentType class. */
    public DeploymentType() {
    }

    /**
     * Get the languageRuntime property: Unique name for the Managed CCF.
     *
     * @return the languageRuntime value.
     */
    public LanguageRuntime languageRuntime() {
        return this.languageRuntime;
    }

    /**
     * Set the languageRuntime property: Unique name for the Managed CCF.
     *
     * @param languageRuntime the languageRuntime value to set.
     * @return the DeploymentType object itself.
     */
    public DeploymentType withLanguageRuntime(LanguageRuntime languageRuntime) {
        this.languageRuntime = languageRuntime;
        return this;
    }

    /**
     * Get the appSourceUri property: Source Uri containing ManagedCCF code.
     *
     * @return the appSourceUri value.
     */
    public String appSourceUri() {
        return this.appSourceUri;
    }

    /**
     * Set the appSourceUri property: Source Uri containing ManagedCCF code.
     *
     * @param appSourceUri the appSourceUri value to set.
     * @return the DeploymentType object itself.
     */
    public DeploymentType withAppSourceUri(String appSourceUri) {
        this.appSourceUri = appSourceUri;
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
