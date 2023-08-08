// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mixedreality.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.mixedreality.models.Identity;
import com.azure.resourcemanager.mixedreality.models.Sku;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** SpatialAnchorsAccount Response. */
@Fluent
public final class SpatialAnchorsAccountInner extends Resource {
    /*
     * Property bag.
     */
    @JsonProperty(value = "properties")
    private MixedRealityAccountProperties innerProperties;

    /*
     * The identity associated with this account
     */
    @JsonProperty(value = "identity")
    private Identity identity;

    /*
     * The plan associated with this account
     */
    @JsonProperty(value = "plan")
    private Identity plan;

    /*
     * The sku associated with this account
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /*
     * The kind of account, if supported
     */
    @JsonProperty(value = "kind")
    private Sku kind;

    /*
     * System metadata for this account
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of SpatialAnchorsAccountInner class. */
    public SpatialAnchorsAccountInner() {
    }

    /**
     * Get the innerProperties property: Property bag.
     *
     * @return the innerProperties value.
     */
    private MixedRealityAccountProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the identity property: The identity associated with this account.
     *
     * @return the identity value.
     */
    public Identity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity associated with this account.
     *
     * @param identity the identity value to set.
     * @return the SpatialAnchorsAccountInner object itself.
     */
    public SpatialAnchorsAccountInner withIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the plan property: The plan associated with this account.
     *
     * @return the plan value.
     */
    public Identity plan() {
        return this.plan;
    }

    /**
     * Set the plan property: The plan associated with this account.
     *
     * @param plan the plan value to set.
     * @return the SpatialAnchorsAccountInner object itself.
     */
    public SpatialAnchorsAccountInner withPlan(Identity plan) {
        this.plan = plan;
        return this;
    }

    /**
     * Get the sku property: The sku associated with this account.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The sku associated with this account.
     *
     * @param sku the sku value to set.
     * @return the SpatialAnchorsAccountInner object itself.
     */
    public SpatialAnchorsAccountInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the kind property: The kind of account, if supported.
     *
     * @return the kind value.
     */
    public Sku kind() {
        return this.kind;
    }

    /**
     * Set the kind property: The kind of account, if supported.
     *
     * @param kind the kind value to set.
     * @return the SpatialAnchorsAccountInner object itself.
     */
    public SpatialAnchorsAccountInner withKind(Sku kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the systemData property: System metadata for this account.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public SpatialAnchorsAccountInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SpatialAnchorsAccountInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the storageAccountName property: The name of the storage account associated with this accountId.
     *
     * @return the storageAccountName value.
     */
    public String storageAccountName() {
        return this.innerProperties() == null ? null : this.innerProperties().storageAccountName();
    }

    /**
     * Set the storageAccountName property: The name of the storage account associated with this accountId.
     *
     * @param storageAccountName the storageAccountName value to set.
     * @return the SpatialAnchorsAccountInner object itself.
     */
    public SpatialAnchorsAccountInner withStorageAccountName(String storageAccountName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MixedRealityAccountProperties();
        }
        this.innerProperties().withStorageAccountName(storageAccountName);
        return this;
    }

    /**
     * Get the accountId property: unique id of certain account.
     *
     * @return the accountId value.
     */
    public String accountId() {
        return this.innerProperties() == null ? null : this.innerProperties().accountId();
    }

    /**
     * Get the accountDomain property: Correspond domain name of certain Spatial Anchors Account.
     *
     * @return the accountDomain value.
     */
    public String accountDomain() {
        return this.innerProperties() == null ? null : this.innerProperties().accountDomain();
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
        if (identity() != null) {
            identity().validate();
        }
        if (plan() != null) {
            plan().validate();
        }
        if (sku() != null) {
            sku().validate();
        }
        if (kind() != null) {
            kind().validate();
        }
    }
}
