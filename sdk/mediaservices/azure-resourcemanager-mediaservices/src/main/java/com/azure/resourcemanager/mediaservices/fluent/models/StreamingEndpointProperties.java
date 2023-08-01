// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.mediaservices.models.CrossSiteAccessPolicies;
import com.azure.resourcemanager.mediaservices.models.StreamingEndpointAccessControl;
import com.azure.resourcemanager.mediaservices.models.StreamingEndpointResourceState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The streaming endpoint properties. */
@Fluent
public final class StreamingEndpointProperties {
    /*
     * The streaming endpoint description.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The number of scale units. Use the Scale operation to adjust this value.
     */
    @JsonProperty(value = "scaleUnits", required = true)
    private int scaleUnits;

    /*
     * This feature is deprecated, do not set a value for this property.
     */
    @JsonProperty(value = "availabilitySetName")
    private String availabilitySetName;

    /*
     * The access control definition of the streaming endpoint.
     */
    @JsonProperty(value = "accessControl")
    private StreamingEndpointAccessControl accessControl;

    /*
     * Max cache age
     */
    @JsonProperty(value = "maxCacheAge")
    private Long maxCacheAge;

    /*
     * The custom host names of the streaming endpoint
     */
    @JsonProperty(value = "customHostNames")
    private List<String> customHostNames;

    /*
     * The streaming endpoint host name.
     */
    @JsonProperty(value = "hostName", access = JsonProperty.Access.WRITE_ONLY)
    private String hostname;

    /*
     * The CDN enabled flag.
     */
    @JsonProperty(value = "cdnEnabled")
    private Boolean cdnEnabled;

    /*
     * The CDN provider name.
     */
    @JsonProperty(value = "cdnProvider")
    private String cdnProvider;

    /*
     * The CDN profile name.
     */
    @JsonProperty(value = "cdnProfile")
    private String cdnProfile;

    /*
     * The provisioning state of the streaming endpoint.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The resource state of the streaming endpoint.
     */
    @JsonProperty(value = "resourceState", access = JsonProperty.Access.WRITE_ONLY)
    private StreamingEndpointResourceState resourceState;

    /*
     * The streaming endpoint access policies.
     */
    @JsonProperty(value = "crossSiteAccessPolicies")
    private CrossSiteAccessPolicies crossSiteAccessPolicies;

