// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The workflow filter. */
@Fluent
public final class WorkflowArtifacts {
    /*
     * Application settings of the workflow.
     */
    @JsonProperty(value = "appSettings")
    private Object appSettings;

    /*
     * Files of the app.
     */
    @JsonProperty(value = "files")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> files;

    /*
     * Files of the app to delete.
     */
    @JsonProperty(value = "filesToDelete")
    private List<String> filesToDelete;

    /** Creates an instance of WorkflowArtifacts class. */
    public WorkflowArtifacts() {
    }

    /**
     * Get the appSettings property: Application settings of the workflow.
     *
     * @return the appSettings value.
     */
    public Object appSettings() {
        return this.appSettings;
    }

    /**
     * Set the appSettings property: Application settings of the workflow.
     *
     * @param appSettings the appSettings value to set.
     * @return the WorkflowArtifacts object itself.
     */
    public WorkflowArtifacts withAppSettings(Object appSettings) {
        this.appSettings = appSettings;
        return this;
    }

    /**
     * Get the files property: Files of the app.
     *
     * @return the files value.
     */
    public Map<String, Object> files() {
        return this.files;
    }

    /**
     * Set the files property: Files of the app.
     *
     * @param files the files value to set.
     * @return the WorkflowArtifacts object itself.
     */
    public WorkflowArtifacts withFiles(Map<String, Object> files) {
        this.files = files;
        return this;
    }

    /**
     * Get the filesToDelete property: Files of the app to delete.
     *
     * @return the filesToDelete value.
     */
    public List<String> filesToDelete() {
        return this.filesToDelete;
    }

    /**
     * Set the filesToDelete property: Files of the app to delete.
     *
     * @param filesToDelete the filesToDelete value to set.
     * @return the WorkflowArtifacts object itself.
     */
    public WorkflowArtifacts withFilesToDelete(List<String> filesToDelete) {
        this.filesToDelete = filesToDelete;
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
