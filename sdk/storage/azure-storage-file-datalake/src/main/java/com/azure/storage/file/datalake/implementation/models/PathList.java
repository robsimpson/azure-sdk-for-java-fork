// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.storage.file.datalake.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.util.ArrayList;
import java.util.List;

/** The PathList model. */
@JacksonXmlRootElement(localName = "PathList")
@Fluent
public final class PathList {

    /*
     * The paths property.
     */
    @JsonProperty("paths")
    private List<Path> paths = new ArrayList<>();

    /** Creates an instance of PathList class. */
    public PathList() {}

    /**
     * Get the paths property: The paths property.
     *
     * @return the paths value.
     */
    public List<Path> getPaths() {
        return this.paths;
    }

    /**
     * Set the paths property: The paths property.
     *
     * @param paths the paths value to set.
     * @return the PathList object itself.
     */
    public PathList setPaths(List<Path> paths) {
        this.paths = paths;
        return this;
    }
}
