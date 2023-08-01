// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.implementation;

import com.azure.resourcemanager.appcontainers.fluent.models.ConnectedEnvironmentStorageInner;
import com.azure.resourcemanager.appcontainers.fluent.models.ConnectedEnvironmentStoragesCollectionInner;
import com.azure.resourcemanager.appcontainers.models.ConnectedEnvironmentStorage;
import com.azure.resourcemanager.appcontainers.models.ConnectedEnvironmentStoragesCollection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class ConnectedEnvironmentStoragesCollectionImpl implements ConnectedEnvironmentStoragesCollection {
    private ConnectedEnvironmentStoragesCollectionInner innerObject;

    private final com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager;

    ConnectedEnvironmentStoragesCollectionImpl(
        ConnectedEnvironmentStoragesCollectionInner innerObject,
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<ConnectedEnvironmentStorage> value() {
        List<ConnectedEnvironmentStorageInner> inner = this.innerModel().value();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new ConnectedEnvironmentStorageImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public ConnectedEnvironmentStoragesCollectionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager() {
        return this.serviceManager;
    }
}
