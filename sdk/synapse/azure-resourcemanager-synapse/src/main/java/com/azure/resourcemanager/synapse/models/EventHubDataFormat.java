// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The data format of the message. Optionally the data format can be added to each message. */
public final class EventHubDataFormat extends ExpandableStringEnum<EventHubDataFormat> {
    /** Static value MULTIJSON for EventHubDataFormat. */
    public static final EventHubDataFormat MULTIJSON = fromString("MULTIJSON");

    /** Static value JSON for EventHubDataFormat. */
    public static final EventHubDataFormat JSON = fromString("JSON");

    /** Static value CSV for EventHubDataFormat. */
    public static final EventHubDataFormat CSV = fromString("CSV");

    /** Static value TSV for EventHubDataFormat. */
    public static final EventHubDataFormat TSV = fromString("TSV");

    /** Static value SCSV for EventHubDataFormat. */
    public static final EventHubDataFormat SCSV = fromString("SCSV");

    /** Static value SOHSV for EventHubDataFormat. */
    public static final EventHubDataFormat SOHSV = fromString("SOHSV");

    /** Static value PSV for EventHubDataFormat. */
    public static final EventHubDataFormat PSV = fromString("PSV");

    /** Static value TXT for EventHubDataFormat. */
    public static final EventHubDataFormat TXT = fromString("TXT");

    /** Static value RAW for EventHubDataFormat. */
    public static final EventHubDataFormat RAW = fromString("RAW");

    /** Static value SINGLEJSON for EventHubDataFormat. */
    public static final EventHubDataFormat SINGLEJSON = fromString("SINGLEJSON");

    /** Static value AVRO for EventHubDataFormat. */
    public static final EventHubDataFormat AVRO = fromString("AVRO");

    /** Static value TSVE for EventHubDataFormat. */
    public static final EventHubDataFormat TSVE = fromString("TSVE");

    /** Static value PARQUET for EventHubDataFormat. */
    public static final EventHubDataFormat PARQUET = fromString("PARQUET");

    /** Static value ORC for EventHubDataFormat. */
    public static final EventHubDataFormat ORC = fromString("ORC");

    /** Static value APACHEAVRO for EventHubDataFormat. */
    public static final EventHubDataFormat APACHEAVRO = fromString("APACHEAVRO");

    /** Static value W3CLOGFILE for EventHubDataFormat. */
    public static final EventHubDataFormat W3CLOGFILE = fromString("W3CLOGFILE");

    /**
     * Creates a new instance of EventHubDataFormat value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public EventHubDataFormat() {
    }

    /**
     * Creates or finds a EventHubDataFormat from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EventHubDataFormat.
     */
    @JsonCreator
    public static EventHubDataFormat fromString(String name) {
        return fromString(name, EventHubDataFormat.class);
    }

    /**
     * Gets known EventHubDataFormat values.
     *
     * @return known EventHubDataFormat values.
     */
    public static Collection<EventHubDataFormat> values() {
        return values(EventHubDataFormat.class);
    }
}
