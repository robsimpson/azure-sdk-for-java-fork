// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A notification hub that has been linked to the communication service. */
@Fluent
public final class LinkedNotificationHubInner {
    /*
     * The resource ID of the notification hub
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /** Creates an instance of LinkedNotificationHubInner class. */
    public LinkedNotificationHubInner() {
    }

    /**
     * Get the resourceId property: The resource ID of the notification hub.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: The resource ID of the notification hub.
     *
     * @param resourceId the resourceId value to set.
     * @return the LinkedNotificationHubInner object itself.
     */
    public LinkedNotificationHubInner withResourceId(String resourceId) {
        this.resourceId = resourceId;
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
