// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.LocationBasedCapabilitiesClient;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.CapabilityPropertiesInner;
import com.azure.resourcemanager.mysqlflexibleserver.models.CapabilityProperties;
import com.azure.resourcemanager.mysqlflexibleserver.models.LocationBasedCapabilities;

public final class LocationBasedCapabilitiesImpl implements LocationBasedCapabilities {
    private static final ClientLogger LOGGER = new ClientLogger(LocationBasedCapabilitiesImpl.class);

    private final LocationBasedCapabilitiesClient innerClient;

    private final com.azure.resourcemanager.mysqlflexibleserver.MySqlManager serviceManager;

    public LocationBasedCapabilitiesImpl(
        LocationBasedCapabilitiesClient innerClient,
        com.azure.resourcemanager.mysqlflexibleserver.MySqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<CapabilityProperties> list(String locationName) {
        PagedIterable<CapabilityPropertiesInner> inner = this.serviceClient().list(locationName);
        return Utils.mapPage(inner, inner1 -> new CapabilityPropertiesImpl(inner1, this.manager()));
    }

    public PagedIterable<CapabilityProperties> list(String locationName, Context context) {
        PagedIterable<CapabilityPropertiesInner> inner = this.serviceClient().list(locationName, context);
        return Utils.mapPage(inner, inner1 -> new CapabilityPropertiesImpl(inner1, this.manager()));
    }

    private LocationBasedCapabilitiesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.mysqlflexibleserver.MySqlManager manager() {
        return this.serviceManager;
    }
}
