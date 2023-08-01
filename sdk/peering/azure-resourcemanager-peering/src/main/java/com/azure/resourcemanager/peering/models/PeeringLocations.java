// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/** Resource collection API of PeeringLocations. */
public interface PeeringLocations {
    /**
     * Lists all of the available peering locations for the specified kind of peering.
     *
     * @param kind The kind of the peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated list of peering locations as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PeeringLocation> list(PeeringLocationsKind kind);

    /**
     * Lists all of the available peering locations for the specified kind of peering.
     *
     * @param kind The kind of the peering.
     * @param directPeeringType The type of direct peering.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated list of peering locations as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PeeringLocation> list(
        PeeringLocationsKind kind, PeeringLocationsDirectPeeringType directPeeringType, Context context);
}
