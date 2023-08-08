// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakestore.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datalakestore.fluent.models.CreateOrUpdateFirewallRuleProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The parameters used to create a new firewall rule. */
@Fluent
public final class CreateOrUpdateFirewallRuleParameters {
    /*
     * The firewall rule properties to use when creating a new firewall rule.
     */
    @JsonProperty(value = "properties", required = true)
    private CreateOrUpdateFirewallRuleProperties innerProperties = new CreateOrUpdateFirewallRuleProperties();

    /** Creates an instance of CreateOrUpdateFirewallRuleParameters class. */
    public CreateOrUpdateFirewallRuleParameters() {
    }

    /**
     * Get the innerProperties property: The firewall rule properties to use when creating a new firewall rule.
     *
     * @return the innerProperties value.
     */
    private CreateOrUpdateFirewallRuleProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the startIpAddress property: The start IP address for the firewall rule. This can be either ipv4 or ipv6.
     * Start and End should be in the same protocol.
     *
     * @return the startIpAddress value.
     */
    public String startIpAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().startIpAddress();
    }

    /**
     * Set the startIpAddress property: The start IP address for the firewall rule. This can be either ipv4 or ipv6.
     * Start and End should be in the same protocol.
     *
     * @param startIpAddress the startIpAddress value to set.
     * @return the CreateOrUpdateFirewallRuleParameters object itself.
     */
    public CreateOrUpdateFirewallRuleParameters withStartIpAddress(String startIpAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CreateOrUpdateFirewallRuleProperties();
        }
        this.innerProperties().withStartIpAddress(startIpAddress);
        return this;
    }

    /**
     * Get the endIpAddress property: The end IP address for the firewall rule. This can be either ipv4 or ipv6. Start
     * and End should be in the same protocol.
     *
     * @return the endIpAddress value.
     */
    public String endIpAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().endIpAddress();
    }

    /**
     * Set the endIpAddress property: The end IP address for the firewall rule. This can be either ipv4 or ipv6. Start
     * and End should be in the same protocol.
     *
     * @param endIpAddress the endIpAddress value to set.
     * @return the CreateOrUpdateFirewallRuleParameters object itself.
     */
    public CreateOrUpdateFirewallRuleParameters withEndIpAddress(String endIpAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CreateOrUpdateFirewallRuleProperties();
        }
        this.innerProperties().withEndIpAddress(endIpAddress);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model CreateOrUpdateFirewallRuleParameters"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CreateOrUpdateFirewallRuleParameters.class);
}
