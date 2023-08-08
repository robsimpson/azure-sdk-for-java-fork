// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.sql.models.PrivateEndpointConnectionRequestStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.UUID;

/** An ImportExport operation result resource. */
@Immutable
public final class ImportExportOperationResultInner extends ProxyResource {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private ImportExportOperationResultProperties innerProperties;

    /** Creates an instance of ImportExportOperationResultInner class. */
    public ImportExportOperationResultInner() {
    }

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private ImportExportOperationResultProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the requestId property: Request Id.
     *
     * @return the requestId value.
     */
    public UUID requestId() {
        return this.innerProperties() == null ? null : this.innerProperties().requestId();
    }

    /**
     * Get the requestType property: Request type.
     *
     * @return the requestType value.
     */
    public String requestType() {
        return this.innerProperties() == null ? null : this.innerProperties().requestType();
    }

    /**
     * Get the queuedTime property: Queued time.
     *
     * @return the queuedTime value.
     */
    public String queuedTime() {
        return this.innerProperties() == null ? null : this.innerProperties().queuedTime();
    }

    /**
     * Get the lastModifiedTime property: Last modified time.
     *
     * @return the lastModifiedTime value.
     */
    public String lastModifiedTime() {
        return this.innerProperties() == null ? null : this.innerProperties().lastModifiedTime();
    }

    /**
     * Get the blobUri property: Blob Uri.
     *
     * @return the blobUri value.
     */
    public String blobUri() {
        return this.innerProperties() == null ? null : this.innerProperties().blobUri();
    }

    /**
     * Get the serverName property: Server name.
     *
     * @return the serverName value.
     */
    public String serverName() {
        return this.innerProperties() == null ? null : this.innerProperties().serverName();
    }

    /**
     * Get the databaseName property: Database name.
     *
     * @return the databaseName value.
     */
    public String databaseName() {
        return this.innerProperties() == null ? null : this.innerProperties().databaseName();
    }

    /**
     * Get the status property: Operation status.
     *
     * @return the status value.
     */
    public String status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Get the errorMessage property: Error message.
     *
     * @return the errorMessage value.
     */
    public String errorMessage() {
        return this.innerProperties() == null ? null : this.innerProperties().errorMessage();
    }

    /**
     * Get the privateEndpointConnections property: Gets the status of private endpoints associated with this request.
     *
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionRequestStatus> privateEndpointConnections() {
        return this.innerProperties() == null ? null : this.innerProperties().privateEndpointConnections();
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
    }
}
