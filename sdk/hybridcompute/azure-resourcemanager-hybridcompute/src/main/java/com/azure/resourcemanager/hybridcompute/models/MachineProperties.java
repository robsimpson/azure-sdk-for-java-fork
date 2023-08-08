// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.exception.ManagementError;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** Describes the properties of a hybrid machine. */
@Fluent
public final class MachineProperties {
    /*
     * Metadata pertaining to the geographic location of the resource.
     */
    @JsonProperty(value = "locationData")
    private LocationData locationData;

    /*
     * Specifies the operating system settings for the hybrid machine.
     */
    @JsonProperty(value = "osProfile", access = JsonProperty.Access.WRITE_ONLY)
    private OSProfile osProfile;

    /*
     * The provisioning state, which only appears in the response.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The status of the hybrid machine agent.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private StatusTypes status;

    /*
     * The time of the last status change.
     */
    @JsonProperty(value = "lastStatusChange", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastStatusChange;

    /*
     * Details about the error state.
     */
    @JsonProperty(value = "errorDetails", access = JsonProperty.Access.WRITE_ONLY)
    private List<ManagementError> errorDetails;

    /*
     * The hybrid machine agent full version.
     */
    @JsonProperty(value = "agentVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String agentVersion;

    /*
     * Specifies the hybrid machine unique ID.
     */
    @JsonProperty(value = "vmId")
    private String vmId;

    /*
     * Specifies the hybrid machine display name.
     */
    @JsonProperty(value = "displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /*
     * Specifies the hybrid machine FQDN.
     */
    @JsonProperty(value = "machineFqdn", access = JsonProperty.Access.WRITE_ONLY)
    private String machineFqdn;

    /*
     * Public Key that the client provides to be used during initial resource onboarding
     */
    @JsonProperty(value = "clientPublicKey")
    private String clientPublicKey;

    /*
     * The Operating System running on the hybrid machine.
     */
    @JsonProperty(value = "osName", access = JsonProperty.Access.WRITE_ONLY)
    private String osName;

    /*
     * The version of Operating System running on the hybrid machine.
     */
    @JsonProperty(value = "osVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String osVersion;

    /*
     * Specifies the Arc Machine's unique SMBIOS ID
     */
    @JsonProperty(value = "vmUuid", access = JsonProperty.Access.WRITE_ONLY)
    private String vmUuid;

    /*
     * Machine Extensions information
     */
    @JsonProperty(value = "extensions")
    private List<MachineExtensionInstanceView> extensions;

    /*
     * Specifies the Operating System product SKU.
     */
    @JsonProperty(value = "osSku", access = JsonProperty.Access.WRITE_ONLY)
    private String osSku;

    /*
     * Specifies the Windows domain name.
     */
    @JsonProperty(value = "domainName", access = JsonProperty.Access.WRITE_ONLY)
    private String domainName;

    /*
     * Specifies the AD fully qualified display name.
     */
    @JsonProperty(value = "adFqdn", access = JsonProperty.Access.WRITE_ONLY)
    private String adFqdn;

    /*
     * Specifies the DNS fully qualified display name.
     */
    @JsonProperty(value = "dnsFqdn", access = JsonProperty.Access.WRITE_ONLY)
    private String dnsFqdn;

    /*
     * The resource id of the private link scope this machine is assigned to, if any.
     */
    @JsonProperty(value = "privateLinkScopeResourceId")
    private String privateLinkScopeResourceId;

    /*
     * The resource id of the parent cluster (Azure HCI) this machine is assigned to, if any.
     */
    @JsonProperty(value = "parentClusterResourceId")
    private String parentClusterResourceId;

    /*
     * Detected properties from the machine.
     */
    @JsonProperty(value = "detectedProperties", access = JsonProperty.Access.WRITE_ONLY)
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> detectedProperties;

    /** Creates an instance of MachineProperties class. */
    public MachineProperties() {
    }

    /**
     * Get the locationData property: Metadata pertaining to the geographic location of the resource.
     *
     * @return the locationData value.
     */
    public LocationData locationData() {
        return this.locationData;
    }

    /**
     * Set the locationData property: Metadata pertaining to the geographic location of the resource.
     *
     * @param locationData the locationData value to set.
     * @return the MachineProperties object itself.
     */
    public MachineProperties withLocationData(LocationData locationData) {
        this.locationData = locationData;
        return this;
    }

    /**
     * Get the osProfile property: Specifies the operating system settings for the hybrid machine.
     *
     * @return the osProfile value.
     */
    public OSProfile osProfile() {
        return this.osProfile;
    }

    /**
     * Get the provisioningState property: The provisioning state, which only appears in the response.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the status property: The status of the hybrid machine agent.
     *
     * @return the status value.
     */
    public StatusTypes status() {
        return this.status;
    }

    /**
     * Get the lastStatusChange property: The time of the last status change.
     *
     * @return the lastStatusChange value.
     */
    public OffsetDateTime lastStatusChange() {
        return this.lastStatusChange;
    }

    /**
     * Get the errorDetails property: Details about the error state.
     *
     * @return the errorDetails value.
     */
    public List<ManagementError> errorDetails() {
        return this.errorDetails;
    }

    /**
     * Get the agentVersion property: The hybrid machine agent full version.
     *
     * @return the agentVersion value.
     */
    public String agentVersion() {
        return this.agentVersion;
    }

    /**
     * Get the vmId property: Specifies the hybrid machine unique ID.
     *
     * @return the vmId value.
     */
    public String vmId() {
        return this.vmId;
    }

    /**
     * Set the vmId property: Specifies the hybrid machine unique ID.
     *
     * @param vmId the vmId value to set.
     * @return the MachineProperties object itself.
     */
    public MachineProperties withVmId(String vmId) {
        this.vmId = vmId;
        return this;
    }

    /**
     * Get the displayName property: Specifies the hybrid machine display name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get the machineFqdn property: Specifies the hybrid machine FQDN.
     *
     * @return the machineFqdn value.
     */
    public String machineFqdn() {
        return this.machineFqdn;
    }

    /**
     * Get the clientPublicKey property: Public Key that the client provides to be used during initial resource
     * onboarding.
     *
     * @return the clientPublicKey value.
     */
    public String clientPublicKey() {
        return this.clientPublicKey;
    }

    /**
     * Set the clientPublicKey property: Public Key that the client provides to be used during initial resource
     * onboarding.
     *
     * @param clientPublicKey the clientPublicKey value to set.
     * @return the MachineProperties object itself.
     */
    public MachineProperties withClientPublicKey(String clientPublicKey) {
        this.clientPublicKey = clientPublicKey;
        return this;
    }

    /**
     * Get the osName property: The Operating System running on the hybrid machine.
     *
     * @return the osName value.
     */
    public String osName() {
        return this.osName;
    }

    /**
     * Get the osVersion property: The version of Operating System running on the hybrid machine.
     *
     * @return the osVersion value.
     */
    public String osVersion() {
        return this.osVersion;
    }

    /**
     * Get the vmUuid property: Specifies the Arc Machine's unique SMBIOS ID.
     *
     * @return the vmUuid value.
     */
    public String vmUuid() {
        return this.vmUuid;
    }

    /**
     * Get the extensions property: Machine Extensions information.
     *
     * @return the extensions value.
     */
    public List<MachineExtensionInstanceView> extensions() {
        return this.extensions;
    }

    /**
     * Set the extensions property: Machine Extensions information.
     *
     * @param extensions the extensions value to set.
     * @return the MachineProperties object itself.
     */
    public MachineProperties withExtensions(List<MachineExtensionInstanceView> extensions) {
        this.extensions = extensions;
        return this;
    }

    /**
     * Get the osSku property: Specifies the Operating System product SKU.
     *
     * @return the osSku value.
     */
    public String osSku() {
        return this.osSku;
    }

    /**
     * Get the domainName property: Specifies the Windows domain name.
     *
     * @return the domainName value.
     */
    public String domainName() {
        return this.domainName;
    }

    /**
     * Get the adFqdn property: Specifies the AD fully qualified display name.
     *
     * @return the adFqdn value.
     */
    public String adFqdn() {
        return this.adFqdn;
    }

    /**
     * Get the dnsFqdn property: Specifies the DNS fully qualified display name.
     *
     * @return the dnsFqdn value.
     */
    public String dnsFqdn() {
        return this.dnsFqdn;
    }

    /**
     * Get the privateLinkScopeResourceId property: The resource id of the private link scope this machine is assigned
     * to, if any.
     *
     * @return the privateLinkScopeResourceId value.
     */
    public String privateLinkScopeResourceId() {
        return this.privateLinkScopeResourceId;
    }

    /**
     * Set the privateLinkScopeResourceId property: The resource id of the private link scope this machine is assigned
     * to, if any.
     *
     * @param privateLinkScopeResourceId the privateLinkScopeResourceId value to set.
     * @return the MachineProperties object itself.
     */
    public MachineProperties withPrivateLinkScopeResourceId(String privateLinkScopeResourceId) {
        this.privateLinkScopeResourceId = privateLinkScopeResourceId;
        return this;
    }

    /**
     * Get the parentClusterResourceId property: The resource id of the parent cluster (Azure HCI) this machine is
     * assigned to, if any.
     *
     * @return the parentClusterResourceId value.
     */
    public String parentClusterResourceId() {
        return this.parentClusterResourceId;
    }

    /**
     * Set the parentClusterResourceId property: The resource id of the parent cluster (Azure HCI) this machine is
     * assigned to, if any.
     *
     * @param parentClusterResourceId the parentClusterResourceId value to set.
     * @return the MachineProperties object itself.
     */
    public MachineProperties withParentClusterResourceId(String parentClusterResourceId) {
        this.parentClusterResourceId = parentClusterResourceId;
        return this;
    }

    /**
     * Get the detectedProperties property: Detected properties from the machine.
     *
     * @return the detectedProperties value.
     */
    public Map<String, String> detectedProperties() {
        return this.detectedProperties;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (locationData() != null) {
            locationData().validate();
        }
        if (osProfile() != null) {
            osProfile().validate();
        }
        if (extensions() != null) {
            extensions().forEach(e -> e.validate());
        }
    }
}
