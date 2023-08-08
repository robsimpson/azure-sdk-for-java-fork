// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventgrid.fluent.models.ChannelUpdateParametersProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Properties of the Channel update. */
@Fluent
public final class ChannelUpdateParameters {
    /*
     * Properties of the channel update parameters.
     */
    @JsonProperty(value = "properties")
    private ChannelUpdateParametersProperties innerProperties;

    /** Creates an instance of ChannelUpdateParameters class. */
    public ChannelUpdateParameters() {
    }

    /**
     * Get the innerProperties property: Properties of the channel update parameters.
     *
     * @return the innerProperties value.
     */
    private ChannelUpdateParametersProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the expirationTimeIfNotActivatedUtc property: Expiration time of the channel. If this timer expires while the
     * corresponding partner topic or partner destination is never activated, the channel and corresponding partner
     * topic or partner destination are deleted.
     *
     * @return the expirationTimeIfNotActivatedUtc value.
     */
    public OffsetDateTime expirationTimeIfNotActivatedUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().expirationTimeIfNotActivatedUtc();
    }

    /**
     * Set the expirationTimeIfNotActivatedUtc property: Expiration time of the channel. If this timer expires while the
     * corresponding partner topic or partner destination is never activated, the channel and corresponding partner
     * topic or partner destination are deleted.
     *
     * @param expirationTimeIfNotActivatedUtc the expirationTimeIfNotActivatedUtc value to set.
     * @return the ChannelUpdateParameters object itself.
     */
    public ChannelUpdateParameters withExpirationTimeIfNotActivatedUtc(OffsetDateTime expirationTimeIfNotActivatedUtc) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ChannelUpdateParametersProperties();
        }
        this.innerProperties().withExpirationTimeIfNotActivatedUtc(expirationTimeIfNotActivatedUtc);
        return this;
    }

    /**
     * Get the partnerDestinationInfo property: Partner destination properties which can be updated if the channel is of
     * type PartnerDestination.
     *
     * @return the partnerDestinationInfo value.
     */
    public PartnerUpdateDestinationInfo partnerDestinationInfo() {
        return this.innerProperties() == null ? null : this.innerProperties().partnerDestinationInfo();
    }

    /**
     * Set the partnerDestinationInfo property: Partner destination properties which can be updated if the channel is of
     * type PartnerDestination.
     *
     * @param partnerDestinationInfo the partnerDestinationInfo value to set.
     * @return the ChannelUpdateParameters object itself.
     */
    public ChannelUpdateParameters withPartnerDestinationInfo(PartnerUpdateDestinationInfo partnerDestinationInfo) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ChannelUpdateParametersProperties();
        }
        this.innerProperties().withPartnerDestinationInfo(partnerDestinationInfo);
        return this;
    }

    /**
     * Get the partnerTopicInfo property: Partner topic properties which can be updated if the channel is of type
     * PartnerTopic.
     *
     * @return the partnerTopicInfo value.
     */
    public PartnerUpdateTopicInfo partnerTopicInfo() {
        return this.innerProperties() == null ? null : this.innerProperties().partnerTopicInfo();
    }

    /**
     * Set the partnerTopicInfo property: Partner topic properties which can be updated if the channel is of type
     * PartnerTopic.
     *
     * @param partnerTopicInfo the partnerTopicInfo value to set.
     * @return the ChannelUpdateParameters object itself.
     */
    public ChannelUpdateParameters withPartnerTopicInfo(PartnerUpdateTopicInfo partnerTopicInfo) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ChannelUpdateParametersProperties();
        }
        this.innerProperties().withPartnerTopicInfo(partnerTopicInfo);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
