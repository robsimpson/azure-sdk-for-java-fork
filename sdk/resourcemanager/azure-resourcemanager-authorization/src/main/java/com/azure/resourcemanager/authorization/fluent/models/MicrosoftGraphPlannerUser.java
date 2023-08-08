// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** plannerUser. */
@Fluent
public final class MicrosoftGraphPlannerUser extends MicrosoftGraphEntity {
    /*
     * Read-only. Nullable. Returns the plannerTasks assigned to the user.
     */
    @JsonProperty(value = "plans")
    private List<MicrosoftGraphPlannerPlan> plans;

    /*
     * Read-only. Nullable. Returns the plannerPlans shared with the user.
     */
    @JsonProperty(value = "tasks")
    private List<MicrosoftGraphPlannerTask> tasks;

    /*
     * plannerUser
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /** Creates an instance of MicrosoftGraphPlannerUser class. */
    public MicrosoftGraphPlannerUser() {
    }

    /**
     * Get the plans property: Read-only. Nullable. Returns the plannerTasks assigned to the user.
     *
     * @return the plans value.
     */
    public List<MicrosoftGraphPlannerPlan> plans() {
        return this.plans;
    }

    /**
     * Set the plans property: Read-only. Nullable. Returns the plannerTasks assigned to the user.
     *
     * @param plans the plans value to set.
     * @return the MicrosoftGraphPlannerUser object itself.
     */
    public MicrosoftGraphPlannerUser withPlans(List<MicrosoftGraphPlannerPlan> plans) {
        this.plans = plans;
        return this;
    }

    /**
     * Get the tasks property: Read-only. Nullable. Returns the plannerPlans shared with the user.
     *
     * @return the tasks value.
     */
    public List<MicrosoftGraphPlannerTask> tasks() {
        return this.tasks;
    }

    /**
     * Set the tasks property: Read-only. Nullable. Returns the plannerPlans shared with the user.
     *
     * @param tasks the tasks value to set.
     * @return the MicrosoftGraphPlannerUser object itself.
     */
    public MicrosoftGraphPlannerUser withTasks(List<MicrosoftGraphPlannerTask> tasks) {
        this.tasks = tasks;
        return this;
    }

    /**
     * Get the additionalProperties property: plannerUser.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: plannerUser.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphPlannerUser object itself.
     */
    public MicrosoftGraphPlannerUser withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphPlannerUser withId(String id) {
        super.withId(id);
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
        if (plans() != null) {
            plans().forEach(e -> e.validate());
        }
        if (tasks() != null) {
            tasks().forEach(e -> e.validate());
        }
    }
}
