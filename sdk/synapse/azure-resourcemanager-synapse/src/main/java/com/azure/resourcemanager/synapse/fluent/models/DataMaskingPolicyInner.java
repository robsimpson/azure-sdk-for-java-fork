// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.synapse.models.DataMaskingState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DataMaskingPolicy model. */
@Fluent
public final class DataMaskingPolicyInner extends ProxyResource {
    /*
     * The properties of the data masking policy.
     */
    @JsonProperty(value = "properties")
    private DataMaskingPolicyProperties innerProperties;

    /*
     * The location of the data masking policy.
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /*
     * The kind of data masking policy. Metadata, used for Azure portal.
     */
    @JsonProperty(value = "kind", access = JsonProperty.Access.WRITE_ONLY)
    private String kind;

    /*
     * Fully qualified resource ID of the sql pool
     */
    @JsonProperty(value = "managedBy", access = JsonProperty.Access.WRITE_ONLY)
    private String managedBy;

    /** Creates an instance of DataMaskingPolicyInner class. */
    public DataMaskingPolicyInner() {
    }

    /**
     * Get the innerProperties property: The properties of the data masking policy.
     *
     * @return the innerProperties value.
     */
    private DataMaskingPolicyProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the location property: The location of the data masking policy.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the kind property: The kind of data masking policy. Metadata, used for Azure portal.
     *
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Get the managedBy property: Fully qualified resource ID of the sql pool.
     *
     * @return the managedBy value.
     */
    public String managedBy() {
        return this.managedBy;
    }

    /**
     * Get the dataMaskingState property: The state of the data masking policy.
     *
     * @return the dataMaskingState value.
     */
    public DataMaskingState dataMaskingState() {
        return this.innerProperties() == null ? null : this.innerProperties().dataMaskingState();
    }

    /**
     * Set the dataMaskingState property: The state of the data masking policy.
     *
     * @param dataMaskingState the dataMaskingState value to set.
     * @return the DataMaskingPolicyInner object itself.
     */
    public DataMaskingPolicyInner withDataMaskingState(DataMaskingState dataMaskingState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DataMaskingPolicyProperties();
        }
        this.innerProperties().withDataMaskingState(dataMaskingState);
        return this;
    }

    /**
     * Get the exemptPrincipals property: The list of the exempt principals. Specifies the semicolon-separated list of
     * database users for which the data masking policy does not apply. The specified users receive data results without
     * masking for all of the database queries.
     *
     * @return the exemptPrincipals value.
     */
    public String exemptPrincipals() {
        return this.innerProperties() == null ? null : this.innerProperties().exemptPrincipals();
    }

    /**
     * Set the exemptPrincipals property: The list of the exempt principals. Specifies the semicolon-separated list of
     * database users for which the data masking policy does not apply. The specified users receive data results without
     * masking for all of the database queries.
     *
     * @param exemptPrincipals the exemptPrincipals value to set.
     * @return the DataMaskingPolicyInner object itself.
     */
    public DataMaskingPolicyInner withExemptPrincipals(String exemptPrincipals) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DataMaskingPolicyProperties();
        }
        this.innerProperties().withExemptPrincipals(exemptPrincipals);
        return this;
    }

    /**
     * Get the applicationPrincipals property: The list of the application principals. This is a legacy parameter and is
     * no longer used.
     *
     * @return the applicationPrincipals value.
     */
    public String applicationPrincipals() {
        return this.innerProperties() == null ? null : this.innerProperties().applicationPrincipals();
    }

    /**
     * Get the maskingLevel property: The masking level. This is a legacy parameter and is no longer used.
     *
     * @return the maskingLevel value.
     */
    public String maskingLevel() {
        return this.innerProperties() == null ? null : this.innerProperties().maskingLevel();
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
