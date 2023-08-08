// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.streamanalytics.models.AuthenticationMode;
import com.azure.resourcemanager.streamanalytics.models.OAuthBasedDataSourceProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties that are associated with a Power BI output. */
@Fluent
public final class PowerBIOutputDataSourceProperties extends OAuthBasedDataSourceProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PowerBIOutputDataSourceProperties.class);

    /*
     * The name of the Power BI dataset. Required on PUT (CreateOrReplace)
     * requests.
     */
    @JsonProperty(value = "dataset")
    private String dataset;

    /*
     * The name of the Power BI table under the specified dataset. Required on
     * PUT (CreateOrReplace) requests.
     */
    @JsonProperty(value = "table")
    private String table;

    /*
     * The ID of the Power BI group.
     */
    @JsonProperty(value = "groupId")
    private String groupId;

    /*
     * The name of the Power BI group. Use this property to help remember which
     * specific Power BI group id was used.
     */
    @JsonProperty(value = "groupName")
    private String groupName;

    /*
     * Authentication Mode.
     */
    @JsonProperty(value = "authenticationMode")
    private AuthenticationMode authenticationMode;

    /**
     * Get the dataset property: The name of the Power BI dataset. Required on PUT (CreateOrReplace) requests.
     *
     * @return the dataset value.
     */
    public String dataset() {
        return this.dataset;
    }

    /**
     * Set the dataset property: The name of the Power BI dataset. Required on PUT (CreateOrReplace) requests.
     *
     * @param dataset the dataset value to set.
     * @return the PowerBIOutputDataSourceProperties object itself.
     */
    public PowerBIOutputDataSourceProperties withDataset(String dataset) {
        this.dataset = dataset;
        return this;
    }

    /**
     * Get the table property: The name of the Power BI table under the specified dataset. Required on PUT
     * (CreateOrReplace) requests.
     *
     * @return the table value.
     */
    public String table() {
        return this.table;
    }

    /**
     * Set the table property: The name of the Power BI table under the specified dataset. Required on PUT
     * (CreateOrReplace) requests.
     *
     * @param table the table value to set.
     * @return the PowerBIOutputDataSourceProperties object itself.
     */
    public PowerBIOutputDataSourceProperties withTable(String table) {
        this.table = table;
        return this;
    }

    /**
     * Get the groupId property: The ID of the Power BI group.
     *
     * @return the groupId value.
     */
    public String groupId() {
        return this.groupId;
    }

    /**
     * Set the groupId property: The ID of the Power BI group.
     *
     * @param groupId the groupId value to set.
     * @return the PowerBIOutputDataSourceProperties object itself.
     */
    public PowerBIOutputDataSourceProperties withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * Get the groupName property: The name of the Power BI group. Use this property to help remember which specific
     * Power BI group id was used.
     *
     * @return the groupName value.
     */
    public String groupName() {
        return this.groupName;
    }

    /**
     * Set the groupName property: The name of the Power BI group. Use this property to help remember which specific
     * Power BI group id was used.
     *
     * @param groupName the groupName value to set.
     * @return the PowerBIOutputDataSourceProperties object itself.
     */
    public PowerBIOutputDataSourceProperties withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * Get the authenticationMode property: Authentication Mode.
     *
     * @return the authenticationMode value.
     */
    public AuthenticationMode authenticationMode() {
        return this.authenticationMode;
    }

    /**
     * Set the authenticationMode property: Authentication Mode.
     *
     * @param authenticationMode the authenticationMode value to set.
     * @return the PowerBIOutputDataSourceProperties object itself.
     */
    public PowerBIOutputDataSourceProperties withAuthenticationMode(AuthenticationMode authenticationMode) {
        this.authenticationMode = authenticationMode;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PowerBIOutputDataSourceProperties withRefreshToken(String refreshToken) {
        super.withRefreshToken(refreshToken);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PowerBIOutputDataSourceProperties withTokenUserPrincipalName(String tokenUserPrincipalName) {
        super.withTokenUserPrincipalName(tokenUserPrincipalName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PowerBIOutputDataSourceProperties withTokenUserDisplayName(String tokenUserDisplayName) {
        super.withTokenUserDisplayName(tokenUserDisplayName);
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