    /*
     * The free trial expiration time.
     */
    @JsonProperty(value = "freeTrialEndTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime freeTrialEndTime;

    /*
     * The exact time the streaming endpoint was created.
     */
    @JsonProperty(value = "created", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime created;

    /*
     * The exact time the streaming endpoint was last modified.
     */
    @JsonProperty(value = "lastModified", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastModified;

    /** Creates an instance of StreamingEndpointProperties class. */
    public StreamingEndpointProperties() {
    }

    /**
     * Get the description property: The streaming endpoint description.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The streaming endpoint description.
     *
     * @param description the description value to set.
     * @return the StreamingEndpointProperties object itself.
     */
    public StreamingEndpointProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the scaleUnits property: The number of scale units. Use the Scale operation to adjust this value.
     *
     * @return the scaleUnits value.
     */
    public int scaleUnits() {
        return this.scaleUnits;
    }

    /**
     * Set the scaleUnits property: The number of scale units. Use the Scale operation to adjust this value.
     *
     * @param scaleUnits the scaleUnits value to set.
     * @return the StreamingEndpointProperties object itself.
     */
    public StreamingEndpointProperties withScaleUnits(int scaleUnits) {
        this.scaleUnits = scaleUnits;
        return this;
    }

    /**
     * Get the availabilitySetName property: This feature is deprecated, do not set a value for this property.
     *
     * @return the availabilitySetName value.
     */
    public String availabilitySetName() {
        return this.availabilitySetName;
    }

    /**
     * Set the availabilitySetName property: This feature is deprecated, do not set a value for this property.
     *
     * @param availabilitySetName the availabilitySetName value to set.
     * @return the StreamingEndpointProperties object itself.
     */
    public StreamingEndpointProperties withAvailabilitySetName(String availabilitySetName) {
        this.availabilitySetName = availabilitySetName;
        return this;
    }

    /**
     * Get the accessControl property: The access control definition of the streaming endpoint.
     *
     * @return the accessControl value.
     */
    public StreamingEndpointAccessControl accessControl() {
        return this.accessControl;
    }

    /**
     * Set the accessControl property: The access control definition of the streaming endpoint.
     *
     * @param accessControl the accessControl value to set.
     * @return the StreamingEndpointProperties object itself.
     */
    public StreamingEndpointProperties withAccessControl(StreamingEndpointAccessControl accessControl) {
        this.accessControl = accessControl;
        return this;
    }

    /**
     * Get the maxCacheAge property: Max cache age.
     *
     * @return the maxCacheAge value.
     */
    public Long maxCacheAge() {
        return this.maxCacheAge;
    }

    /**
     * Set the maxCacheAge property: Max cache age.
     *
     * @param maxCacheAge the maxCacheAge value to set.
     * @return the StreamingEndpointProperties object itself.
     */
    public StreamingEndpointProperties withMaxCacheAge(Long maxCacheAge) {
        this.maxCacheAge = maxCacheAge;
        return this;
    }

    /**
     * Get the customHostNames property: The custom host names of the streaming endpoint.
     *
     * @return the customHostNames value.
     */
    public List<String> customHostNames() {
        return this.customHostNames;
    }

    /**
     * Set the customHostNames property: The custom host names of the streaming endpoint.
     *
     * @param customHostNames the customHostNames value to set.
     * @return the StreamingEndpointProperties object itself.
     */
    public StreamingEndpointProperties withCustomHostNames(List<String> customHostNames) {
        this.customHostNames = customHostNames;
        return this;
    }

    /**
     * Get the hostname property: The streaming endpoint host name.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Get the cdnEnabled property: The CDN enabled flag.
     *
     * @return the cdnEnabled value.
     */
    public Boolean cdnEnabled() {
        return this.cdnEnabled;
    }

    /**
     * Set the cdnEnabled property: The CDN enabled flag.
     *
     * @param cdnEnabled the cdnEnabled value to set.
     * @return the StreamingEndpointProperties object itself.
     */
    public StreamingEndpointProperties withCdnEnabled(Boolean cdnEnabled) {
        this.cdnEnabled = cdnEnabled;
        return this;
    }

    /**
     * Get the cdnProvider property: The CDN provider name.
     *
     * @return the cdnProvider value.
     */
    public String cdnProvider() {
        return this.cdnProvider;
    }

    /**
     * Set the cdnProvider property: The CDN provider name.
     *
     * @param cdnProvider the cdnProvider value to set.
     * @return the StreamingEndpointProperties object itself.
     */
    public StreamingEndpointProperties withCdnProvider(String cdnProvider) {
        this.cdnProvider = cdnProvider;
        return this;
    }

    /**
     * Get the cdnProfile property: The CDN profile name.
     *
     * @return the cdnProfile value.
     */
    public String cdnProfile() {
        return this.cdnProfile;
    }

    /**
     * Set the cdnProfile property: The CDN profile name.
     *
     * @param cdnProfile the cdnProfile value to set.
     * @return the StreamingEndpointProperties object itself.
     */
    public StreamingEndpointProperties withCdnProfile(String cdnProfile) {
        this.cdnProfile = cdnProfile;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the streaming endpoint.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the resourceState property: The resource state of the streaming endpoint.
     *
     * @return the resourceState value.
     */
    public StreamingEndpointResourceState resourceState() {
        return this.resourceState;
    }

    /**
     * Get the crossSiteAccessPolicies property: The streaming endpoint access policies.
     *
     * @return the crossSiteAccessPolicies value.
     */
    public CrossSiteAccessPolicies crossSiteAccessPolicies() {
        return this.crossSiteAccessPolicies;
    }

    /**
     * Set the crossSiteAccessPolicies property: The streaming endpoint access policies.
     *
     * @param crossSiteAccessPolicies the crossSiteAccessPolicies value to set.
     * @return the StreamingEndpointProperties object itself.
     */
    public StreamingEndpointProperties withCrossSiteAccessPolicies(CrossSiteAccessPolicies crossSiteAccessPolicies) {
        this.crossSiteAccessPolicies = crossSiteAccessPolicies;
        return this;
    }

    /**
     * Get the freeTrialEndTime property: The free trial expiration time.
     *
     * @return the freeTrialEndTime value.
     */
    public OffsetDateTime freeTrialEndTime() {
        return this.freeTrialEndTime;
    }

    /**
     * Get the created property: The exact time the streaming endpoint was created.
     *
     * @return the created value.
     */
    public OffsetDateTime created() {
        return this.created;
    }

    /**
     * Get the lastModified property: The exact time the streaming endpoint was last modified.
     *
     * @return the lastModified value.
     */
    public OffsetDateTime lastModified() {
        return this.lastModified;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (accessControl() != null) {
            accessControl().validate();
        }
        if (crossSiteAccessPolicies() != null) {
            crossSiteAccessPolicies().validate();
        }
    }
}
