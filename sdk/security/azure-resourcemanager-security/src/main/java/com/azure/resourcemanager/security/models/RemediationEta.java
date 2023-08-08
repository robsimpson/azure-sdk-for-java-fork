// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The ETA (estimated time of arrival) for remediation. */
@Fluent
public final class RemediationEta {
    /*
     * ETA for remediation.
     */
    @JsonProperty(value = "eta", required = true)
    private OffsetDateTime eta;

    /*
     * Justification for change of Eta.
     */
    @JsonProperty(value = "justification", required = true)
    private String justification;

    /** Creates an instance of RemediationEta class. */
    public RemediationEta() {
    }

    /**
     * Get the eta property: ETA for remediation.
     *
     * @return the eta value.
     */
    public OffsetDateTime eta() {
        return this.eta;
    }

    /**
     * Set the eta property: ETA for remediation.
     *
     * @param eta the eta value to set.
     * @return the RemediationEta object itself.
     */
    public RemediationEta withEta(OffsetDateTime eta) {
        this.eta = eta;
        return this;
    }

    /**
     * Get the justification property: Justification for change of Eta.
     *
     * @return the justification value.
     */
    public String justification() {
        return this.justification;
    }

    /**
     * Set the justification property: Justification for change of Eta.
     *
     * @param justification the justification value to set.
     * @return the RemediationEta object itself.
     */
    public RemediationEta withJustification(String justification) {
        this.justification = justification;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (eta() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property eta in model RemediationEta"));
        }
        if (justification() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property justification in model RemediationEta"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RemediationEta.class);
}
