// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.models;

import com.azure.core.annotation.Fluent;

/** The connection state. */
@Fluent
public final class ConnectionPropertiesPrivateLinkServiceConnectionState extends ConnectionState {
    /** Creates an instance of ConnectionPropertiesPrivateLinkServiceConnectionState class. */
    public ConnectionPropertiesPrivateLinkServiceConnectionState() {
    }

    /** {@inheritDoc} */
    @Override
    public ConnectionPropertiesPrivateLinkServiceConnectionState withStatus(PrivateLinkServiceConnectionStatus status) {
        super.withStatus(status);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ConnectionPropertiesPrivateLinkServiceConnectionState withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ConnectionPropertiesPrivateLinkServiceConnectionState withActionsRequired(String actionsRequired) {
        super.withActionsRequired(actionsRequired);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
