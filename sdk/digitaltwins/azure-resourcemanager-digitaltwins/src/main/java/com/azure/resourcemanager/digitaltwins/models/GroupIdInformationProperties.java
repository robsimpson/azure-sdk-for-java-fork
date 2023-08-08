// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The properties for a group information object. */
@Fluent
public final class GroupIdInformationProperties {
    /*
     * The group id.
     */
    @JsonProperty(value = "groupId")
    private String groupId;

    /*
     * The required members for a specific group id.
     */
    @JsonProperty(value = "requiredMembers")
    private List<String> requiredMembers;

    /*
     * The required DNS zones for a specific group id.
     */
    @JsonProperty(value = "requiredZoneNames")
    private List<String> requiredZoneNames;

    /** Creates an instance of GroupIdInformationProperties class. */
    public GroupIdInformationProperties() {
    }

    /**
     * Get the groupId property: The group id.
     *
     * @return the groupId value.
     */
    public String groupId() {
        return this.groupId;
    }

    /**
     * Set the groupId property: The group id.
     *
     * @param groupId the groupId value to set.
     * @return the GroupIdInformationProperties object itself.
     */
    public GroupIdInformationProperties withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * Get the requiredMembers property: The required members for a specific group id.
     *
     * @return the requiredMembers value.
     */
    public List<String> requiredMembers() {
        return this.requiredMembers;
    }

    /**
     * Set the requiredMembers property: The required members for a specific group id.
     *
     * @param requiredMembers the requiredMembers value to set.
     * @return the GroupIdInformationProperties object itself.
     */
    public GroupIdInformationProperties withRequiredMembers(List<String> requiredMembers) {
        this.requiredMembers = requiredMembers;
        return this;
    }

    /**
     * Get the requiredZoneNames property: The required DNS zones for a specific group id.
     *
     * @return the requiredZoneNames value.
     */
    public List<String> requiredZoneNames() {
        return this.requiredZoneNames;
    }

    /**
     * Set the requiredZoneNames property: The required DNS zones for a specific group id.
     *
     * @param requiredZoneNames the requiredZoneNames value to set.
     * @return the GroupIdInformationProperties object itself.
     */
    public GroupIdInformationProperties withRequiredZoneNames(List<String> requiredZoneNames) {
        this.requiredZoneNames = requiredZoneNames;
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
