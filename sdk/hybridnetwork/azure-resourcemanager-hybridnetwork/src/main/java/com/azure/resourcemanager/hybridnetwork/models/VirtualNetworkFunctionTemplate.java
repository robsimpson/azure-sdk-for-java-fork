// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Virtual network function template.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "nfviType",
    defaultImpl = VirtualNetworkFunctionTemplate.class)
@JsonTypeName("VirtualNetworkFunctionTemplate")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AzureCore", value = AzureCoreNetworkFunctionTemplate.class),
    @JsonSubTypes.Type(name = "AzureOperatorNexus", value = AzureOperatorNexusNetworkFunctionTemplate.class) })
@Immutable
public class VirtualNetworkFunctionTemplate {
    /**
     * Creates an instance of VirtualNetworkFunctionTemplate class.
     */
    public VirtualNetworkFunctionTemplate() {
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
