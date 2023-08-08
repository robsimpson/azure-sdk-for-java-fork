// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of FileImports. */
public interface FileImports {
    /**
     * Gets all file imports.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all file imports as paginated response with {@link PagedIterable}.
     */
    PagedIterable<FileImport> list(String resourceGroupName, String workspaceName);

    /**
     * Gets all file imports.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param filter Filters the results, based on a Boolean condition. Optional.
     * @param orderby Sorts the results. Optional.
     * @param top Returns only the first n results. Optional.
     * @param skipToken Skiptoken is only used if a previous operation returned a partial result. If a previous response
     *     contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that
     *     specifies a starting point to use for subsequent calls. Optional.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all file imports as paginated response with {@link PagedIterable}.
     */
    PagedIterable<FileImport> list(
        String resourceGroupName,
        String workspaceName,
        String filter,
        String orderby,
        Integer top,
        String skipToken,
        Context context);

    /**
     * Gets a file import.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param fileImportId File import ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a file import.
     */
    FileImport get(String resourceGroupName, String workspaceName, String fileImportId);

    /**
     * Gets a file import.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param fileImportId File import ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a file import along with {@link Response}.
     */
    Response<FileImport> getWithResponse(
        String resourceGroupName, String workspaceName, String fileImportId, Context context);

    /**
     * Delete the file import.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param fileImportId File import ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a file import in Azure Security Insights.
     */
    FileImport delete(String resourceGroupName, String workspaceName, String fileImportId);

    /**
     * Delete the file import.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param fileImportId File import ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a file import in Azure Security Insights.
     */
    FileImport delete(String resourceGroupName, String workspaceName, String fileImportId, Context context);

    /**
     * Gets a file import.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a file import along with {@link Response}.
     */
    FileImport getById(String id);

    /**
     * Gets a file import.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a file import along with {@link Response}.
     */
    Response<FileImport> getByIdWithResponse(String id, Context context);

    /**
     * Delete the file import.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a file import in Azure Security Insights.
     */
    FileImport deleteById(String id);

    /**
     * Delete the file import.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a file import in Azure Security Insights.
     */
    FileImport deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new FileImport resource.
     *
     * @param name resource name.
     * @return the first stage of the new FileImport definition.
     */
    FileImport.DefinitionStages.Blank define(String name);
}
