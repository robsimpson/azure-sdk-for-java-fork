// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.streamanalytics.fluent.models.ClusterInner;
import java.time.OffsetDateTime;
import java.util.Map;

/** An immutable client-side representation of Cluster. */
public interface Cluster {
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
     * Gets the sku property: The SKU of the cluster. This determines the size/capacity of the cluster. Required on PUT
     * (CreateOrUpdate) requests.
     *
     * @return the sku value.
     */
    ClusterSku sku();

    /**
     * Gets the etag property: The current entity tag for the cluster. This is an opaque string. You can use it to
     * detect whether the resource has changed between requests. You can also use it in the If-Match or If-None-Match
     * headers for write operations for optimistic concurrency.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the createdDate property: The date this cluster was created.
     *
     * @return the createdDate value.
     */
    OffsetDateTime createdDate();

    /**
     * Gets the clusterId property: Unique identifier for the cluster.
     *
     * @return the clusterId value.
     */
    String clusterId();

    /**
     * Gets the provisioningState property: The status of the cluster provisioning. The three terminal states are:
     * Succeeded, Failed and Canceled.
     *
     * @return the provisioningState value.
     */
    ClusterProvisioningState provisioningState();

    /**
     * Gets the capacityAllocated property: Represents the number of streaming units currently being used on the
     * cluster.
     *
     * @return the capacityAllocated value.
     */
    Integer capacityAllocated();

    /**
     * Gets the capacityAssigned property: Represents the sum of the SUs of all streaming jobs associated with the
     * cluster. If all of the jobs were running, this would be the capacity allocated.
     *
     * @return the capacityAssigned value.
     */
    Integer capacityAssigned();

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
     * Gets the inner com.azure.resourcemanager.streamanalytics.fluent.models.ClusterInner object.
     *
     * @return the inner object.
     */
    ClusterInner innerModel();

    /** The entirety of the Cluster definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The Cluster definition stages. */
    interface DefinitionStages {
        /** The first stage of the Cluster definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the Cluster definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the Cluster definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the Cluster definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithSku,
                DefinitionStages.WithIfMatch,
                DefinitionStages.WithIfNoneMatch {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Cluster create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Cluster create(Context context);
        }
        /** The stage of the Cluster definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the Cluster definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The SKU of the cluster. This determines the size/capacity of the cluster.
             * Required on PUT (CreateOrUpdate) requests..
             *
             * @param sku The SKU of the cluster. This determines the size/capacity of the cluster. Required on PUT
             *     (CreateOrUpdate) requests.
             * @return the next definition stage.
             */
            WithCreate withSku(ClusterSku sku);
        }
        /** The stage of the Cluster definition allowing to specify ifMatch. */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: The ETag of the resource. Omit this value to always overwrite the current
             * record set. Specify the last-seen ETag value to prevent accidentally overwriting concurrent changes..
             *
             * @param ifMatch The ETag of the resource. Omit this value to always overwrite the current record set.
             *     Specify the last-seen ETag value to prevent accidentally overwriting concurrent changes.
             * @return the next definition stage.
             */
            WithCreate withIfMatch(String ifMatch);
        }
        /** The stage of the Cluster definition allowing to specify ifNoneMatch. */
        interface WithIfNoneMatch {
            /**
             * Specifies the ifNoneMatch property: Set to '*' to allow a new resource to be created, but to prevent
             * updating an existing record set. Other values will result in a 412 Pre-condition Failed response..
             *
             * @param ifNoneMatch Set to '*' to allow a new resource to be created, but to prevent updating an existing
             *     record set. Other values will result in a 412 Pre-condition Failed response.
             * @return the next definition stage.
             */
            WithCreate withIfNoneMatch(String ifNoneMatch);
        }
    }
    /**
     * Begins update for the Cluster resource.
     *
     * @return the stage of resource update.
     */
    Cluster.Update update();

    /** The template for Cluster update. */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithSku, UpdateStages.WithIfMatch {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Cluster apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Cluster apply(Context context);
    }
    /** The Cluster update stages. */
    interface UpdateStages {
        /** The stage of the Cluster update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the Cluster update allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The SKU of the cluster. This determines the size/capacity of the cluster.
             * Required on PUT (CreateOrUpdate) requests..
             *
             * @param sku The SKU of the cluster. This determines the size/capacity of the cluster. Required on PUT
             *     (CreateOrUpdate) requests.
             * @return the next definition stage.
             */
            Update withSku(ClusterSku sku);
        }
        /** The stage of the Cluster update allowing to specify ifMatch. */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: The ETag of the resource. Omit this value to always overwrite the current
             * record set. Specify the last-seen ETag value to prevent accidentally overwriting concurrent changes..
             *
             * @param ifMatch The ETag of the resource. Omit this value to always overwrite the current record set.
             *     Specify the last-seen ETag value to prevent accidentally overwriting concurrent changes.
             * @return the next definition stage.
             */
            Update withIfMatch(String ifMatch);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Cluster refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Cluster refresh(Context context);

    /**
     * Lists all of the streaming jobs in the given cluster.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of streaming jobs.
     */
    PagedIterable<ClusterJob> listStreamingJobs();

    /**
     * Lists all of the streaming jobs in the given cluster.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of streaming jobs.
     */
    PagedIterable<ClusterJob> listStreamingJobs(Context context);
}
