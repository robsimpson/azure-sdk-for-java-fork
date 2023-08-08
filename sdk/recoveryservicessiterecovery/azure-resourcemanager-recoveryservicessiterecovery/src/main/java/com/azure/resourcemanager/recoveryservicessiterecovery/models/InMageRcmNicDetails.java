// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** InMageRcm NIC details. */
@Fluent
public final class InMageRcmNicDetails {
    /*
     * The NIC Id.
     */
    @JsonProperty(value = "nicId", access = JsonProperty.Access.WRITE_ONLY)
    private String nicId;

    /*
     * A value indicating whether this is the primary NIC.
     */
    @JsonProperty(value = "isPrimaryNic")
    private String isPrimaryNic;

    /*
     * A value indicating whether this NIC is selected for failover.
     */
    @JsonProperty(value = "isSelectedForFailover")
    private String isSelectedForFailover;

    /*
     * The source IP address.
     */
    @JsonProperty(value = "sourceIPAddress", access = JsonProperty.Access.WRITE_ONLY)
    private String sourceIpAddress;

    /*
     * The source IP address type.
     */
    @JsonProperty(value = "sourceIPAddressType", access = JsonProperty.Access.WRITE_ONLY)
    private EthernetAddressType sourceIpAddressType;

    /*
     * Source network Id.
     */
    @JsonProperty(value = "sourceNetworkId", access = JsonProperty.Access.WRITE_ONLY)
    private String sourceNetworkId;

    /*
     * Source subnet name.
     */
    @JsonProperty(value = "sourceSubnetName", access = JsonProperty.Access.WRITE_ONLY)
    private String sourceSubnetName;

    /*
     * The target IP address.
     */
    @JsonProperty(value = "targetIPAddress")
    private String targetIpAddress;

    /*
     * The target IP address type.
     */
    @JsonProperty(value = "targetIPAddressType")
    private EthernetAddressType targetIpAddressType;

    /*
     * Target subnet name.
     */
    @JsonProperty(value = "targetSubnetName")
    private String targetSubnetName;

    /*
     * Test subnet name.
     */
    @JsonProperty(value = "testSubnetName")
    private String testSubnetName;

    /*
     * The test IP address.
     */
    @JsonProperty(value = "testIPAddress")
    private String testIpAddress;

    /*
     * The test IP address type.
     */
    @JsonProperty(value = "testIPAddressType")
    private EthernetAddressType testIpAddressType;

    /** Creates an instance of InMageRcmNicDetails class. */
    public InMageRcmNicDetails() {
    }

    /**
     * Get the nicId property: The NIC Id.
     *
     * @return the nicId value.
     */
    public String nicId() {
        return this.nicId;
    }

    /**
     * Get the isPrimaryNic property: A value indicating whether this is the primary NIC.
     *
     * @return the isPrimaryNic value.
     */
    public String isPrimaryNic() {
        return this.isPrimaryNic;
    }

    /**
     * Set the isPrimaryNic property: A value indicating whether this is the primary NIC.
     *
     * @param isPrimaryNic the isPrimaryNic value to set.
     * @return the InMageRcmNicDetails object itself.
     */
    public InMageRcmNicDetails withIsPrimaryNic(String isPrimaryNic) {
        this.isPrimaryNic = isPrimaryNic;
        return this;
    }

    /**
     * Get the isSelectedForFailover property: A value indicating whether this NIC is selected for failover.
     *
     * @return the isSelectedForFailover value.
     */
    public String isSelectedForFailover() {
        return this.isSelectedForFailover;
    }

    /**
     * Set the isSelectedForFailover property: A value indicating whether this NIC is selected for failover.
     *
     * @param isSelectedForFailover the isSelectedForFailover value to set.
     * @return the InMageRcmNicDetails object itself.
     */
    public InMageRcmNicDetails withIsSelectedForFailover(String isSelectedForFailover) {
        this.isSelectedForFailover = isSelectedForFailover;
        return this;
    }

