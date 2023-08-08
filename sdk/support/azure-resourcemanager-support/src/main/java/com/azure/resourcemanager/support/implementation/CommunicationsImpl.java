// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.support.fluent.CommunicationsClient;
import com.azure.resourcemanager.support.fluent.models.CheckNameAvailabilityOutputInner;
import com.azure.resourcemanager.support.fluent.models.CommunicationDetailsInner;
import com.azure.resourcemanager.support.models.CheckNameAvailabilityInput;
import com.azure.resourcemanager.support.models.CheckNameAvailabilityOutput;
import com.azure.resourcemanager.support.models.CommunicationDetails;
import com.azure.resourcemanager.support.models.Communications;

public final class CommunicationsImpl implements Communications {
    private static final ClientLogger LOGGER = new ClientLogger(CommunicationsImpl.class);

    private final CommunicationsClient innerClient;

    private final com.azure.resourcemanager.support.SupportManager serviceManager;

    public CommunicationsImpl(
        CommunicationsClient innerClient, com.azure.resourcemanager.support.SupportManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<CheckNameAvailabilityOutput> checkNameAvailabilityWithResponse(
        String supportTicketName, CheckNameAvailabilityInput checkNameAvailabilityInput, Context context) {
        Response<CheckNameAvailabilityOutputInner> inner =
            this
                .serviceClient()
                .checkNameAvailabilityWithResponse(supportTicketName, checkNameAvailabilityInput, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CheckNameAvailabilityOutputImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CheckNameAvailabilityOutput checkNameAvailability(
        String supportTicketName, CheckNameAvailabilityInput checkNameAvailabilityInput) {
        CheckNameAvailabilityOutputInner inner =
            this.serviceClient().checkNameAvailability(supportTicketName, checkNameAvailabilityInput);
        if (inner != null) {
            return new CheckNameAvailabilityOutputImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<CommunicationDetails> list(String supportTicketName) {
        PagedIterable<CommunicationDetailsInner> inner = this.serviceClient().list(supportTicketName);
        return Utils.mapPage(inner, inner1 -> new CommunicationDetailsImpl(inner1, this.manager()));
    }

    public PagedIterable<CommunicationDetails> list(
        String supportTicketName, Integer top, String filter, Context context) {
        PagedIterable<CommunicationDetailsInner> inner =
            this.serviceClient().list(supportTicketName, top, filter, context);
        return Utils.mapPage(inner, inner1 -> new CommunicationDetailsImpl(inner1, this.manager()));
    }

    public Response<CommunicationDetails> getWithResponse(
        String supportTicketName, String communicationName, Context context) {
        Response<CommunicationDetailsInner> inner =
            this.serviceClient().getWithResponse(supportTicketName, communicationName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CommunicationDetailsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CommunicationDetails get(String supportTicketName, String communicationName) {
        CommunicationDetailsInner inner = this.serviceClient().get(supportTicketName, communicationName);
        if (inner != null) {
            return new CommunicationDetailsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public CommunicationDetails getById(String id) {
        String supportTicketName = Utils.getValueFromIdByName(id, "supportTickets");
        if (supportTicketName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'supportTickets'.", id)));
        }
        String communicationName = Utils.getValueFromIdByName(id, "communications");
        if (communicationName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'communications'.", id)));
        }
        return this.getWithResponse(supportTicketName, communicationName, Context.NONE).getValue();
    }

    public Response<CommunicationDetails> getByIdWithResponse(String id, Context context) {
        String supportTicketName = Utils.getValueFromIdByName(id, "supportTickets");
        if (supportTicketName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'supportTickets'.", id)));
        }
        String communicationName = Utils.getValueFromIdByName(id, "communications");
        if (communicationName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'communications'.", id)));
        }
        return this.getWithResponse(supportTicketName, communicationName, context);
    }

    private CommunicationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.support.SupportManager manager() {
        return this.serviceManager;
    }

    public CommunicationDetailsImpl define(String name) {
        return new CommunicationDetailsImpl(name, this.manager());
    }
}
