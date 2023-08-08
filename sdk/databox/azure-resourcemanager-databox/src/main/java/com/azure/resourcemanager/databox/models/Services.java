// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Services. */
public interface Services {
    /**
     * This method provides the list of available skus for the given subscription, resource group and location.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param location The location of the resource.
     * @param availableSkuRequest Filters for showing the available skus.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the available skus operation response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SkuInformation> listAvailableSkusByResourceGroup(
        String resourceGroupName, String location, AvailableSkuRequest availableSkuRequest);

    /**
     * This method provides the list of available skus for the given subscription, resource group and location.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param location The location of the resource.
     * @param availableSkuRequest Filters for showing the available skus.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the available skus operation response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SkuInformation> listAvailableSkusByResourceGroup(
        String resourceGroupName, String location, AvailableSkuRequest availableSkuRequest, Context context);

    /**
     * [DEPRECATED NOTICE: This operation will soon be removed]. This method validates the customer shipping address and
     * provide alternate addresses if any.
     *
     * @param location The location of the resource.
     * @param validateAddress Shipping address of the customer.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of the address validation api along with {@link Response}.
     */
    Response<AddressValidationOutput> validateAddressWithResponse(
        String location, ValidateAddress validateAddress, Context context);

    /**
     * [DEPRECATED NOTICE: This operation will soon be removed]. This method validates the customer shipping address and
     * provide alternate addresses if any.
     *
     * @param location The location of the resource.
     * @param validateAddress Shipping address of the customer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of the address validation api.
     */
    AddressValidationOutput validateAddress(String location, ValidateAddress validateAddress);

    /**
     * This method does all necessary pre-job creation validation under resource group.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param location The location of the resource.
     * @param validationRequest Inputs of the customer.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of pre job creation validations along with {@link Response}.
     */
    Response<ValidationResponse> validateInputsByResourceGroupWithResponse(
        String resourceGroupName, String location, ValidationRequest validationRequest, Context context);

    /**
     * This method does all necessary pre-job creation validation under resource group.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param location The location of the resource.
     * @param validationRequest Inputs of the customer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of pre job creation validations.
     */
    ValidationResponse validateInputsByResourceGroup(
        String resourceGroupName, String location, ValidationRequest validationRequest);

    /**
     * This method does all necessary pre-job creation validation under subscription.
     *
     * @param location The location of the resource.
     * @param validationRequest Inputs of the customer.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of pre job creation validations along with {@link Response}.
     */
    Response<ValidationResponse> validateInputsWithResponse(
        String location, ValidationRequest validationRequest, Context context);

    /**
     * This method does all necessary pre-job creation validation under subscription.
     *
     * @param location The location of the resource.
     * @param validationRequest Inputs of the customer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of pre job creation validations.
     */
    ValidationResponse validateInputs(String location, ValidationRequest validationRequest);

    /**
     * This API provides configuration details specific to given region/location at Subscription level.
     *
     * @param location The location of the resource.
     * @param regionConfigurationRequest Request body to get the configuration for the region.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration response specific to a region along with {@link Response}.
     */
    Response<RegionConfigurationResponse> regionConfigurationWithResponse(
        String location, RegionConfigurationRequest regionConfigurationRequest, Context context);

    /**
     * This API provides configuration details specific to given region/location at Subscription level.
     *
     * @param location The location of the resource.
     * @param regionConfigurationRequest Request body to get the configuration for the region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration response specific to a region.
     */
    RegionConfigurationResponse regionConfiguration(
        String location, RegionConfigurationRequest regionConfigurationRequest);

    /**
     * This API provides configuration details specific to given region/location at Resource group level.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param location The location of the resource.
     * @param regionConfigurationRequest Request body to get the configuration for the region at resource group level.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration response specific to a region along with {@link Response}.
     */
    Response<RegionConfigurationResponse> regionConfigurationByResourceGroupWithResponse(
        String resourceGroupName,
        String location,
        RegionConfigurationRequest regionConfigurationRequest,
        Context context);

    /**
     * This API provides configuration details specific to given region/location at Resource group level.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param location The location of the resource.
     * @param regionConfigurationRequest Request body to get the configuration for the region at resource group level.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configuration response specific to a region.
     */
    RegionConfigurationResponse regionConfigurationByResourceGroup(
        String resourceGroupName, String location, RegionConfigurationRequest regionConfigurationRequest);
}
