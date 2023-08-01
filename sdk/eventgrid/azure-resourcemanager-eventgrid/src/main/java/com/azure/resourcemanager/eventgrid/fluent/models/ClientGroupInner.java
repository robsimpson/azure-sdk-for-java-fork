// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.eventgrid.models.ClientGroupProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Client group resource. */
@Fluent
public final class ClientGroupInner extends ProxyResource {
    /*
     * The properties of client group.
     */
    @JsonProperty(value = "properties")
    private ClientGroupProperties innerProperties;

    /*
     * The system metadata relating to the ClientGroup resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of ClientGroupInner class. */
    public ClientGroupInner() {
    }

    /**
     * Get the innerProperties property: The properties of client group.
     *
     * @return the innerProperties value.
     */
    private ClientGroupProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: The system metadata relating to the ClientGroup resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the description property: Description for the Client Group resource.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: Description for the Client Group resource.
     *
     * @param description the description value to set.
     * @return the ClientGroupInner object itself.
     */
    public ClientGroupInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClientGroupProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the query property: The grouping query for the clients. Example : attributes.keyName IN ['a', 'b', 'c'].
     *
     * @return the query value.
     */
    public String query() {
        return this.innerProperties() == null ? null : this.innerProperties().query();
    }

    /**
     * Set the query property: The grouping query for the clients. Example : attributes.keyName IN ['a', 'b', 'c'].
     *
     * @param query the query value to set.
     * @return the ClientGroupInner object itself.
     */
    public ClientGroupInner withQuery(String query) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClientGroupProperties();
        }
        this.innerProperties().withQuery(query);
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the ClientGroup resource.
     *
     * @return the provisioningState value.
     */
    public ClientGroupProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
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
