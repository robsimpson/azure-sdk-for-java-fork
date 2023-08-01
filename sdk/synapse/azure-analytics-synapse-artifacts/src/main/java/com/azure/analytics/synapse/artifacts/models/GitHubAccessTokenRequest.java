// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The GitHubAccessTokenRequest model. */
@Fluent
public final class GitHubAccessTokenRequest {
    /*
     * The GitHub Client Id.
     */
    @JsonProperty(value = "gitHubClientId", required = true)
    private String gitHubClientId;

    /*
     * The GitHub Access code.
     */
    @JsonProperty(value = "gitHubAccessCode", required = true)
    private String gitHubAccessCode;

    /*
     * The GitHub access token base URL.
     */
    @JsonProperty(value = "gitHubAccessTokenBaseUrl", required = true)
    private String gitHubAccessTokenBaseUrl;

    /** Creates an instance of GitHubAccessTokenRequest class. */
    public GitHubAccessTokenRequest() {}

    /**
     * Get the gitHubClientId property: The GitHub Client Id.
     *
     * @return the gitHubClientId value.
     */
    public String getGitHubClientId() {
        return this.gitHubClientId;
    }

    /**
     * Set the gitHubClientId property: The GitHub Client Id.
     *
     * @param gitHubClientId the gitHubClientId value to set.
     * @return the GitHubAccessTokenRequest object itself.
     */
    public GitHubAccessTokenRequest setGitHubClientId(String gitHubClientId) {
        this.gitHubClientId = gitHubClientId;
        return this;
    }

    /**
     * Get the gitHubAccessCode property: The GitHub Access code.
     *
     * @return the gitHubAccessCode value.
     */
    public String getGitHubAccessCode() {
        return this.gitHubAccessCode;
    }

    /**
     * Set the gitHubAccessCode property: The GitHub Access code.
     *
     * @param gitHubAccessCode the gitHubAccessCode value to set.
     * @return the GitHubAccessTokenRequest object itself.
     */
    public GitHubAccessTokenRequest setGitHubAccessCode(String gitHubAccessCode) {
        this.gitHubAccessCode = gitHubAccessCode;
        return this;
    }

    /**
     * Get the gitHubAccessTokenBaseUrl property: The GitHub access token base URL.
     *
     * @return the gitHubAccessTokenBaseUrl value.
     */
    public String getGitHubAccessTokenBaseUrl() {
        return this.gitHubAccessTokenBaseUrl;
    }

    /**
     * Set the gitHubAccessTokenBaseUrl property: The GitHub access token base URL.
     *
     * @param gitHubAccessTokenBaseUrl the gitHubAccessTokenBaseUrl value to set.
     * @return the GitHubAccessTokenRequest object itself.
     */
    public GitHubAccessTokenRequest setGitHubAccessTokenBaseUrl(String gitHubAccessTokenBaseUrl) {
        this.gitHubAccessTokenBaseUrl = gitHubAccessTokenBaseUrl;
        return this;
    }
}
