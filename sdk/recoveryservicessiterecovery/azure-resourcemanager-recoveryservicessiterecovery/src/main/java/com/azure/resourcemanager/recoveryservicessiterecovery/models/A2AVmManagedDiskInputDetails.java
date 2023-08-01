// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A2A managed disk input details. */
@Fluent
public final class A2AVmManagedDiskInputDetails {
    /*
     * The disk Id.
     */
    @JsonProperty(value = "diskId", required = true)
    private String diskId;

    /*
     * The primary staging storage account Arm Id.
     */
    @JsonProperty(value = "primaryStagingAzureStorageAccountId", required = true)
    private String primaryStagingAzureStorageAccountId;

    /*
     * The target resource group Arm Id.
     */
    @JsonProperty(value = "recoveryResourceGroupId", required = true)
    private String recoveryResourceGroupId;

    /*
     * The replica disk type. Its an optional value and will be same as source disk type if not user provided.
     */
    @JsonProperty(value = "recoveryReplicaDiskAccountType")
    private String recoveryReplicaDiskAccountType;

    /*
     * The target disk type after failover. Its an optional value and will be same as source disk type if not user
     * provided.
     */
    @JsonProperty(value = "recoveryTargetDiskAccountType")
    private String recoveryTargetDiskAccountType;

    /*
     * The recovery disk encryption set Id.
     */
    @JsonProperty(value = "recoveryDiskEncryptionSetId")
    private String recoveryDiskEncryptionSetId;

    /*
     * The recovery disk encryption information (for one / single pass flows).
     */
    @JsonProperty(value = "diskEncryptionInfo")
    private DiskEncryptionInfo diskEncryptionInfo;

    /** Creates an instance of A2AVmManagedDiskInputDetails class. */
    public A2AVmManagedDiskInputDetails() {
    }

    /**
     * Get the diskId property: The disk Id.
     *
     * @return the diskId value.
     */
    public String diskId() {
        return this.diskId;
    }

    /**
     * Set the diskId property: The disk Id.
     *
     * @param diskId the diskId value to set.
     * @return the A2AVmManagedDiskInputDetails object itself.
     */
    public A2AVmManagedDiskInputDetails withDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }

    /**
     * Get the primaryStagingAzureStorageAccountId property: The primary staging storage account Arm Id.
     *
     * @return the primaryStagingAzureStorageAccountId value.
     */
    public String primaryStagingAzureStorageAccountId() {
        return this.primaryStagingAzureStorageAccountId;
    }

    /**
     * Set the primaryStagingAzureStorageAccountId property: The primary staging storage account Arm Id.
     *
     * @param primaryStagingAzureStorageAccountId the primaryStagingAzureStorageAccountId value to set.
     * @return the A2AVmManagedDiskInputDetails object itself.
     */
    public A2AVmManagedDiskInputDetails withPrimaryStagingAzureStorageAccountId(
        String primaryStagingAzureStorageAccountId) {
        this.primaryStagingAzureStorageAccountId = primaryStagingAzureStorageAccountId;
        return this;
    }

    /**
     * Get the recoveryResourceGroupId property: The target resource group Arm Id.
     *
     * @return the recoveryResourceGroupId value.
     */
    public String recoveryResourceGroupId() {
        return this.recoveryResourceGroupId;
    }

    /**
     * Set the recoveryResourceGroupId property: The target resource group Arm Id.
     *
     * @param recoveryResourceGroupId the recoveryResourceGroupId value to set.
     * @return the A2AVmManagedDiskInputDetails object itself.
     */
    public A2AVmManagedDiskInputDetails withRecoveryResourceGroupId(String recoveryResourceGroupId) {
        this.recoveryResourceGroupId = recoveryResourceGroupId;
        return this;
    }

    /**
     * Get the recoveryReplicaDiskAccountType property: The replica disk type. Its an optional value and will be same as
     * source disk type if not user provided.
     *
     * @return the recoveryReplicaDiskAccountType value.
     */
    public String recoveryReplicaDiskAccountType() {
        return this.recoveryReplicaDiskAccountType;
    }

    /**
     * Set the recoveryReplicaDiskAccountType property: The replica disk type. Its an optional value and will be same as
     * source disk type if not user provided.
     *
     * @param recoveryReplicaDiskAccountType the recoveryReplicaDiskAccountType value to set.
     * @return the A2AVmManagedDiskInputDetails object itself.
     */
    public A2AVmManagedDiskInputDetails withRecoveryReplicaDiskAccountType(String recoveryReplicaDiskAccountType) {
        this.recoveryReplicaDiskAccountType = recoveryReplicaDiskAccountType;
        return this;
    }

    /**
     * Get the recoveryTargetDiskAccountType property: The target disk type after failover. Its an optional value and
     * will be same as source disk type if not user provided.
     *
     * @return the recoveryTargetDiskAccountType value.
     */
    public String recoveryTargetDiskAccountType() {
        return this.recoveryTargetDiskAccountType;
    }

    /**
     * Set the recoveryTargetDiskAccountType property: The target disk type after failover. Its an optional value and
     * will be same as source disk type if not user provided.
     *
     * @param recoveryTargetDiskAccountType the recoveryTargetDiskAccountType value to set.
     * @return the A2AVmManagedDiskInputDetails object itself.
     */
    public A2AVmManagedDiskInputDetails withRecoveryTargetDiskAccountType(String recoveryTargetDiskAccountType) {
        this.recoveryTargetDiskAccountType = recoveryTargetDiskAccountType;
        return this;
    }

    /**
     * Get the recoveryDiskEncryptionSetId property: The recovery disk encryption set Id.
     *
     * @return the recoveryDiskEncryptionSetId value.
     */
    public String recoveryDiskEncryptionSetId() {
        return this.recoveryDiskEncryptionSetId;
    }

    /**
     * Set the recoveryDiskEncryptionSetId property: The recovery disk encryption set Id.
     *
     * @param recoveryDiskEncryptionSetId the recoveryDiskEncryptionSetId value to set.
     * @return the A2AVmManagedDiskInputDetails object itself.
     */
    public A2AVmManagedDiskInputDetails withRecoveryDiskEncryptionSetId(String recoveryDiskEncryptionSetId) {
        this.recoveryDiskEncryptionSetId = recoveryDiskEncryptionSetId;
        return this;
    }

    /**
     * Get the diskEncryptionInfo property: The recovery disk encryption information (for one / single pass flows).
     *
     * @return the diskEncryptionInfo value.
     */
    public DiskEncryptionInfo diskEncryptionInfo() {
        return this.diskEncryptionInfo;
    }

    /**
     * Set the diskEncryptionInfo property: The recovery disk encryption information (for one / single pass flows).
     *
     * @param diskEncryptionInfo the diskEncryptionInfo value to set.
     * @return the A2AVmManagedDiskInputDetails object itself.
     */
    public A2AVmManagedDiskInputDetails withDiskEncryptionInfo(DiskEncryptionInfo diskEncryptionInfo) {
        this.diskEncryptionInfo = diskEncryptionInfo;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (diskId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property diskId in model A2AVmManagedDiskInputDetails"));
        }
        if (primaryStagingAzureStorageAccountId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property primaryStagingAzureStorageAccountId in model"
                            + " A2AVmManagedDiskInputDetails"));
        }
        if (recoveryResourceGroupId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property recoveryResourceGroupId in model A2AVmManagedDiskInputDetails"));
        }
        if (diskEncryptionInfo() != null) {
            diskEncryptionInfo().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(A2AVmManagedDiskInputDetails.class);
}
