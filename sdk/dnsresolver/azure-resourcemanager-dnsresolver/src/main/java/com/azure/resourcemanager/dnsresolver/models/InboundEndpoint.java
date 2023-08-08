// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dnsresolver.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.dnsresolver.fluent.models.InboundEndpointInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of InboundEndpoint. */
public interface InboundEndpoint {
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
     * Gets the etag property: ETag of the inbound endpoint.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the ipConfigurations property: IP configurations for the inbound endpoint.
     *
     * @return the ipConfigurations value.
     */
    List<IpConfiguration> ipConfigurations();

    /**
     * Gets the provisioningState property: The current provisioning state of the inbound endpoint. This is a read-only
     * property and any attempt to set this value will be ignored.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the resourceGuid property: The resourceGuid property of the inbound endpoint resource.
     *
     * @return the resourceGuid value.
     */
    String resourceGuid();

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
     * Gets the inner com.azure.resourcemanager.dnsresolver.fluent.models.InboundEndpointInner object.
     *
     * @return the inner object.
     */
    InboundEndpointInner innerModel();

    /** The entirety of the InboundEndpoint definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithIpConfigurations,
            DefinitionStages.WithCreate {
    }
    /** The InboundEndpoint definition stages. */
    interface DefinitionStages {
        /** The first stage of the InboundEndpoint definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the InboundEndpoint definition allowing to specify location. */
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
        /** The stage of the InboundEndpoint definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, dnsResolverName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param dnsResolverName The name of the DNS resolver.
             * @return the next definition stage.
             */
            WithIpConfigurations withExistingDnsResolver(String resourceGroupName, String dnsResolverName);
        }
        /** The stage of the InboundEndpoint definition allowing to specify ipConfigurations. */
        interface WithIpConfigurations {
            /**
             * Specifies the ipConfigurations property: IP configurations for the inbound endpoint..
             *
             * @param ipConfigurations IP configurations for the inbound endpoint.
             * @return the next definition stage.
             */
            WithCreate withIpConfigurations(List<IpConfiguration> ipConfigurations);
        }
        /**
         * The stage of the InboundEndpoint definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags, DefinitionStages.WithIfMatch, DefinitionStages.WithIfNoneMatch {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            InboundEndpoint create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            InboundEndpoint create(Context context);
        }
        /** The stage of the InboundEndpoint definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the InboundEndpoint definition allowing to specify ifMatch. */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: ETag of the resource. Omit this value to always overwrite the current
             * resource. Specify the last-seen ETag value to prevent accidentally overwriting any concurrent changes..
             *
             * @param ifMatch ETag of the resource. Omit this value to always overwrite the current resource. Specify
             *     the last-seen ETag value to prevent accidentally overwriting any concurrent changes.
             * @return the next definition stage.
             */
            WithCreate withIfMatch(String ifMatch);
        }
        /** The stage of the InboundEndpoint definition allowing to specify ifNoneMatch. */
        interface WithIfNoneMatch {
            /**
             * Specifies the ifNoneMatch property: Set to '*' to allow a new resource to be created, but to prevent
             * updating an existing resource. Other values will be ignored..
             *
             * @param ifNoneMatch Set to '*' to allow a new resource to be created, but to prevent updating an existing
             *     resource. Other values will be ignored.
             * @return the next definition stage.
             */
            WithCreate withIfNoneMatch(String ifNoneMatch);
        }
    }
    /**
     * Begins update for the InboundEndpoint resource.
     *
     * @return the stage of resource update.
     */
    InboundEndpoint.Update update();

    /** The template for InboundEndpoint update. */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithIfMatch {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        InboundEndpoint apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        InboundEndpoint apply(Context context);
    }
    /** The InboundEndpoint update stages. */
    interface UpdateStages {
        /** The stage of the InboundEndpoint update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Tags for inbound endpoint..
             *
             * @param tags Tags for inbound endpoint.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the InboundEndpoint update allowing to specify ifMatch. */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: ETag of the resource. Omit this value to always overwrite the current
             * resource. Specify the last-seen ETag value to prevent accidentally overwriting any concurrent changes..
             *
             * @param ifMatch ETag of the resource. Omit this value to always overwrite the current resource. Specify
             *     the last-seen ETag value to prevent accidentally overwriting any concurrent changes.
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
    InboundEndpoint refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    InboundEndpoint refresh(Context context);
}
