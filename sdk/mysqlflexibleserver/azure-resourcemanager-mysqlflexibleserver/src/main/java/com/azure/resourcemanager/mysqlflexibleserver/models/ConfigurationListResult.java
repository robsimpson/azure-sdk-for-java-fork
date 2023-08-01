// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.models;

import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.ConfigurationListResultInner;
import java.util.List;

/** An immutable client-side representation of ConfigurationListResult. */
public interface ConfigurationListResult {
    /**
     * Gets the value property: The list of server configurations.
     *
     * @return the value value.
     */
    List<Configuration> value();

    /**
     * Gets the nextLink property: The link used to get the next page of operations.
     *
     * @return the nextLink value.
     */
    String nextLink();

    /**
     * Gets the inner com.azure.resourcemanager.mysqlflexibleserver.fluent.models.ConfigurationListResultInner object.
     *
     * @return the inner object.
     */
    ConfigurationListResultInner innerModel();
}
