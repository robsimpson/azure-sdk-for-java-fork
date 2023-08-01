// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** data used to implement value filter. */
public final class ValueType extends ExpandableStringEnum<ValueType> {
    /** Static value Value for ValueType. */
    public static final ValueType VALUE = fromString("Value");

    /** Static value Mean for ValueType. */
    public static final ValueType MEAN = fromString("Mean");

    /**
     * Creates a new instance of ValueType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ValueType() {}

    /**
     * Creates or finds a ValueType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ValueType.
     */
    @JsonCreator
    public static ValueType fromString(String name) {
        return fromString(name, ValueType.class);
    }

    /**
     * Gets known ValueType values.
     *
     * @return known ValueType values.
     */
    public static Collection<ValueType> values() {
        return values(ValueType.class);
    }
}
