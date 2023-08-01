// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.securityinsights.fluent.models.MtpCheckRequirementsProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Represents MTP (Microsoft Threat Protection) requirements check request. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("MicrosoftThreatProtection")
@Fluent
public final class MtpCheckRequirements extends DataConnectorsCheckRequirements {
    /*
     * MTP (Microsoft Threat Protection) requirements check properties.
     */
    @JsonProperty(value = "properties")
    private MtpCheckRequirementsProperties innerProperties;

    /**
     * Get the innerProperties property: MTP (Microsoft Threat Protection) requirements check properties.
     *
     * @return the innerProperties value.
     */
    private MtpCheckRequirementsProperties innerProperties() {
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
