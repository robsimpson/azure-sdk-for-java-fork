// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Schema of common properties of all SMS events. */
@Fluent
public class AcsSmsEventBaseProperties {
    /*
     * The identity of the SMS message
     */
    @JsonProperty(value = "messageId")
    private String messageId;

    /*
     * The identity of SMS message sender
     */
    @JsonProperty(value = "from")
    private String from;

    /*
     * The identity of SMS message receiver
     */
    @JsonProperty(value = "to")
    private String to;

    /** Creates an instance of AcsSmsEventBaseProperties class. */
    public AcsSmsEventBaseProperties() {}

    /**
     * Get the messageId property: The identity of the SMS message.
     *
     * @return the messageId value.
     */
    public String getMessageId() {
        return this.messageId;
    }

    /**
     * Set the messageId property: The identity of the SMS message.
     *
     * @param messageId the messageId value to set.
     * @return the AcsSmsEventBaseProperties object itself.
     */
    public AcsSmsEventBaseProperties setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Get the from property: The identity of SMS message sender.
     *
     * @return the from value.
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * Set the from property: The identity of SMS message sender.
     *
     * @param from the from value to set.
     * @return the AcsSmsEventBaseProperties object itself.
     */
    public AcsSmsEventBaseProperties setFrom(String from) {
        this.from = from;
        return this;
    }

    /**
     * Get the to property: The identity of SMS message receiver.
     *
     * @return the to value.
     */
    public String getTo() {
        return this.to;
    }

    /**
     * Set the to property: The identity of SMS message receiver.
     *
     * @param to the to value to set.
     * @return the AcsSmsEventBaseProperties object itself.
     */
    public AcsSmsEventBaseProperties setTo(String to) {
        this.to = to;
        return this;
    }
}
