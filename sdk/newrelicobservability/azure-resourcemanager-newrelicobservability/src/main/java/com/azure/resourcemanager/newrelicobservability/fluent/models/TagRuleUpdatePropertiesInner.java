// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.newrelicobservability.models.LogRules;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The updatable properties of the TagRule. */
@Fluent
public final class TagRuleUpdatePropertiesInner {
    /*
     * Set of rules for sending logs for the Monitor resource.
     */
    @JsonProperty(value = "logRules")
    private LogRules logRules;

    /*
     * Set of rules for sending metrics for the Monitor resource.
     */
    @JsonProperty(value = "metricRules")
    private MetricRulesInner metricRules;

    /** Creates an instance of TagRuleUpdatePropertiesInner class. */
    public TagRuleUpdatePropertiesInner() {
    }

    /**
     * Get the logRules property: Set of rules for sending logs for the Monitor resource.
     *
     * @return the logRules value.
     */
    public LogRules logRules() {
        return this.logRules;
    }

    /**
     * Set the logRules property: Set of rules for sending logs for the Monitor resource.
     *
     * @param logRules the logRules value to set.
     * @return the TagRuleUpdatePropertiesInner object itself.
     */
    public TagRuleUpdatePropertiesInner withLogRules(LogRules logRules) {
        this.logRules = logRules;
        return this;
    }

    /**
     * Get the metricRules property: Set of rules for sending metrics for the Monitor resource.
     *
     * @return the metricRules value.
     */
    public MetricRulesInner metricRules() {
        return this.metricRules;
    }

    /**
     * Set the metricRules property: Set of rules for sending metrics for the Monitor resource.
     *
     * @param metricRules the metricRules value to set.
     * @return the TagRuleUpdatePropertiesInner object itself.
     */
    public TagRuleUpdatePropertiesInner withMetricRules(MetricRulesInner metricRules) {
        this.metricRules = metricRules;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (logRules() != null) {
            logRules().validate();
        }
        if (metricRules() != null) {
            metricRules().validate();
        }
    }
}
