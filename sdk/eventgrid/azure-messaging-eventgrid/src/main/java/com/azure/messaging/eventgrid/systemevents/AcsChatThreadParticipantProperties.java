// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Schema of the chat thread participant. */
@Fluent
public final class AcsChatThreadParticipantProperties {
    /*
     * The name of the user
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The communication identifier of the user
     */
    @JsonProperty(value = "participantCommunicationIdentifier")
    private CommunicationIdentifierModel participantCommunicationIdentifier;

    /** Creates an instance of AcsChatThreadParticipantProperties class. */
    public AcsChatThreadParticipantProperties() {}

    /**
     * Get the displayName property: The name of the user.
     *
     * @return the displayName value.
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The name of the user.
     *
     * @param displayName the displayName value to set.
     * @return the AcsChatThreadParticipantProperties object itself.
     */
    public AcsChatThreadParticipantProperties setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the participantCommunicationIdentifier property: The communication identifier of the user.
     *
     * @return the participantCommunicationIdentifier value.
     */
    public CommunicationIdentifierModel getParticipantCommunicationIdentifier() {
        return this.participantCommunicationIdentifier;
    }

    /**
     * Set the participantCommunicationIdentifier property: The communication identifier of the user.
     *
     * @param participantCommunicationIdentifier the participantCommunicationIdentifier value to set.
     * @return the AcsChatThreadParticipantProperties object itself.
     */
    public AcsChatThreadParticipantProperties setParticipantCommunicationIdentifier(
            CommunicationIdentifierModel participantCommunicationIdentifier) {
        this.participantCommunicationIdentifier = participantCommunicationIdentifier;
        return this;
    }
}
