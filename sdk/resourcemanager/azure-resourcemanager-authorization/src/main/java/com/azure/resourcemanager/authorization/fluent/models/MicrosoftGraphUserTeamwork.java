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

/** userTeamwork. */
@Fluent
public final class MicrosoftGraphUserTeamwork extends MicrosoftGraphEntity {
    /*
     * The apps installed in the personal scope of this user.
     */
    @JsonProperty(value = "installedApps")
    private List<MicrosoftGraphUserScopeTeamsAppInstallation> installedApps;

    /*
     * userTeamwork
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /** Creates an instance of MicrosoftGraphUserTeamwork class. */
    public MicrosoftGraphUserTeamwork() {
    }

    /**
     * Get the installedApps property: The apps installed in the personal scope of this user.
     *
     * @return the installedApps value.
     */
    public List<MicrosoftGraphUserScopeTeamsAppInstallation> installedApps() {
        return this.installedApps;
    }

    /**
     * Set the installedApps property: The apps installed in the personal scope of this user.
     *
     * @param installedApps the installedApps value to set.
     * @return the MicrosoftGraphUserTeamwork object itself.
     */
    public MicrosoftGraphUserTeamwork withInstalledApps(
        List<MicrosoftGraphUserScopeTeamsAppInstallation> installedApps) {
        this.installedApps = installedApps;
        return this;
    }

    /**
     * Get the additionalProperties property: userTeamwork.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: userTeamwork.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphUserTeamwork object itself.
     */
    public MicrosoftGraphUserTeamwork withAdditionalProperties(Map<String, Object> additionalProperties) {
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
    public MicrosoftGraphUserTeamwork withId(String id) {
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
        if (installedApps() != null) {
            installedApps().forEach(e -> e.validate());
        }
    }
}
