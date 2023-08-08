// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.machinelearning.fluent.models.EnvironmentContainerInner;
import com.azure.resourcemanager.machinelearning.models.EnvironmentContainer;
import com.azure.resourcemanager.machinelearning.models.EnvironmentContainerProperties;

public final class EnvironmentContainerImpl
    implements EnvironmentContainer, EnvironmentContainer.Definition, EnvironmentContainer.Update {
    private EnvironmentContainerInner innerObject;

    private final com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public EnvironmentContainerProperties properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public EnvironmentContainerInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.machinelearning.MachineLearningManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String workspaceName;

    private String name;

    public EnvironmentContainerImpl withExistingWorkspace(String resourceGroupName, String workspaceName) {
        this.resourceGroupName = resourceGroupName;
        this.workspaceName = workspaceName;
        return this;
    }

    public EnvironmentContainer create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEnvironmentContainers()
                .createOrUpdateWithResponse(resourceGroupName, workspaceName, name, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public EnvironmentContainer create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEnvironmentContainers()
                .createOrUpdateWithResponse(resourceGroupName, workspaceName, name, this.innerModel(), context)
                .getValue();
        return this;
    }

    EnvironmentContainerImpl(
        String name, com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager) {
        this.innerObject = new EnvironmentContainerInner();
        this.serviceManager = serviceManager;
        this.name = name;
    }

    public EnvironmentContainerImpl update() {
        return this;
    }

    public EnvironmentContainer apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEnvironmentContainers()
                .createOrUpdateWithResponse(resourceGroupName, workspaceName, name, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public EnvironmentContainer apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEnvironmentContainers()
                .createOrUpdateWithResponse(resourceGroupName, workspaceName, name, this.innerModel(), context)
                .getValue();
        return this;
    }

    EnvironmentContainerImpl(
        EnvironmentContainerInner innerObject,
        com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.workspaceName = Utils.getValueFromIdByName(innerObject.id(), "workspaces");
        this.name = Utils.getValueFromIdByName(innerObject.id(), "environments");
    }

    public EnvironmentContainer refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEnvironmentContainers()
                .getWithResponse(resourceGroupName, workspaceName, name, Context.NONE)
                .getValue();
        return this;
    }

    public EnvironmentContainer refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getEnvironmentContainers()
                .getWithResponse(resourceGroupName, workspaceName, name, context)
                .getValue();
        return this;
    }

    public EnvironmentContainerImpl withProperties(EnvironmentContainerProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }
}
