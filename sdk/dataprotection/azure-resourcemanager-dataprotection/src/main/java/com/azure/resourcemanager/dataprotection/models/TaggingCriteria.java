// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * TaggingCriteria
 *
 * <p>Tagging criteria.
 */
@Fluent
public final class TaggingCriteria {
    /*
     * Criteria which decides whether the tag can be applied to a triggered backup.
     */
    @JsonProperty(value = "criteria")
    private List<BackupCriteria> criteria;

    /*
     * Specifies if tag is default.
     */
    @JsonProperty(value = "isDefault", required = true)
    private boolean isDefault;

    /*
     * Retention Tag priority.
     */
    @JsonProperty(value = "taggingPriority", required = true)
    private long taggingPriority;

    /*
     * RetentionTag
     *
     * Retention tag information
     */
    @JsonProperty(value = "tagInfo", required = true)
    private RetentionTag tagInfo;

    /** Creates an instance of TaggingCriteria class. */
    public TaggingCriteria() {
    }

    /**
     * Get the criteria property: Criteria which decides whether the tag can be applied to a triggered backup.
     *
     * @return the criteria value.
     */
    public List<BackupCriteria> criteria() {
        return this.criteria;
    }

    /**
     * Set the criteria property: Criteria which decides whether the tag can be applied to a triggered backup.
     *
     * @param criteria the criteria value to set.
     * @return the TaggingCriteria object itself.
     */
    public TaggingCriteria withCriteria(List<BackupCriteria> criteria) {
        this.criteria = criteria;
        return this;
    }

    /**
     * Get the isDefault property: Specifies if tag is default.
     *
     * @return the isDefault value.
     */
    public boolean isDefault() {
        return this.isDefault;
    }

    /**
     * Set the isDefault property: Specifies if tag is default.
     *
     * @param isDefault the isDefault value to set.
     * @return the TaggingCriteria object itself.
     */
    public TaggingCriteria withIsDefault(boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * Get the taggingPriority property: Retention Tag priority.
     *
     * @return the taggingPriority value.
     */
    public long taggingPriority() {
        return this.taggingPriority;
    }

    /**
     * Set the taggingPriority property: Retention Tag priority.
     *
     * @param taggingPriority the taggingPriority value to set.
     * @return the TaggingCriteria object itself.
     */
    public TaggingCriteria withTaggingPriority(long taggingPriority) {
        this.taggingPriority = taggingPriority;
        return this;
    }

    /**
     * Get the tagInfo property: RetentionTag
     *
     * <p>Retention tag information.
     *
     * @return the tagInfo value.
     */
    public RetentionTag tagInfo() {
        return this.tagInfo;
    }

    /**
     * Set the tagInfo property: RetentionTag
     *
     * <p>Retention tag information.
     *
     * @param tagInfo the tagInfo value to set.
     * @return the TaggingCriteria object itself.
     */
    public TaggingCriteria withTagInfo(RetentionTag tagInfo) {
        this.tagInfo = tagInfo;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (criteria() != null) {
            criteria().forEach(e -> e.validate());
        }
        if (tagInfo() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property tagInfo in model TaggingCriteria"));
        } else {
            tagInfo().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(TaggingCriteria.class);
}
