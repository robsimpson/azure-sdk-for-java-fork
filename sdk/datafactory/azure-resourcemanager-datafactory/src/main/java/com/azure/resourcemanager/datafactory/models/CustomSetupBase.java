// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The base definition of the custom setup. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = CustomSetupBase.class)
@JsonTypeName("CustomSetupBase")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "CmdkeySetup", value = CmdkeySetup.class),
    @JsonSubTypes.Type(name = "EnvironmentVariableSetup", value = EnvironmentVariableSetup.class),
    @JsonSubTypes.Type(name = "ComponentSetup", value = ComponentSetup.class),
    @JsonSubTypes.Type(name = "AzPowerShellSetup", value = AzPowerShellSetup.class)
})
@Immutable
public class CustomSetupBase {
    /** Creates an instance of CustomSetupBase class. */
    public CustomSetupBase() {
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
