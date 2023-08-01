// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.resourcemanager.synapse.fluent.models.SqlPoolColumnInner;

/** An immutable client-side representation of SqlPoolColumn. */
public interface SqlPoolColumn {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the columnType property: The column data type.
     *
     * @return the columnType value.
     */
    ColumnDataType columnType();

    /**
     * Gets the isComputed property: Indicates whether column value is computed or not.
     *
     * @return the isComputed value.
     */
    Boolean isComputed();

    /**
     * Gets the inner com.azure.resourcemanager.synapse.fluent.models.SqlPoolColumnInner object.
     *
     * @return the inner object.
     */
    SqlPoolColumnInner innerModel();
}
