// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Azure ML Execute Pipeline activity properties. */
@Fluent
public final class AzureMLExecutePipelineActivityTypeProperties {
    /*
     * ID of the published Azure ML pipeline. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "mlPipelineId")
    private Object mlPipelineId;

    /*
     * ID of the published Azure ML pipeline endpoint. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "mlPipelineEndpointId")
    private Object mlPipelineEndpointId;

    /*
     * Version of the published Azure ML pipeline endpoint. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "version")
    private Object version;

    /*
     * Run history experiment name of the pipeline run. This information will be passed in the ExperimentName property
     * of the published pipeline execution request. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "experimentName")
    private Object experimentName;

    /*
     * Key,Value pairs to be passed to the published Azure ML pipeline endpoint. Keys must match the names of pipeline
     * parameters defined in the published pipeline. Values will be passed in the ParameterAssignments property of the
     * published pipeline execution request. Type: object with key value pairs (or Expression with resultType object).
     */
    @JsonProperty(value = "mlPipelineParameters")
    private Object mlPipelineParameters;

    /*
     * Dictionary used for changing data path assignments without retraining. Values will be passed in the
     * dataPathAssignments property of the published pipeline execution request. Type: object with key value pairs (or
     * Expression with resultType object).
     */
    @JsonProperty(value = "dataPathAssignments")
    private Object dataPathAssignments;

    /*
     * The parent Azure ML Service pipeline run id. This information will be passed in the ParentRunId property of the
     * published pipeline execution request. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "mlParentRunId")
    private Object mlParentRunId;

    /*
     * Whether to continue execution of other steps in the PipelineRun if a step fails. This information will be passed
     * in the continueOnStepFailure property of the published pipeline execution request. Type: boolean (or Expression
     * with resultType boolean).
     */
    @JsonProperty(value = "continueOnStepFailure")
    private Object continueOnStepFailure;

    /** Creates an instance of AzureMLExecutePipelineActivityTypeProperties class. */
    public AzureMLExecutePipelineActivityTypeProperties() {
    }

    /**
     * Get the mlPipelineId property: ID of the published Azure ML pipeline. Type: string (or Expression with resultType
     * string).
     *
     * @return the mlPipelineId value.
     */
    public Object mlPipelineId() {
        return this.mlPipelineId;
    }

    /**
     * Set the mlPipelineId property: ID of the published Azure ML pipeline. Type: string (or Expression with resultType
     * string).
     *
     * @param mlPipelineId the mlPipelineId value to set.
     * @return the AzureMLExecutePipelineActivityTypeProperties object itself.
     */
    public AzureMLExecutePipelineActivityTypeProperties withMlPipelineId(Object mlPipelineId) {
        this.mlPipelineId = mlPipelineId;
        return this;
    }

    /**
     * Get the mlPipelineEndpointId property: ID of the published Azure ML pipeline endpoint. Type: string (or
     * Expression with resultType string).
     *
     * @return the mlPipelineEndpointId value.
     */
    public Object mlPipelineEndpointId() {
        return this.mlPipelineEndpointId;
    }

    /**
     * Set the mlPipelineEndpointId property: ID of the published Azure ML pipeline endpoint. Type: string (or
     * Expression with resultType string).
     *
     * @param mlPipelineEndpointId the mlPipelineEndpointId value to set.
     * @return the AzureMLExecutePipelineActivityTypeProperties object itself.
     */
    public AzureMLExecutePipelineActivityTypeProperties withMlPipelineEndpointId(Object mlPipelineEndpointId) {
        this.mlPipelineEndpointId = mlPipelineEndpointId;
        return this;
    }

    /**
     * Get the version property: Version of the published Azure ML pipeline endpoint. Type: string (or Expression with
     * resultType string).
     *
     * @return the version value.
     */
    public Object version() {
        return this.version;
    }

    /**
     * Set the version property: Version of the published Azure ML pipeline endpoint. Type: string (or Expression with
     * resultType string).
     *
     * @param version the version value to set.
     * @return the AzureMLExecutePipelineActivityTypeProperties object itself.
     */
    public AzureMLExecutePipelineActivityTypeProperties withVersion(Object version) {
        this.version = version;
        return this;
    }

    /**
     * Get the experimentName property: Run history experiment name of the pipeline run. This information will be passed
     * in the ExperimentName property of the published pipeline execution request. Type: string (or Expression with
     * resultType string).
     *
     * @return the experimentName value.
     */
    public Object experimentName() {
        return this.experimentName;
    }

