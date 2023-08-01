// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managementgroups.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.managementgroups.fluent.ResourceProvidersClient;
import com.azure.resourcemanager.managementgroups.fluent.models.CheckNameAvailabilityResultInner;
import com.azure.resourcemanager.managementgroups.fluent.models.TenantBackfillStatusResultInner;
import com.azure.resourcemanager.managementgroups.models.CheckNameAvailabilityRequest;
import com.azure.resourcemanager.managementgroups.models.CheckNameAvailabilityResult;
import com.azure.resourcemanager.managementgroups.models.ResourceProviders;
import com.azure.resourcemanager.managementgroups.models.TenantBackfillStatusResult;

public final class ResourceProvidersImpl implements ResourceProviders {
    private static final ClientLogger LOGGER = new ClientLogger(ResourceProvidersImpl.class);

    private final ResourceProvidersClient innerClient;

    private final com.azure.resourcemanager.managementgroups.ManagementGroupsManager serviceManager;

    public ResourceProvidersImpl(
        ResourceProvidersClient innerClient,
        com.azure.resourcemanager.managementgroups.ManagementGroupsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<CheckNameAvailabilityResult> checkNameAvailabilityWithResponse(
        CheckNameAvailabilityRequest checkNameAvailabilityRequest, Context context) {
        Response<CheckNameAvailabilityResultInner> inner =
            this.serviceClient().checkNameAvailabilityWithResponse(checkNameAvailabilityRequest, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CheckNameAvailabilityResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CheckNameAvailabilityResult checkNameAvailability(
        CheckNameAvailabilityRequest checkNameAvailabilityRequest) {
        CheckNameAvailabilityResultInner inner =
            this.serviceClient().checkNameAvailability(checkNameAvailabilityRequest);
        if (inner != null) {
            return new CheckNameAvailabilityResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<TenantBackfillStatusResult> startTenantBackfillWithResponse(Context context) {
        Response<TenantBackfillStatusResultInner> inner = this.serviceClient().startTenantBackfillWithResponse(context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new TenantBackfillStatusResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public TenantBackfillStatusResult startTenantBackfill() {
        TenantBackfillStatusResultInner inner = this.serviceClient().startTenantBackfill();
        if (inner != null) {
            return new TenantBackfillStatusResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<TenantBackfillStatusResult> tenantBackfillStatusWithResponse(Context context) {
        Response<TenantBackfillStatusResultInner> inner =
            this.serviceClient().tenantBackfillStatusWithResponse(context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new TenantBackfillStatusResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public TenantBackfillStatusResult tenantBackfillStatus() {
        TenantBackfillStatusResultInner inner = this.serviceClient().tenantBackfillStatus();
        if (inner != null) {
            return new TenantBackfillStatusResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private ResourceProvidersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.managementgroups.ManagementGroupsManager manager() {
        return this.serviceManager;
    }
}
