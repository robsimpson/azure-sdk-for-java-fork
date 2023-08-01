// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** StaticSitesWorkflowPreview resource specific properties. */
@Immutable
public final class StaticSitesWorkflowPreviewProperties {
    /*
     * The path for the workflow file to be generated
     */
    @JsonProperty(value = "path", access = JsonProperty.Access.WRITE_ONLY)
    private String path;

    /*
     * The contents for the workflow file to be generated
     */
    @JsonProperty(value = "contents", access = JsonProperty.Access.WRITE_ONLY)
    private String contents;

    /** Creates an instance of StaticSitesWorkflowPreviewProperties class. */
    public StaticSitesWorkflowPreviewProperties() {
    }

    /**
     * Get the path property: The path for the workflow file to be generated.
     *
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Get the contents property: The contents for the workflow file to be generated.
     *
     * @return the contents value.
     */
    public String contents() {
        return this.contents;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
