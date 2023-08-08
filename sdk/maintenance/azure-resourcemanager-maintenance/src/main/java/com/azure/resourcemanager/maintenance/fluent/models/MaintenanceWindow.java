// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Definition of a MaintenanceWindow. */
@Fluent
public final class MaintenanceWindow {
    /*
     * Effective start date of the maintenance window in YYYY-MM-DD hh:mm format. The start date can be set to either
     * the current date or future date. The window will be created in the time zone provided and adjusted to daylight
     * savings according to that time zone.
     */
    @JsonProperty(value = "startDateTime")
    private String startDateTime;

    /*
     * Effective expiration date of the maintenance window in YYYY-MM-DD hh:mm format. The window will be created in
     * the time zone provided and adjusted to daylight savings according to that time zone. Expiration date must be set
     * to a future date. If not provided, it will be set to the maximum datetime 9999-12-31 23:59:59.
     */
    @JsonProperty(value = "expirationDateTime")
    private String expirationDateTime;

    /*
     * Duration of the maintenance window in HH:mm format. If not provided, default value will be used based on
     * maintenance scope provided. Example: 05:00.
     */
    @JsonProperty(value = "duration")
    private String duration;

    /*
     * Name of the timezone. List of timezones can be obtained by executing [System.TimeZoneInfo]::GetSystemTimeZones()
     * in PowerShell. Example: Pacific Standard Time, UTC, W. Europe Standard Time, Korea Standard Time, Cen. Australia
     * Standard Time.
     */
    @JsonProperty(value = "timeZone")
    private String timeZone;

    /*
     * Rate at which a Maintenance window is expected to recur. The rate can be expressed as daily, weekly, or monthly
     * schedules. Daily schedule are formatted as recurEvery: [Frequency as integer]['Day(s)']. If no frequency is
     * provided, the default frequency is 1. Daily schedule examples are recurEvery: Day, recurEvery: 3Days.  Weekly
     * schedule are formatted as recurEvery: [Frequency as integer]['Week(s)'] [Optional comma separated list of
     * weekdays Monday-Sunday]. Weekly schedule examples are recurEvery: 3Weeks, recurEvery: Week Saturday,Sunday.
     * Monthly schedules are formatted as [Frequency as integer]['Month(s)'] [Comma separated list of month days] or
     * [Frequency as integer]['Month(s)'] [Week of Month (First, Second, Third, Fourth, Last)] [Weekday Monday-Sunday].
     * Monthly schedule examples are recurEvery: Month, recurEvery: 2Months, recurEvery: Month day23,day24, recurEvery:
     * Month Last Sunday, recurEvery: Month Fourth Monday.
     */
    @JsonProperty(value = "recurEvery")
    private String recurEvery;

    /** Creates an instance of MaintenanceWindow class. */
    public MaintenanceWindow() {
    }

    /**
     * Get the startDateTime property: Effective start date of the maintenance window in YYYY-MM-DD hh:mm format. The
     * start date can be set to either the current date or future date. The window will be created in the time zone
     * provided and adjusted to daylight savings according to that time zone.
     *
     * @return the startDateTime value.
     */
    public String startDateTime() {
        return this.startDateTime;
    }

