// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Field Deprecated, the value will be ignored if provided. The indicator of whether one of the specified CPU cores is
 * isolated to run the emulator thread for this virtual machine.
 */
public final class VirtualMachineIsolateEmulatorThread
    extends ExpandableStringEnum<VirtualMachineIsolateEmulatorThread> {
    /** Static value True for VirtualMachineIsolateEmulatorThread. */
    public static final VirtualMachineIsolateEmulatorThread TRUE = fromString("True");

    /** Static value False for VirtualMachineIsolateEmulatorThread. */
    public static final VirtualMachineIsolateEmulatorThread FALSE = fromString("False");

    /**
     * Creates a new instance of VirtualMachineIsolateEmulatorThread value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public VirtualMachineIsolateEmulatorThread() {
    }

    /**
     * Creates or finds a VirtualMachineIsolateEmulatorThread from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding VirtualMachineIsolateEmulatorThread.
     */
    @JsonCreator
    public static VirtualMachineIsolateEmulatorThread fromString(String name) {
        return fromString(name, VirtualMachineIsolateEmulatorThread.class);
    }

    /**
     * Gets known VirtualMachineIsolateEmulatorThread values.
     *
     * @return known VirtualMachineIsolateEmulatorThread values.
     */
    public static Collection<VirtualMachineIsolateEmulatorThread> values() {
        return values(VirtualMachineIsolateEmulatorThread.class);
    }
}
