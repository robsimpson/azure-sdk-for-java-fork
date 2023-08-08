// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** SAP HANA Table properties. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SapHanaTable")
@JsonFlatten
@Fluent
public class SapHanaTableDataset extends Dataset {
    /*
     * The schema name of SAP HANA. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.schema")
    private Object schemaTypePropertiesSchema;

    /*
     * The table name of SAP HANA. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.table")
    private Object table;

    /** Creates an instance of SapHanaTableDataset class. */
    public SapHanaTableDataset() {}

    /**
     * Get the schemaTypePropertiesSchema property: The schema name of SAP HANA. Type: string (or Expression with
     * resultType string).
     *
     * @return the schemaTypePropertiesSchema value.
     */
    public Object getSchemaTypePropertiesSchema() {
        return this.schemaTypePropertiesSchema;
    }

    /**
     * Set the schemaTypePropertiesSchema property: The schema name of SAP HANA. Type: string (or Expression with
     * resultType string).
     *
     * @param schemaTypePropertiesSchema the schemaTypePropertiesSchema value to set.
     * @return the SapHanaTableDataset object itself.
     */
    public SapHanaTableDataset setSchemaTypePropertiesSchema(Object schemaTypePropertiesSchema) {
        this.schemaTypePropertiesSchema = schemaTypePropertiesSchema;
        return this;
    }

    /**
     * Get the table property: The table name of SAP HANA. Type: string (or Expression with resultType string).
     *
     * @return the table value.
     */
    public Object getTable() {
        return this.table;
    }

    /**
     * Set the table property: The table name of SAP HANA. Type: string (or Expression with resultType string).
     *
     * @param table the table value to set.
     * @return the SapHanaTableDataset object itself.
     */
    public SapHanaTableDataset setTable(Object table) {
        this.table = table;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SapHanaTableDataset setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SapHanaTableDataset setStructure(Object structure) {
        super.setStructure(structure);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SapHanaTableDataset setSchema(Object schema) {
        super.setSchema(schema);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SapHanaTableDataset setLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.setLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SapHanaTableDataset setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SapHanaTableDataset setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SapHanaTableDataset setFolder(DatasetFolder folder) {
        super.setFolder(folder);
        return this;
    }
}
