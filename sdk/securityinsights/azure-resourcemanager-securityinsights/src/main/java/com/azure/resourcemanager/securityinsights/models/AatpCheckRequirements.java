// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.securityinsights.fluent.models.AatpCheckRequirementsProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Represents AATP (Azure Advanced Threat Protection) requirements check request. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("AzureAdvancedThreatProtection")
@Fluent
public final class AatpCheckRequirements extends DataConnectorsCheckRequirements {
    /*
     * AATP (Azure Advanced Threat Protection) requirements check properties.
     */
    @JsonProperty(value = "properties")
    private AatpCheckRequirementsProperties innerProperties;

    /**
     * Get the innerProperties property: AATP (Azure Advanced Threat Protection) requirements check properties.
     *
     * @return the innerProperties value.
     */
    private AatpCheckRequirementsProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
