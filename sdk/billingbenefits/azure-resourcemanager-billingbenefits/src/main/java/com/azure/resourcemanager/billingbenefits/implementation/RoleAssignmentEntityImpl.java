// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billingbenefits.implementation;

import com.azure.resourcemanager.billingbenefits.fluent.models.RoleAssignmentEntityInner;
import com.azure.resourcemanager.billingbenefits.models.RoleAssignmentEntity;

public final class RoleAssignmentEntityImpl implements RoleAssignmentEntity {
    private RoleAssignmentEntityInner innerObject;

    private final com.azure.resourcemanager.billingbenefits.BillingBenefitsManager serviceManager;

    RoleAssignmentEntityImpl(
        RoleAssignmentEntityInner innerObject,
        com.azure.resourcemanager.billingbenefits.BillingBenefitsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String principalId() {
        return this.innerModel().principalId();
    }

    public String roleDefinitionId() {
        return this.innerModel().roleDefinitionId();
    }

    public String scope() {
        return this.innerModel().scope();
    }

    public RoleAssignmentEntityInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.billingbenefits.BillingBenefitsManager manager() {
        return this.serviceManager;
    }
}
