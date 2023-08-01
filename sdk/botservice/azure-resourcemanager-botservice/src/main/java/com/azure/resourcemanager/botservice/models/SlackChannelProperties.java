// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The parameters to provide for the Slack channel. */
@Fluent
public final class SlackChannelProperties {
    /*
     * The Slack client id
     */
    @JsonProperty(value = "clientId")
    private String clientId;

    /*
     * The Slack client secret. Value only returned through POST to the action
     * Channel List API, otherwise empty.
     */
    @JsonProperty(value = "clientSecret")
    private String clientSecret;

    /*
     * The Slack verification token. Value only returned through POST to the
     * action Channel List API, otherwise empty.
     */
    @JsonProperty(value = "verificationToken")
    private String verificationToken;

    /*
     * The Slack permission scopes.
     */
    @JsonProperty(value = "scopes")
    private String scopes;

    /*
     * The Slack landing page Url
     */
    @JsonProperty(value = "landingPageUrl")
    private String landingPageUrl;

    /*
     * The Slack redirect action
     */
    @JsonProperty(value = "redirectAction", access = JsonProperty.Access.WRITE_ONLY)
    private String redirectAction;

    /*
     * The Sms auth token
     */
    @JsonProperty(value = "lastSubmissionId", access = JsonProperty.Access.WRITE_ONLY)
    private String lastSubmissionId;

    /*
     * Whether to register the settings before OAuth validation is performed.
     * Recommended to True.
     */
    @JsonProperty(value = "registerBeforeOAuthFlow")
    private Boolean registerBeforeOAuthFlow;

    /*
     * Whether this channel is validated for the bot
     */
    @JsonProperty(value = "IsValidated", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isValidated;

    /*
     * The Slack signing secret.
     */
    @JsonProperty(value = "signingSecret")
    private String signingSecret;

    /*
     * Whether this channel is enabled for the bot
     */
    @JsonProperty(value = "isEnabled", required = true)
    private boolean isEnabled;

    /**
     * Get the clientId property: The Slack client id.
     *
     * @return the clientId value.
     */
    public String clientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: The Slack client id.
     *
     * @param clientId the clientId value to set.
     * @return the SlackChannelProperties object itself.
     */
    public SlackChannelProperties withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the clientSecret property: The Slack client secret. Value only returned through POST to the action Channel
     * List API, otherwise empty.
     *
     * @return the clientSecret value.
     */
    public String clientSecret() {
        return this.clientSecret;
    }

    /**
     * Set the clientSecret property: The Slack client secret. Value only returned through POST to the action Channel
     * List API, otherwise empty.
     *
     * @param clientSecret the clientSecret value to set.
     * @return the SlackChannelProperties object itself.
     */
    public SlackChannelProperties withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * Get the verificationToken property: The Slack verification token. Value only returned through POST to the action
     * Channel List API, otherwise empty.
     *
     * @return the verificationToken value.
     */
    public String verificationToken() {
        return this.verificationToken;
    }

    /**
     * Set the verificationToken property: The Slack verification token. Value only returned through POST to the action
     * Channel List API, otherwise empty.
     *
     * @param verificationToken the verificationToken value to set.
     * @return the SlackChannelProperties object itself.
     */
    public SlackChannelProperties withVerificationToken(String verificationToken) {
        this.verificationToken = verificationToken;
        return this;
    }

    /**
     * Get the scopes property: The Slack permission scopes.
     *
     * @return the scopes value.
     */
    public String scopes() {
        return this.scopes;
    }

    /**
     * Set the scopes property: The Slack permission scopes.
     *
     * @param scopes the scopes value to set.
     * @return the SlackChannelProperties object itself.
     */
    public SlackChannelProperties withScopes(String scopes) {
        this.scopes = scopes;
        return this;
    }

    /**
     * Get the landingPageUrl property: The Slack landing page Url.
     *
     * @return the landingPageUrl value.
     */
    public String landingPageUrl() {
        return this.landingPageUrl;
    }

    /**
     * Set the landingPageUrl property: The Slack landing page Url.
     *
     * @param landingPageUrl the landingPageUrl value to set.
     * @return the SlackChannelProperties object itself.
     */
    public SlackChannelProperties withLandingPageUrl(String landingPageUrl) {
        this.landingPageUrl = landingPageUrl;
        return this;
    }

    /**
     * Get the redirectAction property: The Slack redirect action.
     *
     * @return the redirectAction value.
     */
    public String redirectAction() {
        return this.redirectAction;
    }

    /**
     * Get the lastSubmissionId property: The Sms auth token.
     *
     * @return the lastSubmissionId value.
     */
    public String lastSubmissionId() {
        return this.lastSubmissionId;
    }

    /**
     * Get the registerBeforeOAuthFlow property: Whether to register the settings before OAuth validation is performed.
     * Recommended to True.
     *
     * @return the registerBeforeOAuthFlow value.
     */
    public Boolean registerBeforeOAuthFlow() {
        return this.registerBeforeOAuthFlow;
    }

    /**
     * Set the registerBeforeOAuthFlow property: Whether to register the settings before OAuth validation is performed.
     * Recommended to True.
     *
     * @param registerBeforeOAuthFlow the registerBeforeOAuthFlow value to set.
     * @return the SlackChannelProperties object itself.
     */
    public SlackChannelProperties withRegisterBeforeOAuthFlow(Boolean registerBeforeOAuthFlow) {
        this.registerBeforeOAuthFlow = registerBeforeOAuthFlow;
        return this;
    }

    /**
     * Get the isValidated property: Whether this channel is validated for the bot.
     *
     * @return the isValidated value.
     */
    public Boolean isValidated() {
        return this.isValidated;
    }

    /**
     * Get the signingSecret property: The Slack signing secret.
     *
     * @return the signingSecret value.
     */
    public String signingSecret() {
        return this.signingSecret;
    }

    /**
     * Set the signingSecret property: The Slack signing secret.
     *
     * @param signingSecret the signingSecret value to set.
     * @return the SlackChannelProperties object itself.
     */
    public SlackChannelProperties withSigningSecret(String signingSecret) {
        this.signingSecret = signingSecret;
        return this;
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
     * @return the SlackChannelProperties object itself.
     */
    public SlackChannelProperties withIsEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
