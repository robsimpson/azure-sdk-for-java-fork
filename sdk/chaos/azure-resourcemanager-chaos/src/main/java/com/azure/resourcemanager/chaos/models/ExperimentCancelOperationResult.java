// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.models;

import com.azure.resourcemanager.chaos.fluent.models.ExperimentCancelOperationResultInner;

/** An immutable client-side representation of ExperimentCancelOperationResult. */
public interface ExperimentCancelOperationResult {
    /**
     * Gets the name property: String of the Experiment name.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the statusUrl property: URL to retrieve the Experiment status.
     *
     * @return the statusUrl value.
     */
    String statusUrl();

    /**
     * Gets the inner com.azure.resourcemanager.chaos.fluent.models.ExperimentCancelOperationResultInner object.
     *
     * @return the inner object.
     */
    ExperimentCancelOperationResultInner innerModel();
}
