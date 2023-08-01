// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.orbital.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The configuration associated with the allocated antenna. */
@Fluent
public final class ContactsPropertiesAntennaConfiguration {
    /*
     * The destination IP a packet can be sent to. This would for example be the TCP endpoint you would send data to.
     */
    @JsonProperty(value = "destinationIp")
    private String destinationIp;

    /*
     * List of Source IP
     */
    @JsonProperty(value = "sourceIps")
    private List<String> sourceIps;

    /** Creates an instance of ContactsPropertiesAntennaConfiguration class. */
    public ContactsPropertiesAntennaConfiguration() {
    }

    /**
     * Get the destinationIp property: The destination IP a packet can be sent to. This would for example be the TCP
     * endpoint you would send data to.
     *
     * @return the destinationIp value.
     */
    public String destinationIp() {
        return this.destinationIp;
    }

    /**
     * Set the destinationIp property: The destination IP a packet can be sent to. This would for example be the TCP
     * endpoint you would send data to.
     *
     * @param destinationIp the destinationIp value to set.
     * @return the ContactsPropertiesAntennaConfiguration object itself.
     */
    public ContactsPropertiesAntennaConfiguration withDestinationIp(String destinationIp) {
        this.destinationIp = destinationIp;
        return this;
    }

    /**
     * Get the sourceIps property: List of Source IP.
     *
     * @return the sourceIps value.
     */
    public List<String> sourceIps() {
        return this.sourceIps;
    }

    /**
     * Set the sourceIps property: List of Source IP.
     *
     * @param sourceIps the sourceIps value to set.
     * @return the ContactsPropertiesAntennaConfiguration object itself.
     */
    public ContactsPropertiesAntennaConfiguration withSourceIps(List<String> sourceIps) {
        this.sourceIps = sourceIps;
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
