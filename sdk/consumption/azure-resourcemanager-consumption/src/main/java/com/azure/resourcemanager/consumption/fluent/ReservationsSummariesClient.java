// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.consumption.fluent.models.ReservationSummaryInner;
import com.azure.resourcemanager.consumption.models.Datagrain;

/** An instance of this class provides access to all the operations defined in ReservationsSummariesClient. */
public interface ReservationsSummariesClient {
    /**
     * Lists the reservations summaries for daily or monthly grain.
     *
     * @param reservationOrderId Order Id of the reservation.
     * @param grain Can be daily or monthly.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing reservation summaries.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ReservationSummaryInner> listByReservationOrder(String reservationOrderId, Datagrain grain);

    /**
     * Lists the reservations summaries for daily or monthly grain.
     *
     * @param reservationOrderId Order Id of the reservation.
     * @param grain Can be daily or monthly.
     * @param filter Required only for daily grain. The properties/UsageDate for start date and end date. The filter
     *     supports 'le' and 'ge'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing reservation summaries.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ReservationSummaryInner> listByReservationOrder(
        String reservationOrderId, Datagrain grain, String filter, Context context);

    /**
     * Lists the reservations summaries for daily or monthly grain.
     *
     * @param reservationOrderId Order Id of the reservation.
     * @param reservationId Id of the reservation.
     * @param grain Can be daily or monthly.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing reservation summaries.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ReservationSummaryInner> listByReservationOrderAndReservation(
        String reservationOrderId, String reservationId, Datagrain grain);

    /**
     * Lists the reservations summaries for daily or monthly grain.
     *
     * @param reservationOrderId Order Id of the reservation.
     * @param reservationId Id of the reservation.
     * @param grain Can be daily or monthly.
     * @param filter Required only for daily grain. The properties/UsageDate for start date and end date. The filter
     *     supports 'le' and 'ge'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing reservation summaries.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ReservationSummaryInner> listByReservationOrderAndReservation(
        String reservationOrderId, String reservationId, Datagrain grain, String filter, Context context);

    /**
     * Lists the reservations summaries for the defined scope daily or monthly grain.
     *
     * @param scope The scope associated with reservations summaries operations. This includes
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for BillingAccount scope (legacy), and
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     *     BillingProfile scope (modern).
     * @param grain Can be daily or monthly.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing reservation summaries.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ReservationSummaryInner> list(String scope, Datagrain grain);

    /**
     * Lists the reservations summaries for the defined scope daily or monthly grain.
     *
     * @param scope The scope associated with reservations summaries operations. This includes
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for BillingAccount scope (legacy), and
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     *     BillingProfile scope (modern).
     * @param grain Can be daily or monthly.
     * @param startDate Start date. Only applicable when querying with billing profile.
     * @param endDate End date. Only applicable when querying with billing profile.
     * @param filter Required only for daily grain. The properties/UsageDate for start date and end date. The filter
     *     supports 'le' and 'ge'. Not applicable when querying with billing profile.
     * @param reservationId Reservation Id GUID. Only valid if reservationOrderId is also provided. Filter to a specific
     *     reservation.
     * @param reservationOrderId Reservation Order Id GUID. Required if reservationId is provided. Filter to a specific
     *     reservation order.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing reservation summaries.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ReservationSummaryInner> list(
        String scope,
        Datagrain grain,
        String startDate,
        String endDate,
        String filter,
        String reservationId,
        String reservationOrderId,
        Context context);
}
