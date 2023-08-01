// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Gets or sets the SID groupings by landscape and Environment. */
@Fluent
public final class SapLandscapeMonitorPropertiesGrouping {
    /*
     * Gets or sets the list of landscape to SID mappings.
     */
    @JsonProperty(value = "landscape")
    private List<SapLandscapeMonitorSidMapping> landscape;

    /*
     * Gets or sets the list of Sap Applications to SID mappings.
     */
    @JsonProperty(value = "sapApplication")
    private List<SapLandscapeMonitorSidMapping> sapApplication;

    /** Creates an instance of SapLandscapeMonitorPropertiesGrouping class. */
    public SapLandscapeMonitorPropertiesGrouping() {
    }

    /**
     * Get the landscape property: Gets or sets the list of landscape to SID mappings.
     *
     * @return the landscape value.
     */
    public List<SapLandscapeMonitorSidMapping> landscape() {
        return this.landscape;
    }

    /**
     * Set the landscape property: Gets or sets the list of landscape to SID mappings.
     *
     * @param landscape the landscape value to set.
     * @return the SapLandscapeMonitorPropertiesGrouping object itself.
     */
    public SapLandscapeMonitorPropertiesGrouping withLandscape(List<SapLandscapeMonitorSidMapping> landscape) {
        this.landscape = landscape;
        return this;
    }

    /**
     * Get the sapApplication property: Gets or sets the list of Sap Applications to SID mappings.
     *
     * @return the sapApplication value.
     */
    public List<SapLandscapeMonitorSidMapping> sapApplication() {
        return this.sapApplication;
    }

    /**
     * Set the sapApplication property: Gets or sets the list of Sap Applications to SID mappings.
     *
     * @param sapApplication the sapApplication value to set.
     * @return the SapLandscapeMonitorPropertiesGrouping object itself.
     */
    public SapLandscapeMonitorPropertiesGrouping withSapApplication(
        List<SapLandscapeMonitorSidMapping> sapApplication) {
        this.sapApplication = sapApplication;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (landscape() != null) {
            landscape().forEach(e -> e.validate());
        }
        if (sapApplication() != null) {
            sapApplication().forEach(e -> e.validate());
        }
    }
}
