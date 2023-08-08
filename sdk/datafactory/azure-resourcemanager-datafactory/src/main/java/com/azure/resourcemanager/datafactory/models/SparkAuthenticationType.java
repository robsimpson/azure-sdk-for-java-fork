// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The authentication method used to access the Spark server. */
public final class SparkAuthenticationType extends ExpandableStringEnum<SparkAuthenticationType> {
    /** Static value Anonymous for SparkAuthenticationType. */
    public static final SparkAuthenticationType ANONYMOUS = fromString("Anonymous");

    /** Static value Username for SparkAuthenticationType. */
    public static final SparkAuthenticationType USERNAME = fromString("Username");

    /** Static value UsernameAndPassword for SparkAuthenticationType. */
    public static final SparkAuthenticationType USERNAME_AND_PASSWORD = fromString("UsernameAndPassword");

    /** Static value WindowsAzureHDInsightService for SparkAuthenticationType. */
    public static final SparkAuthenticationType WINDOWS_AZURE_HDINSIGHT_SERVICE =
        fromString("WindowsAzureHDInsightService");

    /**
     * Creates a new instance of SparkAuthenticationType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SparkAuthenticationType() {
    }

    /**
     * Creates or finds a SparkAuthenticationType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SparkAuthenticationType.
     */
    @JsonCreator
    public static SparkAuthenticationType fromString(String name) {
        return fromString(name, SparkAuthenticationType.class);
    }

    /**
     * Gets known SparkAuthenticationType values.
     *
     * @return known SparkAuthenticationType values.
     */
    public static Collection<SparkAuthenticationType> values() {
        return values(SparkAuthenticationType.class);
    }
}
