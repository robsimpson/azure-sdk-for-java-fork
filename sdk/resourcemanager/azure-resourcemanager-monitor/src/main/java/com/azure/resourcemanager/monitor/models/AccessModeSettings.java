// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties that define the scope private link mode settings. */
@Fluent
public final class AccessModeSettings {
    /*
     * Specifies the default access mode of queries through associated private endpoints in scope. If not specified
     * default value is 'Open'. You can override this default setting for a specific private endpoint connection by
     * adding an exclusion in the 'exclusions' array.
     */
    @JsonProperty(value = "queryAccessMode", required = true)
    private AccessMode queryAccessMode;

    /*
     * Specifies the default access mode of ingestion through associated private endpoints in scope. If not specified
     * default value is 'Open'. You can override this default setting for a specific private endpoint connection by
     * adding an exclusion in the 'exclusions' array.
     */
    @JsonProperty(value = "ingestionAccessMode", required = true)
    private AccessMode ingestionAccessMode;

    /*
     * List of exclusions that override the default access mode settings for specific private endpoint connections.
     */
    @JsonProperty(value = "exclusions")
    private List<AccessModeSettingsExclusion> exclusions;

    /** Creates an instance of AccessModeSettings class. */
    public AccessModeSettings() {
    }

    /**
     * Get the queryAccessMode property: Specifies the default access mode of queries through associated private
     * endpoints in scope. If not specified default value is 'Open'. You can override this default setting for a
     * specific private endpoint connection by adding an exclusion in the 'exclusions' array.
     *
     * @return the queryAccessMode value.
     */
    public AccessMode queryAccessMode() {
        return this.queryAccessMode;
    }

    /**
     * Set the queryAccessMode property: Specifies the default access mode of queries through associated private
     * endpoints in scope. If not specified default value is 'Open'. You can override this default setting for a
     * specific private endpoint connection by adding an exclusion in the 'exclusions' array.
     *
     * @param queryAccessMode the queryAccessMode value to set.
     * @return the AccessModeSettings object itself.
     */
    public AccessModeSettings withQueryAccessMode(AccessMode queryAccessMode) {
        this.queryAccessMode = queryAccessMode;
        return this;
    }

    /**
     * Get the ingestionAccessMode property: Specifies the default access mode of ingestion through associated private
     * endpoints in scope. If not specified default value is 'Open'. You can override this default setting for a
     * specific private endpoint connection by adding an exclusion in the 'exclusions' array.
     *
     * @return the ingestionAccessMode value.
     */
    public AccessMode ingestionAccessMode() {
        return this.ingestionAccessMode;
    }

    /**
     * Set the ingestionAccessMode property: Specifies the default access mode of ingestion through associated private
     * endpoints in scope. If not specified default value is 'Open'. You can override this default setting for a
     * specific private endpoint connection by adding an exclusion in the 'exclusions' array.
     *
     * @param ingestionAccessMode the ingestionAccessMode value to set.
     * @return the AccessModeSettings object itself.
     */
    public AccessModeSettings withIngestionAccessMode(AccessMode ingestionAccessMode) {
        this.ingestionAccessMode = ingestionAccessMode;
        return this;
    }

    /**
     * Get the exclusions property: List of exclusions that override the default access mode settings for specific
     * private endpoint connections.
     *
     * @return the exclusions value.
     */
    public List<AccessModeSettingsExclusion> exclusions() {
        return this.exclusions;
    }

    /**
     * Set the exclusions property: List of exclusions that override the default access mode settings for specific
     * private endpoint connections.
     *
     * @param exclusions the exclusions value to set.
     * @return the AccessModeSettings object itself.
     */
    public AccessModeSettings withExclusions(List<AccessModeSettingsExclusion> exclusions) {
        this.exclusions = exclusions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (queryAccessMode() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property queryAccessMode in model AccessModeSettings"));
        }
        if (ingestionAccessMode() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property ingestionAccessMode in model AccessModeSettings"));
        }
        if (exclusions() != null) {
            exclusions().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AccessModeSettings.class);
}
