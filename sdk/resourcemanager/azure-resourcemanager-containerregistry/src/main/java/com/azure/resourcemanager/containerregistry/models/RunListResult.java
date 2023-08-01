// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.containerregistry.fluent.models.RunInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Collection of runs. */
@Fluent
public final class RunListResult {
    /*
     * The collection value.
     */
    @JsonProperty(value = "value")
    private List<RunInner> value;

    /*
     * The URI that can be used to request the next set of paged results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of RunListResult class. */
    public RunListResult() {
    }

    /**
     * Get the value property: The collection value.
     *
     * @return the value value.
     */
    public List<RunInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The collection value.
     *
     * @param value the value value to set.
     * @return the RunListResult object itself.
     */
    public RunListResult withValue(List<RunInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI that can be used to request the next set of paged results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI that can be used to request the next set of paged results.
     *
     * @param nextLink the nextLink value to set.
     * @return the RunListResult object itself.
     */
    public RunListResult withNextLink(String nextLink) {
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
