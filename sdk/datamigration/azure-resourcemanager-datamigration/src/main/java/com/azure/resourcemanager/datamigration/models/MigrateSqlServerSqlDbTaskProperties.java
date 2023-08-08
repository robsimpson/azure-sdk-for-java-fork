// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Properties for the task that migrates on-prem SQL Server databases to Azure SQL Database. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "taskType")
@JsonTypeName("Migrate.SqlServer.SqlDb")
@Fluent
public final class MigrateSqlServerSqlDbTaskProperties extends ProjectTaskProperties {
    /*
     * Task input
     */
    @JsonProperty(value = "input")
    private MigrateSqlServerSqlDbTaskInput input;

    /*
     * Task output. This is ignored if submitted.
     */
    @JsonProperty(value = "output", access = JsonProperty.Access.WRITE_ONLY)
    private List<MigrateSqlServerSqlDbTaskOutput> output;

    /** Creates an instance of MigrateSqlServerSqlDbTaskProperties class. */
    public MigrateSqlServerSqlDbTaskProperties() {
    }

    /**
     * Get the input property: Task input.
     *
     * @return the input value.
     */
    public MigrateSqlServerSqlDbTaskInput input() {
        return this.input;
    }

    /**
     * Set the input property: Task input.
     *
     * @param input the input value to set.
     * @return the MigrateSqlServerSqlDbTaskProperties object itself.
     */
    public MigrateSqlServerSqlDbTaskProperties withInput(MigrateSqlServerSqlDbTaskInput input) {
        this.input = input;
        return this;
    }

    /**
     * Get the output property: Task output. This is ignored if submitted.
     *
     * @return the output value.
     */
    public List<MigrateSqlServerSqlDbTaskOutput> output() {
        return this.output;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (input() != null) {
            input().validate();
        }
        if (output() != null) {
            output().forEach(e -> e.validate());
        }
    }
}
