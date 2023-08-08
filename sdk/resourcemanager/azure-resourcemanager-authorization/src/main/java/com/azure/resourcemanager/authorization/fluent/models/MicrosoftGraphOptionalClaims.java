// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** optionalClaims. */
@Fluent
public final class MicrosoftGraphOptionalClaims {
    /*
     * The optional claims returned in the JWT access token.
     */
    @JsonProperty(value = "accessToken")
    private List<MicrosoftGraphOptionalClaim> accessToken;

    /*
     * The optional claims returned in the JWT ID token.
     */
    @JsonProperty(value = "idToken")
    private List<MicrosoftGraphOptionalClaim> idToken;

    /*
     * The optional claims returned in the SAML token.
     */
    @JsonProperty(value = "saml2Token")
    private List<MicrosoftGraphOptionalClaim> saml2Token;

    /*
     * optionalClaims
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /** Creates an instance of MicrosoftGraphOptionalClaims class. */
    public MicrosoftGraphOptionalClaims() {
    }

    /**
     * Get the accessToken property: The optional claims returned in the JWT access token.
     *
     * @return the accessToken value.
     */
    public List<MicrosoftGraphOptionalClaim> accessToken() {
        return this.accessToken;
    }

    /**
     * Set the accessToken property: The optional claims returned in the JWT access token.
     *
     * @param accessToken the accessToken value to set.
     * @return the MicrosoftGraphOptionalClaims object itself.
     */
    public MicrosoftGraphOptionalClaims withAccessToken(List<MicrosoftGraphOptionalClaim> accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * Get the idToken property: The optional claims returned in the JWT ID token.
     *
     * @return the idToken value.
     */
    public List<MicrosoftGraphOptionalClaim> idToken() {
        return this.idToken;
    }

    /**
     * Set the idToken property: The optional claims returned in the JWT ID token.
     *
     * @param idToken the idToken value to set.
     * @return the MicrosoftGraphOptionalClaims object itself.
     */
    public MicrosoftGraphOptionalClaims withIdToken(List<MicrosoftGraphOptionalClaim> idToken) {
        this.idToken = idToken;
        return this;
    }

    /**
     * Get the saml2Token property: The optional claims returned in the SAML token.
     *
     * @return the saml2Token value.
     */
    public List<MicrosoftGraphOptionalClaim> saml2Token() {
        return this.saml2Token;
    }

    /**
     * Set the saml2Token property: The optional claims returned in the SAML token.
     *
     * @param saml2Token the saml2Token value to set.
     * @return the MicrosoftGraphOptionalClaims object itself.
     */
    public MicrosoftGraphOptionalClaims withSaml2Token(List<MicrosoftGraphOptionalClaim> saml2Token) {
        this.saml2Token = saml2Token;
        return this;
    }

    /**
     * Get the additionalProperties property: optionalClaims.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: optionalClaims.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphOptionalClaims object itself.
     */
    public MicrosoftGraphOptionalClaims withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (accessToken() != null) {
            accessToken().forEach(e -> e.validate());
        }
        if (idToken() != null) {
            idToken().forEach(e -> e.validate());
        }
        if (saml2Token() != null) {
            saml2Token().forEach(e -> e.validate());
        }
    }
}
