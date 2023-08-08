// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties for calculate price response. */
@Fluent
public final class CalculatePriceResponseProperties {
    /*
     * Currency and amount that customer will be charged in customer's local currency. Tax is not included.
     */
    @JsonProperty(value = "billingCurrencyTotal")
    private CalculatePriceResponsePropertiesBillingCurrencyTotal billingCurrencyTotal;

    /*
     * Net total amount in pricing currency.
     */
    @JsonProperty(value = "netTotal")
    private Double netTotal;

    /*
     * Tax amount in pricing currency.
     */
    @JsonProperty(value = "taxTotal")
    private Double taxTotal;

    /*
     * Total amount in pricing currency.
     */
    @JsonProperty(value = "grandTotal")
    private Double grandTotal;

    /*
     * Whether or not tax is included in grand total
     */
    @JsonProperty(value = "isTaxIncluded")
    private Boolean isTaxIncluded;

    /*
     * True if billing is managed by Microsoft Partner. Used only for CSP accounts.
     */
    @JsonProperty(value = "isBillingPartnerManaged")
    private Boolean isBillingPartnerManaged;

    /*
     * GUID that represents reservation order that can be placed after calculating price.
     */
    @JsonProperty(value = "reservationOrderId")
    private String reservationOrderId;

    /*
     * Title of sku that is being purchased.
     */
    @JsonProperty(value = "skuTitle")
    private String skuTitle;

    /*
     * Description of sku that is being purchased.
     */
    @JsonProperty(value = "skuDescription")
    private String skuDescription;

    /*
     * Amount that Microsoft uses for record. Used during refund for calculating refund limit. Tax is not included.
     */
    @JsonProperty(value = "pricingCurrencyTotal")
    private CalculatePriceResponsePropertiesPricingCurrencyTotal pricingCurrencyTotal;

    /*
     * The paymentSchedule property.
     */
    @JsonProperty(value = "paymentSchedule")
    private List<PaymentDetail> paymentSchedule;

    /** Creates an instance of CalculatePriceResponseProperties class. */
    public CalculatePriceResponseProperties() {
    }

    /**
     * Get the billingCurrencyTotal property: Currency and amount that customer will be charged in customer's local
     * currency. Tax is not included.
     *
     * @return the billingCurrencyTotal value.
     */
    public CalculatePriceResponsePropertiesBillingCurrencyTotal billingCurrencyTotal() {
        return this.billingCurrencyTotal;
    }

    /**
     * Set the billingCurrencyTotal property: Currency and amount that customer will be charged in customer's local
     * currency. Tax is not included.
     *
     * @param billingCurrencyTotal the billingCurrencyTotal value to set.
     * @return the CalculatePriceResponseProperties object itself.
     */
    public CalculatePriceResponseProperties withBillingCurrencyTotal(
        CalculatePriceResponsePropertiesBillingCurrencyTotal billingCurrencyTotal) {
        this.billingCurrencyTotal = billingCurrencyTotal;
        return this;
    }

    /**
     * Get the netTotal property: Net total amount in pricing currency.
     *
     * @return the netTotal value.
     */
    public Double netTotal() {
        return this.netTotal;
    }

    /**
     * Set the netTotal property: Net total amount in pricing currency.
     *
     * @param netTotal the netTotal value to set.
     * @return the CalculatePriceResponseProperties object itself.
     */
    public CalculatePriceResponseProperties withNetTotal(Double netTotal) {
        this.netTotal = netTotal;
        return this;
    }

    /**
     * Get the taxTotal property: Tax amount in pricing currency.
     *
     * @return the taxTotal value.
     */
    public Double taxTotal() {
        return this.taxTotal;
    }

    /**
     * Set the taxTotal property: Tax amount in pricing currency.
     *
     * @param taxTotal the taxTotal value to set.
     * @return the CalculatePriceResponseProperties object itself.
     */
    public CalculatePriceResponseProperties withTaxTotal(Double taxTotal) {
        this.taxTotal = taxTotal;
        return this;
    }

    /**
     * Get the grandTotal property: Total amount in pricing currency.
     *
     * @return the grandTotal value.
     */
    public Double grandTotal() {
        return this.grandTotal;
    }

    /**
     * Set the grandTotal property: Total amount in pricing currency.
     *
     * @param grandTotal the grandTotal value to set.
     * @return the CalculatePriceResponseProperties object itself.
     */
    public CalculatePriceResponseProperties withGrandTotal(Double grandTotal) {
        this.grandTotal = grandTotal;
        return this;
    }

    /**
     * Get the isTaxIncluded property: Whether or not tax is included in grand total.
     *
     * @return the isTaxIncluded value.
     */
    public Boolean isTaxIncluded() {
        return this.isTaxIncluded;
    }

