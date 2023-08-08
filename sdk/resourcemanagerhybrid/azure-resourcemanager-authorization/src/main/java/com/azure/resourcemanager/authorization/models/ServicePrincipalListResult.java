// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.authorization.fluent.models.ServicePrincipalInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Server response for get tenant service principals API call. */
@Fluent
public final class ServicePrincipalListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServicePrincipalListResult.class);

    /*
     * the list of service principals.
     */
    @JsonProperty(value = "value")
    private List<ServicePrincipalInner> value;

    /*
     * the URL to get the next set of results.
     */
    @JsonProperty(value = "odata.nextLink")
    private String odataNextLink;

    /**
     * Get the value property: the list of service principals.
     *
     * @return the value value.
     */
    public List<ServicePrincipalInner> value() {
        return this.value;
    }

    /**
     * Set the value property: the list of service principals.
     *
     * @param value the value value to set.
     * @return the ServicePrincipalListResult object itself.
     */
    public ServicePrincipalListResult withValue(List<ServicePrincipalInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the odataNextLink property: the URL to get the next set of results.
     *
     * @return the odataNextLink value.
     */
    public String odataNextLink() {
        return this.odataNextLink;
    }

    /**
     * Set the odataNextLink property: the URL to get the next set of results.
     *
     * @param odataNextLink the odataNextLink value to set.
     * @return the ServicePrincipalListResult object itself.
     */
    public ServicePrincipalListResult withOdataNextLink(String odataNextLink) {
        this.odataNextLink = odataNextLink;
        return this;
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