    /**
     * Set the experimentName property: Run history experiment name of the pipeline run. This information will be passed
     * in the ExperimentName property of the published pipeline execution request. Type: string (or Expression with
     * resultType string).
     *
     * @param experimentName the experimentName value to set.
     * @return the AzureMLExecutePipelineActivityTypeProperties object itself.
     */
    public AzureMLExecutePipelineActivityTypeProperties withExperimentName(Object experimentName) {
        this.experimentName = experimentName;
        return this;
    }

    /**
     * Get the mlPipelineParameters property: Key,Value pairs to be passed to the published Azure ML pipeline endpoint.
     * Keys must match the names of pipeline parameters defined in the published pipeline. Values will be passed in the
     * ParameterAssignments property of the published pipeline execution request. Type: object with key value pairs (or
     * Expression with resultType object).
     *
     * @return the mlPipelineParameters value.
     */
    public Object mlPipelineParameters() {
        return this.mlPipelineParameters;
    }

    /**
     * Set the mlPipelineParameters property: Key,Value pairs to be passed to the published Azure ML pipeline endpoint.
     * Keys must match the names of pipeline parameters defined in the published pipeline. Values will be passed in the
     * ParameterAssignments property of the published pipeline execution request. Type: object with key value pairs (or
     * Expression with resultType object).
     *
     * @param mlPipelineParameters the mlPipelineParameters value to set.
     * @return the AzureMLExecutePipelineActivityTypeProperties object itself.
     */
    public AzureMLExecutePipelineActivityTypeProperties withMlPipelineParameters(Object mlPipelineParameters) {
        this.mlPipelineParameters = mlPipelineParameters;
        return this;
    }

    /**
     * Get the dataPathAssignments property: Dictionary used for changing data path assignments without retraining.
     * Values will be passed in the dataPathAssignments property of the published pipeline execution request. Type:
     * object with key value pairs (or Expression with resultType object).
     *
     * @return the dataPathAssignments value.
     */
    public Object dataPathAssignments() {
        return this.dataPathAssignments;
    }

    /**
     * Set the dataPathAssignments property: Dictionary used for changing data path assignments without retraining.
     * Values will be passed in the dataPathAssignments property of the published pipeline execution request. Type:
     * object with key value pairs (or Expression with resultType object).
     *
     * @param dataPathAssignments the dataPathAssignments value to set.
     * @return the AzureMLExecutePipelineActivityTypeProperties object itself.
     */
    public AzureMLExecutePipelineActivityTypeProperties withDataPathAssignments(Object dataPathAssignments) {
        this.dataPathAssignments = dataPathAssignments;
        return this;
    }

    /**
     * Get the mlParentRunId property: The parent Azure ML Service pipeline run id. This information will be passed in
     * the ParentRunId property of the published pipeline execution request. Type: string (or Expression with resultType
     * string).
     *
     * @return the mlParentRunId value.
     */
    public Object mlParentRunId() {
        return this.mlParentRunId;
    }

    /**
     * Set the mlParentRunId property: The parent Azure ML Service pipeline run id. This information will be passed in
     * the ParentRunId property of the published pipeline execution request. Type: string (or Expression with resultType
     * string).
     *
     * @param mlParentRunId the mlParentRunId value to set.
     * @return the AzureMLExecutePipelineActivityTypeProperties object itself.
     */
    public AzureMLExecutePipelineActivityTypeProperties withMlParentRunId(Object mlParentRunId) {
        this.mlParentRunId = mlParentRunId;
        return this;
    }

    /**
     * Get the continueOnStepFailure property: Whether to continue execution of other steps in the PipelineRun if a step
     * fails. This information will be passed in the continueOnStepFailure property of the published pipeline execution
     * request. Type: boolean (or Expression with resultType boolean).
     *
     * @return the continueOnStepFailure value.
     */
    public Object continueOnStepFailure() {
        return this.continueOnStepFailure;
    }

    /**
     * Set the continueOnStepFailure property: Whether to continue execution of other steps in the PipelineRun if a step
     * fails. This information will be passed in the continueOnStepFailure property of the published pipeline execution
     * request. Type: boolean (or Expression with resultType boolean).
     *
     * @param continueOnStepFailure the continueOnStepFailure value to set.
     * @return the AzureMLExecutePipelineActivityTypeProperties object itself.
     */
    public AzureMLExecutePipelineActivityTypeProperties withContinueOnStepFailure(Object continueOnStepFailure) {
        this.continueOnStepFailure = continueOnStepFailure;
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
