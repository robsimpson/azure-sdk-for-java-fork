// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.alertsmanagement.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** This object contains consistent fields across different monitor services. */
@Fluent
public final class Essentials {
    /*
     * Severity of alert Sev0 being highest and Sev4 being lowest.
     */
    @JsonProperty(value = "severity", access = JsonProperty.Access.WRITE_ONLY)
    private Severity severity;

    /*
     * The type of signal the alert is based on, which could be metrics, logs or activity logs.
     */
    @JsonProperty(value = "signalType", access = JsonProperty.Access.WRITE_ONLY)
    private SignalType signalType;

    /*
     * Alert object state, which can be modified by the user.
     */
    @JsonProperty(value = "alertState", access = JsonProperty.Access.WRITE_ONLY)
    private AlertState alertState;

    /*
     * Condition of the rule at the monitor service. It represents whether the underlying conditions have crossed the
     * defined alert rule thresholds.
     */
    @JsonProperty(value = "monitorCondition", access = JsonProperty.Access.WRITE_ONLY)
    private MonitorCondition monitorCondition;

    /*
     * Target ARM resource, on which alert got created.
     */
    @JsonProperty(value = "targetResource")
    private String targetResource;

    /*
     * Name of the target ARM resource name, on which alert got created.
     */
    @JsonProperty(value = "targetResourceName")
    private String targetResourceName;

    /*
     * Resource group of target ARM resource, on which alert got created.
     */
    @JsonProperty(value = "targetResourceGroup")
    private String targetResourceGroup;

    /*
     * Resource type of target ARM resource, on which alert got created.
     */
    @JsonProperty(value = "targetResourceType")
    private String targetResourceType;

    /*
     * Monitor service on which the rule(monitor) is set.
     */
    @JsonProperty(value = "monitorService", access = JsonProperty.Access.WRITE_ONLY)
    private MonitorService monitorService;

    /*
     * Rule(monitor) which fired alert instance. Depending on the monitor service,  this would be ARM id or name of the
     * rule.
     */
    @JsonProperty(value = "alertRule", access = JsonProperty.Access.WRITE_ONLY)
    private String alertRule;

    /*
     * Unique Id created by monitor service for each alert instance. This could be used to track the issue at the
     * monitor service, in case of Nagios, Zabbix, SCOM etc.
     */
    @JsonProperty(value = "sourceCreatedId", access = JsonProperty.Access.WRITE_ONLY)
    private String sourceCreatedId;

    /*
     * Unique Id of the smart group
     */
    @JsonProperty(value = "smartGroupId", access = JsonProperty.Access.WRITE_ONLY)
    private String smartGroupId;

    /*
     * Verbose reason describing the reason why this alert instance is added to a smart group
     */
    @JsonProperty(value = "smartGroupingReason", access = JsonProperty.Access.WRITE_ONLY)
    private String smartGroupingReason;

