// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.nginx.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The NginxStorageAccount model. */
@Fluent
public final class NginxStorageAccount {
    /*
     * The accountName property.
     */
    @JsonProperty(value = "accountName")
    private String accountName;

    /*
     * The containerName property.
     */
    @JsonProperty(value = "containerName")
    private String containerName;

    /** Creates an instance of NginxStorageAccount class. */
    public NginxStorageAccount() {
    }

    /**
     * Get the accountName property: The accountName property.
     *
     * @return the accountName value.
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * Set the accountName property: The accountName property.
     *
     * @param accountName the accountName value to set.
     * @return the NginxStorageAccount object itself.
     */
    public NginxStorageAccount withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * Get the containerName property: The containerName property.
     *
     * @return the containerName value.
     */
    public String containerName() {
        return this.containerName;
    }

    /**
     * Set the containerName property: The containerName property.
     *
     * @param containerName the containerName value to set.
     * @return the NginxStorageAccount object itself.
     */
    public NginxStorageAccount withContainerName(String containerName) {
        this.containerName = containerName;
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
