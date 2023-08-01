// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Contains the groups to be updated by an UpdateRun. Update order: - Sequential between stages: Stages run
 * sequentially. The previous stage must complete before the next one starts. - Parallel within a stage: Groups within a
 * stage run in parallel. - Sequential within a group: Clusters within a group are updated sequentially.
 */
@Fluent
public final class UpdateStage {
    /*
     * The name of the stage. Must be unique within the UpdateRun.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * A list of group names that compose the stage.
     * The groups will be updated in parallel. Each group name can only appear once in the UpdateRun.
     */
    @JsonProperty(value = "groups")
    private List<UpdateGroup> groups;

    /*
     * The time in seconds to wait at the end of this stage before starting the next one. Defaults to 0 seconds if
     * unspecified.
     */
    @JsonProperty(value = "afterStageWaitInSeconds")
    private Integer afterStageWaitInSeconds;

    /** Creates an instance of UpdateStage class. */
    public UpdateStage() {
    }

    /**
     * Get the name property: The name of the stage. Must be unique within the UpdateRun.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the stage. Must be unique within the UpdateRun.
     *
     * @param name the name value to set.
     * @return the UpdateStage object itself.
     */
    public UpdateStage withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the groups property: A list of group names that compose the stage. The groups will be updated in parallel.
     * Each group name can only appear once in the UpdateRun.
     *
     * @return the groups value.
     */
    public List<UpdateGroup> groups() {
        return this.groups;
    }

    /**
     * Set the groups property: A list of group names that compose the stage. The groups will be updated in parallel.
     * Each group name can only appear once in the UpdateRun.
     *
     * @param groups the groups value to set.
     * @return the UpdateStage object itself.
     */
    public UpdateStage withGroups(List<UpdateGroup> groups) {
        this.groups = groups;
        return this;
    }

    /**
     * Get the afterStageWaitInSeconds property: The time in seconds to wait at the end of this stage before starting
     * the next one. Defaults to 0 seconds if unspecified.
     *
     * @return the afterStageWaitInSeconds value.
     */
    public Integer afterStageWaitInSeconds() {
        return this.afterStageWaitInSeconds;
    }

    /**
     * Set the afterStageWaitInSeconds property: The time in seconds to wait at the end of this stage before starting
     * the next one. Defaults to 0 seconds if unspecified.
     *
     * @param afterStageWaitInSeconds the afterStageWaitInSeconds value to set.
     * @return the UpdateStage object itself.
     */
    public UpdateStage withAfterStageWaitInSeconds(Integer afterStageWaitInSeconds) {
        this.afterStageWaitInSeconds = afterStageWaitInSeconds;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model UpdateStage"));
        }
        if (groups() != null) {
            groups().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(UpdateStage.class);
}
