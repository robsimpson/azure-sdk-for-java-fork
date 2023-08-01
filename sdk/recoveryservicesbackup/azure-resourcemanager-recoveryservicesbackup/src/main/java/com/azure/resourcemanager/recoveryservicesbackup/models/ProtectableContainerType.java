// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of the container. The value of this property for 1. Compute Azure VM is Microsoft.Compute/virtualMachines 2.
 * Classic Compute Azure VM is Microsoft.ClassicCompute/virtualMachines.
 */
public enum ProtectableContainerType {
    /** Enum value Invalid. */
    INVALID("Invalid"),

    /** Enum value Unknown. */
    UNKNOWN("Unknown"),

    /** Enum value IaasVMContainer. */
    IAAS_VMCONTAINER("IaasVMContainer"),

    /** Enum value IaasVMServiceContainer. */
    IAAS_VMSERVICE_CONTAINER("IaasVMServiceContainer"),

    /** Enum value DPMContainer. */
    DPMCONTAINER("DPMContainer"),

    /** Enum value AzureBackupServerContainer. */
    AZURE_BACKUP_SERVER_CONTAINER("AzureBackupServerContainer"),

    /** Enum value MABContainer. */
    MABCONTAINER("MABContainer"),

    /** Enum value Cluster. */
    CLUSTER("Cluster"),

    /** Enum value AzureSqlContainer. */
    AZURE_SQL_CONTAINER("AzureSqlContainer"),

    /** Enum value Windows. */
    WINDOWS("Windows"),

    /** Enum value VCenter. */
    VCENTER("VCenter"),

    /** Enum value VMAppContainer. */
    VMAPP_CONTAINER("VMAppContainer"),

    /** Enum value SQLAGWorkLoadContainer. */
    SQLAGWORK_LOAD_CONTAINER("SQLAGWorkLoadContainer"),

    /** Enum value StorageContainer. */
    STORAGE_CONTAINER("StorageContainer"),

    /** Enum value GenericContainer. */
    GENERIC_CONTAINER("GenericContainer"),

    /** Enum value Microsoft.ClassicCompute/virtualMachines. */
    MICROSOFT_CLASSIC_COMPUTE_VIRTUAL_MACHINES("Microsoft.ClassicCompute/virtualMachines"),

    /** Enum value Microsoft.Compute/virtualMachines. */
    MICROSOFT_COMPUTE_VIRTUAL_MACHINES("Microsoft.Compute/virtualMachines"),

    /** Enum value AzureWorkloadContainer. */
    AZURE_WORKLOAD_CONTAINER("AzureWorkloadContainer");

    /** The actual serialized value for a ProtectableContainerType instance. */
    private final String value;

    ProtectableContainerType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ProtectableContainerType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ProtectableContainerType object, or null if unable to parse.
     */
    @JsonCreator
    public static ProtectableContainerType fromString(String value) {
        if (value == null) {
            return null;
        }
        ProtectableContainerType[] items = ProtectableContainerType.values();
        for (ProtectableContainerType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /** {@inheritDoc} */
    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
