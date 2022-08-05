// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the properties of a VM size. */
@Fluent
public final class VirtualMachineSizeInner {
    /*
     * The name of the virtual machine size.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The number of cores supported by the virtual machine size. For Constrained vCPU capable VM sizes, this number
     * represents the total vCPUs of quota that the VM uses. For accurate vCPU count, please refer to
     * https://docs.microsoft.com/azure/virtual-machines/constrained-vcpu or
     * https://docs.microsoft.com/rest/api/compute/resourceskus/list
     */
    @JsonProperty(value = "numberOfCores")
    private Integer numberOfCores;

    /*
     * The OS disk size, in MB, allowed by the virtual machine size.
     */
    @JsonProperty(value = "osDiskSizeInMB")
    private Integer osDiskSizeInMB;

    /*
     * The resource disk size, in MB, allowed by the virtual machine size.
     */
    @JsonProperty(value = "resourceDiskSizeInMB")
    private Integer resourceDiskSizeInMB;

    /*
     * The amount of memory, in MB, supported by the virtual machine size.
     */
    @JsonProperty(value = "memoryInMB")
    private Integer memoryInMB;

    /*
     * The maximum number of data disks that can be attached to the virtual machine size.
     */
    @JsonProperty(value = "maxDataDiskCount")
    private Integer maxDataDiskCount;

    /**
     * Get the name property: The name of the virtual machine size.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the virtual machine size.
     *
     * @param name the name value to set.
     * @return the VirtualMachineSizeInner object itself.
     */
    public VirtualMachineSizeInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the numberOfCores property: The number of cores supported by the virtual machine size. For Constrained vCPU
     * capable VM sizes, this number represents the total vCPUs of quota that the VM uses. For accurate vCPU count,
     * please refer to https://docs.microsoft.com/azure/virtual-machines/constrained-vcpu or
     * https://docs.microsoft.com/rest/api/compute/resourceskus/list.
     *
     * @return the numberOfCores value.
     */
    public Integer numberOfCores() {
        return this.numberOfCores;
    }

    /**
     * Set the numberOfCores property: The number of cores supported by the virtual machine size. For Constrained vCPU
     * capable VM sizes, this number represents the total vCPUs of quota that the VM uses. For accurate vCPU count,
     * please refer to https://docs.microsoft.com/azure/virtual-machines/constrained-vcpu or
     * https://docs.microsoft.com/rest/api/compute/resourceskus/list.
     *
     * @param numberOfCores the numberOfCores value to set.
     * @return the VirtualMachineSizeInner object itself.
     */
    public VirtualMachineSizeInner withNumberOfCores(Integer numberOfCores) {
        this.numberOfCores = numberOfCores;
        return this;
    }

    /**
     * Get the osDiskSizeInMB property: The OS disk size, in MB, allowed by the virtual machine size.
     *
     * @return the osDiskSizeInMB value.
     */
    public Integer osDiskSizeInMB() {
        return this.osDiskSizeInMB;
    }

    /**
     * Set the osDiskSizeInMB property: The OS disk size, in MB, allowed by the virtual machine size.
     *
     * @param osDiskSizeInMB the osDiskSizeInMB value to set.
     * @return the VirtualMachineSizeInner object itself.
     */
    public VirtualMachineSizeInner withOsDiskSizeInMB(Integer osDiskSizeInMB) {
        this.osDiskSizeInMB = osDiskSizeInMB;
        return this;
    }

    /**
     * Get the resourceDiskSizeInMB property: The resource disk size, in MB, allowed by the virtual machine size.
     *
     * @return the resourceDiskSizeInMB value.
     */
    public Integer resourceDiskSizeInMB() {
        return this.resourceDiskSizeInMB;
    }

    /**
     * Set the resourceDiskSizeInMB property: The resource disk size, in MB, allowed by the virtual machine size.
     *
     * @param resourceDiskSizeInMB the resourceDiskSizeInMB value to set.
     * @return the VirtualMachineSizeInner object itself.
     */
    public VirtualMachineSizeInner withResourceDiskSizeInMB(Integer resourceDiskSizeInMB) {
        this.resourceDiskSizeInMB = resourceDiskSizeInMB;
        return this;
    }

    /**
     * Get the memoryInMB property: The amount of memory, in MB, supported by the virtual machine size.
     *
     * @return the memoryInMB value.
     */
    public Integer memoryInMB() {
        return this.memoryInMB;
    }

    /**
     * Set the memoryInMB property: The amount of memory, in MB, supported by the virtual machine size.
     *
     * @param memoryInMB the memoryInMB value to set.
     * @return the VirtualMachineSizeInner object itself.
     */
    public VirtualMachineSizeInner withMemoryInMB(Integer memoryInMB) {
        this.memoryInMB = memoryInMB;
        return this;
    }

    /**
     * Get the maxDataDiskCount property: The maximum number of data disks that can be attached to the virtual machine
     * size.
     *
     * @return the maxDataDiskCount value.
     */
    public Integer maxDataDiskCount() {
        return this.maxDataDiskCount;
    }

    /**
     * Set the maxDataDiskCount property: The maximum number of data disks that can be attached to the virtual machine
     * size.
     *
     * @param maxDataDiskCount the maxDataDiskCount value to set.
     * @return the VirtualMachineSizeInner object itself.
     */
    public VirtualMachineSizeInner withMaxDataDiskCount(Integer maxDataDiskCount) {
        this.maxDataDiskCount = maxDataDiskCount;
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
