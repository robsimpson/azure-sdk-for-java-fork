// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mysql.fluent.AdvisorsClient;
import com.azure.resourcemanager.mysql.fluent.models.AdvisorInner;
import com.azure.resourcemanager.mysql.models.Advisor;
import com.azure.resourcemanager.mysql.models.Advisors;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class AdvisorsImpl implements Advisors {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AdvisorsImpl.class);

    private final AdvisorsClient innerClient;

    private final com.azure.resourcemanager.mysql.MySqlManager serviceManager;

    public AdvisorsImpl(AdvisorsClient innerClient, com.azure.resourcemanager.mysql.MySqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Advisor get(String resourceGroupName, String serverName, String advisorName) {
        AdvisorInner inner = this.serviceClient().get(resourceGroupName, serverName, advisorName);
        if (inner != null) {
            return new AdvisorImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Advisor> getWithResponse(
        String resourceGroupName, String serverName, String advisorName, Context context) {
        Response<AdvisorInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, serverName, advisorName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AdvisorImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<Advisor> listByServer(String resourceGroupName, String serverName) {
        PagedIterable<AdvisorInner> inner = this.serviceClient().listByServer(resourceGroupName, serverName);
        return Utils.mapPage(inner, inner1 -> new AdvisorImpl(inner1, this.manager()));
    }

    public PagedIterable<Advisor> listByServer(String resourceGroupName, String serverName, Context context) {
        PagedIterable<AdvisorInner> inner = this.serviceClient().listByServer(resourceGroupName, serverName, context);
        return Utils.mapPage(inner, inner1 -> new AdvisorImpl(inner1, this.manager()));
    }

    private AdvisorsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.mysql.MySqlManager manager() {
        return this.serviceManager;
    }
}
