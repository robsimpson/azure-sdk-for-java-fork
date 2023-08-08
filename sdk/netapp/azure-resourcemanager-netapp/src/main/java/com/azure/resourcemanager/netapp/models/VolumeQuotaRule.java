// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.netapp.fluent.models.VolumeQuotaRuleInner;
import java.util.Map;

/** An immutable client-side representation of VolumeQuotaRule. */
public interface VolumeQuotaRule {
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
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the provisioningState property: Gets the status of the VolumeQuotaRule at the time the operation was called.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the quotaSizeInKiBs property: Size of quota.
     *
     * @return the quotaSizeInKiBs value.
     */
    Long quotaSizeInKiBs();

    /**
     * Gets the quotaType property: quotaType
     *
     * <p>Type of quota.
     *
     * @return the quotaType value.
     */
    Type quotaType();

    /**
     * Gets the quotaTarget property: UserID/GroupID/SID based on the quota target type. UserID and groupID can be found
     * by running ‘id’ or ‘getent’ command for the user or group and SID can be found by running &lt;wmic useraccount
     * where name='user-name' get sid&gt;.
     *
     * @return the quotaTarget value.
     */
    String quotaTarget();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.netapp.fluent.models.VolumeQuotaRuleInner object.
     *
     * @return the inner object.
     */
    VolumeQuotaRuleInner innerModel();

    /** The entirety of the VolumeQuotaRule definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithCreate {
    }

    /** The VolumeQuotaRule definition stages. */
    interface DefinitionStages {
        /** The first stage of the VolumeQuotaRule definition. */
        interface Blank extends WithLocation {
        }

        /** The stage of the VolumeQuotaRule definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(String location);
        }

        /** The stage of the VolumeQuotaRule definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, accountName, poolName, volumeName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param accountName The name of the NetApp account.
             * @param poolName The name of the capacity pool.
             * @param volumeName The name of the volume.
             * @return the next definition stage.
             */
            WithCreate withExistingVolume(
                String resourceGroupName, String accountName, String poolName, String volumeName);
        }

        /**
         * The stage of the VolumeQuotaRule definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithQuotaSizeInKiBs,
                DefinitionStages.WithQuotaType,
                DefinitionStages.WithQuotaTarget {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            VolumeQuotaRule create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            VolumeQuotaRule create(Context context);
        }

        /** The stage of the VolumeQuotaRule definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /** The stage of the VolumeQuotaRule definition allowing to specify quotaSizeInKiBs. */
        interface WithQuotaSizeInKiBs {
            /**
             * Specifies the quotaSizeInKiBs property: Size of quota.
             *
             * @param quotaSizeInKiBs Size of quota.
             * @return the next definition stage.
             */
            WithCreate withQuotaSizeInKiBs(Long quotaSizeInKiBs);
        }

        /** The stage of the VolumeQuotaRule definition allowing to specify quotaType. */
        interface WithQuotaType {
            /**
             * Specifies the quotaType property: quotaType
             *
             * <p>Type of quota.
             *
             * @param quotaType quotaType
             *     <p>Type of quota.
             * @return the next definition stage.
             */
            WithCreate withQuotaType(Type quotaType);
        }

        /** The stage of the VolumeQuotaRule definition allowing to specify quotaTarget. */
        interface WithQuotaTarget {
            /**
             * Specifies the quotaTarget property: UserID/GroupID/SID based on the quota target type. UserID and groupID
             * can be found by running ‘id’ or ‘getent’ command for the user or group and SID can be found by running
             * &lt;wmic useraccount where name='user-name' get sid&gt;.
             *
             * @param quotaTarget UserID/GroupID/SID based on the quota target type. UserID and groupID can be found by
             *     running ‘id’ or ‘getent’ command for the user or group and SID can be found by running &lt;wmic
             *     useraccount where name='user-name' get sid&gt;.
             * @return the next definition stage.
             */
            WithCreate withQuotaTarget(String quotaTarget);
        }
    }

    /**
     * Begins update for the VolumeQuotaRule resource.
     *
     * @return the stage of resource update.
     */
    VolumeQuotaRule.Update update();

    /** The template for VolumeQuotaRule update. */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithQuotaSizeInKiBs {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        VolumeQuotaRule apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        VolumeQuotaRule apply(Context context);
    }

    /** The VolumeQuotaRule update stages. */
    interface UpdateStages {
        /** The stage of the VolumeQuotaRule update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags.
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }

        /** The stage of the VolumeQuotaRule update allowing to specify quotaSizeInKiBs. */
        interface WithQuotaSizeInKiBs {
            /**
             * Specifies the quotaSizeInKiBs property: Size of quota.
             *
             * @param quotaSizeInKiBs Size of quota.
             * @return the next definition stage.
             */
            Update withQuotaSizeInKiBs(Long quotaSizeInKiBs);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    VolumeQuotaRule refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    VolumeQuotaRule refresh(Context context);
}
