// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.apimanagement.fluent.models.GatewayContractInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Paged Gateway list representation. */
@Fluent
public final class GatewayCollection {
    /*
     * Page values.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<GatewayContractInner> value;

    /*
     * Total record count number across all pages.
     */
    @JsonProperty(value = "count")
    private Long count;

    /*
     * Next page link if any.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: Page values.
     *
     * @return the value value.
     */
    public List<GatewayContractInner> value() {
        return this.value;
    }

    /**
     * Get the count property: Total record count number across all pages.
     *
     * @return the count value.
     */
    public Long count() {
        return this.count;
    }

    /**
     * Set the count property: Total record count number across all pages.
     *
     * @param count the count value to set.
     * @return the GatewayCollection object itself.
     */
    public GatewayCollection withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * Get the nextLink property: Next page link if any.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
