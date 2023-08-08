// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Enum to determine forecast horizon selection mode. */
public final class ForecastHorizonMode extends ExpandableStringEnum<ForecastHorizonMode> {
    /** Static value Auto for ForecastHorizonMode. */
    public static final ForecastHorizonMode AUTO = fromString("Auto");

    /** Static value Custom for ForecastHorizonMode. */
    public static final ForecastHorizonMode CUSTOM = fromString("Custom");

    /**
     * Creates a new instance of ForecastHorizonMode value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ForecastHorizonMode() {
    }

    /**
     * Creates or finds a ForecastHorizonMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ForecastHorizonMode.
     */
    @JsonCreator
    public static ForecastHorizonMode fromString(String name) {
        return fromString(name, ForecastHorizonMode.class);
    }

    /**
     * Gets known ForecastHorizonMode values.
     *
     * @return known ForecastHorizonMode values.
     */
    public static Collection<ForecastHorizonMode> values() {
        return values(ForecastHorizonMode.class);
    }
}
