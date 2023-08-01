// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managementgroups.implementation;

import com.azure.resourcemanager.managementgroups.fluent.models.DescendantInfoInner;
import com.azure.resourcemanager.managementgroups.models.DescendantInfo;
import com.azure.resourcemanager.managementgroups.models.DescendantParentGroupInfo;

public final class DescendantInfoImpl implements DescendantInfo {
    private DescendantInfoInner innerObject;

    private final com.azure.resourcemanager.managementgroups.ManagementGroupsManager serviceManager;

    DescendantInfoImpl(
        DescendantInfoInner innerObject,
        com.azure.resourcemanager.managementgroups.ManagementGroupsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public DescendantParentGroupInfo parent() {
        return this.innerModel().parent();
    }

    public DescendantInfoInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.managementgroups.ManagementGroupsManager manager() {
        return this.serviceManager;
    }
}
