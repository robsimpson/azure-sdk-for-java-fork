// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.devtestlabs.fluent.models.LabVirtualMachineCreationParameterProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** Properties for creating a virtual machine. */
@Fluent
public final class LabVirtualMachineCreationParameter {
    /*
     * The properties of the resource.
     */
    @JsonProperty(value = "properties")
    private LabVirtualMachineCreationParameterProperties innerProperties;

    /*
     * The name of the virtual machine or environment
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The location of the new virtual machine or environment
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * The tags of the resource.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /** Creates an instance of LabVirtualMachineCreationParameter class. */
    public LabVirtualMachineCreationParameter() {
    }

    /**
     * Get the innerProperties property: The properties of the resource.
     *
     * @return the innerProperties value.
     */
    private LabVirtualMachineCreationParameterProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: The name of the virtual machine or environment.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the virtual machine or environment.
     *
     * @param name the name value to set.
     * @return the LabVirtualMachineCreationParameter object itself.
     */
    public LabVirtualMachineCreationParameter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the location property: The location of the new virtual machine or environment.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The location of the new virtual machine or environment.
     *
     * @param location the location value to set.
     * @return the LabVirtualMachineCreationParameter object itself.
     */
    public LabVirtualMachineCreationParameter withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the tags property: The tags of the resource.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: The tags of the resource.
     *
     * @param tags the tags value to set.
     * @return the LabVirtualMachineCreationParameter object itself.
     */
    public LabVirtualMachineCreationParameter withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the bulkCreationParameters property: The number of virtual machine instances to create.
     *
     * @return the bulkCreationParameters value.
     */
    public BulkCreationParameters bulkCreationParameters() {
        return this.innerProperties() == null ? null : this.innerProperties().bulkCreationParameters();
    }

