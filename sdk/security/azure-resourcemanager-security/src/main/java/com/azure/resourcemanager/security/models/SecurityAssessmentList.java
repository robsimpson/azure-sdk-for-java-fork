// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.security.fluent.models.SecurityAssessmentResponseInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Page of a security assessments list. */
@Immutable
public final class SecurityAssessmentList {
    /*
     * Collection of security assessments in this page
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<SecurityAssessmentResponseInner> value;

    /*
     * The URI to fetch the next page.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /** Creates an instance of SecurityAssessmentList class. */
    public SecurityAssessmentList() {
    }

    /**
     * Get the value property: Collection of security assessments in this page.
     *
     * @return the value value.
     */
    public List<SecurityAssessmentResponseInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: The URI to fetch the next page.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
