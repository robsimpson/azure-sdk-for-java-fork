// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appplatform.fluent.models.BuildServiceAgentPoolResourceInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Object that includes an array of build service agent pool resources and a possible link for next set. */
@Fluent
public final class BuildServiceAgentPoolResourceCollection {
    /*
     * Collection of build service agent pool resource
     */
    @JsonProperty(value = "value")
    private List<BuildServiceAgentPoolResourceInner> value;

    /*
     * URL client should use to fetch the next page (per server side paging).
     * It's null for now, added for future use.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: Collection of build service agent pool resource.
     *
     * @return the value value.
     */
    public List<BuildServiceAgentPoolResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Collection of build service agent pool resource.
     *
     * @param value the value value to set.
     * @return the BuildServiceAgentPoolResourceCollection object itself.
     */
    public BuildServiceAgentPoolResourceCollection withValue(List<BuildServiceAgentPoolResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URL client should use to fetch the next page (per server side paging). It's null for
     * now, added for future use.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL client should use to fetch the next page (per server side paging). It's null for
     * now, added for future use.
     *
     * @param nextLink the nextLink value to set.
     * @return the BuildServiceAgentPoolResourceCollection object itself.
     */
    public BuildServiceAgentPoolResourceCollection withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
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
