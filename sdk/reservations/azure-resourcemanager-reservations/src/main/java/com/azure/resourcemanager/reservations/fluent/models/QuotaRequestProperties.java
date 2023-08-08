// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.reservations.models.QuotaRequestState;
import com.azure.resourcemanager.reservations.models.SubRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The details of quota request. */
@Fluent
public final class QuotaRequestProperties {
    /*
     * The quota request status.
     */
    @JsonProperty(value = "provisioningState")
    private QuotaRequestState provisioningState;

    /*
     * User friendly status message.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /*
     * The time when the quota request was submitted using format: yyyy-MM-ddTHH:mm:ssZ as specified by the ISO 8601
     * standard.
     */
    @JsonProperty(value = "requestSubmitTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime requestSubmitTime;

    /*
     * The quotaRequests.
     */
    @JsonProperty(value = "value")
    private List<SubRequest> value;

    /** Creates an instance of QuotaRequestProperties class. */
    public QuotaRequestProperties() {
    }

    /**
     * Get the provisioningState property: The quota request status.
     *
     * @return the provisioningState value.
     */
    public QuotaRequestState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The quota request status.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the QuotaRequestProperties object itself.
     */
    public QuotaRequestProperties withProvisioningState(QuotaRequestState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the message property: User friendly status message.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Get the requestSubmitTime property: The time when the quota request was submitted using format:
     * yyyy-MM-ddTHH:mm:ssZ as specified by the ISO 8601 standard.
     *
     * @return the requestSubmitTime value.
     */
    public OffsetDateTime requestSubmitTime() {
        return this.requestSubmitTime;
    }

    /**
     * Get the value property: The quotaRequests.
     *
     * @return the value value.
     */
    public List<SubRequest> value() {
        return this.value;
    }

    /**
     * Set the value property: The quotaRequests.
     *
     * @param value the value value to set.
     * @return the QuotaRequestProperties object itself.
     */
    public QuotaRequestProperties withValue(List<SubRequest> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
