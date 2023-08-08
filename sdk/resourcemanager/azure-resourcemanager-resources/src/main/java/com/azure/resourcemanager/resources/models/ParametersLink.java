// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Entity representing the reference to the deployment parameters. */
@Fluent
public final class ParametersLink {
    /*
     * The URI of the parameters file.
     */
    @JsonProperty(value = "uri", required = true)
    private String uri;

    /*
     * If included, must match the ContentVersion in the template.
     */
    @JsonProperty(value = "contentVersion")
    private String contentVersion;

    /** Creates an instance of ParametersLink class. */
    public ParametersLink() {
    }

    /**
     * Get the uri property: The URI of the parameters file.
     *
     * @return the uri value.
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Set the uri property: The URI of the parameters file.
     *
     * @param uri the uri value to set.
     * @return the ParametersLink object itself.
     */
    public ParametersLink withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * Get the contentVersion property: If included, must match the ContentVersion in the template.
     *
     * @return the contentVersion value.
     */
    public String contentVersion() {
        return this.contentVersion;
    }

    /**
     * Set the contentVersion property: If included, must match the ContentVersion in the template.
     *
     * @param contentVersion the contentVersion value to set.
     * @return the ParametersLink object itself.
     */
    public ParametersLink withContentVersion(String contentVersion) {
        this.contentVersion = contentVersion;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (uri() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property uri in model ParametersLink"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ParametersLink.class);
}
