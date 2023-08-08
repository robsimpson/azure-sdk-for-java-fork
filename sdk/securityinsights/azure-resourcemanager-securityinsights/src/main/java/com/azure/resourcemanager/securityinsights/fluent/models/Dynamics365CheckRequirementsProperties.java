// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.securityinsights.models.DataConnectorTenantId;

/** Dynamics365 requirements check properties. */
@Fluent
public final class Dynamics365CheckRequirementsProperties extends DataConnectorTenantId {
    /** {@inheritDoc} */
    @Override
    public Dynamics365CheckRequirementsProperties withTenantId(String tenantId) {
        super.withTenantId(tenantId);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
