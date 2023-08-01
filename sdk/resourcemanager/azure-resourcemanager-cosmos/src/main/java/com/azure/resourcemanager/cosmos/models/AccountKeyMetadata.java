// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The metadata related to an access key for a given database account. */
@Immutable
public final class AccountKeyMetadata {
    /*
     * Generation time in UTC of the key in ISO-8601 format. If the value is missing from the object, it means that the
     * last key regeneration was triggered before 2022-06-18.
     */
    @JsonProperty(value = "generationTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime generationTime;

    /** Creates an instance of AccountKeyMetadata class. */
    public AccountKeyMetadata() {
    }

    /**
     * Get the generationTime property: Generation time in UTC of the key in ISO-8601 format. If the value is missing
     * from the object, it means that the last key regeneration was triggered before 2022-06-18.
     *
     * @return the generationTime value.
     */
    public OffsetDateTime generationTime() {
        return this.generationTime;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
