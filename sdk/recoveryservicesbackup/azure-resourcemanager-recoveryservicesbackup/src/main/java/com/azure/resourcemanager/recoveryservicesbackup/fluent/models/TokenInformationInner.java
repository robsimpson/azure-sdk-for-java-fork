// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The token information details. */
@Fluent
public final class TokenInformationInner {
    /*
     * Token value.
     */
    @JsonProperty(value = "token")
    private String token;

    /*
     * Expiry time of token.
     */
    @JsonProperty(value = "expiryTimeInUtcTicks")
    private Long expiryTimeInUtcTicks;

    /*
     * Security PIN
     */
    @JsonProperty(value = "securityPIN")
    private String securityPin;

    /** Creates an instance of TokenInformationInner class. */
    public TokenInformationInner() {
    }

    /**
     * Get the token property: Token value.
     *
     * @return the token value.
     */
    public String token() {
        return this.token;
    }

    /**
     * Set the token property: Token value.
     *
     * @param token the token value to set.
     * @return the TokenInformationInner object itself.
     */
    public TokenInformationInner withToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * Get the expiryTimeInUtcTicks property: Expiry time of token.
     *
     * @return the expiryTimeInUtcTicks value.
     */
    public Long expiryTimeInUtcTicks() {
        return this.expiryTimeInUtcTicks;
    }

    /**
     * Set the expiryTimeInUtcTicks property: Expiry time of token.
     *
     * @param expiryTimeInUtcTicks the expiryTimeInUtcTicks value to set.
     * @return the TokenInformationInner object itself.
     */
    public TokenInformationInner withExpiryTimeInUtcTicks(Long expiryTimeInUtcTicks) {
        this.expiryTimeInUtcTicks = expiryTimeInUtcTicks;
        return this;
    }

    /**
     * Get the securityPin property: Security PIN.
     *
     * @return the securityPin value.
     */
    public String securityPin() {
        return this.securityPin;
    }

    /**
     * Set the securityPin property: Security PIN.
     *
     * @param securityPin the securityPin value to set.
     * @return the TokenInformationInner object itself.
     */
    public TokenInformationInner withSecurityPin(String securityPin) {
        this.securityPin = securityPin;
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
