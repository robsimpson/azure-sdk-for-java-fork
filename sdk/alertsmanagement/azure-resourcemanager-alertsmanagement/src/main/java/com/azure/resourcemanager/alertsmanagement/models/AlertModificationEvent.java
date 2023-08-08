// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.alertsmanagement.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Reason for the modification. */
public enum AlertModificationEvent {
    /** Enum value AlertCreated. */
    ALERT_CREATED("AlertCreated"),

    /** Enum value StateChange. */
    STATE_CHANGE("StateChange"),

    /** Enum value MonitorConditionChange. */
    MONITOR_CONDITION_CHANGE("MonitorConditionChange"),

    /** Enum value SeverityChange. */
    SEVERITY_CHANGE("SeverityChange"),

    /** Enum value ActionRuleTriggered. */
    ACTION_RULE_TRIGGERED("ActionRuleTriggered"),

    /** Enum value ActionRuleSuppressed. */
    ACTION_RULE_SUPPRESSED("ActionRuleSuppressed"),

    /** Enum value ActionsTriggered. */
    ACTIONS_TRIGGERED("ActionsTriggered"),

    /** Enum value ActionsSuppressed. */
    ACTIONS_SUPPRESSED("ActionsSuppressed"),

    /** Enum value ActionsFailed. */
    ACTIONS_FAILED("ActionsFailed");

    /** The actual serialized value for a AlertModificationEvent instance. */
    private final String value;

    AlertModificationEvent(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AlertModificationEvent instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed AlertModificationEvent object, or null if unable to parse.
     */
    @JsonCreator
    public static AlertModificationEvent fromString(String value) {
        if (value == null) {
            return null;
        }
        AlertModificationEvent[] items = AlertModificationEvent.values();
        for (AlertModificationEvent item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /** {@inheritDoc} */
    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
