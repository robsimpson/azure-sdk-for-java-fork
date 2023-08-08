// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The commitment plan account association properties. */
@Fluent
public final class CommitmentPlanAccountAssociationProperties {
    /*
     * The Azure resource id of the account.
     */
    @JsonProperty(value = "accountId")
    private String accountId;

    /** Creates an instance of CommitmentPlanAccountAssociationProperties class. */
    public CommitmentPlanAccountAssociationProperties() {
    }

    /**
     * Get the accountId property: The Azure resource id of the account.
     *
     * @return the accountId value.
     */
    public String accountId() {
        return this.accountId;
    }

    /**
     * Set the accountId property: The Azure resource id of the account.
     *
     * @param accountId the accountId value to set.
     * @return the CommitmentPlanAccountAssociationProperties object itself.
     */
    public CommitmentPlanAccountAssociationProperties withAccountId(String accountId) {
        this.accountId = accountId;
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
