// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/** Resource collection API of Fields. */
public interface Fields {
    /**
     * Retrieve a list of fields of a given type identified by module name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param moduleName The name of module.
     * @param typeName The name of type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the list fields operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<TypeField> listByType(
        String resourceGroupName, String automationAccountName, String moduleName, String typeName);

    /**
     * Retrieve a list of fields of a given type identified by module name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param moduleName The name of module.
     * @param typeName The name of type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the list fields operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<TypeField> listByType(
        String resourceGroupName, String automationAccountName, String moduleName, String typeName, Context context);
}
