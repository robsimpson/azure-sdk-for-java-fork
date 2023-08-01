// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.resourcemanager.network.models.CustomDnsConfigPropertiesFormat;
import com.azure.resourcemanager.network.models.ExtendedLocation;
import com.azure.resourcemanager.network.models.PrivateEndpointIpConfiguration;
import com.azure.resourcemanager.network.models.PrivateLinkServiceConnection;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Private endpoint resource. */
@Fluent
public final class PrivateEndpointInner extends Resource {
    /*
     * The extended location of the load balancer.
     */
    @JsonProperty(value = "extendedLocation")
    private ExtendedLocation extendedLocation;

    /*
     * Properties of the private endpoint.
     */
    @JsonProperty(value = "properties")
    private PrivateEndpointPropertiesInner innerProperties;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /** Creates an instance of PrivateEndpointInner class. */
    public PrivateEndpointInner() {
    }

    /**
     * Get the extendedLocation property: The extended location of the load balancer.
     *
     * @return the extendedLocation value.
     */
    public ExtendedLocation extendedLocation() {
        return this.extendedLocation;
    }

    /**
     * Set the extendedLocation property: The extended location of the load balancer.
     *
     * @param extendedLocation the extendedLocation value to set.
     * @return the PrivateEndpointInner object itself.
     */
    public PrivateEndpointInner withExtendedLocation(ExtendedLocation extendedLocation) {
        this.extendedLocation = extendedLocation;
        return this;
    }

