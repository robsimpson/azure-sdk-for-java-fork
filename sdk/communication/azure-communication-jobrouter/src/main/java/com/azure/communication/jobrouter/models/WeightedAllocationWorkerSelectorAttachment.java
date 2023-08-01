// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Objects;

/** Describes multiple sets of worker selectors, of which one will be selected and attached according to a weighting. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("weighted-allocation-worker-selector")
@Fluent
public final class WeightedAllocationWorkerSelectorAttachment extends WorkerSelectorAttachment {
    /**
     * Creates an instance of WeightedAllocationWorkerSelectorAttachment class.
     *
     * @param allocations A collection of percentage based weighted allocations.
     */
    public WeightedAllocationWorkerSelectorAttachment(List<WorkerWeightedAllocation> allocations) {
        this.allocations = Objects.requireNonNull(allocations, "'allocations' cannot be null.");
    }

    /*
     * A collection of percentage based weighted allocations.
     */
    @JsonProperty(value = "allocations", required = true)
    private final List<WorkerWeightedAllocation> allocations;

    /**
     * Get the allocations property: A collection of percentage based weighted allocations.
     *
     * @return the allocations value.
     */
    public List<WorkerWeightedAllocation> getAllocations() {
        return this.allocations;
    }
}
