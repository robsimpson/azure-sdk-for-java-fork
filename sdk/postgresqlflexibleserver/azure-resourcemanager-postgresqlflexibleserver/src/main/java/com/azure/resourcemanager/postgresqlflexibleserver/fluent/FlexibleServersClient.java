// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.LtrBackupResponseInner;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.LtrPreBackupResponseInner;
import com.azure.resourcemanager.postgresqlflexibleserver.models.FlexibleServersTriggerLtrPreBackupResponse;
import com.azure.resourcemanager.postgresqlflexibleserver.models.LtrBackupRequest;
import com.azure.resourcemanager.postgresqlflexibleserver.models.LtrPreBackupRequest;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in FlexibleServersClient. */
public interface FlexibleServersClient {
    /**
     * PreBackup operation performs all the checks that are needed for the subsequent long term retention backup
     * operation to succeed.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param parameters Request body for operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the LTR pre-backup API call on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<FlexibleServersTriggerLtrPreBackupResponse> triggerLtrPreBackupWithResponseAsync(
        String resourceGroupName, String serverName, LtrPreBackupRequest parameters);

    /**
     * PreBackup operation performs all the checks that are needed for the subsequent long term retention backup
     * operation to succeed.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param parameters Request body for operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the LTR pre-backup API call on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<LtrPreBackupResponseInner> triggerLtrPreBackupAsync(
        String resourceGroupName, String serverName, LtrPreBackupRequest parameters);

    /**
     * PreBackup operation performs all the checks that are needed for the subsequent long term retention backup
     * operation to succeed.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param parameters Request body for operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the LTR pre-backup API call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FlexibleServersTriggerLtrPreBackupResponse triggerLtrPreBackupWithResponse(
        String resourceGroupName, String serverName, LtrPreBackupRequest parameters, Context context);

    /**
     * PreBackup operation performs all the checks that are needed for the subsequent long term retention backup
     * operation to succeed.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param parameters Request body for operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the LTR pre-backup API call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LtrPreBackupResponseInner triggerLtrPreBackup(
        String resourceGroupName, String serverName, LtrPreBackupRequest parameters);

    /**
     * Start the Long Term Retention Backup operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param parameters Request body for operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the LTR backup API call along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> startLtrBackupWithResponseAsync(
        String resourceGroupName, String serverName, LtrBackupRequest parameters);

    /**
     * Start the Long Term Retention Backup operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param parameters Request body for operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of response for the LTR backup API call.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<LtrBackupResponseInner>, LtrBackupResponseInner> beginStartLtrBackupAsync(
        String resourceGroupName, String serverName, LtrBackupRequest parameters);

    /**
     * Start the Long Term Retention Backup operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param parameters Request body for operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of response for the LTR backup API call.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<LtrBackupResponseInner>, LtrBackupResponseInner> beginStartLtrBackup(
        String resourceGroupName, String serverName, LtrBackupRequest parameters);

    /**
     * Start the Long Term Retention Backup operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param parameters Request body for operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of response for the LTR backup API call.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<LtrBackupResponseInner>, LtrBackupResponseInner> beginStartLtrBackup(
        String resourceGroupName, String serverName, LtrBackupRequest parameters, Context context);

    /**
     * Start the Long Term Retention Backup operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param parameters Request body for operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the LTR backup API call on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<LtrBackupResponseInner> startLtrBackupAsync(
        String resourceGroupName, String serverName, LtrBackupRequest parameters);

    /**
     * Start the Long Term Retention Backup operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param parameters Request body for operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the LTR backup API call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LtrBackupResponseInner startLtrBackup(String resourceGroupName, String serverName, LtrBackupRequest parameters);

    /**
     * Start the Long Term Retention Backup operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param parameters Request body for operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the LTR backup API call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LtrBackupResponseInner startLtrBackup(
        String resourceGroupName, String serverName, LtrBackupRequest parameters, Context context);
}
