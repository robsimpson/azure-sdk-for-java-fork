// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Base class for generic container of backup items. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "containerType")
@JsonTypeName("GenericContainer")
@Fluent
public final class GenericContainer extends ProtectionContainer {
    /*
     * Name of the container's fabric
     */
    @JsonProperty(value = "fabricName")
    private String fabricName;

    /*
     * Extended information (not returned in List container API calls)
     */
    @JsonProperty(value = "extendedInformation")
    private GenericContainerExtendedInfo extendedInformation;

    /** Creates an instance of GenericContainer class. */
    public GenericContainer() {
    }

    /**
     * Get the fabricName property: Name of the container's fabric.
     *
     * @return the fabricName value.
     */
    public String fabricName() {
        return this.fabricName;
    }

    /**
     * Set the fabricName property: Name of the container's fabric.
     *
     * @param fabricName the fabricName value to set.
     * @return the GenericContainer object itself.
     */
    public GenericContainer withFabricName(String fabricName) {
        this.fabricName = fabricName;
        return this;
    }

    /**
     * Get the extendedInformation property: Extended information (not returned in List container API calls).
     *
     * @return the extendedInformation value.
     */
    public GenericContainerExtendedInfo extendedInformation() {
        return this.extendedInformation;
    }

    /**
     * Set the extendedInformation property: Extended information (not returned in List container API calls).
     *
     * @param extendedInformation the extendedInformation value to set.
     * @return the GenericContainer object itself.
     */
    public GenericContainer withExtendedInformation(GenericContainerExtendedInfo extendedInformation) {
        this.extendedInformation = extendedInformation;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GenericContainer withFriendlyName(String friendlyName) {
        super.withFriendlyName(friendlyName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GenericContainer withBackupManagementType(BackupManagementType backupManagementType) {
        super.withBackupManagementType(backupManagementType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GenericContainer withRegistrationStatus(String registrationStatus) {
        super.withRegistrationStatus(registrationStatus);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GenericContainer withHealthStatus(String healthStatus) {
        super.withHealthStatus(healthStatus);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GenericContainer withProtectableObjectType(String protectableObjectType) {
        super.withProtectableObjectType(protectableObjectType);
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
        if (extendedInformation() != null) {
            extendedInformation().validate();
        }
    }
}
