// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedapplications.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Plan for the managed application. */
@Fluent
public final class PlanPatchable {
    /*
     * The plan name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The publisher ID.
     */
    @JsonProperty(value = "publisher")
    private String publisher;

    /*
     * The product code.
     */
    @JsonProperty(value = "product")
    private String product;

    /*
     * The promotion code.
     */
    @JsonProperty(value = "promotionCode")
    private String promotionCode;

    /*
     * The plan's version.
     */
    @JsonProperty(value = "version")
    private String version;

    /** Creates an instance of PlanPatchable class. */
    public PlanPatchable() {
    }

    /**
     * Get the name property: The plan name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The plan name.
     *
     * @param name the name value to set.
     * @return the PlanPatchable object itself.
     */
    public PlanPatchable withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the publisher property: The publisher ID.
     *
     * @return the publisher value.
     */
    public String publisher() {
        return this.publisher;
    }

    /**
     * Set the publisher property: The publisher ID.
     *
     * @param publisher the publisher value to set.
     * @return the PlanPatchable object itself.
     */
    public PlanPatchable withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * Get the product property: The product code.
     *
     * @return the product value.
     */
    public String product() {
        return this.product;
    }

    /**
     * Set the product property: The product code.
     *
     * @param product the product value to set.
     * @return the PlanPatchable object itself.
     */
    public PlanPatchable withProduct(String product) {
        this.product = product;
        return this;
    }

    /**
     * Get the promotionCode property: The promotion code.
     *
     * @return the promotionCode value.
     */
    public String promotionCode() {
        return this.promotionCode;
    }

    /**
     * Set the promotionCode property: The promotion code.
     *
     * @param promotionCode the promotionCode value to set.
     * @return the PlanPatchable object itself.
     */
    public PlanPatchable withPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
        return this;
    }

    /**
     * Get the version property: The plan's version.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: The plan's version.
     *
     * @param version the version value to set.
     * @return the PlanPatchable object itself.
     */
    public PlanPatchable withVersion(String version) {
        this.version = version;
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
