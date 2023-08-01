// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Model that represents the an action and its status. */
@Immutable
public final class ActionStatus {
    /*
     * The name of the action status.
     */
    @JsonProperty(value = "actionName", access = JsonProperty.Access.WRITE_ONLY)
    private String actionName;

    /*
     * The id of the action status.
     */
    @JsonProperty(value = "actionId", access = JsonProperty.Access.WRITE_ONLY)
    private String actionId;

    /*
     * The status of the action.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /*
     * String that represents the start time of the action.
     */
    @JsonProperty(value = "startTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime startTime;

    /*
     * String that represents the end time of the action.
     */
    @JsonProperty(value = "endTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime endTime;

    /*
     * The array of targets.
     */
    @JsonProperty(value = "targets", access = JsonProperty.Access.WRITE_ONLY)
    private List<ExperimentExecutionActionTargetDetailsProperties> targets;

    /** Creates an instance of ActionStatus class. */
    public ActionStatus() {
    }

    /**
     * Get the actionName property: The name of the action status.
     *
     * @return the actionName value.
     */
    public String actionName() {
        return this.actionName;
    }

    /**
     * Get the actionId property: The id of the action status.
     *
     * @return the actionId value.
     */
    public String actionId() {
        return this.actionId;
    }

    /**
     * Get the status property: The status of the action.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Get the startTime property: String that represents the start time of the action.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Get the endTime property: String that represents the end time of the action.
     *
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Get the targets property: The array of targets.
     *
     * @return the targets value.
     */
    public List<ExperimentExecutionActionTargetDetailsProperties> targets() {
        return this.targets;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (targets() != null) {
            targets().forEach(e -> e.validate());
        }
    }
}
