// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Script activity type. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Script")
@JsonFlatten
@Fluent
public class ScriptActivity extends ExecutionActivity {
    /*
     * Array of script blocks. Type: array.
     */
    @JsonProperty(value = "typeProperties.scripts")
    private List<ScriptActivityScriptBlock> scripts;

    /*
     * Log settings of script activity.
     */
    @JsonProperty(value = "typeProperties.logSettings")
    private ScriptActivityTypePropertiesLogSettings logSettings;

    /** Creates an instance of ScriptActivity class. */
    public ScriptActivity() {}

    /**
     * Get the scripts property: Array of script blocks. Type: array.
     *
     * @return the scripts value.
     */
    public List<ScriptActivityScriptBlock> getScripts() {
        return this.scripts;
    }

    /**
     * Set the scripts property: Array of script blocks. Type: array.
     *
     * @param scripts the scripts value to set.
     * @return the ScriptActivity object itself.
     */
    public ScriptActivity setScripts(List<ScriptActivityScriptBlock> scripts) {
        this.scripts = scripts;
        return this;
    }

    /**
     * Get the logSettings property: Log settings of script activity.
     *
     * @return the logSettings value.
     */
    public ScriptActivityTypePropertiesLogSettings getLogSettings() {
        return this.logSettings;
    }

    /**
     * Set the logSettings property: Log settings of script activity.
     *
     * @param logSettings the logSettings value to set.
     * @return the ScriptActivity object itself.
     */
    public ScriptActivity setLogSettings(ScriptActivityTypePropertiesLogSettings logSettings) {
        this.logSettings = logSettings;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ScriptActivity setLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.setLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ScriptActivity setPolicy(ActivityPolicy policy) {
        super.setPolicy(policy);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ScriptActivity setName(String name) {
        super.setName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ScriptActivity setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ScriptActivity setState(ActivityState state) {
        super.setState(state);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ScriptActivity setOnInactiveMarkAs(ActivityOnInactiveMarkAs onInactiveMarkAs) {
        super.setOnInactiveMarkAs(onInactiveMarkAs);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ScriptActivity setDependsOn(List<ActivityDependency> dependsOn) {
        super.setDependsOn(dependsOn);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ScriptActivity setUserProperties(List<UserProperty> userProperties) {
        super.setUserProperties(userProperties);
        return this;
    }
}
