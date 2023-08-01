// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.automation.fluent.models.CredentialInner;
import java.time.OffsetDateTime;

/** An immutable client-side representation of Credential. */
public interface Credential {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the username property: Gets the user name of the credential.
     *
     * @return the username value.
     */
    String username();

    /**
     * Gets the creationTime property: Gets the creation time.
     *
     * @return the creationTime value.
     */
    OffsetDateTime creationTime();

    /**
     * Gets the lastModifiedTime property: Gets the last modified time.
     *
     * @return the lastModifiedTime value.
     */
    OffsetDateTime lastModifiedTime();

    /**
     * Gets the description property: Gets or sets the description.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.automation.fluent.models.CredentialInner object.
     *
     * @return the inner object.
     */
    CredentialInner innerModel();

    /** The entirety of the Credential definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithName,
            DefinitionStages.WithUsername,
            DefinitionStages.WithPassword,
            DefinitionStages.WithCreate {
    }
    /** The Credential definition stages. */
    interface DefinitionStages {
        /** The first stage of the Credential definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the Credential definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, automationAccountName.
             *
             * @param resourceGroupName Name of an Azure Resource group.
             * @param automationAccountName The name of the automation account.
             * @return the next definition stage.
             */
            WithName withExistingAutomationAccount(String resourceGroupName, String automationAccountName);
        }
        /** The stage of the Credential definition allowing to specify name. */
        interface WithName {
            /**
             * Specifies the name property: Gets or sets the name of the credential..
             *
             * @param name Gets or sets the name of the credential.
             * @return the next definition stage.
             */
            WithUsername withName(String name);
        }
        /** The stage of the Credential definition allowing to specify username. */
        interface WithUsername {
            /**
             * Specifies the username property: Gets or sets the user name of the credential..
             *
             * @param username Gets or sets the user name of the credential.
             * @return the next definition stage.
             */
            WithPassword withUsername(String username);
        }
        /** The stage of the Credential definition allowing to specify password. */
        interface WithPassword {
            /**
             * Specifies the password property: Gets or sets the password of the credential..
             *
             * @param password Gets or sets the password of the credential.
             * @return the next definition stage.
             */
            WithCreate withPassword(String password);
        }
        /**
         * The stage of the Credential definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithDescription {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Credential create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Credential create(Context context);
        }
        /** The stage of the Credential definition allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: Gets or sets the description of the credential..
             *
             * @param description Gets or sets the description of the credential.
             * @return the next definition stage.
             */
            WithCreate withDescription(String description);
        }
    }
    /**
     * Begins update for the Credential resource.
     *
     * @return the stage of resource update.
     */
    Credential.Update update();

    /** The template for Credential update. */
    interface Update
        extends UpdateStages.WithName,
            UpdateStages.WithUsername,
            UpdateStages.WithPassword,
            UpdateStages.WithDescription {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Credential apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Credential apply(Context context);
    }
    /** The Credential update stages. */
    interface UpdateStages {
        /** The stage of the Credential update allowing to specify name. */
        interface WithName {
            /**
             * Specifies the name property: Gets or sets the name of the credential..
             *
             * @param name Gets or sets the name of the credential.
             * @return the next definition stage.
             */
            Update withName(String name);
        }
        /** The stage of the Credential update allowing to specify username. */
        interface WithUsername {
            /**
             * Specifies the username property: Gets or sets the user name of the credential..
             *
             * @param username Gets or sets the user name of the credential.
             * @return the next definition stage.
             */
            Update withUsername(String username);
        }
        /** The stage of the Credential update allowing to specify password. */
        interface WithPassword {
            /**
             * Specifies the password property: Gets or sets the password of the credential..
             *
             * @param password Gets or sets the password of the credential.
             * @return the next definition stage.
             */
            Update withPassword(String password);
        }
        /** The stage of the Credential update allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: Gets or sets the description of the credential..
             *
             * @param description Gets or sets the description of the credential.
             * @return the next definition stage.
             */
            Update withDescription(String description);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Credential refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Credential refresh(Context context);
}
