// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.botservice.fluent.models.BotChannelInner;
import com.azure.resourcemanager.botservice.models.RegenerateKeysChannelName;
import com.azure.resourcemanager.botservice.models.SiteInfo;

/** An instance of this class provides access to all the operations defined in DirectLinesClient. */
public interface DirectLinesClient {
    /**
     * Regenerates secret keys and returns them for the DirectLine Channel of a particular BotService resource.
     *
     * @param resourceGroupName The name of the Bot resource group in the user subscription.
     * @param resourceName The name of the Bot resource.
     * @param channelName The name of the Channel resource for which keys are to be regenerated.
     * @param parameters The parameters to provide for the created bot.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return bot channel resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BotChannelInner regenerateKeys(
        String resourceGroupName, String resourceName, RegenerateKeysChannelName channelName, SiteInfo parameters);

    /**
     * Regenerates secret keys and returns them for the DirectLine Channel of a particular BotService resource.
     *
     * @param resourceGroupName The name of the Bot resource group in the user subscription.
     * @param resourceName The name of the Bot resource.
     * @param channelName The name of the Channel resource for which keys are to be regenerated.
     * @param parameters The parameters to provide for the created bot.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return bot channel resource definition along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<BotChannelInner> regenerateKeysWithResponse(
        String resourceGroupName,
        String resourceName,
        RegenerateKeysChannelName channelName,
        SiteInfo parameters,
        Context context);
}
