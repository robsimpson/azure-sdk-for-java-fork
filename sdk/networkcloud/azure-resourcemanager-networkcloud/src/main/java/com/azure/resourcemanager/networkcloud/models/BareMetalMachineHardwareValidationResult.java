// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The outcome of the hardware validation. */
public final class BareMetalMachineHardwareValidationResult
    extends ExpandableStringEnum<BareMetalMachineHardwareValidationResult> {
    /** Static value Pass for BareMetalMachineHardwareValidationResult. */
    public static final BareMetalMachineHardwareValidationResult PASS = fromString("Pass");

    /** Static value Fail for BareMetalMachineHardwareValidationResult. */
    public static final BareMetalMachineHardwareValidationResult FAIL = fromString("Fail");

    /**
     * Creates a new instance of BareMetalMachineHardwareValidationResult value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public BareMetalMachineHardwareValidationResult() {
    }

    /**
     * Creates or finds a BareMetalMachineHardwareValidationResult from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding BareMetalMachineHardwareValidationResult.
     */
    @JsonCreator
    public static BareMetalMachineHardwareValidationResult fromString(String name) {
        return fromString(name, BareMetalMachineHardwareValidationResult.class);
    }

    /**
     * Gets known BareMetalMachineHardwareValidationResult values.
     *
     * @return known BareMetalMachineHardwareValidationResult values.
     */
    public static Collection<BareMetalMachineHardwareValidationResult> values() {
        return values(BareMetalMachineHardwareValidationResult.class);
    }
}
