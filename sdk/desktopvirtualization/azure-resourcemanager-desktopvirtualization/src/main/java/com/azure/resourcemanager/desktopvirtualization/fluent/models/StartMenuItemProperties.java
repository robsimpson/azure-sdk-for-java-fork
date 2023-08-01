// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Schema for StartMenuItem properties. */
@Fluent
public final class StartMenuItemProperties {
    /*
     * Alias of StartMenuItem.
     */
    @JsonProperty(value = "appAlias")
    private String appAlias;

    /*
     * Path to the file of StartMenuItem.
     */
    @JsonProperty(value = "filePath")
    private String filePath;

    /*
     * Command line arguments for StartMenuItem.
     */
    @JsonProperty(value = "commandLineArguments")
    private String commandLineArguments;

    /*
     * Path to the icon.
     */
    @JsonProperty(value = "iconPath")
    private String iconPath;

    /*
     * Index of the icon.
     */
    @JsonProperty(value = "iconIndex")
    private Integer iconIndex;

    /** Creates an instance of StartMenuItemProperties class. */
    public StartMenuItemProperties() {
    }

    /**
     * Get the appAlias property: Alias of StartMenuItem.
     *
     * @return the appAlias value.
     */
    public String appAlias() {
        return this.appAlias;
    }

    /**
     * Set the appAlias property: Alias of StartMenuItem.
     *
     * @param appAlias the appAlias value to set.
     * @return the StartMenuItemProperties object itself.
     */
    public StartMenuItemProperties withAppAlias(String appAlias) {
        this.appAlias = appAlias;
        return this;
    }

    /**
     * Get the filePath property: Path to the file of StartMenuItem.
     *
     * @return the filePath value.
     */
    public String filePath() {
        return this.filePath;
    }

    /**
     * Set the filePath property: Path to the file of StartMenuItem.
     *
     * @param filePath the filePath value to set.
     * @return the StartMenuItemProperties object itself.
     */
    public StartMenuItemProperties withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * Get the commandLineArguments property: Command line arguments for StartMenuItem.
     *
     * @return the commandLineArguments value.
     */
    public String commandLineArguments() {
        return this.commandLineArguments;
    }

    /**
     * Set the commandLineArguments property: Command line arguments for StartMenuItem.
     *
     * @param commandLineArguments the commandLineArguments value to set.
     * @return the StartMenuItemProperties object itself.
     */
    public StartMenuItemProperties withCommandLineArguments(String commandLineArguments) {
        this.commandLineArguments = commandLineArguments;
        return this;
    }

    /**
     * Get the iconPath property: Path to the icon.
     *
     * @return the iconPath value.
     */
    public String iconPath() {
        return this.iconPath;
    }

    /**
     * Set the iconPath property: Path to the icon.
     *
     * @param iconPath the iconPath value to set.
     * @return the StartMenuItemProperties object itself.
     */
    public StartMenuItemProperties withIconPath(String iconPath) {
        this.iconPath = iconPath;
        return this;
    }

    /**
     * Get the iconIndex property: Index of the icon.
     *
     * @return the iconIndex value.
     */
    public Integer iconIndex() {
        return this.iconIndex;
    }

    /**
     * Set the iconIndex property: Index of the icon.
     *
     * @param iconIndex the iconIndex value to set.
     * @return the StartMenuItemProperties object itself.
     */
    public StartMenuItemProperties withIconIndex(Integer iconIndex) {
        this.iconIndex = iconIndex;
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
