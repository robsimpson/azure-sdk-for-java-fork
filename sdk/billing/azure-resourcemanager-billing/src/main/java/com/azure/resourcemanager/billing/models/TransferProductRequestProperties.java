// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties of the product to initiate a transfer. */
@Fluent
public final class TransferProductRequestProperties {
    /*
     * The destination invoice section id.
     */
    @JsonProperty(value = "destinationInvoiceSectionId")
    private String destinationInvoiceSectionId;

    /** Creates an instance of TransferProductRequestProperties class. */
    public TransferProductRequestProperties() {
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
     * @return the TransferProductRequestProperties object itself.
     */
    public TransferProductRequestProperties withDestinationInvoiceSectionId(String destinationInvoiceSectionId) {
        this.destinationInvoiceSectionId = destinationInvoiceSectionId;
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
