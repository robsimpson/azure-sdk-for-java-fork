// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.billing.fluent.BillingPeriodsClient;
import com.azure.resourcemanager.billing.fluent.models.BillingPeriodInner;
import com.azure.resourcemanager.billing.models.BillingPeriod;
import com.azure.resourcemanager.billing.models.BillingPeriods;

public final class BillingPeriodsImpl implements BillingPeriods {
    private static final ClientLogger LOGGER = new ClientLogger(BillingPeriodsImpl.class);

    private final BillingPeriodsClient innerClient;

    private final com.azure.resourcemanager.billing.BillingManager serviceManager;

    public BillingPeriodsImpl(
        BillingPeriodsClient innerClient, com.azure.resourcemanager.billing.BillingManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<BillingPeriod> list() {
        PagedIterable<BillingPeriodInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new BillingPeriodImpl(inner1, this.manager()));
    }

    public PagedIterable<BillingPeriod> list(String filter, String skiptoken, Integer top, Context context) {
        PagedIterable<BillingPeriodInner> inner = this.serviceClient().list(filter, skiptoken, top, context);
        return Utils.mapPage(inner, inner1 -> new BillingPeriodImpl(inner1, this.manager()));
    }

    public Response<BillingPeriod> getWithResponse(String billingPeriodName, Context context) {
        Response<BillingPeriodInner> inner = this.serviceClient().getWithResponse(billingPeriodName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new BillingPeriodImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public BillingPeriod get(String billingPeriodName) {
        BillingPeriodInner inner = this.serviceClient().get(billingPeriodName);
        if (inner != null) {
            return new BillingPeriodImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private BillingPeriodsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.billing.BillingManager manager() {
        return this.serviceManager;
    }
}
