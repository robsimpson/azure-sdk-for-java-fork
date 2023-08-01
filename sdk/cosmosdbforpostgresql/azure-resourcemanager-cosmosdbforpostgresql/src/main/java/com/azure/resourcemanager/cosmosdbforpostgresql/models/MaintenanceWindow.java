// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmosdbforpostgresql.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Schedule settings for regular cluster updates. */
@Fluent
public final class MaintenanceWindow {
    /*
     * Indicates whether custom maintenance window is enabled or not.
     */
    @JsonProperty(value = "customWindow")
    private String customWindow;

    /*
     * Start hour within preferred day of the week for maintenance window.
     */
    @JsonProperty(value = "startHour")
    private Integer startHour;

    /*
     * Start minute within the start hour for maintenance window.
     */
    @JsonProperty(value = "startMinute")
    private Integer startMinute;

    /*
     * Preferred day of the week for maintenance window.
     */
    @JsonProperty(value = "dayOfWeek")
    private Integer dayOfWeek;

    /** Creates an instance of MaintenanceWindow class. */
    public MaintenanceWindow() {
    }

    /**
     * Get the customWindow property: Indicates whether custom maintenance window is enabled or not.
     *
     * @return the customWindow value.
     */
    public String customWindow() {
        return this.customWindow;
    }

    /**
     * Set the customWindow property: Indicates whether custom maintenance window is enabled or not.
     *
     * @param customWindow the customWindow value to set.
     * @return the MaintenanceWindow object itself.
     */
    public MaintenanceWindow withCustomWindow(String customWindow) {
        this.customWindow = customWindow;
        return this;
    }

    /**
     * Get the startHour property: Start hour within preferred day of the week for maintenance window.
     *
     * @return the startHour value.
     */
    public Integer startHour() {
        return this.startHour;
    }

    /**
     * Set the startHour property: Start hour within preferred day of the week for maintenance window.
     *
     * @param startHour the startHour value to set.
     * @return the MaintenanceWindow object itself.
     */
    public MaintenanceWindow withStartHour(Integer startHour) {
        this.startHour = startHour;
        return this;
    }

    /**
     * Get the startMinute property: Start minute within the start hour for maintenance window.
     *
     * @return the startMinute value.
     */
    public Integer startMinute() {
        return this.startMinute;
    }

    /**
     * Set the startMinute property: Start minute within the start hour for maintenance window.
     *
     * @param startMinute the startMinute value to set.
     * @return the MaintenanceWindow object itself.
     */
    public MaintenanceWindow withStartMinute(Integer startMinute) {
        this.startMinute = startMinute;
        return this;
    }

    /**
     * Get the dayOfWeek property: Preferred day of the week for maintenance window.
     *
     * @return the dayOfWeek value.
     */
    public Integer dayOfWeek() {
        return this.dayOfWeek;
    }

    /**
     * Set the dayOfWeek property: Preferred day of the week for maintenance window.
     *
     * @param dayOfWeek the dayOfWeek value to set.
     * @return the MaintenanceWindow object itself.
     */
    public MaintenanceWindow withDayOfWeek(Integer dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
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
