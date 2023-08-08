// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Request parameters to transfer billing subscription. */
@Fluent
public final class TransferBillingSubscriptionRequestProperties {
    /*
     * The destination invoice section id.
     */
    @JsonProperty(value = "destinationInvoiceSectionId", required = true)
    private String destinationInvoiceSectionId;

    /** Creates an instance of TransferBillingSubscriptionRequestProperties class. */
    public TransferBillingSubscriptionRequestProperties() {
    }

    /**
     * Get the destinationInvoiceSectionId property: The destination invoice section id.
     *
     * @return the destinationInvoiceSectionId value.
     */
    public String destinationInvoiceSectionId() {
        return this.destinationInvoiceSectionId;
    }

    /**
     * Set the destinationInvoiceSectionId property: The destination invoice section id.
     *
     * @param destinationInvoiceSectionId the destinationInvoiceSectionId value to set.
     * @return the TransferBillingSubscriptionRequestProperties object itself.
     */
    public TransferBillingSubscriptionRequestProperties withDestinationInvoiceSectionId(
        String destinationInvoiceSectionId) {
        this.destinationInvoiceSectionId = destinationInvoiceSectionId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (destinationInvoiceSectionId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property destinationInvoiceSectionId in model"
                            + " TransferBillingSubscriptionRequestProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(TransferBillingSubscriptionRequestProperties.class);
}
