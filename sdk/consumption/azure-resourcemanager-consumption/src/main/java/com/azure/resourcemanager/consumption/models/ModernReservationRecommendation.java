// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.consumption.fluent.models.ModernReservationRecommendationProperties;
import com.azure.resourcemanager.consumption.fluent.models.ReservationRecommendationInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/** Modern reservation recommendation. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("modern")
@Fluent
public final class ModernReservationRecommendation extends ReservationRecommendationInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ModernReservationRecommendation.class);

    /*
     * Properties for modern reservation recommendation
     */
    @JsonProperty(value = "properties", required = true)
    private ModernReservationRecommendationProperties innerProperties = new ModernReservationRecommendationProperties();

    /**
     * Get the innerProperties property: Properties for modern reservation recommendation.
     *
     * @return the innerProperties value.
     */
    private ModernReservationRecommendationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the location property: Resource Location.
     *
     * @return the location value.
     */
    public String locationPropertiesLocation() {
        return this.innerProperties() == null ? null : this.innerProperties().location();
    }

    /**
     * Get the lookBackPeriod property: The number of days of usage to look back for recommendation.
     *
     * @return the lookBackPeriod value.
     */
    public Integer lookBackPeriod() {
        return this.innerProperties() == null ? null : this.innerProperties().lookBackPeriod();
    }

    /**
     * Get the instanceFlexibilityRatio property: The instance Flexibility Ratio.
     *
     * @return the instanceFlexibilityRatio value.
     */
    public Float instanceFlexibilityRatio() {
        return this.innerProperties() == null ? null : this.innerProperties().instanceFlexibilityRatio();
    }

    /**
     * Get the instanceFlexibilityGroup property: The instance Flexibility Group.
     *
     * @return the instanceFlexibilityGroup value.
     */
    public String instanceFlexibilityGroup() {
        return this.innerProperties() == null ? null : this.innerProperties().instanceFlexibilityGroup();
    }

    /**
     * Get the normalizedSize property: The normalized Size.
     *
     * @return the normalizedSize value.
     */
    public String normalizedSize() {
        return this.innerProperties() == null ? null : this.innerProperties().normalizedSize();
    }

    /**
     * Get the recommendedQuantityNormalized property: The recommended Quantity Normalized.
     *
     * @return the recommendedQuantityNormalized value.
     */
    public Float recommendedQuantityNormalized() {
        return this.innerProperties() == null ? null : this.innerProperties().recommendedQuantityNormalized();
    }

    /**
     * Get the meterId property: The meter id (GUID).
     *
     * @return the meterId value.
     */
    public UUID meterId() {
        return this.innerProperties() == null ? null : this.innerProperties().meterId();
    }

    /**
     * Get the term property: RI recommendations in one or three year terms.
     *
     * @return the term value.
     */
    public String term() {
        return this.innerProperties() == null ? null : this.innerProperties().term();
    }

    /**
     * Get the costWithNoReservedInstances property: The total amount of cost without reserved instances.
     *
     * @return the costWithNoReservedInstances value.
     */
    public Amount costWithNoReservedInstances() {
        return this.innerProperties() == null ? null : this.innerProperties().costWithNoReservedInstances();
    }

    /**
     * Get the recommendedQuantity property: Recommended quality for reserved instances.
     *
     * @return the recommendedQuantity value.
     */
    public BigDecimal recommendedQuantity() {
        return this.innerProperties() == null ? null : this.innerProperties().recommendedQuantity();
    }

    /**
     * Get the totalCostWithReservedInstances property: The total amount of cost with reserved instances.
     *
     * @return the totalCostWithReservedInstances value.
     */
    public Amount totalCostWithReservedInstances() {
        return this.innerProperties() == null ? null : this.innerProperties().totalCostWithReservedInstances();
    }

    /**
     * Get the netSavings property: Total estimated savings with reserved instances.
     *
     * @return the netSavings value.
     */
    public Amount netSavings() {
        return this.innerProperties() == null ? null : this.innerProperties().netSavings();
    }

    /**
     * Get the firstUsageDate property: The usage date for looking back.
     *
     * @return the firstUsageDate value.
     */
    public OffsetDateTime firstUsageDate() {
        return this.innerProperties() == null ? null : this.innerProperties().firstUsageDate();
    }

    /**
     * Get the scope property: Shared or single recommendation.
     *
     * @return the scope value.
     */
    public String scope() {
        return this.innerProperties() == null ? null : this.innerProperties().scope();
    }

    /**
     * Get the skuProperties property: List of sku properties.
     *
     * @return the skuProperties value.
     */
    public List<SkuProperty> skuProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().skuProperties();
    }

    /**
     * Get the skuName property: This is the ARM Sku name.
     *
     * @return the skuName value.
     */
    public String skuName() {
        return this.innerProperties() == null ? null : this.innerProperties().skuName();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model ModernReservationRecommendation"));
        } else {
            innerProperties().validate();
        }
    }
}
