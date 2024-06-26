// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Definition of the activity parameter validation set. */
@Fluent
public final class ActivityParameterValidationSet {
    /*
     * Gets or sets the name of the activity parameter validation set member.
     */
    @JsonProperty(value = "memberValue")
    private String memberValue;

    /**
     * Get the memberValue property: Gets or sets the name of the activity parameter validation set member.
     *
     * @return the memberValue value.
     */
    public String memberValue() {
        return this.memberValue;
    }

    /**
     * Set the memberValue property: Gets or sets the name of the activity parameter validation set member.
     *
     * @param memberValue the memberValue value to set.
     * @return the ActivityParameterValidationSet object itself.
     */
    public ActivityParameterValidationSet withMemberValue(String memberValue) {
        this.memberValue = memberValue;
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
