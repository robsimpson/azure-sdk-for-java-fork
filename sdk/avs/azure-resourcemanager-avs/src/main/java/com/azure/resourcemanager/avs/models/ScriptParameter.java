// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An parameter that the script will accept. */
@Fluent
public final class ScriptParameter {
    /*
     * The type of parameter the script is expecting. psCredential is a PSCredentialObject
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private ScriptParameterTypes type;

    /*
     * The parameter name that the script will expect a parameter value for
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * User friendly description of the parameter
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /*
     * Should this parameter be visible to arm and passed in the parameters argument when executing
     */
    @JsonProperty(value = "visibility", access = JsonProperty.Access.WRITE_ONLY)
    private VisibilityParameterEnum visibility;

    /*
     * Is this parameter required or optional
     */
    @JsonProperty(value = "optional", access = JsonProperty.Access.WRITE_ONLY)
    private OptionalParamEnum optional;

    /** Creates an instance of ScriptParameter class. */
    public ScriptParameter() {
    }

    /**
     * Get the type property: The type of parameter the script is expecting. psCredential is a PSCredentialObject.
     *
     * @return the type value.
     */
    public ScriptParameterTypes type() {
        return this.type;
    }

    /**
     * Get the name property: The parameter name that the script will expect a parameter value for.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The parameter name that the script will expect a parameter value for.
     *
     * @param name the name value to set.
     * @return the ScriptParameter object itself.
     */
    public ScriptParameter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the description property: User friendly description of the parameter.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the visibility property: Should this parameter be visible to arm and passed in the parameters argument when
     * executing.
     *
     * @return the visibility value.
     */
    public VisibilityParameterEnum visibility() {
        return this.visibility;
    }

    /**
     * Get the optional property: Is this parameter required or optional.
     *
     * @return the optional value.
     */
    public OptionalParamEnum optional() {
        return this.optional;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
