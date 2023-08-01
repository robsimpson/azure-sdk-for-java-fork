// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * deviceCompliancePolicySettingState
 *
 * <p>Device Compilance Policy Setting State for a given device.
 */
@Fluent
public final class MicrosoftGraphDeviceCompliancePolicySettingState {
    /*
     * Current value of setting on device
     */
    @JsonProperty(value = "currentValue")
    private String currentValue;

    /*
     * Error code for the setting
     */
    @JsonProperty(value = "errorCode")
    private Long errorCode;

    /*
     * Error description
     */
    @JsonProperty(value = "errorDescription")
    private String errorDescription;

    /*
     * Name of setting instance that is being reported.
     */
    @JsonProperty(value = "instanceDisplayName")
    private String instanceDisplayName;

    /*
     * The setting that is being reported
     */
    @JsonProperty(value = "setting")
    private String setting;

    /*
     * Localized/user friendly setting name that is being reported
     */
    @JsonProperty(value = "settingName")
    private String settingName;

    /*
     * Contributing policies
     */
    @JsonProperty(value = "sources")
    private List<MicrosoftGraphSettingSource> sources;

    /*
     * complianceStatus
     */
    @JsonProperty(value = "state")
    private MicrosoftGraphComplianceStatus state;

    /*
     * UserEmail
     */
    @JsonProperty(value = "userEmail")
    private String userEmail;

    /*
     * UserId
     */
    @JsonProperty(value = "userId")
    private String userId;

    /*
     * UserName
     */
    @JsonProperty(value = "userName")
    private String username;

    /*
     * UserPrincipalName.
     */
    @JsonProperty(value = "userPrincipalName")
    private String userPrincipalName;

    /*
     * Device Compilance Policy Setting State for a given device.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /** Creates an instance of MicrosoftGraphDeviceCompliancePolicySettingState class. */
    public MicrosoftGraphDeviceCompliancePolicySettingState() {
    }

    /**
     * Get the currentValue property: Current value of setting on device.
     *
     * @return the currentValue value.
     */
    public String currentValue() {
        return this.currentValue;
    }

    /**
     * Set the currentValue property: Current value of setting on device.
     *
     * @param currentValue the currentValue value to set.
     * @return the MicrosoftGraphDeviceCompliancePolicySettingState object itself.
     */
    public MicrosoftGraphDeviceCompliancePolicySettingState withCurrentValue(String currentValue) {
        this.currentValue = currentValue;
        return this;
    }

    /**
     * Get the errorCode property: Error code for the setting.
     *
     * @return the errorCode value.
     */
    public Long errorCode() {
        return this.errorCode;
    }

    /**
     * Set the errorCode property: Error code for the setting.
     *
     * @param errorCode the errorCode value to set.
     * @return the MicrosoftGraphDeviceCompliancePolicySettingState object itself.
     */
    public MicrosoftGraphDeviceCompliancePolicySettingState withErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Get the errorDescription property: Error description.
     *
     * @return the errorDescription value.
     */
    public String errorDescription() {
        return this.errorDescription;
    }

