// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storageimportexport.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** location properties. */
@Fluent
public final class LocationProperties {
    /*
     * The recipient name to use when shipping the drives to the Azure data center.
     */
    @JsonProperty(value = "recipientName")
    private String recipientName;

    /*
     * The first line of the street address to use when shipping the drives to the Azure data center.
     */
    @JsonProperty(value = "streetAddress1")
    private String streetAddress1;

    /*
     * The second line of the street address to use when shipping the drives to the Azure data center.
     */
    @JsonProperty(value = "streetAddress2")
    private String streetAddress2;

    /*
     * The city name to use when shipping the drives to the Azure data center.
     */
    @JsonProperty(value = "city")
    private String city;

    /*
     * The state or province to use when shipping the drives to the Azure data center.
     */
    @JsonProperty(value = "stateOrProvince")
    private String stateOrProvince;

    /*
     * The postal code to use when shipping the drives to the Azure data center.
     */
    @JsonProperty(value = "postalCode")
    private String postalCode;

    /*
     * The country or region to use when shipping the drives to the Azure data center.
     */
    @JsonProperty(value = "countryOrRegion")
    private String countryOrRegion;

    /*
     * The phone number for the Azure data center.
     */
    @JsonProperty(value = "phone")
    private String phone;

    /*
     * Additional shipping information for customer, specific to datacenter to which customer should send their disks.
     */
    @JsonProperty(value = "additionalShippingInformation")
    private String additionalShippingInformation;

    /*
     * A list of carriers that are supported at this location.
     */
    @JsonProperty(value = "supportedCarriers")
    private List<String> supportedCarriers;

    /*
     * A list of location IDs that should be used to ship shipping drives to for jobs created against the current
     * location. If the current location is active, it will be part of the list. If it is temporarily closed due to
     * maintenance, this list may contain other locations.
     */
    @JsonProperty(value = "alternateLocations")
    private List<String> alternateLocations;

    /** Creates an instance of LocationProperties class. */
    public LocationProperties() {
    }

    /**
     * Get the recipientName property: The recipient name to use when shipping the drives to the Azure data center.
     *
     * @return the recipientName value.
     */
    public String recipientName() {
        return this.recipientName;
    }

    /**
     * Set the recipientName property: The recipient name to use when shipping the drives to the Azure data center.
     *
     * @param recipientName the recipientName value to set.
     * @return the LocationProperties object itself.
     */
    public LocationProperties withRecipientName(String recipientName) {
        this.recipientName = recipientName;
        return this;
    }

    /**
     * Get the streetAddress1 property: The first line of the street address to use when shipping the drives to the
     * Azure data center.
     *
     * @return the streetAddress1 value.
     */
    public String streetAddress1() {
        return this.streetAddress1;
    }

    /**
     * Set the streetAddress1 property: The first line of the street address to use when shipping the drives to the
     * Azure data center.
     *
     * @param streetAddress1 the streetAddress1 value to set.
     * @return the LocationProperties object itself.
     */
    public LocationProperties withStreetAddress1(String streetAddress1) {
        this.streetAddress1 = streetAddress1;
        return this;
    }

    /**
     * Get the streetAddress2 property: The second line of the street address to use when shipping the drives to the
     * Azure data center.
     *
     * @return the streetAddress2 value.
     */
    public String streetAddress2() {
        return this.streetAddress2;
    }

    /**
     * Set the streetAddress2 property: The second line of the street address to use when shipping the drives to the
     * Azure data center.
     *
     * @param streetAddress2 the streetAddress2 value to set.
     * @return the LocationProperties object itself.
     */
    public LocationProperties withStreetAddress2(String streetAddress2) {
        this.streetAddress2 = streetAddress2;
        return this;
    }

    /**
     * Get the city property: The city name to use when shipping the drives to the Azure data center.
     *
     * @return the city value.
     */
    public String city() {
        return this.city;
    }

