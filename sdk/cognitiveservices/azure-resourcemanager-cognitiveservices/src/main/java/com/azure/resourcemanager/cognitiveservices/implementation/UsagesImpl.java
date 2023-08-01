// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cognitiveservices.fluent.UsagesClient;
import com.azure.resourcemanager.cognitiveservices.fluent.models.UsageInner;
import com.azure.resourcemanager.cognitiveservices.models.Usage;
import com.azure.resourcemanager.cognitiveservices.models.Usages;

public final class UsagesImpl implements Usages {
    private static final ClientLogger LOGGER = new ClientLogger(UsagesImpl.class);

    private final UsagesClient innerClient;

    private final com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager serviceManager;

    public UsagesImpl(
        UsagesClient innerClient, com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Usage> list(String location) {
        PagedIterable<UsageInner> inner = this.serviceClient().list(location);
        return Utils.mapPage(inner, inner1 -> new UsageImpl(inner1, this.manager()));
    }

    public PagedIterable<Usage> list(String location, String filter, Context context) {
        PagedIterable<UsageInner> inner = this.serviceClient().list(location, filter, context);
        return Utils.mapPage(inner, inner1 -> new UsageImpl(inner1, this.manager()));
    }

    private UsagesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager() {
        return this.serviceManager;
    }
}
