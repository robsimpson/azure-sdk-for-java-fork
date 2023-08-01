// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datadog.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Definition of the properties for a TagRules resource. */
@Fluent
public final class MonitoringTagRulesProperties {
    /*
     * The provisioningState property.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Set of rules for sending logs for the Monitor resource.
     */
    @JsonProperty(value = "logRules")
    private LogRules logRules;

    /*
     * Set of rules for sending metrics for the Monitor resource.
     */
    @JsonProperty(value = "metricRules")
    private MetricRules metricRules;

    /** Creates an instance of MonitoringTagRulesProperties class. */
    public MonitoringTagRulesProperties() {
    }

    /**
     * Get the provisioningState property: The provisioningState property.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
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
     * @return the MonitoringTagRulesProperties object itself.
     */
    public MonitoringTagRulesProperties withLogRules(LogRules logRules) {
        this.logRules = logRules;
        return this;
    }

    /**
     * Get the metricRules property: Set of rules for sending metrics for the Monitor resource.
     *
     * @return the metricRules value.
     */
    public MetricRules metricRules() {
        return this.metricRules;
    }

    /**
     * Set the metricRules property: Set of rules for sending metrics for the Monitor resource.
     *
     * @param metricRules the metricRules value to set.
     * @return the MonitoringTagRulesProperties object itself.
     */
    public MonitoringTagRulesProperties withMetricRules(MetricRules metricRules) {
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
