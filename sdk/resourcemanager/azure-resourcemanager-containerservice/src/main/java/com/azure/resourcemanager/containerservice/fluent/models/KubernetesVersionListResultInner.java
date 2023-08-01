// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.containerservice.models.KubernetesVersion;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Hold values properties, which is array of KubernetesVersion. */
@Fluent
public final class KubernetesVersionListResultInner {
    /*
     * Array of AKS supported Kubernetes versions.
     */
    @JsonProperty(value = "values")
    private List<KubernetesVersion> values;

    /** Creates an instance of KubernetesVersionListResultInner class. */
    public KubernetesVersionListResultInner() {
    }

    /**
     * Get the values property: Array of AKS supported Kubernetes versions.
     *
     * @return the values value.
     */
    public List<KubernetesVersion> values() {
        return this.values;
    }

    /**
     * Set the values property: Array of AKS supported Kubernetes versions.
     *
     * @param values the values value to set.
     * @return the KubernetesVersionListResultInner object itself.
     */
    public KubernetesVersionListResultInner withValues(List<KubernetesVersion> values) {
        this.values = values;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (values() != null) {
            values().forEach(e -> e.validate());
        }
    }
}
