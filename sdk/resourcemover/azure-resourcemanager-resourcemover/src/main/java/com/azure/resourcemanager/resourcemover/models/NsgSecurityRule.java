// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Security Rule data model for Network Security Groups. */
@Fluent
public final class NsgSecurityRule {
    /*
     * Gets or sets the Security rule name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Gets or sets whether network traffic is allowed or denied.
     * Possible values are “Allow” and “Deny”.
     */
    @JsonProperty(value = "access")
    private String access;

    /*
     * Gets or sets a description for this rule. Restricted to 140 chars.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Gets or sets destination address prefix. CIDR or source IP range.
     * A “*” can also be used to match all source IPs. Default tags such
     * as ‘VirtualNetwork’, ‘AzureLoadBalancer’ and ‘Internet’ can also be used.
     */
    @JsonProperty(value = "destinationAddressPrefix")
    private String destinationAddressPrefix;

    /*
     * Gets or sets Destination Port or Range. Integer or range between
     * 0 and 65535. A “*” can also be used to match all ports.
     */
    @JsonProperty(value = "destinationPortRange")
    private String destinationPortRange;

    /*
     * Gets or sets the direction of the rule.InBound or Outbound. The
     * direction specifies if rule will be evaluated on incoming or outgoing traffic.
     */
    @JsonProperty(value = "direction")
    private String direction;

    /*
     * Gets or sets the priority of the rule. The value can be between
     * 100 and 4096. The priority number must be unique for each rule in the collection.
     * The lower the priority number, the higher the priority of the rule.
     */
    @JsonProperty(value = "priority")
    private Integer priority;

    /*
     * Gets or sets Network protocol this rule applies to. Can be Tcp, Udp or All(*).
     */
    @JsonProperty(value = "protocol")
    private String protocol;

    /*
     * Gets or sets source address prefix. CIDR or source IP range. A
     * “*” can also be used to match all source IPs.  Default tags such as ‘VirtualNetwork’,
     * ‘AzureLoadBalancer’ and ‘Internet’ can also be used. If this is an ingress
     * rule, specifies where network traffic originates from.
     */
    @JsonProperty(value = "sourceAddressPrefix")
    private String sourceAddressPrefix;

    /*
     * Gets or sets Source Port or Range. Integer or range between 0 and
     * 65535. A “*” can also be used to match all ports.
     */
    @JsonProperty(value = "sourcePortRange")
    private String sourcePortRange;

    /** Creates an instance of NsgSecurityRule class. */
    public NsgSecurityRule() {
    }

    /**
     * Get the name property: Gets or sets the Security rule name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Gets or sets the Security rule name.
     *
     * @param name the name value to set.
     * @return the NsgSecurityRule object itself.
     */
    public NsgSecurityRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the access property: Gets or sets whether network traffic is allowed or denied. Possible values are “Allow”
     * and “Deny”.
     *
     * @return the access value.
     */
    public String access() {
        return this.access;
    }

    /**
     * Set the access property: Gets or sets whether network traffic is allowed or denied. Possible values are “Allow”
     * and “Deny”.
     *
     * @param access the access value to set.
     * @return the NsgSecurityRule object itself.
     */
    public NsgSecurityRule withAccess(String access) {
        this.access = access;
        return this;
    }

    /**
     * Get the description property: Gets or sets a description for this rule. Restricted to 140 chars.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Gets or sets a description for this rule. Restricted to 140 chars.
     *
     * @param description the description value to set.
     * @return the NsgSecurityRule object itself.
     */
    public NsgSecurityRule withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the destinationAddressPrefix property: Gets or sets destination address prefix. CIDR or source IP range. A
     * “*” can also be used to match all source IPs. Default tags such as ‘VirtualNetwork’, ‘AzureLoadBalancer’ and
     * ‘Internet’ can also be used.
     *
     * @return the destinationAddressPrefix value.
     */
    public String destinationAddressPrefix() {
        return this.destinationAddressPrefix;
    }

    /**
     * Set the destinationAddressPrefix property: Gets or sets destination address prefix. CIDR or source IP range. A
     * “*” can also be used to match all source IPs. Default tags such as ‘VirtualNetwork’, ‘AzureLoadBalancer’ and
     * ‘Internet’ can also be used.
     *
     * @param destinationAddressPrefix the destinationAddressPrefix value to set.
     * @return the NsgSecurityRule object itself.
     */
    public NsgSecurityRule withDestinationAddressPrefix(String destinationAddressPrefix) {
        this.destinationAddressPrefix = destinationAddressPrefix;
        return this;
    }

