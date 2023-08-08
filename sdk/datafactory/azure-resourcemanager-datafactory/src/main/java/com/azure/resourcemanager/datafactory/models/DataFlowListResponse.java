// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.DataFlowResourceInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A list of data flow resources. */
@Fluent
public final class DataFlowListResponse {
    /*
     * List of data flows.
     */
    @JsonProperty(value = "value", required = true)
    private List<DataFlowResourceInner> value;

    /*
     * The link to the next page of results, if any remaining results exist.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of DataFlowListResponse class. */
    public DataFlowListResponse() {
    }

    /**
     * Get the value property: List of data flows.
     *
     * @return the value value.
     */
    public List<DataFlowResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of data flows.
     *
     * @param value the value value to set.
     * @return the DataFlowListResponse object itself.
     */
    public DataFlowListResponse withValue(List<DataFlowResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link to the next page of results, if any remaining results exist.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link to the next page of results, if any remaining results exist.
     *
     * @param nextLink the nextLink value to set.
     * @return the DataFlowListResponse object itself.
     */
    public DataFlowListResponse withNextLink(String nextLink) {
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
                    new IllegalArgumentException("Missing required property value in model DataFlowListResponse"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DataFlowListResponse.class);
}
