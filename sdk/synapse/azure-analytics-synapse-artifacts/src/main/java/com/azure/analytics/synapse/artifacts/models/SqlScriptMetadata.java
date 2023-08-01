// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** The metadata of the SQL script. */
@Fluent
public final class SqlScriptMetadata {
    /*
     * The language of the SQL script.
     */
    @JsonProperty(value = "language")
    private String language;

    /*
     * The metadata of the SQL script.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /** Creates an instance of SqlScriptMetadata class. */
    public SqlScriptMetadata() {}

    /**
     * Get the language property: The language of the SQL script.
     *
     * @return the language value.
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * Set the language property: The language of the SQL script.
     *
     * @param language the language value to set.
     * @return the SqlScriptMetadata object itself.
     */
    public SqlScriptMetadata setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Get the additionalProperties property: The metadata of the SQL script.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: The metadata of the SQL script.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the SqlScriptMetadata object itself.
     */
    public SqlScriptMetadata setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void setAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }
}