    /**
     * Set the bulkCreationParameters property: The number of virtual machine instances to create.
     *
     * @param bulkCreationParameters the bulkCreationParameters value to set.
     * @return the LabVirtualMachineCreationParameter object itself.
     */
    public LabVirtualMachineCreationParameter withBulkCreationParameters(
        BulkCreationParameters bulkCreationParameters) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabVirtualMachineCreationParameterProperties();
        }
        this.innerProperties().withBulkCreationParameters(bulkCreationParameters);
        return this;
    }

    /**
     * Get the notes property: The notes of the virtual machine.
     *
     * @return the notes value.
     */
    public String notes() {
        return this.innerProperties() == null ? null : this.innerProperties().notes();
    }

    /**
     * Set the notes property: The notes of the virtual machine.
     *
     * @param notes the notes value to set.
     * @return the LabVirtualMachineCreationParameter object itself.
     */
    public LabVirtualMachineCreationParameter withNotes(String notes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabVirtualMachineCreationParameterProperties();
        }
        this.innerProperties().withNotes(notes);
        return this;
    }

    /**
     * Get the ownerObjectId property: The object identifier of the owner of the virtual machine.
     *
     * @return the ownerObjectId value.
     */
    public String ownerObjectId() {
        return this.innerProperties() == null ? null : this.innerProperties().ownerObjectId();
    }

    /**
     * Set the ownerObjectId property: The object identifier of the owner of the virtual machine.
     *
     * @param ownerObjectId the ownerObjectId value to set.
     * @return the LabVirtualMachineCreationParameter object itself.
     */
    public LabVirtualMachineCreationParameter withOwnerObjectId(String ownerObjectId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabVirtualMachineCreationParameterProperties();
        }
        this.innerProperties().withOwnerObjectId(ownerObjectId);
        return this;
    }

    /**
     * Get the ownerUserPrincipalName property: The user principal name of the virtual machine owner.
     *
     * @return the ownerUserPrincipalName value.
     */
    public String ownerUserPrincipalName() {
        return this.innerProperties() == null ? null : this.innerProperties().ownerUserPrincipalName();
    }

    /**
     * Set the ownerUserPrincipalName property: The user principal name of the virtual machine owner.
     *
     * @param ownerUserPrincipalName the ownerUserPrincipalName value to set.
     * @return the LabVirtualMachineCreationParameter object itself.
     */
    public LabVirtualMachineCreationParameter withOwnerUserPrincipalName(String ownerUserPrincipalName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabVirtualMachineCreationParameterProperties();
        }
        this.innerProperties().withOwnerUserPrincipalName(ownerUserPrincipalName);
        return this;
    }

    /**
     * Get the createdDate property: The creation date of the virtual machine.
     *
     * @return the createdDate value.
     */
    public OffsetDateTime createdDate() {
        return this.innerProperties() == null ? null : this.innerProperties().createdDate();
    }

    /**
     * Set the createdDate property: The creation date of the virtual machine.
     *
     * @param createdDate the createdDate value to set.
     * @return the LabVirtualMachineCreationParameter object itself.
     */
    public LabVirtualMachineCreationParameter withCreatedDate(OffsetDateTime createdDate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabVirtualMachineCreationParameterProperties();
        }
        this.innerProperties().withCreatedDate(createdDate);
        return this;
    }

    /**
     * Get the customImageId property: The custom image identifier of the virtual machine.
     *
     * @return the customImageId value.
     */
    public String customImageId() {
        return this.innerProperties() == null ? null : this.innerProperties().customImageId();
    }

    /**
     * Set the customImageId property: The custom image identifier of the virtual machine.
     *
     * @param customImageId the customImageId value to set.
     * @return the LabVirtualMachineCreationParameter object itself.
     */
    public LabVirtualMachineCreationParameter withCustomImageId(String customImageId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabVirtualMachineCreationParameterProperties();
        }
        this.innerProperties().withCustomImageId(customImageId);
        return this;
    }

    /**
     * Get the size property: The size of the virtual machine.
     *
     * @return the size value.
     */
    public String size() {
        return this.innerProperties() == null ? null : this.innerProperties().size();
    }

    /**
     * Set the size property: The size of the virtual machine.
     *
     * @param size the size value to set.
     * @return the LabVirtualMachineCreationParameter object itself.
     */
    public LabVirtualMachineCreationParameter withSize(String size) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabVirtualMachineCreationParameterProperties();
        }
        this.innerProperties().withSize(size);
        return this;
    }

    /**
     * Get the username property: The user name of the virtual machine.
     *
     * @return the username value.
     */
    public String username() {
        return this.innerProperties() == null ? null : this.innerProperties().username();
    }

    /**
     * Set the username property: The user name of the virtual machine.
     *
     * @param username the username value to set.
     * @return the LabVirtualMachineCreationParameter object itself.
     */
    public LabVirtualMachineCreationParameter withUsername(String username) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabVirtualMachineCreationParameterProperties();
        }
        this.innerProperties().withUsername(username);
        return this;
    }

    /**
     * Get the password property: The password of the virtual machine administrator.
     *
     * @return the password value.
     */
    public String password() {
        return this.innerProperties() == null ? null : this.innerProperties().password();
    }

    /**
     * Set the password property: The password of the virtual machine administrator.
     *
     * @param password the password value to set.
     * @return the LabVirtualMachineCreationParameter object itself.
     */
    public LabVirtualMachineCreationParameter withPassword(String password) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabVirtualMachineCreationParameterProperties();
        }
        this.innerProperties().withPassword(password);
        return this;
    }

    /**
     * Get the sshKey property: The SSH key of the virtual machine administrator.
     *
     * @return the sshKey value.
     */
    public String sshKey() {
        return this.innerProperties() == null ? null : this.innerProperties().sshKey();
    }

    /**
     * Set the sshKey property: The SSH key of the virtual machine administrator.
     *
     * @param sshKey the sshKey value to set.
     * @return the LabVirtualMachineCreationParameter object itself.
     */
    public LabVirtualMachineCreationParameter withSshKey(String sshKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabVirtualMachineCreationParameterProperties();
        }
        this.innerProperties().withSshKey(sshKey);
        return this;
    }

    /**
     * Get the isAuthenticationWithSshKey property: Indicates whether this virtual machine uses an SSH key for
     * authentication.
     *
     * @return the isAuthenticationWithSshKey value.
     */
    public Boolean isAuthenticationWithSshKey() {
        return this.innerProperties() == null ? null : this.innerProperties().isAuthenticationWithSshKey();
    }

    /**
     * Set the isAuthenticationWithSshKey property: Indicates whether this virtual machine uses an SSH key for
     * authentication.
     *
     * @param isAuthenticationWithSshKey the isAuthenticationWithSshKey value to set.
     * @return the LabVirtualMachineCreationParameter object itself.
     */
    public LabVirtualMachineCreationParameter withIsAuthenticationWithSshKey(Boolean isAuthenticationWithSshKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabVirtualMachineCreationParameterProperties();
        }
        this.innerProperties().withIsAuthenticationWithSshKey(isAuthenticationWithSshKey);
        return this;
    }

    /**
     * Get the labSubnetName property: The lab subnet name of the virtual machine.
     *
     * @return the labSubnetName value.
     */
    public String labSubnetName() {
        return this.innerProperties() == null ? null : this.innerProperties().labSubnetName();
    }

    /**
     * Set the labSubnetName property: The lab subnet name of the virtual machine.
     *
     * @param labSubnetName the labSubnetName value to set.
     * @return the LabVirtualMachineCreationParameter object itself.
     */
    public LabVirtualMachineCreationParameter withLabSubnetName(String labSubnetName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabVirtualMachineCreationParameterProperties();
        }
        this.innerProperties().withLabSubnetName(labSubnetName);
        return this;
    }

    /**
     * Get the labVirtualNetworkId property: The lab virtual network identifier of the virtual machine.
     *
     * @return the labVirtualNetworkId value.
     */
    public String labVirtualNetworkId() {
        return this.innerProperties() == null ? null : this.innerProperties().labVirtualNetworkId();
    }

    /**
     * Set the labVirtualNetworkId property: The lab virtual network identifier of the virtual machine.
     *
     * @param labVirtualNetworkId the labVirtualNetworkId value to set.
     * @return the LabVirtualMachineCreationParameter object itself.
     */
    public LabVirtualMachineCreationParameter withLabVirtualNetworkId(String labVirtualNetworkId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabVirtualMachineCreationParameterProperties();
        }
        this.innerProperties().withLabVirtualNetworkId(labVirtualNetworkId);
        return this;
    }

    /**
     * Get the disallowPublicIpAddress property: Indicates whether the virtual machine is to be created without a public
     * IP address.
     *
     * @return the disallowPublicIpAddress value.
     */
    public Boolean disallowPublicIpAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().disallowPublicIpAddress();
    }

    /**
     * Set the disallowPublicIpAddress property: Indicates whether the virtual machine is to be created without a public
     * IP address.
     *
     * @param disallowPublicIpAddress the disallowPublicIpAddress value to set.
     * @return the LabVirtualMachineCreationParameter object itself.
     */
    public LabVirtualMachineCreationParameter withDisallowPublicIpAddress(Boolean disallowPublicIpAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabVirtualMachineCreationParameterProperties();
        }
        this.innerProperties().withDisallowPublicIpAddress(disallowPublicIpAddress);
        return this;
    }

    /**
     * Get the artifacts property: The artifacts to be installed on the virtual machine.
     *
     * @return the artifacts value.
     */
    public List<ArtifactInstallProperties> artifacts() {
        return this.innerProperties() == null ? null : this.innerProperties().artifacts();
    }

    /**
     * Set the artifacts property: The artifacts to be installed on the virtual machine.
     *
     * @param artifacts the artifacts value to set.
     * @return the LabVirtualMachineCreationParameter object itself.
     */
    public LabVirtualMachineCreationParameter withArtifacts(List<ArtifactInstallProperties> artifacts) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabVirtualMachineCreationParameterProperties();
        }
        this.innerProperties().withArtifacts(artifacts);
        return this;
    }

    /**
     * Get the galleryImageReference property: The Microsoft Azure Marketplace image reference of the virtual machine.
     *
     * @return the galleryImageReference value.
     */
    public GalleryImageReference galleryImageReference() {
        return this.innerProperties() == null ? null : this.innerProperties().galleryImageReference();
    }

    /**
     * Set the galleryImageReference property: The Microsoft Azure Marketplace image reference of the virtual machine.
     *
     * @param galleryImageReference the galleryImageReference value to set.
     * @return the LabVirtualMachineCreationParameter object itself.
     */
    public LabVirtualMachineCreationParameter withGalleryImageReference(GalleryImageReference galleryImageReference) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabVirtualMachineCreationParameterProperties();
        }
        this.innerProperties().withGalleryImageReference(galleryImageReference);
        return this;
    }

    /**
     * Get the planId property: The id of the plan associated with the virtual machine image.
     *
     * @return the planId value.
     */
    public String planId() {
        return this.innerProperties() == null ? null : this.innerProperties().planId();
    }

    /**
     * Set the planId property: The id of the plan associated with the virtual machine image.
     *
     * @param planId the planId value to set.
     * @return the LabVirtualMachineCreationParameter object itself.
     */
    public LabVirtualMachineCreationParameter withPlanId(String planId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabVirtualMachineCreationParameterProperties();
        }
        this.innerProperties().withPlanId(planId);
        return this;
    }

    /**
     * Get the networkInterface property: The network interface properties.
     *
     * @return the networkInterface value.
     */
    public NetworkInterfaceProperties networkInterface() {
        return this.innerProperties() == null ? null : this.innerProperties().networkInterface();
    }

    /**
     * Set the networkInterface property: The network interface properties.
     *
     * @param networkInterface the networkInterface value to set.
     * @return the LabVirtualMachineCreationParameter object itself.
     */
    public LabVirtualMachineCreationParameter withNetworkInterface(NetworkInterfaceProperties networkInterface) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabVirtualMachineCreationParameterProperties();
        }
        this.innerProperties().withNetworkInterface(networkInterface);
        return this;
    }

    /**
     * Get the expirationDate property: The expiration date for VM.
     *
     * @return the expirationDate value.
     */
    public OffsetDateTime expirationDate() {
        return this.innerProperties() == null ? null : this.innerProperties().expirationDate();
    }

    /**
     * Set the expirationDate property: The expiration date for VM.
     *
     * @param expirationDate the expirationDate value to set.
     * @return the LabVirtualMachineCreationParameter object itself.
     */
    public LabVirtualMachineCreationParameter withExpirationDate(OffsetDateTime expirationDate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabVirtualMachineCreationParameterProperties();
        }
        this.innerProperties().withExpirationDate(expirationDate);
        return this;
    }

    /**
     * Get the allowClaim property: Indicates whether another user can take ownership of the virtual machine.
     *
     * @return the allowClaim value.
     */
    public Boolean allowClaim() {
        return this.innerProperties() == null ? null : this.innerProperties().allowClaim();
    }

    /**
     * Set the allowClaim property: Indicates whether another user can take ownership of the virtual machine.
     *
     * @param allowClaim the allowClaim value to set.
     * @return the LabVirtualMachineCreationParameter object itself.
     */
    public LabVirtualMachineCreationParameter withAllowClaim(Boolean allowClaim) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabVirtualMachineCreationParameterProperties();
        }
        this.innerProperties().withAllowClaim(allowClaim);
        return this;
    }

    /**
     * Get the storageType property: Storage type to use for virtual machine (i.e. Standard, Premium).
     *
     * @return the storageType value.
     */
    public String storageType() {
        return this.innerProperties() == null ? null : this.innerProperties().storageType();
    }

    /**
     * Set the storageType property: Storage type to use for virtual machine (i.e. Standard, Premium).
     *
     * @param storageType the storageType value to set.
     * @return the LabVirtualMachineCreationParameter object itself.
     */
    public LabVirtualMachineCreationParameter withStorageType(String storageType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabVirtualMachineCreationParameterProperties();
        }
        this.innerProperties().withStorageType(storageType);
        return this;
    }

    /**
     * Get the environmentId property: The resource ID of the environment that contains this virtual machine, if any.
     *
     * @return the environmentId value.
     */
    public String environmentId() {
        return this.innerProperties() == null ? null : this.innerProperties().environmentId();
    }

    /**
     * Set the environmentId property: The resource ID of the environment that contains this virtual machine, if any.
     *
     * @param environmentId the environmentId value to set.
     * @return the LabVirtualMachineCreationParameter object itself.
     */
    public LabVirtualMachineCreationParameter withEnvironmentId(String environmentId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabVirtualMachineCreationParameterProperties();
        }
        this.innerProperties().withEnvironmentId(environmentId);
        return this;
    }

    /**
     * Get the dataDiskParameters property: New or existing data disks to attach to the virtual machine after creation.
     *
     * @return the dataDiskParameters value.
     */
    public List<DataDiskProperties> dataDiskParameters() {
        return this.innerProperties() == null ? null : this.innerProperties().dataDiskParameters();
    }

    /**
     * Set the dataDiskParameters property: New or existing data disks to attach to the virtual machine after creation.
     *
     * @param dataDiskParameters the dataDiskParameters value to set.
     * @return the LabVirtualMachineCreationParameter object itself.
     */
    public LabVirtualMachineCreationParameter withDataDiskParameters(List<DataDiskProperties> dataDiskParameters) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabVirtualMachineCreationParameterProperties();
        }
        this.innerProperties().withDataDiskParameters(dataDiskParameters);
        return this;
    }

    /**
     * Get the scheduleParameters property: Virtual Machine schedules to be created.
     *
     * @return the scheduleParameters value.
     */
    public List<ScheduleCreationParameter> scheduleParameters() {
        return this.innerProperties() == null ? null : this.innerProperties().scheduleParameters();
    }

    /**
     * Set the scheduleParameters property: Virtual Machine schedules to be created.
     *
     * @param scheduleParameters the scheduleParameters value to set.
     * @return the LabVirtualMachineCreationParameter object itself.
     */
    public LabVirtualMachineCreationParameter withScheduleParameters(
        List<ScheduleCreationParameter> scheduleParameters) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabVirtualMachineCreationParameterProperties();
        }
        this.innerProperties().withScheduleParameters(scheduleParameters);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
