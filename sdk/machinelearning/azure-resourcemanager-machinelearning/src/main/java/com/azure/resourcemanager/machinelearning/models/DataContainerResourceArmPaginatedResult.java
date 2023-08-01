// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.machinelearning.fluent.models.DataContainerInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A paginated list of DataContainer entities. */
@Fluent
public final class DataContainerResourceArmPaginatedResult {
    /*
     * The link to the next page of DataContainer objects. If null, there are no additional pages.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /*
     * An array of objects of type DataContainer.
     */
    @JsonProperty(value = "value")
    private List<DataContainerInner> value;

    /** Creates an instance of DataContainerResourceArmPaginatedResult class. */
    public DataContainerResourceArmPaginatedResult() {
    }

    /**
     * Get the nextLink property: The link to the next page of DataContainer objects. If null, there are no additional
     * pages.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link to the next page of DataContainer objects. If null, there are no additional
     * pages.
     *
     * @param nextLink the nextLink value to set.
     * @return the DataContainerResourceArmPaginatedResult object itself.
     */
    public DataContainerResourceArmPaginatedResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Get the value property: An array of objects of type DataContainer.
     *
     * @return the value value.
     */
    public List<DataContainerInner> value() {
        return this.value;
    }

    /**
     * Set the value property: An array of objects of type DataContainer.
     *
     * @param value the value value to set.
     * @return the DataContainerResourceArmPaginatedResult object itself.
     */
    public DataContainerResourceArmPaginatedResult withValue(List<DataContainerInner> value) {
        this.value = value;
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
