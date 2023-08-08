// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The GalleryTargetExtendedLocation model. */
@Fluent
public final class GalleryTargetExtendedLocation {
    /*
     * The name of the region.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The name of the extended location.
     */
    @JsonProperty(value = "extendedLocation")
    private GalleryExtendedLocation extendedLocation;

    /*
     * The number of replicas of the Image Version to be created per extended location. This property is updatable.
     */
    @JsonProperty(value = "extendedLocationReplicaCount")
    private Integer extendedLocationReplicaCount;

    /*
     * Specifies the storage account type to be used to store the image. This property is not updatable.
     */
    @JsonProperty(value = "storageAccountType")
    private StorageAccountType storageAccountType;

    /*
     * Optional. Allows users to provide customer managed keys for encrypting the OS and data disks in the gallery
     * artifact.
     */
    @JsonProperty(value = "encryption")
    private EncryptionImages encryption;

    /** Creates an instance of GalleryTargetExtendedLocation class. */
    public GalleryTargetExtendedLocation() {
    }

    /**
     * Get the name property: The name of the region.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the region.
     *
     * @param name the name value to set.
     * @return the GalleryTargetExtendedLocation object itself.
     */
    public GalleryTargetExtendedLocation withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the extendedLocation property: The name of the extended location.
     *
     * @return the extendedLocation value.
     */
    public GalleryExtendedLocation extendedLocation() {
        return this.extendedLocation;
    }

    /**
     * Set the extendedLocation property: The name of the extended location.
     *
     * @param extendedLocation the extendedLocation value to set.
     * @return the GalleryTargetExtendedLocation object itself.
     */
    public GalleryTargetExtendedLocation withExtendedLocation(GalleryExtendedLocation extendedLocation) {
        this.extendedLocation = extendedLocation;
        return this;
    }

    /**
     * Get the extendedLocationReplicaCount property: The number of replicas of the Image Version to be created per
     * extended location. This property is updatable.
     *
     * @return the extendedLocationReplicaCount value.
     */
    public Integer extendedLocationReplicaCount() {
        return this.extendedLocationReplicaCount;
    }

    /**
     * Set the extendedLocationReplicaCount property: The number of replicas of the Image Version to be created per
     * extended location. This property is updatable.
     *
     * @param extendedLocationReplicaCount the extendedLocationReplicaCount value to set.
     * @return the GalleryTargetExtendedLocation object itself.
     */
    public GalleryTargetExtendedLocation withExtendedLocationReplicaCount(Integer extendedLocationReplicaCount) {
        this.extendedLocationReplicaCount = extendedLocationReplicaCount;
        return this;
    }

    /**
     * Get the storageAccountType property: Specifies the storage account type to be used to store the image. This
     * property is not updatable.
     *
     * @return the storageAccountType value.
     */
    public StorageAccountType storageAccountType() {
        return this.storageAccountType;
    }

    /**
     * Set the storageAccountType property: Specifies the storage account type to be used to store the image. This
     * property is not updatable.
     *
     * @param storageAccountType the storageAccountType value to set.
     * @return the GalleryTargetExtendedLocation object itself.
     */
    public GalleryTargetExtendedLocation withStorageAccountType(StorageAccountType storageAccountType) {
        this.storageAccountType = storageAccountType;
        return this;
    }

    /**
     * Get the encryption property: Optional. Allows users to provide customer managed keys for encrypting the OS and
     * data disks in the gallery artifact.
     *
     * @return the encryption value.
     */
    public EncryptionImages encryption() {
        return this.encryption;
    }

    /**
     * Set the encryption property: Optional. Allows users to provide customer managed keys for encrypting the OS and
     * data disks in the gallery artifact.
     *
     * @param encryption the encryption value to set.
     * @return the GalleryTargetExtendedLocation object itself.
     */
    public GalleryTargetExtendedLocation withEncryption(EncryptionImages encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (extendedLocation() != null) {
            extendedLocation().validate();
        }
        if (encryption() != null) {
            encryption().validate();
        }
    }
}
