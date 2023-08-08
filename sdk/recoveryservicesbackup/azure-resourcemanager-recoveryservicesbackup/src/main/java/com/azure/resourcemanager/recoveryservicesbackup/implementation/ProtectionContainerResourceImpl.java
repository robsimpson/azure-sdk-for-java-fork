// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.ProtectionContainerResourceInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionContainer;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionContainerResource;
import java.util.Collections;
import java.util.Map;

public final class ProtectionContainerResourceImpl
    implements ProtectionContainerResource, ProtectionContainerResource.Definition, ProtectionContainerResource.Update {
    private ProtectionContainerResourceInner innerObject;

    private final com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager;

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

    public ProtectionContainer properties() {
        return this.innerModel().properties();
    }

    public String etag() {
        return this.innerModel().etag();
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

    public ProtectionContainerResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager() {
        return this.serviceManager;
    }

    private String vaultName;

    private String resourceGroupName;

    private String fabricName;

    private String containerName;

    public ProtectionContainerResourceImpl withExistingBackupFabric(
        String vaultName, String resourceGroupName, String fabricName) {
        this.vaultName = vaultName;
        this.resourceGroupName = resourceGroupName;
        this.fabricName = fabricName;
        return this;
    }

    public ProtectionContainerResource create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getProtectionContainers()
                .registerWithResponse(
                    vaultName, resourceGroupName, fabricName, containerName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public ProtectionContainerResource create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getProtectionContainers()
                .registerWithResponse(
                    vaultName, resourceGroupName, fabricName, containerName, this.innerModel(), context)
                .getValue();
        return this;
    }

    ProtectionContainerResourceImpl(
        String name, com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager) {
        this.innerObject = new ProtectionContainerResourceInner();
        this.serviceManager = serviceManager;
        this.containerName = name;
    }

    public ProtectionContainerResourceImpl update() {
        return this;
    }

    public ProtectionContainerResource apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getProtectionContainers()
                .registerWithResponse(
                    vaultName, resourceGroupName, fabricName, containerName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public ProtectionContainerResource apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getProtectionContainers()
                .registerWithResponse(
                    vaultName, resourceGroupName, fabricName, containerName, this.innerModel(), context)
                .getValue();
        return this;
    }

    ProtectionContainerResourceImpl(
        ProtectionContainerResourceInner innerObject,
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.vaultName = Utils.getValueFromIdByName(innerObject.id(), "vaults");
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.fabricName = Utils.getValueFromIdByName(innerObject.id(), "backupFabrics");
        this.containerName = Utils.getValueFromIdByName(innerObject.id(), "protectionContainers");
    }

    public ProtectionContainerResource refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getProtectionContainers()
                .getWithResponse(vaultName, resourceGroupName, fabricName, containerName, Context.NONE)
                .getValue();
        return this;
    }

    public ProtectionContainerResource refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getProtectionContainers()
                .getWithResponse(vaultName, resourceGroupName, fabricName, containerName, context)
                .getValue();
        return this;
    }

    public Response<Void> inquireWithResponse(String filter, Context context) {
        return serviceManager
            .protectionContainers()
            .inquireWithResponse(vaultName, resourceGroupName, fabricName, containerName, filter, context);
    }

    public void inquire() {
        serviceManager.protectionContainers().inquire(vaultName, resourceGroupName, fabricName, containerName);
    }

    public ProtectionContainerResourceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ProtectionContainerResourceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ProtectionContainerResourceImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public ProtectionContainerResourceImpl withProperties(ProtectionContainer properties) {
        this.innerModel().withProperties(properties);
        return this;
    }

    public ProtectionContainerResourceImpl withEtag(String etag) {
        this.innerModel().withEtag(etag);
        return this;
    }
}
