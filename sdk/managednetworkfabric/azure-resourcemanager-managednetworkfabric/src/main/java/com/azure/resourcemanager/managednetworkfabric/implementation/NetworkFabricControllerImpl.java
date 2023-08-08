// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.NetworkFabricControllerInner;
import com.azure.resourcemanager.managednetworkfabric.models.ControllerServices;
import com.azure.resourcemanager.managednetworkfabric.models.ExpressRouteConnectionInformation;
import com.azure.resourcemanager.managednetworkfabric.models.IsWorkloadManagementNetworkEnabled;
import com.azure.resourcemanager.managednetworkfabric.models.ManagedResourceGroupConfiguration;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkFabricController;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkFabricControllerPatch;
import com.azure.resourcemanager.managednetworkfabric.models.NfcSku;
import com.azure.resourcemanager.managednetworkfabric.models.ProvisioningState;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class NetworkFabricControllerImpl
    implements NetworkFabricController, NetworkFabricController.Definition, NetworkFabricController.Update {
    private NetworkFabricControllerInner innerObject;

    private final com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public ControllerServices infrastructureServices() {
        return this.innerModel().infrastructureServices();
    }

    public ControllerServices workloadServices() {
        return this.innerModel().workloadServices();
    }

    public ManagedResourceGroupConfiguration managedResourceGroupConfiguration() {
        return this.innerModel().managedResourceGroupConfiguration();
    }

    public List<String> networkFabricIds() {
        List<String> inner = this.innerModel().networkFabricIds();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Boolean workloadManagementNetwork() {
        return this.innerModel().workloadManagementNetwork();
    }

    public IsWorkloadManagementNetworkEnabled isWorkloadManagementNetworkEnabled() {
        return this.innerModel().isWorkloadManagementNetworkEnabled();
    }

    public List<String> tenantInternetGatewayIds() {
        List<String> inner = this.innerModel().tenantInternetGatewayIds();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String ipv4AddressSpace() {
        return this.innerModel().ipv4AddressSpace();
    }

    public String ipv6AddressSpace() {
        return this.innerModel().ipv6AddressSpace();
    }

    public NfcSku nfcSku() {
        return this.innerModel().nfcSku();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public List<ExpressRouteConnectionInformation> infrastructureExpressRouteConnections() {
        List<ExpressRouteConnectionInformation> inner = this.innerModel().infrastructureExpressRouteConnections();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ExpressRouteConnectionInformation> workloadExpressRouteConnections() {
        List<ExpressRouteConnectionInformation> inner = this.innerModel().workloadExpressRouteConnections();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String annotation() {
        return this.innerModel().annotation();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public NetworkFabricControllerInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String networkFabricControllerName;

    private NetworkFabricControllerPatch updateBody;

    public NetworkFabricControllerImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public NetworkFabricController create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkFabricControllers()
                .create(resourceGroupName, networkFabricControllerName, this.innerModel(), Context.NONE);
        return this;
    }

    public NetworkFabricController create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkFabricControllers()
                .create(resourceGroupName, networkFabricControllerName, this.innerModel(), context);
        return this;
    }

    NetworkFabricControllerImpl(
        String name, com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager) {
        this.innerObject = new NetworkFabricControllerInner();
        this.serviceManager = serviceManager;
        this.networkFabricControllerName = name;
    }

    public NetworkFabricControllerImpl update() {
        this.updateBody = new NetworkFabricControllerPatch();
        return this;
    }

    public NetworkFabricController apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkFabricControllers()
                .update(resourceGroupName, networkFabricControllerName, updateBody, Context.NONE);
        return this;
    }

    public NetworkFabricController apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkFabricControllers()
                .update(resourceGroupName, networkFabricControllerName, updateBody, context);
        return this;
    }

    NetworkFabricControllerImpl(
        NetworkFabricControllerInner innerObject,
        com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.networkFabricControllerName = Utils.getValueFromIdByName(innerObject.id(), "networkFabricControllers");
    }

    public NetworkFabricController refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkFabricControllers()
                .getByResourceGroupWithResponse(resourceGroupName, networkFabricControllerName, Context.NONE)
                .getValue();
        return this;
    }

    public NetworkFabricController refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkFabricControllers()
                .getByResourceGroupWithResponse(resourceGroupName, networkFabricControllerName, context)
                .getValue();
        return this;
    }

    public NetworkFabricControllerImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public NetworkFabricControllerImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public NetworkFabricControllerImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateBody.withTags(tags);
            return this;
        }
    }

    public NetworkFabricControllerImpl withManagedResourceGroupConfiguration(
        ManagedResourceGroupConfiguration managedResourceGroupConfiguration) {
        this.innerModel().withManagedResourceGroupConfiguration(managedResourceGroupConfiguration);
        return this;
    }

    public NetworkFabricControllerImpl withIsWorkloadManagementNetworkEnabled(
        IsWorkloadManagementNetworkEnabled isWorkloadManagementNetworkEnabled) {
        this.innerModel().withIsWorkloadManagementNetworkEnabled(isWorkloadManagementNetworkEnabled);
        return this;
    }

    public NetworkFabricControllerImpl withIpv4AddressSpace(String ipv4AddressSpace) {
        this.innerModel().withIpv4AddressSpace(ipv4AddressSpace);
        return this;
    }

    public NetworkFabricControllerImpl withIpv6AddressSpace(String ipv6AddressSpace) {
        this.innerModel().withIpv6AddressSpace(ipv6AddressSpace);
        return this;
    }

    public NetworkFabricControllerImpl withNfcSku(NfcSku nfcSku) {
        this.innerModel().withNfcSku(nfcSku);
        return this;
    }

    public NetworkFabricControllerImpl withInfrastructureExpressRouteConnections(
        List<ExpressRouteConnectionInformation> infrastructureExpressRouteConnections) {
        if (isInCreateMode()) {
            this.innerModel().withInfrastructureExpressRouteConnections(infrastructureExpressRouteConnections);
            return this;
        } else {
            this.updateBody.withInfrastructureExpressRouteConnections(infrastructureExpressRouteConnections);
            return this;
        }
    }

    public NetworkFabricControllerImpl withWorkloadExpressRouteConnections(
        List<ExpressRouteConnectionInformation> workloadExpressRouteConnections) {
        if (isInCreateMode()) {
            this.innerModel().withWorkloadExpressRouteConnections(workloadExpressRouteConnections);
            return this;
        } else {
            this.updateBody.withWorkloadExpressRouteConnections(workloadExpressRouteConnections);
            return this;
        }
    }

    public NetworkFabricControllerImpl withAnnotation(String annotation) {
        this.innerModel().withAnnotation(annotation);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
