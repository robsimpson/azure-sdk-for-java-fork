// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** chatMessagePolicyViolationUserActionTypes. */
public final class MicrosoftGraphChatMessagePolicyViolationUserActionTypes
    extends ExpandableStringEnum<MicrosoftGraphChatMessagePolicyViolationUserActionTypes> {
    /** Static value none for MicrosoftGraphChatMessagePolicyViolationUserActionTypes. */
    public static final MicrosoftGraphChatMessagePolicyViolationUserActionTypes NONE = fromString("none");

    /** Static value override for MicrosoftGraphChatMessagePolicyViolationUserActionTypes. */
    public static final MicrosoftGraphChatMessagePolicyViolationUserActionTypes OVERRIDE = fromString("override");

    /** Static value reportFalsePositive for MicrosoftGraphChatMessagePolicyViolationUserActionTypes. */
    public static final MicrosoftGraphChatMessagePolicyViolationUserActionTypes REPORT_FALSE_POSITIVE =
        fromString("reportFalsePositive");

    /**
     * Creates or finds a MicrosoftGraphChatMessagePolicyViolationUserActionTypes from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MicrosoftGraphChatMessagePolicyViolationUserActionTypes.
     */
    @JsonCreator
    public static MicrosoftGraphChatMessagePolicyViolationUserActionTypes fromString(String name) {
        return fromString(name, MicrosoftGraphChatMessagePolicyViolationUserActionTypes.class);
    }

    /**
     * Gets known MicrosoftGraphChatMessagePolicyViolationUserActionTypes values.
     *
     * @return known MicrosoftGraphChatMessagePolicyViolationUserActionTypes values.
     */
    public static Collection<MicrosoftGraphChatMessagePolicyViolationUserActionTypes> values() {
        return values(MicrosoftGraphChatMessagePolicyViolationUserActionTypes.class);
    }
}
