// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The properties of an enrollment. */
@Fluent
public final class Enrollment {
    /*
     * The start date of the enrollment.
     */
    @JsonProperty(value = "startDate")
    private OffsetDateTime startDate;

    /*
     * The end date of the enrollment.
     */
    @JsonProperty(value = "endDate")
    private OffsetDateTime endDate;

    /*
     * The billing currency for the enrollment.
     */
    @JsonProperty(value = "currency", access = JsonProperty.Access.WRITE_ONLY)
    private String currency;

    /*
     * The channel type of the enrollment.
     */
    @JsonProperty(value = "channel", access = JsonProperty.Access.WRITE_ONLY)
    private String channel;

    /*
     * The policies for Enterprise Agreement enrollments.
     */
    @JsonProperty(value = "policies", access = JsonProperty.Access.WRITE_ONLY)
    private EnrollmentPolicies policies;

    /*
     * The language for the enrollment.
     */
    @JsonProperty(value = "language", access = JsonProperty.Access.WRITE_ONLY)
    private String language;

    /*
     * The country code of the enrollment.
     */
    @JsonProperty(value = "countryCode", access = JsonProperty.Access.WRITE_ONLY)
    private String countryCode;

    /*
     * The current status of the enrollment.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /*
     * The billing cycle for the enrollment.
     */
    @JsonProperty(value = "billingCycle", access = JsonProperty.Access.WRITE_ONLY)
    private String billingCycle;

    /** Creates an instance of Enrollment class. */
    public Enrollment() {
    }

    /**
     * Get the startDate property: The start date of the enrollment.
     *
     * @return the startDate value.
     */
    public OffsetDateTime startDate() {
        return this.startDate;
    }

    /**
     * Set the startDate property: The start date of the enrollment.
     *
     * @param startDate the startDate value to set.
     * @return the Enrollment object itself.
     */
    public Enrollment withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Get the endDate property: The end date of the enrollment.
     *
     * @return the endDate value.
     */
    public OffsetDateTime endDate() {
        return this.endDate;
    }

    /**
     * Set the endDate property: The end date of the enrollment.
     *
     * @param endDate the endDate value to set.
     * @return the Enrollment object itself.
     */
    public Enrollment withEndDate(OffsetDateTime endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Get the currency property: The billing currency for the enrollment.
     *
     * @return the currency value.
     */
    public String currency() {
        return this.currency;
    }

    /**
     * Get the channel property: The channel type of the enrollment.
     *
     * @return the channel value.
     */
    public String channel() {
        return this.channel;
    }

    /**
     * Get the policies property: The policies for Enterprise Agreement enrollments.
     *
     * @return the policies value.
     */
    public EnrollmentPolicies policies() {
        return this.policies;
    }

    /**
     * Get the language property: The language for the enrollment.
     *
     * @return the language value.
     */
    public String language() {
        return this.language;
    }

    /**
     * Get the countryCode property: The country code of the enrollment.
     *
     * @return the countryCode value.
     */
    public String countryCode() {
        return this.countryCode;
    }

    /**
     * Get the status property: The current status of the enrollment.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Get the billingCycle property: The billing cycle for the enrollment.
     *
     * @return the billingCycle value.
     */
    public String billingCycle() {
        return this.billingCycle;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (policies() != null) {
            policies().validate();
        }
    }
}
