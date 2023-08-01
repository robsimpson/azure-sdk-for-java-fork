// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Azure Recovery Services Vault specific protection intent item. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "protectionIntentItemType",
    defaultImpl = AzureRecoveryServiceVaultProtectionIntent.class)
@JsonTypeName("RecoveryServiceVaultItem")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AzureWorkloadAutoProtectionIntent", value = AzureWorkloadAutoProtectionIntent.class)
})
@Fluent
public class AzureRecoveryServiceVaultProtectionIntent extends ProtectionIntent {
    /** Creates an instance of AzureRecoveryServiceVaultProtectionIntent class. */
    public AzureRecoveryServiceVaultProtectionIntent() {
    }

    /** {@inheritDoc} */
    @Override
    public AzureRecoveryServiceVaultProtectionIntent withBackupManagementType(
        BackupManagementType backupManagementType) {
        super.withBackupManagementType(backupManagementType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureRecoveryServiceVaultProtectionIntent withSourceResourceId(String sourceResourceId) {
        super.withSourceResourceId(sourceResourceId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureRecoveryServiceVaultProtectionIntent withItemId(String itemId) {
        super.withItemId(itemId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureRecoveryServiceVaultProtectionIntent withPolicyId(String policyId) {
        super.withPolicyId(policyId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureRecoveryServiceVaultProtectionIntent withProtectionState(ProtectionStatus protectionState) {
        super.withProtectionState(protectionState);
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
    }
}
