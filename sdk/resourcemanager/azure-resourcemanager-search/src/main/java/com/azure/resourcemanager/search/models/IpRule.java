// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The IP restriction rule of the Azure Cognitive Search service. */
@Fluent
public final class IpRule {
    /*
     * Value corresponding to a single IPv4 address (eg., 123.1.2.3) or an IP
     * range in CIDR format (eg., 123.1.2.3/24) to be allowed.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Get the value property: Value corresponding to a single IPv4 address (eg., 123.1.2.3) or an IP range in CIDR
     * format (eg., 123.1.2.3/24) to be allowed.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Value corresponding to a single IPv4 address (eg., 123.1.2.3) or an IP range in CIDR
     * format (eg., 123.1.2.3/24) to be allowed.
     *
     * @param value the value value to set.
     * @return the IpRule object itself.
     */
    public IpRule withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
