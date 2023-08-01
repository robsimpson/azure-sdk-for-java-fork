// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Fluent;

/** The ResourceProviderManifestFeaturesRule model. */
@Fluent
public final class ResourceProviderManifestFeaturesRule extends FeaturesRule {
    /** Creates an instance of ResourceProviderManifestFeaturesRule class. */
    public ResourceProviderManifestFeaturesRule() {
    }

    /** {@inheritDoc} */
    @Override
    public ResourceProviderManifestFeaturesRule withRequiredFeaturesPolicy(FeaturesPolicy requiredFeaturesPolicy) {
        super.withRequiredFeaturesPolicy(requiredFeaturesPolicy);
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
