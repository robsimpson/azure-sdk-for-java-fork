// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devhub.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.devhub.fluent.models.ArtifactGenerationProperties;
import java.util.Map;

/** Resource collection API of ResourceProviders. */
public interface ResourceProviders {
    /**
     * Gets GitHubOAuth info used to authenticate users with the Developer Hub GitHub App.
     *
     * @param location The name of Azure region.
     * @param parameters GitHubOAuth request object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return gitHubOAuth info used to authenticate users with the Developer Hub GitHub App along with {@link
     *     Response}.
     */
    Response<GitHubOAuthInfoResponse> gitHubOAuthWithResponse(
        String location, GitHubOAuthCallRequest parameters, Context context);

    /**
     * Gets GitHubOAuth info used to authenticate users with the Developer Hub GitHub App.
     *
     * @param location The name of Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return gitHubOAuth info used to authenticate users with the Developer Hub GitHub App.
     */
    GitHubOAuthInfoResponse gitHubOAuth(String location);

    /**
     * Callback URL to hit once authenticated with GitHub App to have the service store the OAuth token.
     *
     * @param location The name of Azure region.
     * @param code The code response from authenticating the GitHub App.
     * @param state The state response from authenticating the GitHub App.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return singleton response of GitHubOAuth containing along with {@link Response}.
     */
    Response<GitHubOAuthResponse> gitHubOAuthCallbackWithResponse(
        String location, String code, String state, Context context);

    /**
     * Callback URL to hit once authenticated with GitHub App to have the service store the OAuth token.
     *
     * @param location The name of Azure region.
     * @param code The code response from authenticating the GitHub App.
     * @param state The state response from authenticating the GitHub App.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return singleton response of GitHubOAuth containing.
     */
    GitHubOAuthResponse gitHubOAuthCallback(String location, String code, String state);

    /**
     * Callback URL to hit once authenticated with GitHub App to have the service store the OAuth token.
     *
     * @param location The name of Azure region.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from List GitHubOAuth operation along with {@link Response}.
     */
    Response<GitHubOAuthListResponse> listGitHubOAuthWithResponse(String location, Context context);

    /**
     * Callback URL to hit once authenticated with GitHub App to have the service store the OAuth token.
     *
     * @param location The name of Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from List GitHubOAuth operation.
     */
    GitHubOAuthListResponse listGitHubOAuth(String location);

    /**
     * Generate preview dockerfile and manifests.
     *
     * @param location The name of Azure region.
     * @param parameters Properties used for generating artifacts such as Dockerfiles and manifests.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return dockerfile and manifest artifacts generated as a preview are returned as a map&lt;path string,content
     *     string&gt; along with {@link Response}.
     */
    Response<Map<String, String>> generatePreviewArtifactsWithResponse(
        String location, ArtifactGenerationProperties parameters, Context context);

    /**
     * Generate preview dockerfile and manifests.
     *
     * @param location The name of Azure region.
     * @param parameters Properties used for generating artifacts such as Dockerfiles and manifests.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return dockerfile and manifest artifacts generated as a preview are returned as a map&lt;path string,content
     *     string&gt;.
     */
    Map<String, String> generatePreviewArtifacts(String location, ArtifactGenerationProperties parameters);
}
