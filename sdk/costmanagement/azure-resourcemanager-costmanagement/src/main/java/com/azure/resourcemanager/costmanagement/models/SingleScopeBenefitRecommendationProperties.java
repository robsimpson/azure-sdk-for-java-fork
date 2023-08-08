// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The properties of the benefit recommendations when scope is 'Single'. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "scope")
@JsonTypeName("Single")
@Fluent
public final class SingleScopeBenefitRecommendationProperties extends BenefitRecommendationProperties {
    /*
     * The subscription ID that this single scope recommendation is for. Applicable only if recommendation is for
     * 'Single' scope.
     */
    @JsonProperty(value = "subscriptionId", access = JsonProperty.Access.WRITE_ONLY)
    private String subscriptionId;

    /*
     * The resource group that this single scope recommendation is for. Applicable only if recommendation is for
     * 'Single' scope and 'ResourceGroup' request scope.
     */
    @JsonProperty(value = "resourceGroup", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGroup;

    /** Creates an instance of SingleScopeBenefitRecommendationProperties class. */
    public SingleScopeBenefitRecommendationProperties() {
    }

    /**
     * Get the subscriptionId property: The subscription ID that this single scope recommendation is for. Applicable
     * only if recommendation is for 'Single' scope.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Get the resourceGroup property: The resource group that this single scope recommendation is for. Applicable only
     * if recommendation is for 'Single' scope and 'ResourceGroup' request scope.
     *
     * @return the resourceGroup value.
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    /** {@inheritDoc} */
    @Override
    public SingleScopeBenefitRecommendationProperties withLookBackPeriod(LookBackPeriod lookBackPeriod) {
        super.withLookBackPeriod(lookBackPeriod);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SingleScopeBenefitRecommendationProperties withUsage(RecommendationUsageDetails usage) {
        super.withUsage(usage);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SingleScopeBenefitRecommendationProperties withTerm(Term term) {
        super.withTerm(term);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SingleScopeBenefitRecommendationProperties withCommitmentGranularity(Grain commitmentGranularity) {
        super.withCommitmentGranularity(commitmentGranularity);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SingleScopeBenefitRecommendationProperties withRecommendationDetails(
        AllSavingsBenefitDetails recommendationDetails) {
        super.withRecommendationDetails(recommendationDetails);
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
