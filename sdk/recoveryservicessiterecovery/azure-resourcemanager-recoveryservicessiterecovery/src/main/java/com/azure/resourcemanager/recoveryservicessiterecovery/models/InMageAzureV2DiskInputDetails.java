// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Disk input details. */
@Fluent
public final class InMageAzureV2DiskInputDetails {
    /*
     * The DiskId.
     */
    @JsonProperty(value = "diskId")
    private String diskId;

    /*
     * The LogStorageAccountId.
     */
    @JsonProperty(value = "logStorageAccountId")
    private String logStorageAccountId;

    /*
     * The DiskType.
     */
    @JsonProperty(value = "diskType")
    private DiskAccountType diskType;

    /*
     * The DiskEncryptionSet ARM ID.
     */
    @JsonProperty(value = "diskEncryptionSetId")
    private String diskEncryptionSetId;

    /** Creates an instance of InMageAzureV2DiskInputDetails class. */
    public InMageAzureV2DiskInputDetails() {
    }

    /**
     * Get the diskId property: The DiskId.
     *
     * @return the diskId value.
     */
    public String diskId() {
        return this.diskId;
    }

    /**
     * Set the diskId property: The DiskId.
     *
     * @param diskId the diskId value to set.
     * @return the InMageAzureV2DiskInputDetails object itself.
     */
    public InMageAzureV2DiskInputDetails withDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }

    /**
     * Get the logStorageAccountId property: The LogStorageAccountId.
     *
     * @return the logStorageAccountId value.
     */
    public String logStorageAccountId() {
        return this.logStorageAccountId;
    }

    /**
     * Set the logStorageAccountId property: The LogStorageAccountId.
     *
     * @param logStorageAccountId the logStorageAccountId value to set.
     * @return the InMageAzureV2DiskInputDetails object itself.
     */
    public InMageAzureV2DiskInputDetails withLogStorageAccountId(String logStorageAccountId) {
        this.logStorageAccountId = logStorageAccountId;
        return this;
    }

    /**
     * Get the diskType property: The DiskType.
     *
     * @return the diskType value.
     */
    public DiskAccountType diskType() {
        return this.diskType;
    }

    /**
     * Set the diskType property: The DiskType.
     *
     * @param diskType the diskType value to set.
     * @return the InMageAzureV2DiskInputDetails object itself.
     */
    public InMageAzureV2DiskInputDetails withDiskType(DiskAccountType diskType) {
        this.diskType = diskType;
        return this;
    }

    /**
     * Get the diskEncryptionSetId property: The DiskEncryptionSet ARM ID.
     *
     * @return the diskEncryptionSetId value.
     */
    public String diskEncryptionSetId() {
        return this.diskEncryptionSetId;
    }

    /**
     * Set the diskEncryptionSetId property: The DiskEncryptionSet ARM ID.
     *
     * @param diskEncryptionSetId the diskEncryptionSetId value to set.
     * @return the InMageAzureV2DiskInputDetails object itself.
     */
    public InMageAzureV2DiskInputDetails withDiskEncryptionSetId(String diskEncryptionSetId) {
        this.diskEncryptionSetId = diskEncryptionSetId;
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