    /**
     * Get the innerProperties property: Properties of the private endpoint.
     *
     * @return the innerProperties value.
     */
    private PrivateEndpointPropertiesInner innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the id property: Resource ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     *
     * @param id the id value to set.
     * @return the PrivateEndpointInner object itself.
     */
    public PrivateEndpointInner withId(String id) {
        this.id = id;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PrivateEndpointInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PrivateEndpointInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the subnet property: The ID of the subnet from which the private IP will be allocated.
     *
     * @return the subnet value.
     */
    public SubnetInner subnet() {
        return this.innerProperties() == null ? null : this.innerProperties().subnet();
    }

    /**
     * Set the subnet property: The ID of the subnet from which the private IP will be allocated.
     *
     * @param subnet the subnet value to set.
     * @return the PrivateEndpointInner object itself.
     */
    public PrivateEndpointInner withSubnet(SubnetInner subnet) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateEndpointPropertiesInner();
        }
        this.innerProperties().withSubnet(subnet);
        return this;
    }

    /**
     * Get the networkInterfaces property: An array of references to the network interfaces created for this private
     * endpoint.
     *
     * @return the networkInterfaces value.
     */
    public List<NetworkInterfaceInner> networkInterfaces() {
        return this.innerProperties() == null ? null : this.innerProperties().networkInterfaces();
    }

    /**
     * Get the provisioningState property: The provisioning state of the private endpoint resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the privateLinkServiceConnections property: A grouping of information about the connection to the remote
     * resource.
     *
     * @return the privateLinkServiceConnections value.
     */
    public List<PrivateLinkServiceConnection> privateLinkServiceConnections() {
        return this.innerProperties() == null ? null : this.innerProperties().privateLinkServiceConnections();
    }

    /**
     * Set the privateLinkServiceConnections property: A grouping of information about the connection to the remote
     * resource.
     *
     * @param privateLinkServiceConnections the privateLinkServiceConnections value to set.
     * @return the PrivateEndpointInner object itself.
     */
    public PrivateEndpointInner withPrivateLinkServiceConnections(
        List<PrivateLinkServiceConnection> privateLinkServiceConnections) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateEndpointPropertiesInner();
        }
        this.innerProperties().withPrivateLinkServiceConnections(privateLinkServiceConnections);
        return this;
    }

    /**
     * Get the manualPrivateLinkServiceConnections property: A grouping of information about the connection to the
     * remote resource. Used when the network admin does not have access to approve connections to the remote resource.
     *
     * @return the manualPrivateLinkServiceConnections value.
     */
    public List<PrivateLinkServiceConnection> manualPrivateLinkServiceConnections() {
        return this.innerProperties() == null ? null : this.innerProperties().manualPrivateLinkServiceConnections();
    }

    /**
     * Set the manualPrivateLinkServiceConnections property: A grouping of information about the connection to the
     * remote resource. Used when the network admin does not have access to approve connections to the remote resource.
     *
     * @param manualPrivateLinkServiceConnections the manualPrivateLinkServiceConnections value to set.
     * @return the PrivateEndpointInner object itself.
     */
    public PrivateEndpointInner withManualPrivateLinkServiceConnections(
        List<PrivateLinkServiceConnection> manualPrivateLinkServiceConnections) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateEndpointPropertiesInner();
        }
        this.innerProperties().withManualPrivateLinkServiceConnections(manualPrivateLinkServiceConnections);
        return this;
    }

    /**
     * Get the customDnsConfigs property: An array of custom dns configurations.
     *
     * @return the customDnsConfigs value.
     */
    public List<CustomDnsConfigPropertiesFormat> customDnsConfigs() {
        return this.innerProperties() == null ? null : this.innerProperties().customDnsConfigs();
    }

    /**
     * Set the customDnsConfigs property: An array of custom dns configurations.
     *
     * @param customDnsConfigs the customDnsConfigs value to set.
     * @return the PrivateEndpointInner object itself.
     */
    public PrivateEndpointInner withCustomDnsConfigs(List<CustomDnsConfigPropertiesFormat> customDnsConfigs) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateEndpointPropertiesInner();
        }
        this.innerProperties().withCustomDnsConfigs(customDnsConfigs);
        return this;
    }

    /**
     * Get the applicationSecurityGroups property: Application security groups in which the private endpoint IP
     * configuration is included.
     *
     * @return the applicationSecurityGroups value.
     */
    public List<ApplicationSecurityGroupInner> applicationSecurityGroups() {
        return this.innerProperties() == null ? null : this.innerProperties().applicationSecurityGroups();
    }

    /**
     * Set the applicationSecurityGroups property: Application security groups in which the private endpoint IP
     * configuration is included.
     *
     * @param applicationSecurityGroups the applicationSecurityGroups value to set.
     * @return the PrivateEndpointInner object itself.
     */
    public PrivateEndpointInner withApplicationSecurityGroups(
        List<ApplicationSecurityGroupInner> applicationSecurityGroups) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateEndpointPropertiesInner();
        }
        this.innerProperties().withApplicationSecurityGroups(applicationSecurityGroups);
        return this;
    }

    /**
     * Get the ipConfigurations property: A list of IP configurations of the private endpoint. This will be used to map
     * to the First Party Service's endpoints.
     *
     * @return the ipConfigurations value.
     */
    public List<PrivateEndpointIpConfiguration> ipConfigurations() {
        return this.innerProperties() == null ? null : this.innerProperties().ipConfigurations();
    }

    /**
     * Set the ipConfigurations property: A list of IP configurations of the private endpoint. This will be used to map
     * to the First Party Service's endpoints.
     *
     * @param ipConfigurations the ipConfigurations value to set.
     * @return the PrivateEndpointInner object itself.
     */
    public PrivateEndpointInner withIpConfigurations(List<PrivateEndpointIpConfiguration> ipConfigurations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateEndpointPropertiesInner();
        }
        this.innerProperties().withIpConfigurations(ipConfigurations);
        return this;
    }

    /**
     * Get the customNetworkInterfaceName property: The custom name of the network interface attached to the private
     * endpoint.
     *
     * @return the customNetworkInterfaceName value.
     */
    public String customNetworkInterfaceName() {
        return this.innerProperties() == null ? null : this.innerProperties().customNetworkInterfaceName();
    }

    /**
     * Set the customNetworkInterfaceName property: The custom name of the network interface attached to the private
     * endpoint.
     *
     * @param customNetworkInterfaceName the customNetworkInterfaceName value to set.
     * @return the PrivateEndpointInner object itself.
     */
    public PrivateEndpointInner withCustomNetworkInterfaceName(String customNetworkInterfaceName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateEndpointPropertiesInner();
        }
        this.innerProperties().withCustomNetworkInterfaceName(customNetworkInterfaceName);
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
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
