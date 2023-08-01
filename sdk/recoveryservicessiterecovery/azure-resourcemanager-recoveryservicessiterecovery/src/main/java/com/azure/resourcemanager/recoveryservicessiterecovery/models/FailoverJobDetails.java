// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** This class represents the details for a failover job. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("FailoverJobDetails")
@Fluent
public final class FailoverJobDetails extends JobDetails {
    /*
     * The test VM details.
     */
    @JsonProperty(value = "protectedItemDetails")
    private List<FailoverReplicationProtectedItemDetails> protectedItemDetails;

    /** Creates an instance of FailoverJobDetails class. */
    public FailoverJobDetails() {
    }

    /**
     * Get the protectedItemDetails property: The test VM details.
     *
     * @return the protectedItemDetails value.
     */
    public List<FailoverReplicationProtectedItemDetails> protectedItemDetails() {
        return this.protectedItemDetails;
    }

    /**
     * Set the protectedItemDetails property: The test VM details.
     *
     * @param protectedItemDetails the protectedItemDetails value to set.
     * @return the FailoverJobDetails object itself.
     */
    public FailoverJobDetails withProtectedItemDetails(
        List<FailoverReplicationProtectedItemDetails> protectedItemDetails) {
        this.protectedItemDetails = protectedItemDetails;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FailoverJobDetails withAffectedObjectDetails(Map<String, String> affectedObjectDetails) {
        super.withAffectedObjectDetails(affectedObjectDetails);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (protectedItemDetails() != null) {
            protectedItemDetails().forEach(e -> e.validate());
        }
    }
}
