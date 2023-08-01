// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.security.models.AutomationAction;
import com.azure.resourcemanager.security.models.AutomationScope;
import com.azure.resourcemanager.security.models.AutomationSource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * A set of properties that defines the behavior of the automation configuration. To learn more about the supported
 * security events data models schemas - please visit https://aka.ms/ASCAutomationSchemas.
 */
@Fluent
public final class AutomationProperties {
    /*
     * The security automation description.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Indicates whether the security automation is enabled.
     */
    @JsonProperty(value = "isEnabled")
    private Boolean isEnabled;

    /*
     * A collection of scopes on which the security automations logic is applied. Supported scopes are the subscription
     * itself or a resource group under that subscription. The automation will only apply on defined scopes.
     */
    @JsonProperty(value = "scopes")
    private List<AutomationScope> scopes;

    /*
     * A collection of the source event types which evaluate the security automation set of rules.
     */
    @JsonProperty(value = "sources")
    private List<AutomationSource> sources;

    /*
     * A collection of the actions which are triggered if all the configured rules evaluations, within at least one
     * rule set, are true.
     */
    @JsonProperty(value = "actions")
    private List<AutomationAction> actions;

    /** Creates an instance of AutomationProperties class. */
    public AutomationProperties() {
    }

    /**
     * Get the description property: The security automation description.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The security automation description.
     *
     * @param description the description value to set.
     * @return the AutomationProperties object itself.
     */
    public AutomationProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the isEnabled property: Indicates whether the security automation is enabled.
     *
     * @return the isEnabled value.
     */
    public Boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * Set the isEnabled property: Indicates whether the security automation is enabled.
     *
     * @param isEnabled the isEnabled value to set.
     * @return the AutomationProperties object itself.
     */
    public AutomationProperties withIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }

    /**
     * Get the scopes property: A collection of scopes on which the security automations logic is applied. Supported
     * scopes are the subscription itself or a resource group under that subscription. The automation will only apply on
     * defined scopes.
     *
     * @return the scopes value.
     */
    public List<AutomationScope> scopes() {
        return this.scopes;
    }

    /**
     * Set the scopes property: A collection of scopes on which the security automations logic is applied. Supported
     * scopes are the subscription itself or a resource group under that subscription. The automation will only apply on
     * defined scopes.
     *
     * @param scopes the scopes value to set.
     * @return the AutomationProperties object itself.
     */
    public AutomationProperties withScopes(List<AutomationScope> scopes) {
        this.scopes = scopes;
        return this;
    }

    /**
     * Get the sources property: A collection of the source event types which evaluate the security automation set of
     * rules.
     *
     * @return the sources value.
     */
    public List<AutomationSource> sources() {
        return this.sources;
    }

    /**
     * Set the sources property: A collection of the source event types which evaluate the security automation set of
     * rules.
     *
     * @param sources the sources value to set.
     * @return the AutomationProperties object itself.
     */
    public AutomationProperties withSources(List<AutomationSource> sources) {
        this.sources = sources;
        return this;
    }

    /**
     * Get the actions property: A collection of the actions which are triggered if all the configured rules
     * evaluations, within at least one rule set, are true.
     *
     * @return the actions value.
     */
    public List<AutomationAction> actions() {
        return this.actions;
    }

    /**
     * Set the actions property: A collection of the actions which are triggered if all the configured rules
     * evaluations, within at least one rule set, are true.
     *
     * @param actions the actions value to set.
     * @return the AutomationProperties object itself.
     */
    public AutomationProperties withActions(List<AutomationAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (scopes() != null) {
            scopes().forEach(e -> e.validate());
        }
        if (sources() != null) {
            sources().forEach(e -> e.validate());
        }
        if (actions() != null) {
            actions().forEach(e -> e.validate());
        }
    }
}