    /*
     * Creation time(ISO-8601 format) of alert instance.
     */
    @JsonProperty(value = "startDateTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime startDateTime;

    /*
     * Last modification time(ISO-8601 format) of alert instance.
     */
    @JsonProperty(value = "lastModifiedDateTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastModifiedDateTime;

    /*
     * Resolved time(ISO-8601 format) of alert instance. This will be updated when monitor service resolves the alert
     * instance because the rule condition is no longer met.
     */
    @JsonProperty(value = "monitorConditionResolvedDateTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime monitorConditionResolvedDateTime;

    /*
     * User who last modified the alert, in case of monitor service updates user would be 'system', otherwise name of
     * the user.
     */
    @JsonProperty(value = "lastModifiedUserName", access = JsonProperty.Access.WRITE_ONLY)
    private String lastModifiedUsername;

    /*
     * Action status
     */
    @JsonProperty(value = "actionStatus")
    private ActionStatus actionStatus;

    /*
     * Alert description.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get the severity property: Severity of alert Sev0 being highest and Sev4 being lowest.
     *
     * @return the severity value.
     */
    public Severity severity() {
        return this.severity;
    }

    /**
     * Get the signalType property: The type of signal the alert is based on, which could be metrics, logs or activity
     * logs.
     *
     * @return the signalType value.
     */
    public SignalType signalType() {
        return this.signalType;
    }

    /**
     * Get the alertState property: Alert object state, which can be modified by the user.
     *
     * @return the alertState value.
     */
    public AlertState alertState() {
        return this.alertState;
    }

    /**
     * Get the monitorCondition property: Condition of the rule at the monitor service. It represents whether the
     * underlying conditions have crossed the defined alert rule thresholds.
     *
     * @return the monitorCondition value.
     */
    public MonitorCondition monitorCondition() {
        return this.monitorCondition;
    }

    /**
     * Get the targetResource property: Target ARM resource, on which alert got created.
     *
     * @return the targetResource value.
     */
    public String targetResource() {
        return this.targetResource;
    }

    /**
     * Set the targetResource property: Target ARM resource, on which alert got created.
     *
     * @param targetResource the targetResource value to set.
     * @return the Essentials object itself.
     */
    public Essentials withTargetResource(String targetResource) {
        this.targetResource = targetResource;
        return this;
    }

    /**
     * Get the targetResourceName property: Name of the target ARM resource name, on which alert got created.
     *
     * @return the targetResourceName value.
     */
    public String targetResourceName() {
        return this.targetResourceName;
    }

    /**
     * Set the targetResourceName property: Name of the target ARM resource name, on which alert got created.
     *
     * @param targetResourceName the targetResourceName value to set.
     * @return the Essentials object itself.
     */
    public Essentials withTargetResourceName(String targetResourceName) {
        this.targetResourceName = targetResourceName;
        return this;
    }

    /**
     * Get the targetResourceGroup property: Resource group of target ARM resource, on which alert got created.
     *
     * @return the targetResourceGroup value.
     */
    public String targetResourceGroup() {
        return this.targetResourceGroup;
    }

    /**
     * Set the targetResourceGroup property: Resource group of target ARM resource, on which alert got created.
     *
     * @param targetResourceGroup the targetResourceGroup value to set.
     * @return the Essentials object itself.
     */
    public Essentials withTargetResourceGroup(String targetResourceGroup) {
        this.targetResourceGroup = targetResourceGroup;
        return this;
    }

    /**
     * Get the targetResourceType property: Resource type of target ARM resource, on which alert got created.
     *
     * @return the targetResourceType value.
     */
    public String targetResourceType() {
        return this.targetResourceType;
    }

    /**
     * Set the targetResourceType property: Resource type of target ARM resource, on which alert got created.
     *
     * @param targetResourceType the targetResourceType value to set.
     * @return the Essentials object itself.
     */
    public Essentials withTargetResourceType(String targetResourceType) {
        this.targetResourceType = targetResourceType;
        return this;
    }

    /**
     * Get the monitorService property: Monitor service on which the rule(monitor) is set.
     *
     * @return the monitorService value.
     */
    public MonitorService monitorService() {
        return this.monitorService;
    }

    /**
     * Get the alertRule property: Rule(monitor) which fired alert instance. Depending on the monitor service, this
     * would be ARM id or name of the rule.
     *
     * @return the alertRule value.
     */
    public String alertRule() {
        return this.alertRule;
    }

    /**
     * Get the sourceCreatedId property: Unique Id created by monitor service for each alert instance. This could be
     * used to track the issue at the monitor service, in case of Nagios, Zabbix, SCOM etc.
     *
     * @return the sourceCreatedId value.
     */
    public String sourceCreatedId() {
        return this.sourceCreatedId;
    }

    /**
     * Get the smartGroupId property: Unique Id of the smart group.
     *
     * @return the smartGroupId value.
     */
    public String smartGroupId() {
        return this.smartGroupId;
    }

    /**
     * Get the smartGroupingReason property: Verbose reason describing the reason why this alert instance is added to a
     * smart group.
     *
     * @return the smartGroupingReason value.
     */
    public String smartGroupingReason() {
        return this.smartGroupingReason;
    }

    /**
     * Get the startDateTime property: Creation time(ISO-8601 format) of alert instance.
     *
     * @return the startDateTime value.
     */
    public OffsetDateTime startDateTime() {
        return this.startDateTime;
    }

    /**
     * Get the lastModifiedDateTime property: Last modification time(ISO-8601 format) of alert instance.
     *
     * @return the lastModifiedDateTime value.
     */
    public OffsetDateTime lastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }

    /**
     * Get the monitorConditionResolvedDateTime property: Resolved time(ISO-8601 format) of alert instance. This will be
     * updated when monitor service resolves the alert instance because the rule condition is no longer met.
     *
     * @return the monitorConditionResolvedDateTime value.
     */
    public OffsetDateTime monitorConditionResolvedDateTime() {
        return this.monitorConditionResolvedDateTime;
    }

    /**
     * Get the lastModifiedUsername property: User who last modified the alert, in case of monitor service updates user
     * would be 'system', otherwise name of the user.
     *
     * @return the lastModifiedUsername value.
     */
    public String lastModifiedUsername() {
        return this.lastModifiedUsername;
    }

    /**
     * Get the actionStatus property: Action status.
     *
     * @return the actionStatus value.
     */
    public ActionStatus actionStatus() {
        return this.actionStatus;
    }

    /**
     * Set the actionStatus property: Action status.
     *
     * @param actionStatus the actionStatus value to set.
     * @return the Essentials object itself.
     */
    public Essentials withActionStatus(ActionStatus actionStatus) {
        this.actionStatus = actionStatus;
        return this;
    }

    /**
     * Get the description property: Alert description.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Alert description.
     *
     * @param description the description value to set.
     * @return the Essentials object itself.
     */
    public Essentials withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (actionStatus() != null) {
            actionStatus().validate();
        }
    }
}
