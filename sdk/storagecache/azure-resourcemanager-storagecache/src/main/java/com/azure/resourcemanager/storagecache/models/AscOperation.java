// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.models;

import com.azure.resourcemanager.storagecache.fluent.models.AscOperationInner;
import java.util.Map;

/** An immutable client-side representation of AscOperation. */
public interface AscOperation {
    /**
     * Gets the id property: The operation Id.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The operation name.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the startTime property: The start time of the operation.
     *
     * @return the startTime value.
     */
    String startTime();

    /**
     * Gets the endTime property: The end time of the operation.
     *
     * @return the endTime value.
     */
    String endTime();

    /**
     * Gets the status property: The status of the operation.
     *
     * @return the status value.
     */
    String status();

    /**
     * Gets the error property: The error detail of the operation if any.
     *
     * @return the error value.
     */
    ErrorResponse error();

    /**
     * Gets the output property: Additional operation-specific output.
     *
     * @return the output value.
     */
    Map<String, Object> output();

    /**
     * Gets the inner com.azure.resourcemanager.storagecache.fluent.models.AscOperationInner object.
     *
     * @return the inner object.
     */
    AscOperationInner innerModel();
}
