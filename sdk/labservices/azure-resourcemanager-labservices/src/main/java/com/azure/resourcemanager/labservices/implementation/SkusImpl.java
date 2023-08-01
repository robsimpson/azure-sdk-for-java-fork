// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.labservices.fluent.SkusClient;
import com.azure.resourcemanager.labservices.fluent.models.LabServicesSkuInner;
import com.azure.resourcemanager.labservices.models.LabServicesSku;
import com.azure.resourcemanager.labservices.models.Skus;

public final class SkusImpl implements Skus {
    private static final ClientLogger LOGGER = new ClientLogger(SkusImpl.class);

    private final SkusClient innerClient;

    private final com.azure.resourcemanager.labservices.LabServicesManager serviceManager;

    public SkusImpl(SkusClient innerClient, com.azure.resourcemanager.labservices.LabServicesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<LabServicesSku> list() {
        PagedIterable<LabServicesSkuInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new LabServicesSkuImpl(inner1, this.manager()));
    }

    public PagedIterable<LabServicesSku> list(String filter, Context context) {
        PagedIterable<LabServicesSkuInner> inner = this.serviceClient().list(filter, context);
        return Utils.mapPage(inner, inner1 -> new LabServicesSkuImpl(inner1, this.manager()));
    }

    private SkusClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.labservices.LabServicesManager manager() {
        return this.serviceManager;
    }
}
