// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A valid notification source type.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "sourceType",
    defaultImpl = NotificationsSource.class,
    visible = true)
@JsonTypeName("NotificationsSource")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Alert", value = NotificationsSourceAlert.class),
    @JsonSubTypes.Type(name = "AttackPath", value = NotificationsSourceAttackPath.class) })
@Immutable
public class NotificationsSource {
    /*
     * The source type that will trigger the notification
     */
    @JsonTypeId
    @JsonProperty(value = "sourceType", required = true)
    private SourceType sourceType;

    /**
     * Creates an instance of NotificationsSource class.
     */
    public NotificationsSource() {
        this.sourceType = SourceType.fromString("NotificationsSource");
    }

    /**
     * Get the sourceType property: The source type that will trigger the notification.
     * 
     * @return the sourceType value.
     */
    public SourceType sourceType() {
        return this.sourceType;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
