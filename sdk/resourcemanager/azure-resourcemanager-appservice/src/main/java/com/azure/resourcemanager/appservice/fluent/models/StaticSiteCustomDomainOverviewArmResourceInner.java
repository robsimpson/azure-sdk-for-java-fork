// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.models.CustomDomainStatus;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Static Site Custom Domain Overview ARM resource. */
@Fluent
public final class StaticSiteCustomDomainOverviewArmResourceInner extends ProxyOnlyResource {
    /*
     * StaticSiteCustomDomainOverviewARMResource resource specific properties
     */
    @JsonProperty(value = "properties")
    private StaticSiteCustomDomainOverviewArmResourceProperties innerProperties;

    /** Creates an instance of StaticSiteCustomDomainOverviewArmResourceInner class. */
    public StaticSiteCustomDomainOverviewArmResourceInner() {
    }

    /**
     * Get the innerProperties property: StaticSiteCustomDomainOverviewARMResource resource specific properties.
     *
     * @return the innerProperties value.
     */
    private StaticSiteCustomDomainOverviewArmResourceProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public StaticSiteCustomDomainOverviewArmResourceInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the domainName property: The domain name for the static site custom domain.
     *
     * @return the domainName value.
     */
    public String domainName() {
        return this.innerProperties() == null ? null : this.innerProperties().domainName();
    }

    /**
     * Get the createdOn property: The date and time on which the custom domain was created for the static site.
     *
     * @return the createdOn value.
     */
    public OffsetDateTime createdOn() {
        return this.innerProperties() == null ? null : this.innerProperties().createdOn();
    }

    /**
     * Get the status property: The status of the custom domain.
     *
     * @return the status value.
     */
    public CustomDomainStatus status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Get the validationToken property: The TXT record validation token.
     *
     * @return the validationToken value.
     */
    public String validationToken() {
        return this.innerProperties() == null ? null : this.innerProperties().validationToken();
    }

    /**
     * Get the errorMessage property: The errorMessage property.
     *
     * @return the errorMessage value.
     */
    public String errorMessage() {
        return this.innerProperties() == null ? null : this.innerProperties().errorMessage();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
