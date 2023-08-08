// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.data.tables.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.util.ArrayList;
import java.util.List;

/** Table Service Properties. */
@JacksonXmlRootElement(localName = "StorageServiceProperties")
@Fluent
public final class TableServiceProperties {
    /*
     * Azure Analytics Logging settings.
     */
    @JsonProperty(value = "Logging")
    private Logging logging;

    /*
     * A summary of request statistics grouped by API in hourly aggregates for tables.
     */
    @JsonProperty(value = "HourMetrics")
    private Metrics hourMetrics;

    /*
     * A summary of request statistics grouped by API in minute aggregates for tables.
     */
    @JsonProperty(value = "MinuteMetrics")
    private Metrics minuteMetrics;

    private static final class CorsWrapper {
        @JacksonXmlProperty(localName = "CorsRule")
        private final List<CorsRule> items;

        @JsonCreator
        private CorsWrapper(@JacksonXmlProperty(localName = "CorsRule") List<CorsRule> items) {
            this.items = items;
        }
    }

    /*
     * The set of CORS rules.
     */
    @JsonProperty(value = "Cors")
    private CorsWrapper cors;

    /** Creates an instance of TableServiceProperties class. */
    public TableServiceProperties() {}

    /**
     * Get the logging property: Azure Analytics Logging settings.
     *
     * @return the logging value.
     */
    public Logging getLogging() {
        return this.logging;
    }

    /**
     * Set the logging property: Azure Analytics Logging settings.
     *
     * @param logging the logging value to set.
     * @return the TableServiceProperties object itself.
     */
    public TableServiceProperties setLogging(Logging logging) {
        this.logging = logging;
        return this;
    }

    /**
     * Get the hourMetrics property: A summary of request statistics grouped by API in hourly aggregates for tables.
     *
     * @return the hourMetrics value.
     */
    public Metrics getHourMetrics() {
        return this.hourMetrics;
    }

    /**
     * Set the hourMetrics property: A summary of request statistics grouped by API in hourly aggregates for tables.
     *
     * @param hourMetrics the hourMetrics value to set.
     * @return the TableServiceProperties object itself.
     */
    public TableServiceProperties setHourMetrics(Metrics hourMetrics) {
        this.hourMetrics = hourMetrics;
        return this;
    }

    /**
     * Get the minuteMetrics property: A summary of request statistics grouped by API in minute aggregates for tables.
     *
     * @return the minuteMetrics value.
     */
    public Metrics getMinuteMetrics() {
        return this.minuteMetrics;
    }

    /**
     * Set the minuteMetrics property: A summary of request statistics grouped by API in minute aggregates for tables.
     *
     * @param minuteMetrics the minuteMetrics value to set.
     * @return the TableServiceProperties object itself.
     */
    public TableServiceProperties setMinuteMetrics(Metrics minuteMetrics) {
        this.minuteMetrics = minuteMetrics;
        return this;
    }

    /**
     * Get the cors property: The set of CORS rules.
     *
     * @return the cors value.
     */
    public List<CorsRule> getCors() {
        if (this.cors == null) {
            this.cors = new CorsWrapper(new ArrayList<CorsRule>());
        }
        return this.cors.items;
    }

    /**
     * Set the cors property: The set of CORS rules.
     *
     * @param cors the cors value to set.
     * @return the TableServiceProperties object itself.
     */
    public TableServiceProperties setCors(List<CorsRule> cors) {
        this.cors = new CorsWrapper(cors);
        return this;
    }
}
