// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * This property allows you to specify the operation type of gallery sharing update. &lt;br&gt;&lt;br&gt; Possible
 * values are: &lt;br&gt;&lt;br&gt; **Add** &lt;br&gt;&lt;br&gt; **Remove** &lt;br&gt;&lt;br&gt; **Reset**.
 */
public final class SharingUpdateOperationTypes extends ExpandableStringEnum<SharingUpdateOperationTypes> {
    /** Static value Add for SharingUpdateOperationTypes. */
    public static final SharingUpdateOperationTypes ADD = fromString("Add");

    /** Static value Remove for SharingUpdateOperationTypes. */
    public static final SharingUpdateOperationTypes REMOVE = fromString("Remove");

    /** Static value Reset for SharingUpdateOperationTypes. */
    public static final SharingUpdateOperationTypes RESET = fromString("Reset");

    /** Static value EnableCommunity for SharingUpdateOperationTypes. */
    public static final SharingUpdateOperationTypes ENABLE_COMMUNITY = fromString("EnableCommunity");

    /**
     * Creates a new instance of SharingUpdateOperationTypes value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SharingUpdateOperationTypes() {
    }

    /**
     * Creates or finds a SharingUpdateOperationTypes from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SharingUpdateOperationTypes.
     */
    @JsonCreator
    public static SharingUpdateOperationTypes fromString(String name) {
        return fromString(name, SharingUpdateOperationTypes.class);
    }

    /**
     * Gets known SharingUpdateOperationTypes values.
     *
     * @return known SharingUpdateOperationTypes values.
     */
    public static Collection<SharingUpdateOperationTypes> values() {
        return values(SharingUpdateOperationTypes.class);
    }
}
