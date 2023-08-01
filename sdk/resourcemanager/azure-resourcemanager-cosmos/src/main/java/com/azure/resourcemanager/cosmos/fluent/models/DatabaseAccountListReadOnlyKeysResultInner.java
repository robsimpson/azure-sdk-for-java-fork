// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The read-only access keys for the given database account. */
@Immutable
public class DatabaseAccountListReadOnlyKeysResultInner {
    /*
     * Base 64 encoded value of the primary read-only key.
     */
    @JsonProperty(value = "primaryReadonlyMasterKey", access = JsonProperty.Access.WRITE_ONLY)
    private String primaryReadonlyMasterKey;

    /*
     * Base 64 encoded value of the secondary read-only key.
     */
    @JsonProperty(value = "secondaryReadonlyMasterKey", access = JsonProperty.Access.WRITE_ONLY)
    private String secondaryReadonlyMasterKey;

    /** Creates an instance of DatabaseAccountListReadOnlyKeysResultInner class. */
    public DatabaseAccountListReadOnlyKeysResultInner() {
    }

    /**
     * Get the primaryReadonlyMasterKey property: Base 64 encoded value of the primary read-only key.
     *
     * @return the primaryReadonlyMasterKey value.
     */
    public String primaryReadonlyMasterKey() {
        return this.primaryReadonlyMasterKey;
    }

    /**
     * Get the secondaryReadonlyMasterKey property: Base 64 encoded value of the secondary read-only key.
     *
     * @return the secondaryReadonlyMasterKey value.
     */
    public String secondaryReadonlyMasterKey() {
        return this.secondaryReadonlyMasterKey;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
