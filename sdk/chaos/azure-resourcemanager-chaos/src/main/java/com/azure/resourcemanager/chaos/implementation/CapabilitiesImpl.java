// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.chaos.fluent.CapabilitiesClient;
import com.azure.resourcemanager.chaos.fluent.models.CapabilityInner;
import com.azure.resourcemanager.chaos.models.Capabilities;
import com.azure.resourcemanager.chaos.models.Capability;

public final class CapabilitiesImpl implements Capabilities {
    private static final ClientLogger LOGGER = new ClientLogger(CapabilitiesImpl.class);

    private final CapabilitiesClient innerClient;

    private final com.azure.resourcemanager.chaos.ChaosManager serviceManager;

    public CapabilitiesImpl(
        CapabilitiesClient innerClient, com.azure.resourcemanager.chaos.ChaosManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Capability> list(
        String resourceGroupName,
        String parentProviderNamespace,
        String parentResourceType,
        String parentResourceName,
        String targetName) {
        PagedIterable<CapabilityInner> inner =
            this
                .serviceClient()
                .list(resourceGroupName, parentProviderNamespace, parentResourceType, parentResourceName, targetName);
        return Utils.mapPage(inner, inner1 -> new CapabilityImpl(inner1, this.manager()));
    }

    public PagedIterable<Capability> list(
        String resourceGroupName,
        String parentProviderNamespace,
        String parentResourceType,
        String parentResourceName,
        String targetName,
        String continuationToken,
        Context context) {
        PagedIterable<CapabilityInner> inner =
            this
                .serviceClient()
                .list(
                    resourceGroupName,
                    parentProviderNamespace,
                    parentResourceType,
                    parentResourceName,
                    targetName,
                    continuationToken,
                    context);
        return Utils.mapPage(inner, inner1 -> new CapabilityImpl(inner1, this.manager()));
    }

    public Response<Capability> getWithResponse(
        String resourceGroupName,
        String parentProviderNamespace,
        String parentResourceType,
        String parentResourceName,
        String targetName,
        String capabilityName,
        Context context) {
        Response<CapabilityInner> inner =
            this
                .serviceClient()
                .getWithResponse(
                    resourceGroupName,
                    parentProviderNamespace,
                    parentResourceType,
                    parentResourceName,
                    targetName,
                    capabilityName,
                    context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CapabilityImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Capability get(
        String resourceGroupName,
        String parentProviderNamespace,
        String parentResourceType,
        String parentResourceName,
        String targetName,
        String capabilityName) {
        CapabilityInner inner =
            this
                .serviceClient()
                .get(
                    resourceGroupName,
                    parentProviderNamespace,
                    parentResourceType,
                    parentResourceName,
                    targetName,
                    capabilityName);
        if (inner != null) {
            return new CapabilityImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName,
        String parentProviderNamespace,
        String parentResourceType,
        String parentResourceName,
        String targetName,
        String capabilityName,
        Context context) {
        return this
            .serviceClient()
            .deleteWithResponse(
                resourceGroupName,
                parentProviderNamespace,
                parentResourceType,
                parentResourceName,
                targetName,
                capabilityName,
                context);
    }

    public void delete(
        String resourceGroupName,
        String parentProviderNamespace,
        String parentResourceType,
        String parentResourceName,
        String targetName,
        String capabilityName) {
        this
            .serviceClient()
            .delete(
                resourceGroupName,
                parentProviderNamespace,
                parentResourceType,
                parentResourceName,
                targetName,
                capabilityName);
    }

    public Response<Capability> createOrUpdateWithResponse(
        String resourceGroupName,
        String parentProviderNamespace,
        String parentResourceType,
        String parentResourceName,
        String targetName,
        String capabilityName,
        CapabilityInner capability,
        Context context) {
        Response<CapabilityInner> inner =
            this
                .serviceClient()
                .createOrUpdateWithResponse(
                    resourceGroupName,
                    parentProviderNamespace,
                    parentResourceType,
                    parentResourceName,
                    targetName,
                    capabilityName,
                    capability,
                    context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CapabilityImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Capability createOrUpdate(
        String resourceGroupName,
        String parentProviderNamespace,
        String parentResourceType,
        String parentResourceName,
        String targetName,
        String capabilityName,
        CapabilityInner capability) {
        CapabilityInner inner =
            this
                .serviceClient()
                .createOrUpdate(
                    resourceGroupName,
                    parentProviderNamespace,
                    parentResourceType,
                    parentResourceName,
                    targetName,
                    capabilityName,
                    capability);
        if (inner != null) {
            return new CapabilityImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private CapabilitiesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.chaos.ChaosManager manager() {
        return this.serviceManager;
    }
}
