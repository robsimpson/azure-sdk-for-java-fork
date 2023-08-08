// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storageimportexport.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A list of the blobs to be exported. */
@Fluent
public final class ExportBlobList {
    /*
     * A collection of blob-path strings.
     */
    @JsonProperty(value = "blobPath")
    private List<String> blobPath;

    /*
     * A collection of blob-prefix strings.
     */
    @JsonProperty(value = "blobPathPrefix")
    private List<String> blobPathPrefix;

    /** Creates an instance of ExportBlobList class. */
    public ExportBlobList() {
    }

    /**
     * Get the blobPath property: A collection of blob-path strings.
     *
     * @return the blobPath value.
     */
    public List<String> blobPath() {
        return this.blobPath;
    }

    /**
     * Set the blobPath property: A collection of blob-path strings.
     *
     * @param blobPath the blobPath value to set.
     * @return the ExportBlobList object itself.
     */
    public ExportBlobList withBlobPath(List<String> blobPath) {
        this.blobPath = blobPath;
        return this;
    }

    /**
     * Get the blobPathPrefix property: A collection of blob-prefix strings.
     *
     * @return the blobPathPrefix value.
     */
    public List<String> blobPathPrefix() {
        return this.blobPathPrefix;
    }

    /**
     * Set the blobPathPrefix property: A collection of blob-prefix strings.
     *
     * @param blobPathPrefix the blobPathPrefix value to set.
     * @return the ExportBlobList object itself.
     */
    public ExportBlobList withBlobPathPrefix(List<String> blobPathPrefix) {
        this.blobPathPrefix = blobPathPrefix;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
