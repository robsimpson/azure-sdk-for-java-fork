// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Solutions Diagnostic. */
@Fluent
public final class SolutionsDiagnostic {
    /*
     * Solution Id to identify single Solutions Diagnostic
     */
    @JsonProperty(value = "solutionId")
    private String solutionId;

    /*
     * Denotes the status of the diagnostic resource.
     */
    @JsonProperty(value = "status")
    private Status status;

    /*
     * Details of the status
     */
    @JsonProperty(value = "statusDetails")
    private String statusDetails;

    /*
     * Place holder used in HTML Content replace control with the content
     */
    @JsonProperty(value = "replacementKey")
    private String replacementKey;

    /*
     * Required parameters of this item
     */
    @JsonProperty(value = "requiredParameters")
    private List<String> requiredParameters;

    /*
     * Diagnostic insights
     */
    @JsonProperty(value = "insights")
    private List<Insight> insights;

    /** Creates an instance of SolutionsDiagnostic class. */
    public SolutionsDiagnostic() {
    }

    /**
     * Get the solutionId property: Solution Id to identify single Solutions Diagnostic.
     *
     * @return the solutionId value.
     */
    public String solutionId() {
        return this.solutionId;
    }

    /**
     * Set the solutionId property: Solution Id to identify single Solutions Diagnostic.
     *
     * @param solutionId the solutionId value to set.
     * @return the SolutionsDiagnostic object itself.
     */
    public SolutionsDiagnostic withSolutionId(String solutionId) {
        this.solutionId = solutionId;
        return this;
    }

    /**
     * Get the status property: Denotes the status of the diagnostic resource.
     *
     * @return the status value.
     */
    public Status status() {
        return this.status;
    }

    /**
     * Set the status property: Denotes the status of the diagnostic resource.
     *
     * @param status the status value to set.
     * @return the SolutionsDiagnostic object itself.
     */
    public SolutionsDiagnostic withStatus(Status status) {
        this.status = status;
        return this;
    }

    /**
     * Get the statusDetails property: Details of the status.
     *
     * @return the statusDetails value.
     */
    public String statusDetails() {
        return this.statusDetails;
    }

    /**
     * Set the statusDetails property: Details of the status.
     *
     * @param statusDetails the statusDetails value to set.
     * @return the SolutionsDiagnostic object itself.
     */
    public SolutionsDiagnostic withStatusDetails(String statusDetails) {
        this.statusDetails = statusDetails;
        return this;
    }

    /**
     * Get the replacementKey property: Place holder used in HTML Content replace control with the content.
     *
     * @return the replacementKey value.
     */
    public String replacementKey() {
        return this.replacementKey;
    }

    /**
     * Set the replacementKey property: Place holder used in HTML Content replace control with the content.
     *
     * @param replacementKey the replacementKey value to set.
     * @return the SolutionsDiagnostic object itself.
     */
    public SolutionsDiagnostic withReplacementKey(String replacementKey) {
        this.replacementKey = replacementKey;
        return this;
    }

    /**
     * Get the requiredParameters property: Required parameters of this item.
     *
     * @return the requiredParameters value.
     */
    public List<String> requiredParameters() {
        return this.requiredParameters;
    }

    /**
     * Set the requiredParameters property: Required parameters of this item.
     *
     * @param requiredParameters the requiredParameters value to set.
     * @return the SolutionsDiagnostic object itself.
     */
    public SolutionsDiagnostic withRequiredParameters(List<String> requiredParameters) {
        this.requiredParameters = requiredParameters;
        return this;
    }

    /**
     * Get the insights property: Diagnostic insights.
     *
     * @return the insights value.
     */
    public List<Insight> insights() {
        return this.insights;
    }

    /**
     * Set the insights property: Diagnostic insights.
     *
     * @param insights the insights value to set.
     * @return the SolutionsDiagnostic object itself.
     */
    public SolutionsDiagnostic withInsights(List<Insight> insights) {
        this.insights = insights;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (insights() != null) {
            insights().forEach(e -> e.validate());
        }
    }
}
