// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The parameters to provide for the Facebook channel. */
@Fluent
public final class FacebookChannelProperties {
    /*
     * Verify token. Value only returned through POST to the action Channel
     * List API, otherwise empty.
     */
    @JsonProperty(value = "verifyToken", access = JsonProperty.Access.WRITE_ONLY)
    private String verifyToken;

    /*
     * The list of Facebook pages
     */
    @JsonProperty(value = "pages")
    private List<FacebookPage> pages;

    /*
     * Facebook application id
     */
    @JsonProperty(value = "appId", required = true)
    private String appId;

    /*
     * Facebook application secret. Value only returned through POST to the
     * action Channel List API, otherwise empty.
     */
    @JsonProperty(value = "appSecret")
    private String appSecret;

    /*
     * Callback Url
     */
    @JsonProperty(value = "callbackUrl", access = JsonProperty.Access.WRITE_ONLY)
    private String callbackUrl;

    /*
     * Whether this channel is enabled for the bot
     */
    @JsonProperty(value = "isEnabled", required = true)
    private boolean isEnabled;

    /**
     * Get the verifyToken property: Verify token. Value only returned through POST to the action Channel List API,
     * otherwise empty.
     *
     * @return the verifyToken value.
     */
    public String verifyToken() {
        return this.verifyToken;
    }

    /**
     * Get the pages property: The list of Facebook pages.
     *
     * @return the pages value.
     */
    public List<FacebookPage> pages() {
        return this.pages;
    }

    /**
     * Set the pages property: The list of Facebook pages.
     *
     * @param pages the pages value to set.
     * @return the FacebookChannelProperties object itself.
     */
    public FacebookChannelProperties withPages(List<FacebookPage> pages) {
        this.pages = pages;
        return this;
    }

    /**
     * Get the appId property: Facebook application id.
     *
     * @return the appId value.
     */
    public String appId() {
        return this.appId;
    }

    /**
     * Set the appId property: Facebook application id.
     *
     * @param appId the appId value to set.
     * @return the FacebookChannelProperties object itself.
     */
    public FacebookChannelProperties withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * Get the appSecret property: Facebook application secret. Value only returned through POST to the action Channel
     * List API, otherwise empty.
     *
     * @return the appSecret value.
     */
    public String appSecret() {
        return this.appSecret;
    }

    /**
     * Set the appSecret property: Facebook application secret. Value only returned through POST to the action Channel
     * List API, otherwise empty.
     *
     * @param appSecret the appSecret value to set.
     * @return the FacebookChannelProperties object itself.
     */
    public FacebookChannelProperties withAppSecret(String appSecret) {
        this.appSecret = appSecret;
        return this;
    }

    /**
     * Get the callbackUrl property: Callback Url.
     *
     * @return the callbackUrl value.
     */
    public String callbackUrl() {
        return this.callbackUrl;
    }

    /**
     * Get the isEnabled property: Whether this channel is enabled for the bot.
     *
     * @return the isEnabled value.
     */
    public boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * Set the isEnabled property: Whether this channel is enabled for the bot.
     *
     * @param isEnabled the isEnabled value to set.
     * @return the FacebookChannelProperties object itself.
     */
    public FacebookChannelProperties withIsEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (pages() != null) {
            pages().forEach(e -> e.validate());
        }
        if (appId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property appId in model FacebookChannelProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(FacebookChannelProperties.class);
}
