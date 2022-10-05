// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.fluent.SecurityConnectorApplicationsClient;
import com.azure.resourcemanager.security.fluent.models.ApplicationInner;
import com.azure.resourcemanager.security.models.Application;
import com.azure.resourcemanager.security.models.SecurityConnectorApplications;

public final class SecurityConnectorApplicationsImpl implements SecurityConnectorApplications {
    private static final ClientLogger LOGGER = new ClientLogger(SecurityConnectorApplicationsImpl.class);

    private final SecurityConnectorApplicationsClient innerClient;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    public SecurityConnectorApplicationsImpl(
        SecurityConnectorApplicationsClient innerClient,
        com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Application> list(String resourceGroupName, String securityConnectorName) {
        PagedIterable<ApplicationInner> inner = this.serviceClient().list(resourceGroupName, securityConnectorName);
        return Utils.mapPage(inner, inner1 -> new ApplicationImpl(inner1, this.manager()));
    }

    public PagedIterable<Application> list(String resourceGroupName, String securityConnectorName, Context context) {
        PagedIterable<ApplicationInner> inner =
            this.serviceClient().list(resourceGroupName, securityConnectorName, context);
        return Utils.mapPage(inner, inner1 -> new ApplicationImpl(inner1, this.manager()));
    }

    private SecurityConnectorApplicationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }
}