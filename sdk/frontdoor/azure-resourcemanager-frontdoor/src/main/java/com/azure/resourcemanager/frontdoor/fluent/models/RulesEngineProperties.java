// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.frontdoor.models.FrontDoorResourceState;
import com.azure.resourcemanager.frontdoor.models.RulesEngineRule;
import com.azure.resourcemanager.frontdoor.models.RulesEngineUpdateParameters;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The JSON object that contains the properties required to create a Rules Engine Configuration. */
@Fluent
public final class RulesEngineProperties extends RulesEngineUpdateParameters {
    /*
     * Resource status of the Front Door or Front Door SubResource.
     *
     * Resource status.
     */
    @JsonProperty(value = "resourceState", access = JsonProperty.Access.WRITE_ONLY)
    private FrontDoorResourceState resourceState;

    /** Creates an instance of RulesEngineProperties class. */
    public RulesEngineProperties() {
    }

    /**
     * Get the resourceState property: Resource status of the Front Door or Front Door SubResource.
     *
     * <p>Resource status.
     *
     * @return the resourceState value.
     */
    public FrontDoorResourceState resourceState() {
        return this.resourceState;
    }

    /** {@inheritDoc} */
    @Override
    public RulesEngineProperties withRules(List<RulesEngineRule> rules) {
        super.withRules(rules);
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
