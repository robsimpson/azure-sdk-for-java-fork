// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;
import java.util.List;

/** Classification Training related configuration. */
@Fluent
public final class ClassificationTrainingSettings extends TrainingSettings {
    /*
     * Allowed models for classification task.
     */
    @JsonProperty(value = "allowedTrainingAlgorithms")
    private List<ClassificationModels> allowedTrainingAlgorithms;

    /*
     * Blocked models for classification task.
     */
    @JsonProperty(value = "blockedTrainingAlgorithms")
    private List<ClassificationModels> blockedTrainingAlgorithms;

    /** Creates an instance of ClassificationTrainingSettings class. */
    public ClassificationTrainingSettings() {
    }

    /**
     * Get the allowedTrainingAlgorithms property: Allowed models for classification task.
     *
     * @return the allowedTrainingAlgorithms value.
     */
    public List<ClassificationModels> allowedTrainingAlgorithms() {
        return this.allowedTrainingAlgorithms;
    }

    /**
     * Set the allowedTrainingAlgorithms property: Allowed models for classification task.
     *
     * @param allowedTrainingAlgorithms the allowedTrainingAlgorithms value to set.
     * @return the ClassificationTrainingSettings object itself.
     */
    public ClassificationTrainingSettings withAllowedTrainingAlgorithms(
        List<ClassificationModels> allowedTrainingAlgorithms) {
        this.allowedTrainingAlgorithms = allowedTrainingAlgorithms;
        return this;
    }

    /**
     * Get the blockedTrainingAlgorithms property: Blocked models for classification task.
     *
     * @return the blockedTrainingAlgorithms value.
     */
    public List<ClassificationModels> blockedTrainingAlgorithms() {
        return this.blockedTrainingAlgorithms;
    }

    /**
     * Set the blockedTrainingAlgorithms property: Blocked models for classification task.
     *
     * @param blockedTrainingAlgorithms the blockedTrainingAlgorithms value to set.
     * @return the ClassificationTrainingSettings object itself.
     */
    public ClassificationTrainingSettings withBlockedTrainingAlgorithms(
        List<ClassificationModels> blockedTrainingAlgorithms) {
        this.blockedTrainingAlgorithms = blockedTrainingAlgorithms;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ClassificationTrainingSettings withEnableDnnTraining(Boolean enableDnnTraining) {
        super.withEnableDnnTraining(enableDnnTraining);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ClassificationTrainingSettings withEnableModelExplainability(Boolean enableModelExplainability) {
        super.withEnableModelExplainability(enableModelExplainability);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ClassificationTrainingSettings withEnableOnnxCompatibleModels(Boolean enableOnnxCompatibleModels) {
        super.withEnableOnnxCompatibleModels(enableOnnxCompatibleModels);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ClassificationTrainingSettings withEnableStackEnsemble(Boolean enableStackEnsemble) {
        super.withEnableStackEnsemble(enableStackEnsemble);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ClassificationTrainingSettings withEnableVoteEnsemble(Boolean enableVoteEnsemble) {
        super.withEnableVoteEnsemble(enableVoteEnsemble);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ClassificationTrainingSettings withEnsembleModelDownloadTimeout(Duration ensembleModelDownloadTimeout) {
        super.withEnsembleModelDownloadTimeout(ensembleModelDownloadTimeout);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ClassificationTrainingSettings withStackEnsembleSettings(StackEnsembleSettings stackEnsembleSettings) {
        super.withStackEnsembleSettings(stackEnsembleSettings);
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
