// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Web App stack runtimes. */
@Immutable
public final class WebAppRuntimes {
    /*
     * Linux-specific settings associated with the minor version.
     */
    @JsonProperty(value = "linuxRuntimeSettings", access = JsonProperty.Access.WRITE_ONLY)
    private WebAppRuntimeSettings linuxRuntimeSettings;

    /*
     * Windows-specific settings associated with the minor version.
     */
    @JsonProperty(value = "windowsRuntimeSettings", access = JsonProperty.Access.WRITE_ONLY)
    private WebAppRuntimeSettings windowsRuntimeSettings;

    /*
     * Linux-specific settings associated with the Java container minor version.
     */
    @JsonProperty(value = "linuxContainerSettings", access = JsonProperty.Access.WRITE_ONLY)
    private LinuxJavaContainerSettings linuxContainerSettings;

    /*
     * Windows-specific settings associated with the Java container minor version.
     */
    @JsonProperty(value = "windowsContainerSettings", access = JsonProperty.Access.WRITE_ONLY)
    private WindowsJavaContainerSettings windowsContainerSettings;

    /** Creates an instance of WebAppRuntimes class. */
    public WebAppRuntimes() {
    }

    /**
     * Get the linuxRuntimeSettings property: Linux-specific settings associated with the minor version.
     *
     * @return the linuxRuntimeSettings value.
     */
    public WebAppRuntimeSettings linuxRuntimeSettings() {
        return this.linuxRuntimeSettings;
    }

    /**
     * Get the windowsRuntimeSettings property: Windows-specific settings associated with the minor version.
     *
     * @return the windowsRuntimeSettings value.
     */
    public WebAppRuntimeSettings windowsRuntimeSettings() {
        return this.windowsRuntimeSettings;
    }

    /**
     * Get the linuxContainerSettings property: Linux-specific settings associated with the Java container minor
     * version.
     *
     * @return the linuxContainerSettings value.
     */
    public LinuxJavaContainerSettings linuxContainerSettings() {
        return this.linuxContainerSettings;
    }

    /**
     * Get the windowsContainerSettings property: Windows-specific settings associated with the Java container minor
     * version.
     *
     * @return the windowsContainerSettings value.
     */
    public WindowsJavaContainerSettings windowsContainerSettings() {
        return this.windowsContainerSettings;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (linuxRuntimeSettings() != null) {
            linuxRuntimeSettings().validate();
        }
        if (windowsRuntimeSettings() != null) {
            windowsRuntimeSettings().validate();
        }
        if (linuxContainerSettings() != null) {
            linuxContainerSettings().validate();
        }
        if (windowsContainerSettings() != null) {
            windowsContainerSettings().validate();
        }
    }
}