    /**
     * Set the isTaxIncluded property: Whether or not tax is included in grand total.
     *
     * @param isTaxIncluded the isTaxIncluded value to set.
     * @return the CalculatePriceResponseProperties object itself.
     */
    public CalculatePriceResponseProperties withIsTaxIncluded(Boolean isTaxIncluded) {
        this.isTaxIncluded = isTaxIncluded;
        return this;
    }

    /**
     * Get the isBillingPartnerManaged property: True if billing is managed by Microsoft Partner. Used only for CSP
     * accounts.
     *
     * @return the isBillingPartnerManaged value.
     */
    public Boolean isBillingPartnerManaged() {
        return this.isBillingPartnerManaged;
    }

    /**
     * Set the isBillingPartnerManaged property: True if billing is managed by Microsoft Partner. Used only for CSP
     * accounts.
     *
     * @param isBillingPartnerManaged the isBillingPartnerManaged value to set.
     * @return the CalculatePriceResponseProperties object itself.
     */
    public CalculatePriceResponseProperties withIsBillingPartnerManaged(Boolean isBillingPartnerManaged) {
        this.isBillingPartnerManaged = isBillingPartnerManaged;
        return this;
    }

    /**
     * Get the reservationOrderId property: GUID that represents reservation order that can be placed after calculating
     * price.
     *
     * @return the reservationOrderId value.
     */
    public String reservationOrderId() {
        return this.reservationOrderId;
    }

    /**
     * Set the reservationOrderId property: GUID that represents reservation order that can be placed after calculating
     * price.
     *
     * @param reservationOrderId the reservationOrderId value to set.
     * @return the CalculatePriceResponseProperties object itself.
     */
    public CalculatePriceResponseProperties withReservationOrderId(String reservationOrderId) {
        this.reservationOrderId = reservationOrderId;
        return this;
    }

    /**
     * Get the skuTitle property: Title of sku that is being purchased.
     *
     * @return the skuTitle value.
     */
    public String skuTitle() {
        return this.skuTitle;
    }

    /**
     * Set the skuTitle property: Title of sku that is being purchased.
     *
     * @param skuTitle the skuTitle value to set.
     * @return the CalculatePriceResponseProperties object itself.
     */
    public CalculatePriceResponseProperties withSkuTitle(String skuTitle) {
        this.skuTitle = skuTitle;
        return this;
    }

    /**
     * Get the skuDescription property: Description of sku that is being purchased.
     *
     * @return the skuDescription value.
     */
    public String skuDescription() {
        return this.skuDescription;
    }

    /**
     * Set the skuDescription property: Description of sku that is being purchased.
     *
     * @param skuDescription the skuDescription value to set.
     * @return the CalculatePriceResponseProperties object itself.
     */
    public CalculatePriceResponseProperties withSkuDescription(String skuDescription) {
        this.skuDescription = skuDescription;
        return this;
    }

    /**
     * Get the pricingCurrencyTotal property: Amount that Microsoft uses for record. Used during refund for calculating
     * refund limit. Tax is not included.
     *
     * @return the pricingCurrencyTotal value.
     */
    public CalculatePriceResponsePropertiesPricingCurrencyTotal pricingCurrencyTotal() {
        return this.pricingCurrencyTotal;
    }

    /**
     * Set the pricingCurrencyTotal property: Amount that Microsoft uses for record. Used during refund for calculating
     * refund limit. Tax is not included.
     *
     * @param pricingCurrencyTotal the pricingCurrencyTotal value to set.
     * @return the CalculatePriceResponseProperties object itself.
     */
    public CalculatePriceResponseProperties withPricingCurrencyTotal(
        CalculatePriceResponsePropertiesPricingCurrencyTotal pricingCurrencyTotal) {
        this.pricingCurrencyTotal = pricingCurrencyTotal;
        return this;
    }

    /**
     * Get the paymentSchedule property: The paymentSchedule property.
     *
     * @return the paymentSchedule value.
     */
    public List<PaymentDetail> paymentSchedule() {
        return this.paymentSchedule;
    }

    /**
     * Set the paymentSchedule property: The paymentSchedule property.
     *
     * @param paymentSchedule the paymentSchedule value to set.
     * @return the CalculatePriceResponseProperties object itself.
     */
    public CalculatePriceResponseProperties withPaymentSchedule(List<PaymentDetail> paymentSchedule) {
        this.paymentSchedule = paymentSchedule;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (billingCurrencyTotal() != null) {
            billingCurrencyTotal().validate();
        }
        if (pricingCurrencyTotal() != null) {
            pricingCurrencyTotal().validate();
        }
        if (paymentSchedule() != null) {
            paymentSchedule().forEach(e -> e.validate());
        }
    }
}