    /**
     * Get the destinationPortRange property: Gets or sets Destination Port or Range. Integer or range between 0 and
     * 65535. A “*” can also be used to match all ports.
     *
     * @return the destinationPortRange value.
     */
    public String destinationPortRange() {
        return this.destinationPortRange;
    }

    /**
     * Set the destinationPortRange property: Gets or sets Destination Port or Range. Integer or range between 0 and
     * 65535. A “*” can also be used to match all ports.
     *
     * @param destinationPortRange the destinationPortRange value to set.
     * @return the NsgSecurityRule object itself.
     */
    public NsgSecurityRule withDestinationPortRange(String destinationPortRange) {
        this.destinationPortRange = destinationPortRange;
        return this;
    }

    /**
     * Get the direction property: Gets or sets the direction of the rule.InBound or Outbound. The direction specifies
     * if rule will be evaluated on incoming or outgoing traffic.
     *
     * @return the direction value.
     */
    public String direction() {
        return this.direction;
    }

    /**
     * Set the direction property: Gets or sets the direction of the rule.InBound or Outbound. The direction specifies
     * if rule will be evaluated on incoming or outgoing traffic.
     *
     * @param direction the direction value to set.
     * @return the NsgSecurityRule object itself.
     */
    public NsgSecurityRule withDirection(String direction) {
        this.direction = direction;
        return this;
    }

    /**
     * Get the priority property: Gets or sets the priority of the rule. The value can be between 100 and 4096. The
     * priority number must be unique for each rule in the collection. The lower the priority number, the higher the
     * priority of the rule.
     *
     * @return the priority value.
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Set the priority property: Gets or sets the priority of the rule. The value can be between 100 and 4096. The
     * priority number must be unique for each rule in the collection. The lower the priority number, the higher the
     * priority of the rule.
     *
     * @param priority the priority value to set.
     * @return the NsgSecurityRule object itself.
     */
    public NsgSecurityRule withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the protocol property: Gets or sets Network protocol this rule applies to. Can be Tcp, Udp or All(*).
     *
     * @return the protocol value.
     */
    public String protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: Gets or sets Network protocol this rule applies to. Can be Tcp, Udp or All(*).
     *
     * @param protocol the protocol value to set.
     * @return the NsgSecurityRule object itself.
     */
    public NsgSecurityRule withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the sourceAddressPrefix property: Gets or sets source address prefix. CIDR or source IP range. A “*” can also
     * be used to match all source IPs. Default tags such as ‘VirtualNetwork’, ‘AzureLoadBalancer’ and ‘Internet’ can
     * also be used. If this is an ingress rule, specifies where network traffic originates from.
     *
     * @return the sourceAddressPrefix value.
     */
    public String sourceAddressPrefix() {
        return this.sourceAddressPrefix;
    }

    /**
     * Set the sourceAddressPrefix property: Gets or sets source address prefix. CIDR or source IP range. A “*” can also
     * be used to match all source IPs. Default tags such as ‘VirtualNetwork’, ‘AzureLoadBalancer’ and ‘Internet’ can
     * also be used. If this is an ingress rule, specifies where network traffic originates from.
     *
     * @param sourceAddressPrefix the sourceAddressPrefix value to set.
     * @return the NsgSecurityRule object itself.
     */
    public NsgSecurityRule withSourceAddressPrefix(String sourceAddressPrefix) {
        this.sourceAddressPrefix = sourceAddressPrefix;
        return this;
    }

    /**
     * Get the sourcePortRange property: Gets or sets Source Port or Range. Integer or range between 0 and 65535. A “*”
     * can also be used to match all ports.
     *
     * @return the sourcePortRange value.
     */
    public String sourcePortRange() {
        return this.sourcePortRange;
    }

    /**
     * Set the sourcePortRange property: Gets or sets Source Port or Range. Integer or range between 0 and 65535. A “*”
     * can also be used to match all ports.
     *
     * @param sourcePortRange the sourcePortRange value to set.
     * @return the NsgSecurityRule object itself.
     */
    public NsgSecurityRule withSourcePortRange(String sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
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
