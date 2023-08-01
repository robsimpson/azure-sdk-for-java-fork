// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.translation.text.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The value of the transliteration property is a dictionary of (key, value) pairs. Each key is a BCP 47 language tag. A
 * key identifies a language for which text can be converted from one script to another script.
 */
@Immutable
public final class TransliterationLanguage {
    /*
     * Display name of the language in the locale requested via Accept-Language header.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Display name of the language in the locale native for this language.
     */
    @JsonProperty(value = "nativeName", required = true)
    private String nativeName;

    /*
     * List of scripts to convert from.
     */
    @JsonProperty(value = "scripts", required = true)
    private List<TransliterableScript> scripts;

    /**
     * Creates an instance of TransliterationLanguage class.
     *
     * @param name the name value to set.
     * @param nativeName the nativeName value to set.
     * @param scripts the scripts value to set.
     */
    @JsonCreator
    private TransliterationLanguage(
            @JsonProperty(value = "name", required = true) String name,
            @JsonProperty(value = "nativeName", required = true) String nativeName,
            @JsonProperty(value = "scripts", required = true) List<TransliterableScript> scripts) {
        this.name = name;
        this.nativeName = nativeName;
        this.scripts = scripts;
    }

    /**
     * Get the name property: Display name of the language in the locale requested via Accept-Language header.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the nativeName property: Display name of the language in the locale native for this language.
     *
     * @return the nativeName value.
     */
    public String getNativeName() {
        return this.nativeName;
    }

    /**
     * Get the scripts property: List of scripts to convert from.
     *
     * @return the scripts value.
     */
    public List<TransliterableScript> getScripts() {
        return this.scripts;
    }
}