    /**
     * Set the errorDescription property: Error description.
     *
     * @param errorDescription the errorDescription value to set.
     * @return the MicrosoftGraphDeviceCompliancePolicySettingState object itself.
     */
    public MicrosoftGraphDeviceCompliancePolicySettingState withErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
        return this;
    }

    /**
     * Get the instanceDisplayName property: Name of setting instance that is being reported.
     *
     * @return the instanceDisplayName value.
     */
    public String instanceDisplayName() {
        return this.instanceDisplayName;
    }

    /**
     * Set the instanceDisplayName property: Name of setting instance that is being reported.
     *
     * @param instanceDisplayName the instanceDisplayName value to set.
     * @return the MicrosoftGraphDeviceCompliancePolicySettingState object itself.
     */
    public MicrosoftGraphDeviceCompliancePolicySettingState withInstanceDisplayName(String instanceDisplayName) {
        this.instanceDisplayName = instanceDisplayName;
        return this;
    }

    /**
     * Get the setting property: The setting that is being reported.
     *
     * @return the setting value.
     */
    public String setting() {
        return this.setting;
    }

    /**
     * Set the setting property: The setting that is being reported.
     *
     * @param setting the setting value to set.
     * @return the MicrosoftGraphDeviceCompliancePolicySettingState object itself.
     */
    public MicrosoftGraphDeviceCompliancePolicySettingState withSetting(String setting) {
        this.setting = setting;
        return this;
    }

    /**
     * Get the settingName property: Localized/user friendly setting name that is being reported.
     *
     * @return the settingName value.
     */
    public String settingName() {
        return this.settingName;
    }

    /**
     * Set the settingName property: Localized/user friendly setting name that is being reported.
     *
     * @param settingName the settingName value to set.
     * @return the MicrosoftGraphDeviceCompliancePolicySettingState object itself.
     */
    public MicrosoftGraphDeviceCompliancePolicySettingState withSettingName(String settingName) {
        this.settingName = settingName;
        return this;
    }

    /**
     * Get the sources property: Contributing policies.
     *
     * @return the sources value.
     */
    public List<MicrosoftGraphSettingSource> sources() {
        return this.sources;
    }

    /**
     * Set the sources property: Contributing policies.
     *
     * @param sources the sources value to set.
     * @return the MicrosoftGraphDeviceCompliancePolicySettingState object itself.
     */
    public MicrosoftGraphDeviceCompliancePolicySettingState withSources(List<MicrosoftGraphSettingSource> sources) {
        this.sources = sources;
        return this;
    }

    /**
     * Get the state property: complianceStatus.
     *
     * @return the state value.
     */
    public MicrosoftGraphComplianceStatus state() {
        return this.state;
    }

    /**
     * Set the state property: complianceStatus.
     *
     * @param state the state value to set.
     * @return the MicrosoftGraphDeviceCompliancePolicySettingState object itself.
     */
    public MicrosoftGraphDeviceCompliancePolicySettingState withState(MicrosoftGraphComplianceStatus state) {
        this.state = state;
        return this;
    }

    /**
     * Get the userEmail property: UserEmail.
     *
     * @return the userEmail value.
     */
    public String userEmail() {
        return this.userEmail;
    }

    /**
     * Set the userEmail property: UserEmail.
     *
     * @param userEmail the userEmail value to set.
     * @return the MicrosoftGraphDeviceCompliancePolicySettingState object itself.
     */
    public MicrosoftGraphDeviceCompliancePolicySettingState withUserEmail(String userEmail) {
        this.userEmail = userEmail;
        return this;
    }

    /**
     * Get the userId property: UserId.
     *
     * @return the userId value.
     */
    public String userId() {
        return this.userId;
    }

    /**
     * Set the userId property: UserId.
     *
     * @param userId the userId value to set.
     * @return the MicrosoftGraphDeviceCompliancePolicySettingState object itself.
     */
    public MicrosoftGraphDeviceCompliancePolicySettingState withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Get the username property: UserName.
     *
     * @return the username value.
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the username property: UserName.
     *
     * @param username the username value to set.
     * @return the MicrosoftGraphDeviceCompliancePolicySettingState object itself.
     */
    public MicrosoftGraphDeviceCompliancePolicySettingState withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the userPrincipalName property: UserPrincipalName.
     *
     * @return the userPrincipalName value.
     */
    public String userPrincipalName() {
        return this.userPrincipalName;
    }

    /**
     * Set the userPrincipalName property: UserPrincipalName.
     *
     * @param userPrincipalName the userPrincipalName value to set.
     * @return the MicrosoftGraphDeviceCompliancePolicySettingState object itself.
     */
    public MicrosoftGraphDeviceCompliancePolicySettingState withUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
        return this;
    }

    /**
     * Get the additionalProperties property: Device Compilance Policy Setting State for a given device.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Device Compilance Policy Setting State for a given device.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphDeviceCompliancePolicySettingState object itself.
     */
    public MicrosoftGraphDeviceCompliancePolicySettingState withAdditionalProperties(
        Map<String, Object> additionalProperties) {
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

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sources() != null) {
            sources().forEach(e -> e.validate());
        }
    }
}
