// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The TasksStateTasks model. */
@Fluent
public final class TasksStateTasks {
    /*
     * The completed property.
     */
    @JsonProperty(value = "completed", required = true)
    private int completed;

    /*
     * The failed property.
     */
    @JsonProperty(value = "failed", required = true)
    private int failed;

    /*
     * The inProgress property.
     */
    @JsonProperty(value = "inProgress", required = true)
    private int inProgress;

    /*
     * The total property.
     */
    @JsonProperty(value = "total", required = true)
    private int total;

    /*
     * The items property.
     */
    @JsonProperty(value = "items")
    private List<AnalyzeTextLROResult> items;

    /** Creates an instance of TasksStateTasks class. */
    public TasksStateTasks() {}

    /**
     * Get the completed property: The completed property.
     *
     * @return the completed value.
     */
    public int getCompleted() {
        return this.completed;
    }

    /**
     * Set the completed property: The completed property.
     *
     * @param completed the completed value to set.
     * @return the TasksStateTasks object itself.
     */
    public TasksStateTasks setCompleted(int completed) {
        this.completed = completed;
        return this;
    }

    /**
     * Get the failed property: The failed property.
     *
     * @return the failed value.
     */
    public int getFailed() {
        return this.failed;
    }

    /**
     * Set the failed property: The failed property.
     *
     * @param failed the failed value to set.
     * @return the TasksStateTasks object itself.
     */
    public TasksStateTasks setFailed(int failed) {
        this.failed = failed;
        return this;
    }

    /**
     * Get the inProgress property: The inProgress property.
     *
     * @return the inProgress value.
     */
    public int getInProgress() {
        return this.inProgress;
    }

    /**
     * Set the inProgress property: The inProgress property.
     *
     * @param inProgress the inProgress value to set.
     * @return the TasksStateTasks object itself.
     */
    public TasksStateTasks setInProgress(int inProgress) {
        this.inProgress = inProgress;
        return this;
    }

    /**
     * Get the total property: The total property.
     *
     * @return the total value.
     */
    public int getTotal() {
        return this.total;
    }

    /**
     * Set the total property: The total property.
     *
     * @param total the total value to set.
     * @return the TasksStateTasks object itself.
     */
    public TasksStateTasks setTotal(int total) {
        this.total = total;
        return this;
    }

    /**
     * Get the items property: The items property.
     *
     * @return the items value.
     */
    public List<AnalyzeTextLROResult> getItems() {
        return this.items;
    }

    /**
     * Set the items property: The items property.
     *
     * @param items the items value to set.
     * @return the TasksStateTasks object itself.
     */
    public TasksStateTasks setItems(List<AnalyzeTextLROResult> items) {
        this.items = items;
        return this;
    }
}
