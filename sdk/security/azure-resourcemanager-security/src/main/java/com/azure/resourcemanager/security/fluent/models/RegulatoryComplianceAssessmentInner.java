// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.security.models.State;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Regulatory compliance assessment details and state. */
@Fluent
public final class RegulatoryComplianceAssessmentInner extends ProxyResource {
    /*
     * Regulatory compliance assessment data
     */
    @JsonProperty(value = "properties")
    private RegulatoryComplianceAssessmentProperties innerProperties;

    /** Creates an instance of RegulatoryComplianceAssessmentInner class. */
    public RegulatoryComplianceAssessmentInner() {
    }

    /**
     * Get the innerProperties property: Regulatory compliance assessment data.
     *
     * @return the innerProperties value.
     */
    private RegulatoryComplianceAssessmentProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the description property: The description of the regulatory compliance assessment.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Get the assessmentType property: The expected type of assessment contained in the AssessmentDetailsLink.
     *
     * @return the assessmentType value.
     */
    public String assessmentType() {
        return this.innerProperties() == null ? null : this.innerProperties().assessmentType();
    }

    /**
     * Get the assessmentDetailsLink property: Link to more detailed assessment results data. The response type will be
     * according to the assessmentType field.
     *
     * @return the assessmentDetailsLink value.
     */
    public String assessmentDetailsLink() {
        return this.innerProperties() == null ? null : this.innerProperties().assessmentDetailsLink();
    }

    /**
     * Get the state property: Aggregative state based on the assessment's scanned resources states.
     *
     * @return the state value.
     */
    public State state() {
        return this.innerProperties() == null ? null : this.innerProperties().state();
    }

    /**
     * Set the state property: Aggregative state based on the assessment's scanned resources states.
     *
     * @param state the state value to set.
     * @return the RegulatoryComplianceAssessmentInner object itself.
     */
    public RegulatoryComplianceAssessmentInner withState(State state) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RegulatoryComplianceAssessmentProperties();
        }
        this.innerProperties().withState(state);
        return this;
    }

    /**
     * Get the passedResources property: The given assessment's related resources count with passed state.
     *
     * @return the passedResources value.
     */
    public Integer passedResources() {
        return this.innerProperties() == null ? null : this.innerProperties().passedResources();
    }

    /**
     * Get the failedResources property: The given assessment's related resources count with failed state.
     *
     * @return the failedResources value.
     */
    public Integer failedResources() {
        return this.innerProperties() == null ? null : this.innerProperties().failedResources();
    }

    /**
     * Get the skippedResources property: The given assessment's related resources count with skipped state.
     *
     * @return the skippedResources value.
     */
    public Integer skippedResources() {
        return this.innerProperties() == null ? null : this.innerProperties().skippedResources();
    }

    /**
     * Get the unsupportedResources property: The given assessment's related resources count with unsupported state.
     *
     * @return the unsupportedResources value.
     */
    public Integer unsupportedResources() {
        return this.innerProperties() == null ? null : this.innerProperties().unsupportedResources();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
