// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.timeseriesinsights.fluent.models.IoTHubEventSourceMutableProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;

/** Parameters supplied to the Update Event Source operation to update an IoTHub event source. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("Microsoft.IoTHub")
@Fluent
public final class IoTHubEventSourceUpdateParameters extends EventSourceUpdateParameters {
    /*
     * Properties of the IoTHub event source.
     */
    @JsonProperty(value = "properties")
    private IoTHubEventSourceMutableProperties innerProperties;

    /** Creates an instance of IoTHubEventSourceUpdateParameters class. */
    public IoTHubEventSourceUpdateParameters() {
    }

    /**
     * Get the innerProperties property: Properties of the IoTHub event source.
     *
     * @return the innerProperties value.
     */
    private IoTHubEventSourceMutableProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public IoTHubEventSourceUpdateParameters withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the sharedAccessKey property: The value of the shared access key that grants the Time Series Insights service
     * read access to the iot hub. This property is not shown in event source responses.
     *
     * @return the sharedAccessKey value.
     */
    public String sharedAccessKey() {
        return this.innerProperties() == null ? null : this.innerProperties().sharedAccessKey();
    }

    /**
     * Set the sharedAccessKey property: The value of the shared access key that grants the Time Series Insights service
     * read access to the iot hub. This property is not shown in event source responses.
     *
     * @param sharedAccessKey the sharedAccessKey value to set.
     * @return the IoTHubEventSourceUpdateParameters object itself.
     */
    public IoTHubEventSourceUpdateParameters withSharedAccessKey(String sharedAccessKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IoTHubEventSourceMutableProperties();
        }
        this.innerProperties().withSharedAccessKey(sharedAccessKey);
        return this;
    }

    /**
     * Get the timestampPropertyName property: The event property that will be used as the event source's timestamp. If
     * a value isn't specified for timestampPropertyName, or if null or empty-string is specified, the event creation
     * time will be used.
     *
     * @return the timestampPropertyName value.
     */
    public String timestampPropertyName() {
        return this.innerProperties() == null ? null : this.innerProperties().timestampPropertyName();
    }

    /**
     * Set the timestampPropertyName property: The event property that will be used as the event source's timestamp. If
     * a value isn't specified for timestampPropertyName, or if null or empty-string is specified, the event creation
     * time will be used.
     *
     * @param timestampPropertyName the timestampPropertyName value to set.
     * @return the IoTHubEventSourceUpdateParameters object itself.
     */
    public IoTHubEventSourceUpdateParameters withTimestampPropertyName(String timestampPropertyName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IoTHubEventSourceMutableProperties();
        }
        this.innerProperties().withTimestampPropertyName(timestampPropertyName);
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
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