    /**
     * Set the city property: The city name to use when shipping the drives to the Azure data center.
     *
     * @param city the city value to set.
     * @return the LocationProperties object itself.
     */
    public LocationProperties withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * Get the stateOrProvince property: The state or province to use when shipping the drives to the Azure data center.
     *
     * @return the stateOrProvince value.
     */
    public String stateOrProvince() {
        return this.stateOrProvince;
    }

    /**
     * Set the stateOrProvince property: The state or province to use when shipping the drives to the Azure data center.
     *
     * @param stateOrProvince the stateOrProvince value to set.
     * @return the LocationProperties object itself.
     */
    public LocationProperties withStateOrProvince(String stateOrProvince) {
        this.stateOrProvince = stateOrProvince;
        return this;
    }

    /**
     * Get the postalCode property: The postal code to use when shipping the drives to the Azure data center.
     *
     * @return the postalCode value.
     */
    public String postalCode() {
        return this.postalCode;
    }

    /**
     * Set the postalCode property: The postal code to use when shipping the drives to the Azure data center.
     *
     * @param postalCode the postalCode value to set.
     * @return the LocationProperties object itself.
     */
    public LocationProperties withPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     * Get the countryOrRegion property: The country or region to use when shipping the drives to the Azure data center.
     *
     * @return the countryOrRegion value.
     */
    public String countryOrRegion() {
        return this.countryOrRegion;
    }

    /**
     * Set the countryOrRegion property: The country or region to use when shipping the drives to the Azure data center.
     *
     * @param countryOrRegion the countryOrRegion value to set.
     * @return the LocationProperties object itself.
     */
    public LocationProperties withCountryOrRegion(String countryOrRegion) {
        this.countryOrRegion = countryOrRegion;
        return this;
    }

    /**
     * Get the phone property: The phone number for the Azure data center.
     *
     * @return the phone value.
     */
    public String phone() {
        return this.phone;
    }

    /**
     * Set the phone property: The phone number for the Azure data center.
     *
     * @param phone the phone value to set.
     * @return the LocationProperties object itself.
     */
    public LocationProperties withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Get the additionalShippingInformation property: Additional shipping information for customer, specific to
     * datacenter to which customer should send their disks.
     *
     * @return the additionalShippingInformation value.
     */
    public String additionalShippingInformation() {
        return this.additionalShippingInformation;
    }

    /**
     * Set the additionalShippingInformation property: Additional shipping information for customer, specific to
     * datacenter to which customer should send their disks.
     *
     * @param additionalShippingInformation the additionalShippingInformation value to set.
     * @return the LocationProperties object itself.
     */
    public LocationProperties withAdditionalShippingInformation(String additionalShippingInformation) {
        this.additionalShippingInformation = additionalShippingInformation;
        return this;
    }

    /**
     * Get the supportedCarriers property: A list of carriers that are supported at this location.
     *
     * @return the supportedCarriers value.
     */
    public List<String> supportedCarriers() {
        return this.supportedCarriers;
    }

    /**
     * Set the supportedCarriers property: A list of carriers that are supported at this location.
     *
     * @param supportedCarriers the supportedCarriers value to set.
     * @return the LocationProperties object itself.
     */
    public LocationProperties withSupportedCarriers(List<String> supportedCarriers) {
        this.supportedCarriers = supportedCarriers;
        return this;
    }

    /**
     * Get the alternateLocations property: A list of location IDs that should be used to ship shipping drives to for
     * jobs created against the current location. If the current location is active, it will be part of the list. If it
     * is temporarily closed due to maintenance, this list may contain other locations.
     *
     * @return the alternateLocations value.
     */
    public List<String> alternateLocations() {
        return this.alternateLocations;
    }

    /**
     * Set the alternateLocations property: A list of location IDs that should be used to ship shipping drives to for
     * jobs created against the current location. If the current location is active, it will be part of the list. If it
     * is temporarily closed due to maintenance, this list may contain other locations.
     *
     * @param alternateLocations the alternateLocations value to set.
     * @return the LocationProperties object itself.
     */
    public LocationProperties withAlternateLocations(List<String> alternateLocations) {
        this.alternateLocations = alternateLocations;
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
