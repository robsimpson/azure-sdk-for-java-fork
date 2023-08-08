// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loadtesting.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Dimensions for new quota request. */
@Fluent
public final class QuotaBucketRequestPropertiesDimensions {
    /*
     * Subscription Id dimension for new quota request of the quota bucket.
     */
    @JsonProperty(value = "subscriptionId")
    private String subscriptionId;

    /*
     * Location dimension for new quota request of the quota bucket.
     */
    @JsonProperty(value = "location")
    private String location;

    /** Creates an instance of QuotaBucketRequestPropertiesDimensions class. */
    public QuotaBucketRequestPropertiesDimensions() {
    }

    /**
     * Get the subscriptionId property: Subscription Id dimension for new quota request of the quota bucket.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscriptionId property: Subscription Id dimension for new quota request of the quota bucket.
     *
     * @param subscriptionId the subscriptionId value to set.
     * @return the QuotaBucketRequestPropertiesDimensions object itself.
     */
    public QuotaBucketRequestPropertiesDimensions withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get the location property: Location dimension for new quota request of the quota bucket.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Location dimension for new quota request of the quota bucket.
     *
     * @param location the location value to set.
     * @return the QuotaBucketRequestPropertiesDimensions object itself.
     */
    public QuotaBucketRequestPropertiesDimensions withLocation(String location) {
        this.location = location;
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
