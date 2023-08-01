// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.phonenumbers.implementation.models;

import com.azure.communication.phonenumbers.CodeCoverageAnnotation.Generated;
import com.azure.communication.phonenumbers.models.PhoneNumberLocality;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The PhoneNumberLocalities model. */
@Immutable
@Generated
public final class PhoneNumberLocalities {
    /*
     * Represents the underlying list of localities, e.g. cities or town.
     */
    @JsonProperty(value = "phoneNumberLocalities", access = JsonProperty.Access.WRITE_ONLY)
    private List<PhoneNumberLocality> phoneNumberLocalities;

    /*
     * Represents the URL link to the next page.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the phoneNumberLocalities property: Represents the underlying list of localities, e.g. cities or town.
     *
     * @return the phoneNumberLocalities value.
     */
    public List<PhoneNumberLocality> getPhoneNumberLocalities() {
        return this.phoneNumberLocalities;
    }

    /**
     * Get the nextLink property: Represents the URL link to the next page.
     *
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }
}
