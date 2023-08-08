// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.resourcemover.fluent.models.MoveCollectionInner;
import com.azure.resourcemanager.resourcemover.models.BulkRemoveRequest;
import com.azure.resourcemanager.resourcemover.models.CommitRequest;
import com.azure.resourcemanager.resourcemover.models.DiscardRequest;
import com.azure.resourcemanager.resourcemover.models.Identity;
import com.azure.resourcemanager.resourcemover.models.MoveCollection;
import com.azure.resourcemanager.resourcemover.models.MoveCollectionProperties;
import com.azure.resourcemanager.resourcemover.models.OperationStatus;
import com.azure.resourcemanager.resourcemover.models.PrepareRequest;
import com.azure.resourcemanager.resourcemover.models.ResourceMoveRequest;
import com.azure.resourcemanager.resourcemover.models.UpdateMoveCollectionRequest;
import java.util.Collections;
import java.util.Map;

public final class MoveCollectionImpl implements MoveCollection, MoveCollection.Definition, MoveCollection.Update {
    private MoveCollectionInner innerObject;

    private final com.azure.resourcemanager.resourcemover.ResourceMoverManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public Identity identity() {
        return this.innerModel().identity();
    }

    public MoveCollectionProperties properties() {
        return this.innerModel().properties();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public MoveCollectionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.resourcemover.ResourceMoverManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String moveCollectionName;

    private UpdateMoveCollectionRequest updateBody;

    public MoveCollectionImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public MoveCollection create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getMoveCollections()
                .createWithResponse(resourceGroupName, moveCollectionName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public MoveCollection create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getMoveCollections()
                .createWithResponse(resourceGroupName, moveCollectionName, this.innerModel(), context)
                .getValue();
        return this;
    }

    MoveCollectionImpl(String name, com.azure.resourcemanager.resourcemover.ResourceMoverManager serviceManager) {
        this.innerObject = new MoveCollectionInner();
        this.serviceManager = serviceManager;
        this.moveCollectionName = name;
    }

    public MoveCollectionImpl update() {
        this.updateBody = new UpdateMoveCollectionRequest();
        return this;
    }

    public MoveCollection apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getMoveCollections()
                .updateWithResponse(resourceGroupName, moveCollectionName, updateBody, Context.NONE)
                .getValue();
        return this;
    }

    public MoveCollection apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getMoveCollections()
                .updateWithResponse(resourceGroupName, moveCollectionName, updateBody, context)
                .getValue();
        return this;
    }

    MoveCollectionImpl(
        MoveCollectionInner innerObject, com.azure.resourcemanager.resourcemover.ResourceMoverManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.moveCollectionName = Utils.getValueFromIdByName(innerObject.id(), "moveCollections");
    }

    public MoveCollection refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getMoveCollections()
                .getByResourceGroupWithResponse(resourceGroupName, moveCollectionName, Context.NONE)
                .getValue();
        return this;
    }

    public MoveCollection refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getMoveCollections()
                .getByResourceGroupWithResponse(resourceGroupName, moveCollectionName, context)
                .getValue();
        return this;
    }

    public OperationStatus prepare() {
        return serviceManager.moveCollections().prepare(resourceGroupName, moveCollectionName);
    }

    public OperationStatus prepare(PrepareRequest body, Context context) {
        return serviceManager.moveCollections().prepare(resourceGroupName, moveCollectionName, body, context);
    }

    public OperationStatus initiateMove() {
        return serviceManager.moveCollections().initiateMove(resourceGroupName, moveCollectionName);
    }

    public OperationStatus initiateMove(ResourceMoveRequest body, Context context) {
        return serviceManager.moveCollections().initiateMove(resourceGroupName, moveCollectionName, body, context);
    }

    public OperationStatus commit() {
        return serviceManager.moveCollections().commit(resourceGroupName, moveCollectionName);
    }

    public OperationStatus commit(CommitRequest body, Context context) {
        return serviceManager.moveCollections().commit(resourceGroupName, moveCollectionName, body, context);
    }

    public OperationStatus discard() {
        return serviceManager.moveCollections().discard(resourceGroupName, moveCollectionName);
    }

    public OperationStatus discard(DiscardRequest body, Context context) {
        return serviceManager.moveCollections().discard(resourceGroupName, moveCollectionName, body, context);
    }

    public OperationStatus resolveDependencies() {
        return serviceManager.moveCollections().resolveDependencies(resourceGroupName, moveCollectionName);
    }

    public OperationStatus resolveDependencies(Context context) {
        return serviceManager.moveCollections().resolveDependencies(resourceGroupName, moveCollectionName, context);
    }

    public OperationStatus bulkRemove() {
        return serviceManager.moveCollections().bulkRemove(resourceGroupName, moveCollectionName);
    }

    public OperationStatus bulkRemove(BulkRemoveRequest body, Context context) {
        return serviceManager.moveCollections().bulkRemove(resourceGroupName, moveCollectionName, body, context);
    }

    public MoveCollectionImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public MoveCollectionImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public MoveCollectionImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateBody.withTags(tags);
            return this;
        }
    }

    public MoveCollectionImpl withIdentity(Identity identity) {
        if (isInCreateMode()) {
            this.innerModel().withIdentity(identity);
            return this;
        } else {
            this.updateBody.withIdentity(identity);
            return this;
        }
    }

    public MoveCollectionImpl withProperties(MoveCollectionProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
