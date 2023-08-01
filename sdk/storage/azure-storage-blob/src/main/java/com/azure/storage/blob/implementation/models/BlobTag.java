// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/** The BlobTag model. */
@JacksonXmlRootElement(localName = "Tag")
@Fluent
public final class BlobTag {
    /*
     * The Key property.
     */
    @JsonProperty(value = "Key", required = true)
    private String key;

    /*
     * The Value property.
     */
    @JsonProperty(value = "Value", required = true)
    private String value;

    /** Creates an instance of BlobTag class. */
    public BlobTag() {}

    /**
     * Get the key property: The Key property.
     *
     * @return the key value.
     */
    public String getKey() {
        return this.key;
    }

    /**
     * Set the key property: The Key property.
     *
     * @param key the key value to set.
     * @return the BlobTag object itself.
     */
    public BlobTag setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the value property: The Value property.
     *
     * @return the value value.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Set the value property: The Value property.
     *
     * @param value the value value to set.
     * @return the BlobTag object itself.
     */
    public BlobTag setValue(String value) {
        this.value = value;
        return this;
    }
}
