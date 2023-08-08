// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.costmanagement.models.BenefitKind;
import com.azure.resourcemanager.costmanagement.models.BenefitUtilizationSummaryProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/** Savings plan utilization summary properties. */
@Fluent
public final class SavingsPlanUtilizationSummaryProperties extends BenefitUtilizationSummaryProperties {
    /*
     * This is the average hourly utilization for each date range that corresponds to given grain (Daily, Monthly).
     * Suppose the API call is for usageDate > 2022-10-01 and usageDate < 2022-10-31 at a daily granularity. There will
     * be one record per benefit id for each day. For a single day, the avgUtilizationPercentage value will be equal to
     * the average of the set of values where the set contains 24 utilization percentage entries one for each hour in a
     * specific day.
     */
    @JsonProperty(value = "avgUtilizationPercentage", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal avgUtilizationPercentage;

    /*
     * This is the minimum hourly utilization for each date range that corresponds to given grain (Daily, Monthly).
     * Suppose the API call is for usageDate > 2022-10-01 and usageDate < 2022-10-31 at a daily granularity. There will
     * be one record per benefit id for each day. For a single day, the minUtilizationPercentage value will be equal to
     * the smallest in the set of values where the set contains 24 utilization percentage entries one for each hour in
     * a specific day. If on the day 2022-10-18, the lowest utilization percentage was 10% at hour 4, then the value
     * for the minUtilizationPercentage in the response will be 10%.
     */
    @JsonProperty(value = "minUtilizationPercentage", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal minUtilizationPercentage;

    /*
     * This is the maximum hourly utilization for each date range that corresponds to given grain (Daily, Monthly).
     * Suppose the API call is for usageDate > 2022-10-01 and usageDate < 2022-10-31 at a daily granularity. There will
     * be one record per benefit id for each day. For a single day, the maxUtilizationPercentage value will be equal to
     * the largest in the set of values where the set contains 24 utilization percentage entries one for each hour in a
     * specific day. If on the day 2022-10-18, the largest utilization percentage was 90% at hour 5, then the value for
     * the maxUtilizationPercentage in the response will be 90%.
     */
    @JsonProperty(value = "maxUtilizationPercentage", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal maxUtilizationPercentage;

    /** Creates an instance of SavingsPlanUtilizationSummaryProperties class. */
    public SavingsPlanUtilizationSummaryProperties() {
    }

    /**
     * Get the avgUtilizationPercentage property: This is the average hourly utilization for each date range that
     * corresponds to given grain (Daily, Monthly). Suppose the API call is for usageDate &gt; 2022-10-01 and usageDate
     * &lt; 2022-10-31 at a daily granularity. There will be one record per benefit id for each day. For a single day,
     * the avgUtilizationPercentage value will be equal to the average of the set of values where the set contains 24
     * utilization percentage entries one for each hour in a specific day.
     *
     * @return the avgUtilizationPercentage value.
     */
    public BigDecimal avgUtilizationPercentage() {
        return this.avgUtilizationPercentage;
    }

    /**
     * Get the minUtilizationPercentage property: This is the minimum hourly utilization for each date range that
     * corresponds to given grain (Daily, Monthly). Suppose the API call is for usageDate &gt; 2022-10-01 and usageDate
     * &lt; 2022-10-31 at a daily granularity. There will be one record per benefit id for each day. For a single day,
     * the minUtilizationPercentage value will be equal to the smallest in the set of values where the set contains 24
     * utilization percentage entries one for each hour in a specific day. If on the day 2022-10-18, the lowest
     * utilization percentage was 10% at hour 4, then the value for the minUtilizationPercentage in the response will be
     * 10%.
     *
     * @return the minUtilizationPercentage value.
     */
    public BigDecimal minUtilizationPercentage() {
        return this.minUtilizationPercentage;
    }

    /**
     * Get the maxUtilizationPercentage property: This is the maximum hourly utilization for each date range that
     * corresponds to given grain (Daily, Monthly). Suppose the API call is for usageDate &gt; 2022-10-01 and usageDate
     * &lt; 2022-10-31 at a daily granularity. There will be one record per benefit id for each day. For a single day,
     * the maxUtilizationPercentage value will be equal to the largest in the set of values where the set contains 24
     * utilization percentage entries one for each hour in a specific day. If on the day 2022-10-18, the largest
     * utilization percentage was 90% at hour 5, then the value for the maxUtilizationPercentage in the response will be
     * 90%.
     *
     * @return the maxUtilizationPercentage value.
     */
    public BigDecimal maxUtilizationPercentage() {
        return this.maxUtilizationPercentage;
    }

    /** {@inheritDoc} */
    @Override
    public SavingsPlanUtilizationSummaryProperties withBenefitType(BenefitKind benefitType) {
        super.withBenefitType(benefitType);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
