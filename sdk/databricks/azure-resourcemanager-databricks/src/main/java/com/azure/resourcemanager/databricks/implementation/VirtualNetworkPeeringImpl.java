// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.databricks.fluent.models.VirtualNetworkPeeringInner;
import com.azure.resourcemanager.databricks.models.AddressSpace;
import com.azure.resourcemanager.databricks.models.PeeringProvisioningState;
import com.azure.resourcemanager.databricks.models.PeeringState;
import com.azure.resourcemanager.databricks.models.VirtualNetworkPeering;
import com.azure.resourcemanager.databricks.models.VirtualNetworkPeeringPropertiesFormatDatabricksVirtualNetwork;
import com.azure.resourcemanager.databricks.models.VirtualNetworkPeeringPropertiesFormatRemoteVirtualNetwork;

public final class VirtualNetworkPeeringImpl
    implements VirtualNetworkPeering, VirtualNetworkPeering.Definition, VirtualNetworkPeering.Update {
    private VirtualNetworkPeeringInner innerObject;

    private final com.azure.resourcemanager.databricks.AzureDatabricksManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public Boolean allowVirtualNetworkAccess() {
        return this.innerModel().allowVirtualNetworkAccess();
    }

    public Boolean allowForwardedTraffic() {
        return this.innerModel().allowForwardedTraffic();
    }

    public Boolean allowGatewayTransit() {
        return this.innerModel().allowGatewayTransit();
    }

    public Boolean useRemoteGateways() {
        return this.innerModel().useRemoteGateways();
    }

    public VirtualNetworkPeeringPropertiesFormatDatabricksVirtualNetwork databricksVirtualNetwork() {
        return this.innerModel().databricksVirtualNetwork();
    }

    public AddressSpace databricksAddressSpace() {
        return this.innerModel().databricksAddressSpace();
    }

    public VirtualNetworkPeeringPropertiesFormatRemoteVirtualNetwork remoteVirtualNetwork() {
        return this.innerModel().remoteVirtualNetwork();
    }

    public AddressSpace remoteAddressSpace() {
        return this.innerModel().remoteAddressSpace();
    }

    public PeeringState peeringState() {
        return this.innerModel().peeringState();
    }

    public PeeringProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public VirtualNetworkPeeringInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.databricks.AzureDatabricksManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String workspaceName;

    private String peeringName;

    public VirtualNetworkPeeringImpl withExistingWorkspace(String resourceGroupName, String workspaceName) {
        this.resourceGroupName = resourceGroupName;
        this.workspaceName = workspaceName;
        return this;
    }

    public VirtualNetworkPeering create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVNetPeerings()
                .createOrUpdate(resourceGroupName, workspaceName, peeringName, this.innerModel(), Context.NONE);
        return this;
    }

    public VirtualNetworkPeering create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVNetPeerings()
                .createOrUpdate(resourceGroupName, workspaceName, peeringName, this.innerModel(), context);
        return this;
    }

    VirtualNetworkPeeringImpl(String name, com.azure.resourcemanager.databricks.AzureDatabricksManager serviceManager) {
        this.innerObject = new VirtualNetworkPeeringInner();
        this.serviceManager = serviceManager;
        this.peeringName = name;
    }

    public VirtualNetworkPeeringImpl update() {
        return this;
    }

    public VirtualNetworkPeering apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVNetPeerings()
                .createOrUpdate(resourceGroupName, workspaceName, peeringName, this.innerModel(), Context.NONE);
        return this;
    }

    public VirtualNetworkPeering apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVNetPeerings()
                .createOrUpdate(resourceGroupName, workspaceName, peeringName, this.innerModel(), context);
        return this;
    }

    VirtualNetworkPeeringImpl(
        VirtualNetworkPeeringInner innerObject,
        com.azure.resourcemanager.databricks.AzureDatabricksManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.workspaceName = Utils.getValueFromIdByName(innerObject.id(), "workspaces");
        this.peeringName = Utils.getValueFromIdByName(innerObject.id(), "virtualNetworkPeerings");
    }

    public VirtualNetworkPeering refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVNetPeerings()
                .getWithResponse(resourceGroupName, workspaceName, peeringName, Context.NONE)
                .getValue();
        return this;
    }

    public VirtualNetworkPeering refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVNetPeerings()
                .getWithResponse(resourceGroupName, workspaceName, peeringName, context)
                .getValue();
        return this;
    }

    public VirtualNetworkPeeringImpl withRemoteVirtualNetwork(
        VirtualNetworkPeeringPropertiesFormatRemoteVirtualNetwork remoteVirtualNetwork) {
        this.innerModel().withRemoteVirtualNetwork(remoteVirtualNetwork);
        return this;
    }

    public VirtualNetworkPeeringImpl withAllowVirtualNetworkAccess(Boolean allowVirtualNetworkAccess) {
        this.innerModel().withAllowVirtualNetworkAccess(allowVirtualNetworkAccess);
        return this;
    }

    public VirtualNetworkPeeringImpl withAllowForwardedTraffic(Boolean allowForwardedTraffic) {
        this.innerModel().withAllowForwardedTraffic(allowForwardedTraffic);
        return this;
    }

    public VirtualNetworkPeeringImpl withAllowGatewayTransit(Boolean allowGatewayTransit) {
        this.innerModel().withAllowGatewayTransit(allowGatewayTransit);
        return this;
    }

    public VirtualNetworkPeeringImpl withUseRemoteGateways(Boolean useRemoteGateways) {
        this.innerModel().withUseRemoteGateways(useRemoteGateways);
        return this;
    }

    public VirtualNetworkPeeringImpl withDatabricksVirtualNetwork(
        VirtualNetworkPeeringPropertiesFormatDatabricksVirtualNetwork databricksVirtualNetwork) {
        this.innerModel().withDatabricksVirtualNetwork(databricksVirtualNetwork);
        return this;
    }

    public VirtualNetworkPeeringImpl withDatabricksAddressSpace(AddressSpace databricksAddressSpace) {
        this.innerModel().withDatabricksAddressSpace(databricksAddressSpace);
        return this;
    }

    public VirtualNetworkPeeringImpl withRemoteAddressSpace(AddressSpace remoteAddressSpace) {
        this.innerModel().withRemoteAddressSpace(remoteAddressSpace);
        return this;
    }
}
