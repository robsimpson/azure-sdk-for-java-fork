// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines the Arc Agent properties for the Provisioned clusters. */
@Fluent
public final class ArcAgentProfile {
    /*
     * Version of the Arc agents to be installed on the provisioned Provisioned cluster resource
     */
    @JsonProperty(value = "agentVersion")
    private String agentVersion;

    /*
     * Indicates whether the Arc agents on the provisioned clusters be upgraded automatically to the latest version.
     * Defaults to Enabled.
     */
    @JsonProperty(value = "agentAutoUpgrade")
    private AutoUpgradeOptions agentAutoUpgrade;

    /** Creates an instance of ArcAgentProfile class. */
    public ArcAgentProfile() {
    }

    /**
     * Get the agentVersion property: Version of the Arc agents to be installed on the provisioned Provisioned cluster
     * resource.
     *
     * @return the agentVersion value.
     */
    public String agentVersion() {
        return this.agentVersion;
    }

    /**
     * Set the agentVersion property: Version of the Arc agents to be installed on the provisioned Provisioned cluster
     * resource.
     *
     * @param agentVersion the agentVersion value to set.
     * @return the ArcAgentProfile object itself.
     */
    public ArcAgentProfile withAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }

    /**
     * Get the agentAutoUpgrade property: Indicates whether the Arc agents on the provisioned clusters be upgraded
     * automatically to the latest version. Defaults to Enabled.
     *
     * @return the agentAutoUpgrade value.
     */
    public AutoUpgradeOptions agentAutoUpgrade() {
        return this.agentAutoUpgrade;
    }

    /**
     * Set the agentAutoUpgrade property: Indicates whether the Arc agents on the provisioned clusters be upgraded
     * automatically to the latest version. Defaults to Enabled.
     *
     * @param agentAutoUpgrade the agentAutoUpgrade value to set.
     * @return the ArcAgentProfile object itself.
     */
    public ArcAgentProfile withAgentAutoUpgrade(AutoUpgradeOptions agentAutoUpgrade) {
        this.agentAutoUpgrade = agentAutoUpgrade;
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
