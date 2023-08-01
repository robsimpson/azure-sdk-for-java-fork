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
import java.util.Map;

/** workbookChartGridlinesFormat. */
@Fluent
public final class MicrosoftGraphWorkbookChartGridlinesFormat extends MicrosoftGraphEntity {
    /*
     * workbookChartLineFormat
     */
    @JsonProperty(value = "line")
    private MicrosoftGraphWorkbookChartLineFormat line;

    /*
     * workbookChartGridlinesFormat
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /** Creates an instance of MicrosoftGraphWorkbookChartGridlinesFormat class. */
    public MicrosoftGraphWorkbookChartGridlinesFormat() {
    }

    /**
     * Get the line property: workbookChartLineFormat.
     *
     * @return the line value.
     */
    public MicrosoftGraphWorkbookChartLineFormat line() {
        return this.line;
    }

    /**
     * Set the line property: workbookChartLineFormat.
     *
     * @param line the line value to set.
     * @return the MicrosoftGraphWorkbookChartGridlinesFormat object itself.
     */
    public MicrosoftGraphWorkbookChartGridlinesFormat withLine(MicrosoftGraphWorkbookChartLineFormat line) {
        this.line = line;
        return this;
    }

    /**
     * Get the additionalProperties property: workbookChartGridlinesFormat.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: workbookChartGridlinesFormat.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphWorkbookChartGridlinesFormat object itself.
     */
    public MicrosoftGraphWorkbookChartGridlinesFormat withAdditionalProperties(
        Map<String, Object> additionalProperties) {
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

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphWorkbookChartGridlinesFormat withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (line() != null) {
            line().validate();
        }
    }
}
