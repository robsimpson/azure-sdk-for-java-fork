// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.resourcemanager.appcontainers.fluent.models.JobSecretsCollectionInner;
import java.util.List;

/** An immutable client-side representation of JobSecretsCollection. */
public interface JobSecretsCollection {
    /**
     * Gets the value property: Collection of resources.
     *
     * @return the value value.
     */
    List<Secret> value();

    /**
     * Gets the inner com.azure.resourcemanager.appcontainers.fluent.models.JobSecretsCollectionInner object.
     *
     * @return the inner object.
     */
    JobSecretsCollectionInner innerModel();
}
