// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logz.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The PlanData model. */
@Fluent
public final class PlanData {
    /*
     * different usage type like PAYG/COMMITTED. this could be enum
     */
    @JsonProperty(value = "usageType")
    private String usageType;

    /*
     * different billing cycles like MONTHLY/WEEKLY. this could be enum
     */
    @JsonProperty(value = "billingCycle")
    private String billingCycle;

    /*
     * plan id as published by Logz
     */
    @JsonProperty(value = "planDetails")
    private String planDetails;

    /*
     * date when plan was applied
     */
    @JsonProperty(value = "effectiveDate")
    private OffsetDateTime effectiveDate;

    /** Creates an instance of PlanData class. */
    public PlanData() {
    }

    /**
     * Get the usageType property: different usage type like PAYG/COMMITTED. this could be enum.
     *
     * @return the usageType value.
     */
    public String usageType() {
        return this.usageType;
    }

    /**
     * Set the usageType property: different usage type like PAYG/COMMITTED. this could be enum.
     *
     * @param usageType the usageType value to set.
     * @return the PlanData object itself.
     */
    public PlanData withUsageType(String usageType) {
        this.usageType = usageType;
        return this;
    }

    /**
     * Get the billingCycle property: different billing cycles like MONTHLY/WEEKLY. this could be enum.
     *
     * @return the billingCycle value.
     */
    public String billingCycle() {
        return this.billingCycle;
    }

    /**
     * Set the billingCycle property: different billing cycles like MONTHLY/WEEKLY. this could be enum.
     *
     * @param billingCycle the billingCycle value to set.
     * @return the PlanData object itself.
     */
    public PlanData withBillingCycle(String billingCycle) {
        this.billingCycle = billingCycle;
        return this;
    }

    /**
     * Get the planDetails property: plan id as published by Logz.
     *
     * @return the planDetails value.
     */
    public String planDetails() {
        return this.planDetails;
    }

    /**
     * Set the planDetails property: plan id as published by Logz.
     *
     * @param planDetails the planDetails value to set.
     * @return the PlanData object itself.
     */
    public PlanData withPlanDetails(String planDetails) {
        this.planDetails = planDetails;
        return this;
    }

    /**
     * Get the effectiveDate property: date when plan was applied.
     *
     * @return the effectiveDate value.
     */
    public OffsetDateTime effectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Set the effectiveDate property: date when plan was applied.
     *
     * @param effectiveDate the effectiveDate value to set.
     * @return the PlanData object itself.
     */
    public PlanData withEffectiveDate(OffsetDateTime effectiveDate) {
        this.effectiveDate = effectiveDate;
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
