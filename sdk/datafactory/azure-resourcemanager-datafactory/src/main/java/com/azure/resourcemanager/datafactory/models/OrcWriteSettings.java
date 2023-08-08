// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Orc write settings. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("OrcWriteSettings")
@Fluent
public final class OrcWriteSettings extends FormatWriteSettings {
    /*
     * Limit the written file's row count to be smaller than or equal to the specified count. Type: integer (or
     * Expression with resultType integer).
     */
    @JsonProperty(value = "maxRowsPerFile")
    private Object maxRowsPerFile;

    /*
     * Specifies the file name pattern <fileNamePrefix>_<fileIndex>.<fileExtension> when copy from non-file based store
     * without partitionOptions. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "fileNamePrefix")
    private Object fileNamePrefix;

    /** Creates an instance of OrcWriteSettings class. */
    public OrcWriteSettings() {
    }

    /**
     * Get the maxRowsPerFile property: Limit the written file's row count to be smaller than or equal to the specified
     * count. Type: integer (or Expression with resultType integer).
     *
     * @return the maxRowsPerFile value.
     */
    public Object maxRowsPerFile() {
        return this.maxRowsPerFile;
    }

    /**
     * Set the maxRowsPerFile property: Limit the written file's row count to be smaller than or equal to the specified
     * count. Type: integer (or Expression with resultType integer).
     *
     * @param maxRowsPerFile the maxRowsPerFile value to set.
     * @return the OrcWriteSettings object itself.
     */
    public OrcWriteSettings withMaxRowsPerFile(Object maxRowsPerFile) {
        this.maxRowsPerFile = maxRowsPerFile;
        return this;
    }

    /**
     * Get the fileNamePrefix property: Specifies the file name pattern
     * &lt;fileNamePrefix&gt;_&lt;fileIndex&gt;.&lt;fileExtension&gt; when copy from non-file based store without
     * partitionOptions. Type: string (or Expression with resultType string).
     *
     * @return the fileNamePrefix value.
     */
    public Object fileNamePrefix() {
        return this.fileNamePrefix;
    }

    /**
     * Set the fileNamePrefix property: Specifies the file name pattern
     * &lt;fileNamePrefix&gt;_&lt;fileIndex&gt;.&lt;fileExtension&gt; when copy from non-file based store without
     * partitionOptions. Type: string (or Expression with resultType string).
     *
     * @param fileNamePrefix the fileNamePrefix value to set.
     * @return the OrcWriteSettings object itself.
     */
    public OrcWriteSettings withFileNamePrefix(Object fileNamePrefix) {
        this.fileNamePrefix = fileNamePrefix;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
