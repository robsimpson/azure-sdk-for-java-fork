// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.billing.models.Amount;
import com.azure.resourcemanager.billing.models.AutoRenew;
import com.azure.resourcemanager.billing.models.BillingFrequency;
import com.azure.resourcemanager.billing.models.ProductStatusType;
import com.azure.resourcemanager.billing.models.Reseller;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The properties of a product. */
@Fluent
public final class ProductProperties {
    /*
     * Indicates whether auto renewal is turned on or off for a product.
     */
    @JsonProperty(value = "autoRenew")
    private AutoRenew autoRenew;

    /*
     * The display name of the product.
     */
    @JsonProperty(value = "displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /*
     * The date when the product was purchased.
     */
    @JsonProperty(value = "purchaseDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime purchaseDate;

    /*
     * The ID of the type of product.
     */
    @JsonProperty(value = "productTypeId", access = JsonProperty.Access.WRITE_ONLY)
    private String productTypeId;

    /*
     * The description of the type of product.
     */
    @JsonProperty(value = "productType", access = JsonProperty.Access.WRITE_ONLY)
    private String productType;

    /*
     * The current status of the product.
     */
    @JsonProperty(value = "status")
    private ProductStatusType status;

    /*
     * The date when the product will be renewed or canceled.
     */
    @JsonProperty(value = "endDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime endDate;

    /*
     * The frequency at which the product will be billed.
     */
    @JsonProperty(value = "billingFrequency")
    private BillingFrequency billingFrequency;

    /*
     * The last month charges.
     */
    @JsonProperty(value = "lastCharge", access = JsonProperty.Access.WRITE_ONLY)
    private Amount lastCharge;

    /*
     * The date of the last charge.
     */
    @JsonProperty(value = "lastChargeDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastChargeDate;

    /*
     * The quantity purchased for the product.
     */
    @JsonProperty(value = "quantity", access = JsonProperty.Access.WRITE_ONLY)
    private Float quantity;

    /*
     * The sku ID of the product.
     */
    @JsonProperty(value = "skuId", access = JsonProperty.Access.WRITE_ONLY)
    private String skuId;

    /*
     * The sku description of the product.
     */
    @JsonProperty(value = "skuDescription", access = JsonProperty.Access.WRITE_ONLY)
    private String skuDescription;

    /*
     * The id of the tenant in which the product is used.
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantId;

    /*
     * The availability of the product.
     */
    @JsonProperty(value = "availabilityId", access = JsonProperty.Access.WRITE_ONLY)
    private String availabilityId;

    /*
     * The ID of the invoice section to which the product is billed.
     */
    @JsonProperty(value = "invoiceSectionId", access = JsonProperty.Access.WRITE_ONLY)
    private String invoiceSectionId;

    /*
     * The name of the invoice section to which the product is billed.
     */
    @JsonProperty(value = "invoiceSectionDisplayName", access = JsonProperty.Access.WRITE_ONLY)
    private String invoiceSectionDisplayName;

    /*
     * The ID of the billing profile to which the product is billed.
     */
    @JsonProperty(value = "billingProfileId", access = JsonProperty.Access.WRITE_ONLY)
    private String billingProfileId;

    /*
     * The name of the billing profile to which the product is billed.
     */
    @JsonProperty(value = "billingProfileDisplayName", access = JsonProperty.Access.WRITE_ONLY)
    private String billingProfileDisplayName;

    /*
     * The ID of the customer for whom the product was purchased. The field is applicable only for Microsoft Partner
     * Agreement billing account.
     */
    @JsonProperty(value = "customerId", access = JsonProperty.Access.WRITE_ONLY)
    private String customerId;

    /*
     * The name of the customer for whom the product was purchased. The field is applicable only for Microsoft Partner
     * Agreement billing account.
     */
    @JsonProperty(value = "customerDisplayName", access = JsonProperty.Access.WRITE_ONLY)
    private String customerDisplayName;

    /*
     * Reseller for this product.
     */
    @JsonProperty(value = "reseller", access = JsonProperty.Access.WRITE_ONLY)
    private Reseller reseller;

    /** Creates an instance of ProductProperties class. */
    public ProductProperties() {
    }

    /**
     * Get the autoRenew property: Indicates whether auto renewal is turned on or off for a product.
     *
     * @return the autoRenew value.
     */
    public AutoRenew autoRenew() {
        return this.autoRenew;
    }

    /**
     * Set the autoRenew property: Indicates whether auto renewal is turned on or off for a product.
     *
     * @param autoRenew the autoRenew value to set.
     * @return the ProductProperties object itself.
     */
    public ProductProperties withAutoRenew(AutoRenew autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }

    /**
     * Get the displayName property: The display name of the product.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get the purchaseDate property: The date when the product was purchased.
     *
     * @return the purchaseDate value.
     */
    public OffsetDateTime purchaseDate() {
        return this.purchaseDate;
    }

    /**
     * Get the productTypeId property: The ID of the type of product.
     *
     * @return the productTypeId value.
     */
    public String productTypeId() {
        return this.productTypeId;
    }

    /**
     * Get the productType property: The description of the type of product.
     *
     * @return the productType value.
     */
    public String productType() {
        return this.productType;
    }

    /**
     * Get the status property: The current status of the product.
     *
     * @return the status value.
     */
    public ProductStatusType status() {
        return this.status;
    }

    /**
     * Set the status property: The current status of the product.
     *
     * @param status the status value to set.
     * @return the ProductProperties object itself.
     */
    public ProductProperties withStatus(ProductStatusType status) {
        this.status = status;
        return this;
    }

    /**
     * Get the endDate property: The date when the product will be renewed or canceled.
     *
     * @return the endDate value.
     */
    public OffsetDateTime endDate() {
        return this.endDate;
    }

    /**
     * Get the billingFrequency property: The frequency at which the product will be billed.
     *
     * @return the billingFrequency value.
     */
    public BillingFrequency billingFrequency() {
        return this.billingFrequency;
    }

    /**
     * Set the billingFrequency property: The frequency at which the product will be billed.
     *
     * @param billingFrequency the billingFrequency value to set.
     * @return the ProductProperties object itself.
     */
    public ProductProperties withBillingFrequency(BillingFrequency billingFrequency) {
        this.billingFrequency = billingFrequency;
        return this;
    }

    /**
     * Get the lastCharge property: The last month charges.
     *
     * @return the lastCharge value.
     */
    public Amount lastCharge() {
        return this.lastCharge;
    }

    /**
     * Get the lastChargeDate property: The date of the last charge.
     *
     * @return the lastChargeDate value.
     */
    public OffsetDateTime lastChargeDate() {
        return this.lastChargeDate;
    }

    /**
     * Get the quantity property: The quantity purchased for the product.
     *
     * @return the quantity value.
     */
    public Float quantity() {
        return this.quantity;
    }

    /**
     * Get the skuId property: The sku ID of the product.
     *
     * @return the skuId value.
     */
    public String skuId() {
        return this.skuId;
    }

    /**
     * Get the skuDescription property: The sku description of the product.
     *
     * @return the skuDescription value.
     */
    public String skuDescription() {
        return this.skuDescription;
    }

    /**
     * Get the tenantId property: The id of the tenant in which the product is used.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Get the availabilityId property: The availability of the product.
     *
     * @return the availabilityId value.
     */
    public String availabilityId() {
        return this.availabilityId;
    }

    /**
     * Get the invoiceSectionId property: The ID of the invoice section to which the product is billed.
     *
     * @return the invoiceSectionId value.
     */
    public String invoiceSectionId() {
        return this.invoiceSectionId;
    }

    /**
     * Get the invoiceSectionDisplayName property: The name of the invoice section to which the product is billed.
     *
     * @return the invoiceSectionDisplayName value.
     */
    public String invoiceSectionDisplayName() {
        return this.invoiceSectionDisplayName;
    }

    /**
     * Get the billingProfileId property: The ID of the billing profile to which the product is billed.
     *
     * @return the billingProfileId value.
     */
    public String billingProfileId() {
        return this.billingProfileId;
    }

    /**
     * Get the billingProfileDisplayName property: The name of the billing profile to which the product is billed.
     *
     * @return the billingProfileDisplayName value.
     */
    public String billingProfileDisplayName() {
        return this.billingProfileDisplayName;
    }

    /**
     * Get the customerId property: The ID of the customer for whom the product was purchased. The field is applicable
     * only for Microsoft Partner Agreement billing account.
     *
     * @return the customerId value.
     */
    public String customerId() {
        return this.customerId;
    }

    /**
     * Get the customerDisplayName property: The name of the customer for whom the product was purchased. The field is
     * applicable only for Microsoft Partner Agreement billing account.
     *
     * @return the customerDisplayName value.
     */
    public String customerDisplayName() {
        return this.customerDisplayName;
    }

    /**
     * Get the reseller property: Reseller for this product.
     *
     * @return the reseller value.
     */
    public Reseller reseller() {
        return this.reseller;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (lastCharge() != null) {
            lastCharge().validate();
        }
        if (reseller() != null) {
            reseller().validate();
        }
    }
}
