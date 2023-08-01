// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** schedulingGroup. */
@Fluent
public final class MicrosoftGraphSchedulingGroup extends MicrosoftGraphChangeTrackedEntity {
    /*
     * The display name for the schedulingGroup. Required.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Indicates whether the schedulingGroup can be used when creating new entities or updating existing ones.
     * Required.
     */
    @JsonProperty(value = "isActive")
    private Boolean isActive;

    /*
     * The list of user IDs that are a member of the schedulingGroup. Required.
     */
    @JsonProperty(value = "userIds")
    private List<String> userIds;

    /*
     * schedulingGroup
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /** Creates an instance of MicrosoftGraphSchedulingGroup class. */
    public MicrosoftGraphSchedulingGroup() {
    }

    /**
     * Get the displayName property: The display name for the schedulingGroup. Required.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name for the schedulingGroup. Required.
     *
     * @param displayName the displayName value to set.
     * @return the MicrosoftGraphSchedulingGroup object itself.
     */
    public MicrosoftGraphSchedulingGroup withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the isActive property: Indicates whether the schedulingGroup can be used when creating new entities or
     * updating existing ones. Required.
     *
     * @return the isActive value.
     */
    public Boolean isActive() {
        return this.isActive;
    }

    /**
     * Set the isActive property: Indicates whether the schedulingGroup can be used when creating new entities or
     * updating existing ones. Required.
     *
     * @param isActive the isActive value to set.
     * @return the MicrosoftGraphSchedulingGroup object itself.
     */
    public MicrosoftGraphSchedulingGroup withIsActive(Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    /**
     * Get the userIds property: The list of user IDs that are a member of the schedulingGroup. Required.
     *
     * @return the userIds value.
     */
    public List<String> userIds() {
        return this.userIds;
    }

    /**
     * Set the userIds property: The list of user IDs that are a member of the schedulingGroup. Required.
     *
     * @param userIds the userIds value to set.
     * @return the MicrosoftGraphSchedulingGroup object itself.
     */
    public MicrosoftGraphSchedulingGroup withUserIds(List<String> userIds) {
        this.userIds = userIds;
        return this;
    }

    /**
     * Get the additionalProperties property: schedulingGroup.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: schedulingGroup.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphSchedulingGroup object itself.
     */
    public MicrosoftGraphSchedulingGroup withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphSchedulingGroup withCreatedDateTime(OffsetDateTime createdDateTime) {
        super.withCreatedDateTime(createdDateTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphSchedulingGroup withLastModifiedBy(MicrosoftGraphIdentitySet lastModifiedBy) {
        super.withLastModifiedBy(lastModifiedBy);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphSchedulingGroup withLastModifiedDateTime(OffsetDateTime lastModifiedDateTime) {
        super.withLastModifiedDateTime(lastModifiedDateTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphSchedulingGroup withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
