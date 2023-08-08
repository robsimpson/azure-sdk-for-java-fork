// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.DdosSettings;
import com.azure.resourcemanager.network.models.IpAllocationMethod;
import com.azure.resourcemanager.network.models.IpTag;
import com.azure.resourcemanager.network.models.IpVersion;
import com.azure.resourcemanager.network.models.PublicIpAddressDnsSettings;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Public IP address properties. */
@Fluent
public final class PublicIpAddressPropertiesFormatInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PublicIpAddressPropertiesFormatInner.class);

    /*
     * The public IP allocation method. Possible values are: 'Static' and
     * 'Dynamic'.
     */
    @JsonProperty(value = "publicIPAllocationMethod")
    private IpAllocationMethod publicIpAllocationMethod;

    /*
     * The public IP address version. Possible values are: 'IPv4' and 'IPv6'.
     */
    @JsonProperty(value = "publicIPAddressVersion")
    private IpVersion publicIpAddressVersion;

    /*
     * The IP configuration associated with the public IP address.
     */
    @JsonProperty(value = "ipConfiguration", access = JsonProperty.Access.WRITE_ONLY)
    private IpConfigurationInner ipConfiguration;

    /*
     * The FQDN of the DNS record associated with the public IP address.
     */
    @JsonProperty(value = "dnsSettings")
    private PublicIpAddressDnsSettings dnsSettings;

    /*
     * The DDoS protection custom policy associated with the public IP address.
     */
    @JsonProperty(value = "ddosSettings")
    private DdosSettings ddosSettings;

    /*
     * The list of tags associated with the public IP address.
     */
    @JsonProperty(value = "ipTags")
    private List<IpTag> ipTags;

    /*
     * The IP address associated with the public IP address resource.
     */
    @JsonProperty(value = "ipAddress")
    private String ipAddress;

    /*
     * The Public IP Prefix this Public IP Address should be allocated from.
     */
    @JsonProperty(value = "publicIPPrefix")
    private SubResource publicIpPrefix;

    /*
     * The idle timeout of the public IP address.
     */
    @JsonProperty(value = "idleTimeoutInMinutes")
    private Integer idleTimeoutInMinutes;

    /*
     * The resource GUID property of the public IP resource.
     */
    @JsonProperty(value = "resourceGuid")
    private String resourceGuid;

    /*
     * The provisioning state of the PublicIP resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "provisioningState")
    private String provisioningState;

    /**
     * Get the publicIpAllocationMethod property: The public IP allocation method. Possible values are: 'Static' and
     * 'Dynamic'.
     *
     * @return the publicIpAllocationMethod value.
     */
    public IpAllocationMethod publicIpAllocationMethod() {
        return this.publicIpAllocationMethod;
    }

    /**
     * Set the publicIpAllocationMethod property: The public IP allocation method. Possible values are: 'Static' and
     * 'Dynamic'.
     *
     * @param publicIpAllocationMethod the publicIpAllocationMethod value to set.
     * @return the PublicIpAddressPropertiesFormatInner object itself.
     */
    public PublicIpAddressPropertiesFormatInner withPublicIpAllocationMethod(
        IpAllocationMethod publicIpAllocationMethod) {
        this.publicIpAllocationMethod = publicIpAllocationMethod;
        return this;
    }

    /**
     * Get the publicIpAddressVersion property: The public IP address version. Possible values are: 'IPv4' and 'IPv6'.
     *
     * @return the publicIpAddressVersion value.
     */
    public IpVersion publicIpAddressVersion() {
        return this.publicIpAddressVersion;
    }

    /**
     * Set the publicIpAddressVersion property: The public IP address version. Possible values are: 'IPv4' and 'IPv6'.
     *
     * @param publicIpAddressVersion the publicIpAddressVersion value to set.
     * @return the PublicIpAddressPropertiesFormatInner object itself.
     */
    public PublicIpAddressPropertiesFormatInner withPublicIpAddressVersion(IpVersion publicIpAddressVersion) {
        this.publicIpAddressVersion = publicIpAddressVersion;
        return this;
    }

    /**
     * Get the ipConfiguration property: The IP configuration associated with the public IP address.
     *
     * @return the ipConfiguration value.
     */
    public IpConfigurationInner ipConfiguration() {
        return this.ipConfiguration;
    }

    /**
     * Get the dnsSettings property: The FQDN of the DNS record associated with the public IP address.
     *
     * @return the dnsSettings value.
     */
    public PublicIpAddressDnsSettings dnsSettings() {
        return this.dnsSettings;
    }

    /**
     * Set the dnsSettings property: The FQDN of the DNS record associated with the public IP address.
     *
     * @param dnsSettings the dnsSettings value to set.
     * @return the PublicIpAddressPropertiesFormatInner object itself.
     */
    public PublicIpAddressPropertiesFormatInner withDnsSettings(PublicIpAddressDnsSettings dnsSettings) {
        this.dnsSettings = dnsSettings;
        return this;
    }

    /**
     * Get the ddosSettings property: The DDoS protection custom policy associated with the public IP address.
     *
     * @return the ddosSettings value.
     */
    public DdosSettings ddosSettings() {
        return this.ddosSettings;
    }

    /**
     * Set the ddosSettings property: The DDoS protection custom policy associated with the public IP address.
     *
     * @param ddosSettings the ddosSettings value to set.
     * @return the PublicIpAddressPropertiesFormatInner object itself.
     */
    public PublicIpAddressPropertiesFormatInner withDdosSettings(DdosSettings ddosSettings) {
        this.ddosSettings = ddosSettings;
        return this;
    }

    /**
     * Get the ipTags property: The list of tags associated with the public IP address.
     *
     * @return the ipTags value.
     */
    public List<IpTag> ipTags() {
        return this.ipTags;
    }

    /**
     * Set the ipTags property: The list of tags associated with the public IP address.
     *
     * @param ipTags the ipTags value to set.
     * @return the PublicIpAddressPropertiesFormatInner object itself.
     */
    public PublicIpAddressPropertiesFormatInner withIpTags(List<IpTag> ipTags) {
        this.ipTags = ipTags;
        return this;
    }

    /**
     * Get the ipAddress property: The IP address associated with the public IP address resource.
     *
     * @return the ipAddress value.
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Set the ipAddress property: The IP address associated with the public IP address resource.
     *
     * @param ipAddress the ipAddress value to set.
     * @return the PublicIpAddressPropertiesFormatInner object itself.
     */
    public PublicIpAddressPropertiesFormatInner withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get the publicIpPrefix property: The Public IP Prefix this Public IP Address should be allocated from.
     *
     * @return the publicIpPrefix value.
     */
    public SubResource publicIpPrefix() {
        return this.publicIpPrefix;
    }

    /**
     * Set the publicIpPrefix property: The Public IP Prefix this Public IP Address should be allocated from.
     *
     * @param publicIpPrefix the publicIpPrefix value to set.
     * @return the PublicIpAddressPropertiesFormatInner object itself.
     */
    public PublicIpAddressPropertiesFormatInner withPublicIpPrefix(SubResource publicIpPrefix) {
        this.publicIpPrefix = publicIpPrefix;
        return this;
    }

    /**
     * Get the idleTimeoutInMinutes property: The idle timeout of the public IP address.
     *
     * @return the idleTimeoutInMinutes value.
     */
    public Integer idleTimeoutInMinutes() {
        return this.idleTimeoutInMinutes;
    }

    /**
     * Set the idleTimeoutInMinutes property: The idle timeout of the public IP address.
     *
     * @param idleTimeoutInMinutes the idleTimeoutInMinutes value to set.
     * @return the PublicIpAddressPropertiesFormatInner object itself.
     */
    public PublicIpAddressPropertiesFormatInner withIdleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
        return this;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the public IP resource.
     *
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Set the resourceGuid property: The resource GUID property of the public IP resource.
     *
     * @param resourceGuid the resourceGuid value to set.
     * @return the PublicIpAddressPropertiesFormatInner object itself.
     */
    public PublicIpAddressPropertiesFormatInner withResourceGuid(String resourceGuid) {
        this.resourceGuid = resourceGuid;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the PublicIP resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The provisioning state of the PublicIP resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the PublicIpAddressPropertiesFormatInner object itself.
     */
    public PublicIpAddressPropertiesFormatInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ipConfiguration() != null) {
            ipConfiguration().validate();
        }
        if (dnsSettings() != null) {
            dnsSettings().validate();
        }
        if (ddosSettings() != null) {
            ddosSettings().validate();
        }
        if (ipTags() != null) {
            ipTags().forEach(e -> e.validate());
        }
    }
}
