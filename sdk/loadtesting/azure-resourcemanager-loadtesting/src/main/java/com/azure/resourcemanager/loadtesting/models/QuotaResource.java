// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loadtesting.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.loadtesting.fluent.models.QuotaResourceInner;

/** An immutable client-side representation of QuotaResource. */
public interface QuotaResource {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the limit property: Current quota limit of the quota bucket.
     *
     * @return the limit value.
     */
    Integer limit();

    /**
     * Gets the usage property: Current quota usage of the quota bucket.
     *
     * @return the usage value.
     */
    Integer usage();

    /**
     * Gets the provisioningState property: Resource provisioning state.
     *
     * @return the provisioningState value.
     */
    ResourceState provisioningState();

    /**
     * Gets the inner com.azure.resourcemanager.loadtesting.fluent.models.QuotaResourceInner object.
     *
     * @return the inner object.
     */
    QuotaResourceInner innerModel();
}
