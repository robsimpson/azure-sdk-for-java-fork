// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicenetworking.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.servicenetworking.fluent.models.AssociationInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The response of a Association list operation. */
@Fluent
public final class AssociationListResult {
    /*
     * The Association items on this page
     */
    @JsonProperty(value = "value", required = true)
    private List<AssociationInner> value;

    /*
     * The link to the next page of items
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of AssociationListResult class. */
    public AssociationListResult() {
    }

    /**
     * Get the value property: The Association items on this page.
     *
     * @return the value value.
     */
    public List<AssociationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The Association items on this page.
     *
     * @param value the value value to set.
     * @return the AssociationListResult object itself.
     */
    public AssociationListResult withValue(List<AssociationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link to the next page of items.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link to the next page of items.
     *
     * @param nextLink the nextLink value to set.
     * @return the AssociationListResult object itself.
     */
    public AssociationListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model AssociationListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AssociationListResult.class);
}
