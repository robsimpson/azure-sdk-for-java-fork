// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Data proxy properties for a managed dedicated integration runtime. */
@Fluent
public final class IntegrationRuntimeDataProxyProperties {
    /*
     * The self-hosted integration runtime reference.
     */
    @JsonProperty(value = "connectVia")
    private EntityReference connectVia;

    /*
     * The staging linked service reference.
     */
    @JsonProperty(value = "stagingLinkedService")
    private EntityReference stagingLinkedService;

    /*
     * The path to contain the staged data in the Blob storage.
     */
    @JsonProperty(value = "path")
    private String path;

    /** Creates an instance of IntegrationRuntimeDataProxyProperties class. */
    public IntegrationRuntimeDataProxyProperties() {
    }

    /**
     * Get the connectVia property: The self-hosted integration runtime reference.
     *
     * @return the connectVia value.
     */
    public EntityReference connectVia() {
        return this.connectVia;
    }

    /**
     * Set the connectVia property: The self-hosted integration runtime reference.
     *
     * @param connectVia the connectVia value to set.
     * @return the IntegrationRuntimeDataProxyProperties object itself.
     */
    public IntegrationRuntimeDataProxyProperties withConnectVia(EntityReference connectVia) {
        this.connectVia = connectVia;
        return this;
    }

    /**
     * Get the stagingLinkedService property: The staging linked service reference.
     *
     * @return the stagingLinkedService value.
     */
    public EntityReference stagingLinkedService() {
        return this.stagingLinkedService;
    }

    /**
     * Set the stagingLinkedService property: The staging linked service reference.
     *
     * @param stagingLinkedService the stagingLinkedService value to set.
     * @return the IntegrationRuntimeDataProxyProperties object itself.
     */
    public IntegrationRuntimeDataProxyProperties withStagingLinkedService(EntityReference stagingLinkedService) {
        this.stagingLinkedService = stagingLinkedService;
        return this;
    }

    /**
     * Get the path property: The path to contain the staged data in the Blob storage.
     *
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: The path to contain the staged data in the Blob storage.
     *
     * @param path the path value to set.
     * @return the IntegrationRuntimeDataProxyProperties object itself.
     */
    public IntegrationRuntimeDataProxyProperties withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (connectVia() != null) {
            connectVia().validate();
        }
        if (stagingLinkedService() != null) {
            stagingLinkedService().validate();
        }
    }
}
