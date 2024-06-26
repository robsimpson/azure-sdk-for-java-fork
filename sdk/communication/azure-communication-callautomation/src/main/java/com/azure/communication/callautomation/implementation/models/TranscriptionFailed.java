// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The TranscriptionFailed model.
 */
@Immutable
public final class TranscriptionFailed {
    /*
     * Used by customers when calling mid-call actions to correlate the request to the response event.
     */
    @JsonProperty(value = "operationContext", access = JsonProperty.Access.WRITE_ONLY)
    private String operationContext;

    /*
     * Contains the resulting SIP code, sub-code and message.
     */
    @JsonProperty(value = "resultInformation", access = JsonProperty.Access.WRITE_ONLY)
    private ResultInformation resultInformation;

    /*
     * Defines the result for TranscriptionUpdate with the current status and the details about the status
     */
    @JsonProperty(value = "transcriptionUpdate", access = JsonProperty.Access.WRITE_ONLY)
    private TranscriptionUpdate transcriptionUpdate;

    /*
     * Call connection ID.
     */
    @JsonProperty(value = "callConnectionId", access = JsonProperty.Access.WRITE_ONLY)
    private String callConnectionId;

    /*
     * Server call ID.
     */
    @JsonProperty(value = "serverCallId", access = JsonProperty.Access.WRITE_ONLY)
    private String serverCallId;

    /*
     * Correlation ID for event to call correlation. Also called ChainId for skype chain ID.
     */
    @JsonProperty(value = "correlationId", access = JsonProperty.Access.WRITE_ONLY)
    private String correlationId;

    /**
     * Creates an instance of TranscriptionFailed class.
     */
    public TranscriptionFailed() {
    }

    /**
     * Get the operationContext property: Used by customers when calling mid-call actions to correlate the request to
     * the response event.
     * 
     * @return the operationContext value.
     */
    public String getOperationContext() {
        return this.operationContext;
    }

    /**
     * Get the resultInformation property: Contains the resulting SIP code, sub-code and message.
     * 
     * @return the resultInformation value.
     */
    public ResultInformation getResultInformation() {
        return this.resultInformation;
    }

    /**
     * Get the transcriptionUpdate property: Defines the result for TranscriptionUpdate with the current status and the
     * details about the status.
     * 
     * @return the transcriptionUpdate value.
     */
    public TranscriptionUpdate getTranscriptionUpdate() {
        return this.transcriptionUpdate;
    }

    /**
     * Get the callConnectionId property: Call connection ID.
     * 
     * @return the callConnectionId value.
     */
    public String getCallConnectionId() {
        return this.callConnectionId;
    }

    /**
     * Get the serverCallId property: Server call ID.
     * 
     * @return the serverCallId value.
     */
    public String getServerCallId() {
        return this.serverCallId;
    }

    /**
     * Get the correlationId property: Correlation ID for event to call correlation. Also called ChainId for skype
     * chain ID.
     * 
     * @return the correlationId value.
     */
    public String getCorrelationId() {
        return this.correlationId;
    }
}
