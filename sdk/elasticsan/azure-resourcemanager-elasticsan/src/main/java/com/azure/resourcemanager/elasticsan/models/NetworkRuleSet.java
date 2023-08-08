// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A set of rules governing the network accessibility. */
@Fluent
public final class NetworkRuleSet {
    /*
     * The list of virtual network rules.
     */
    @JsonProperty(value = "virtualNetworkRules")
    private List<VirtualNetworkRule> virtualNetworkRules;

    /** Creates an instance of NetworkRuleSet class. */
    public NetworkRuleSet() {
    }

    /**
     * Get the virtualNetworkRules property: The list of virtual network rules.
     *
     * @return the virtualNetworkRules value.
     */
    public List<VirtualNetworkRule> virtualNetworkRules() {
        return this.virtualNetworkRules;
    }

    /**
     * Set the virtualNetworkRules property: The list of virtual network rules.
     *
     * @param virtualNetworkRules the virtualNetworkRules value to set.
     * @return the NetworkRuleSet object itself.
     */
    public NetworkRuleSet withVirtualNetworkRules(List<VirtualNetworkRule> virtualNetworkRules) {
        this.virtualNetworkRules = virtualNetworkRules;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (virtualNetworkRules() != null) {
            virtualNetworkRules().forEach(e -> e.validate());
        }
    }
}
