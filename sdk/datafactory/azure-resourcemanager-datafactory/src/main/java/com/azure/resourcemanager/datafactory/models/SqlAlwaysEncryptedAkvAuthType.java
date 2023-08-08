// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Sql always encrypted AKV authentication type. Type: string (or Expression with resultType string). */
public final class SqlAlwaysEncryptedAkvAuthType extends ExpandableStringEnum<SqlAlwaysEncryptedAkvAuthType> {
    /** Static value ServicePrincipal for SqlAlwaysEncryptedAkvAuthType. */
    public static final SqlAlwaysEncryptedAkvAuthType SERVICE_PRINCIPAL = fromString("ServicePrincipal");

    /** Static value ManagedIdentity for SqlAlwaysEncryptedAkvAuthType. */
    public static final SqlAlwaysEncryptedAkvAuthType MANAGED_IDENTITY = fromString("ManagedIdentity");

    /** Static value UserAssignedManagedIdentity for SqlAlwaysEncryptedAkvAuthType. */
    public static final SqlAlwaysEncryptedAkvAuthType USER_ASSIGNED_MANAGED_IDENTITY =
        fromString("UserAssignedManagedIdentity");

    /**
     * Creates a new instance of SqlAlwaysEncryptedAkvAuthType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SqlAlwaysEncryptedAkvAuthType() {
    }

    /**
     * Creates or finds a SqlAlwaysEncryptedAkvAuthType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SqlAlwaysEncryptedAkvAuthType.
     */
    @JsonCreator
    public static SqlAlwaysEncryptedAkvAuthType fromString(String name) {
        return fromString(name, SqlAlwaysEncryptedAkvAuthType.class);
    }

    /**
     * Gets known SqlAlwaysEncryptedAkvAuthType values.
     *
     * @return known SqlAlwaysEncryptedAkvAuthType values.
     */
    public static Collection<SqlAlwaysEncryptedAkvAuthType> values() {
        return values(SqlAlwaysEncryptedAkvAuthType.class);
    }
}