    /**
     * Get the sourceIpAddress property: The source IP address.
     *
     * @return the sourceIpAddress value.
     */
    public String sourceIpAddress() {
        return this.sourceIpAddress;
    }

    /**
     * Get the sourceIpAddressType property: The source IP address type.
     *
     * @return the sourceIpAddressType value.
     */
    public EthernetAddressType sourceIpAddressType() {
        return this.sourceIpAddressType;
    }

    /**
     * Get the sourceNetworkId property: Source network Id.
     *
     * @return the sourceNetworkId value.
     */
    public String sourceNetworkId() {
        return this.sourceNetworkId;
    }

    /**
     * Get the sourceSubnetName property: Source subnet name.
     *
     * @return the sourceSubnetName value.
     */
    public String sourceSubnetName() {
        return this.sourceSubnetName;
    }

    /**
     * Get the targetIpAddress property: The target IP address.
     *
     * @return the targetIpAddress value.
     */
    public String targetIpAddress() {
        return this.targetIpAddress;
    }

    /**
     * Set the targetIpAddress property: The target IP address.
     *
     * @param targetIpAddress the targetIpAddress value to set.
     * @return the InMageRcmNicDetails object itself.
     */
    public InMageRcmNicDetails withTargetIpAddress(String targetIpAddress) {
        this.targetIpAddress = targetIpAddress;
        return this;
    }

    /**
     * Get the targetIpAddressType property: The target IP address type.
     *
     * @return the targetIpAddressType value.
     */
    public EthernetAddressType targetIpAddressType() {
        return this.targetIpAddressType;
    }

    /**
     * Set the targetIpAddressType property: The target IP address type.
     *
     * @param targetIpAddressType the targetIpAddressType value to set.
     * @return the InMageRcmNicDetails object itself.
     */
    public InMageRcmNicDetails withTargetIpAddressType(EthernetAddressType targetIpAddressType) {
        this.targetIpAddressType = targetIpAddressType;
        return this;
    }

    /**
     * Get the targetSubnetName property: Target subnet name.
     *
     * @return the targetSubnetName value.
     */
    public String targetSubnetName() {
        return this.targetSubnetName;
    }

    /**
     * Set the targetSubnetName property: Target subnet name.
     *
     * @param targetSubnetName the targetSubnetName value to set.
     * @return the InMageRcmNicDetails object itself.
     */
    public InMageRcmNicDetails withTargetSubnetName(String targetSubnetName) {
        this.targetSubnetName = targetSubnetName;
        return this;
    }

    /**
     * Get the testSubnetName property: Test subnet name.
     *
     * @return the testSubnetName value.
     */
    public String testSubnetName() {
        return this.testSubnetName;
    }

    /**
     * Set the testSubnetName property: Test subnet name.
     *
     * @param testSubnetName the testSubnetName value to set.
     * @return the InMageRcmNicDetails object itself.
     */
    public InMageRcmNicDetails withTestSubnetName(String testSubnetName) {
        this.testSubnetName = testSubnetName;
        return this;
    }

    /**
     * Get the testIpAddress property: The test IP address.
     *
     * @return the testIpAddress value.
     */
    public String testIpAddress() {
        return this.testIpAddress;
    }

    /**
     * Set the testIpAddress property: The test IP address.
     *
     * @param testIpAddress the testIpAddress value to set.
     * @return the InMageRcmNicDetails object itself.
     */
    public InMageRcmNicDetails withTestIpAddress(String testIpAddress) {
        this.testIpAddress = testIpAddress;
        return this;
    }

    /**
     * Get the testIpAddressType property: The test IP address type.
     *
     * @return the testIpAddressType value.
     */
    public EthernetAddressType testIpAddressType() {
        return this.testIpAddressType;
    }

    /**
     * Set the testIpAddressType property: The test IP address type.
     *
     * @param testIpAddressType the testIpAddressType value to set.
     * @return the InMageRcmNicDetails object itself.
     */
    public InMageRcmNicDetails withTestIpAddressType(EthernetAddressType testIpAddressType) {
        this.testIpAddressType = testIpAddressType;
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
