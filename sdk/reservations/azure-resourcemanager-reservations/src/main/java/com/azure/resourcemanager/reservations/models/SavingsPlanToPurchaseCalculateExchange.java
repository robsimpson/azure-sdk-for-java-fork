// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Savings plan purchase details. */
@Fluent
public final class SavingsPlanToPurchaseCalculateExchange {
    /*
     * Request body for savings plan purchase
     */
    @JsonProperty(value = "properties")
    private SavingsPlanPurchaseRequest properties;

    /*
     * Pricing information containing the amount and the currency code
     */
    @JsonProperty(value = "billingCurrencyTotal")
    private Price billingCurrencyTotal;

    /** Creates an instance of SavingsPlanToPurchaseCalculateExchange class. */
    public SavingsPlanToPurchaseCalculateExchange() {
    }

    /**
     * Get the properties property: Request body for savings plan purchase.
     *
     * @return the properties value.
     */
    public SavingsPlanPurchaseRequest properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Request body for savings plan purchase.
     *
     * @param properties the properties value to set.
     * @return the SavingsPlanToPurchaseCalculateExchange object itself.
     */
    public SavingsPlanToPurchaseCalculateExchange withProperties(SavingsPlanPurchaseRequest properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the billingCurrencyTotal property: Pricing information containing the amount and the currency code.
     *
     * @return the billingCurrencyTotal value.
     */
    public Price billingCurrencyTotal() {
        return this.billingCurrencyTotal;
    }

    /**
     * Set the billingCurrencyTotal property: Pricing information containing the amount and the currency code.
     *
     * @param billingCurrencyTotal the billingCurrencyTotal value to set.
     * @return the SavingsPlanToPurchaseCalculateExchange object itself.
     */
    public SavingsPlanToPurchaseCalculateExchange withBillingCurrencyTotal(Price billingCurrencyTotal) {
        this.billingCurrencyTotal = billingCurrencyTotal;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
        if (billingCurrencyTotal() != null) {
            billingCurrencyTotal().validate();
        }
    }
}