    /**
     * Set the startDateTime property: Effective start date of the maintenance window in YYYY-MM-DD hh:mm format. The
     * start date can be set to either the current date or future date. The window will be created in the time zone
     * provided and adjusted to daylight savings according to that time zone.
     *
     * @param startDateTime the startDateTime value to set.
     * @return the MaintenanceWindow object itself.
     */
    public MaintenanceWindow withStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
        return this;
    }

    /**
     * Get the expirationDateTime property: Effective expiration date of the maintenance window in YYYY-MM-DD hh:mm
     * format. The window will be created in the time zone provided and adjusted to daylight savings according to that
     * time zone. Expiration date must be set to a future date. If not provided, it will be set to the maximum datetime
     * 9999-12-31 23:59:59.
     *
     * @return the expirationDateTime value.
     */
    public String expirationDateTime() {
        return this.expirationDateTime;
    }

    /**
     * Set the expirationDateTime property: Effective expiration date of the maintenance window in YYYY-MM-DD hh:mm
     * format. The window will be created in the time zone provided and adjusted to daylight savings according to that
     * time zone. Expiration date must be set to a future date. If not provided, it will be set to the maximum datetime
     * 9999-12-31 23:59:59.
     *
     * @param expirationDateTime the expirationDateTime value to set.
     * @return the MaintenanceWindow object itself.
     */
    public MaintenanceWindow withExpirationDateTime(String expirationDateTime) {
        this.expirationDateTime = expirationDateTime;
        return this;
    }

    /**
     * Get the duration property: Duration of the maintenance window in HH:mm format. If not provided, default value
     * will be used based on maintenance scope provided. Example: 05:00.
     *
     * @return the duration value.
     */
    public String duration() {
        return this.duration;
    }

    /**
     * Set the duration property: Duration of the maintenance window in HH:mm format. If not provided, default value
     * will be used based on maintenance scope provided. Example: 05:00.
     *
     * @param duration the duration value to set.
     * @return the MaintenanceWindow object itself.
     */
    public MaintenanceWindow withDuration(String duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Get the timeZone property: Name of the timezone. List of timezones can be obtained by executing
     * [System.TimeZoneInfo]::GetSystemTimeZones() in PowerShell. Example: Pacific Standard Time, UTC, W. Europe
     * Standard Time, Korea Standard Time, Cen. Australia Standard Time.
     *
     * @return the timeZone value.
     */
    public String timeZone() {
        return this.timeZone;
    }

    /**
     * Set the timeZone property: Name of the timezone. List of timezones can be obtained by executing
     * [System.TimeZoneInfo]::GetSystemTimeZones() in PowerShell. Example: Pacific Standard Time, UTC, W. Europe
     * Standard Time, Korea Standard Time, Cen. Australia Standard Time.
     *
     * @param timeZone the timeZone value to set.
     * @return the MaintenanceWindow object itself.
     */
    public MaintenanceWindow withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * Get the recurEvery property: Rate at which a Maintenance window is expected to recur. The rate can be expressed
     * as daily, weekly, or monthly schedules. Daily schedule are formatted as recurEvery: [Frequency as
     * integer]['Day(s)']. If no frequency is provided, the default frequency is 1. Daily schedule examples are
     * recurEvery: Day, recurEvery: 3Days. Weekly schedule are formatted as recurEvery: [Frequency as
     * integer]['Week(s)'] [Optional comma separated list of weekdays Monday-Sunday]. Weekly schedule examples are
     * recurEvery: 3Weeks, recurEvery: Week Saturday,Sunday. Monthly schedules are formatted as [Frequency as
     * integer]['Month(s)'] [Comma separated list of month days] or [Frequency as integer]['Month(s)'] [Week of Month
     * (First, Second, Third, Fourth, Last)] [Weekday Monday-Sunday]. Monthly schedule examples are recurEvery: Month,
     * recurEvery: 2Months, recurEvery: Month day23,day24, recurEvery: Month Last Sunday, recurEvery: Month Fourth
     * Monday.
     *
     * @return the recurEvery value.
     */
    public String recurEvery() {
        return this.recurEvery;
    }

    /**
     * Set the recurEvery property: Rate at which a Maintenance window is expected to recur. The rate can be expressed
     * as daily, weekly, or monthly schedules. Daily schedule are formatted as recurEvery: [Frequency as
     * integer]['Day(s)']. If no frequency is provided, the default frequency is 1. Daily schedule examples are
     * recurEvery: Day, recurEvery: 3Days. Weekly schedule are formatted as recurEvery: [Frequency as
     * integer]['Week(s)'] [Optional comma separated list of weekdays Monday-Sunday]. Weekly schedule examples are
     * recurEvery: 3Weeks, recurEvery: Week Saturday,Sunday. Monthly schedules are formatted as [Frequency as
     * integer]['Month(s)'] [Comma separated list of month days] or [Frequency as integer]['Month(s)'] [Week of Month
     * (First, Second, Third, Fourth, Last)] [Weekday Monday-Sunday]. Monthly schedule examples are recurEvery: Month,
     * recurEvery: 2Months, recurEvery: Month day23,day24, recurEvery: Month Last Sunday, recurEvery: Month Fourth
     * Monday.
     *
     * @param recurEvery the recurEvery value to set.
     * @return the MaintenanceWindow object itself.
     */
    public MaintenanceWindow withRecurEvery(String recurEvery) {
        this.recurEvery = recurEvery;
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
