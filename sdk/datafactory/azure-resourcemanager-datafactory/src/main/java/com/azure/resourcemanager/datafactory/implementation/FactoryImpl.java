// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.datafactory.fluent.models.FactoryInner;
import com.azure.resourcemanager.datafactory.models.AccessPolicyResponse;
import com.azure.resourcemanager.datafactory.models.EncryptionConfiguration;
import com.azure.resourcemanager.datafactory.models.Factory;
import com.azure.resourcemanager.datafactory.models.FactoryIdentity;
import com.azure.resourcemanager.datafactory.models.FactoryRepoConfiguration;
import com.azure.resourcemanager.datafactory.models.FactoryUpdateParameters;
import com.azure.resourcemanager.datafactory.models.GitHubAccessTokenRequest;
import com.azure.resourcemanager.datafactory.models.GitHubAccessTokenResponse;
import com.azure.resourcemanager.datafactory.models.GlobalParameterSpecification;
import com.azure.resourcemanager.datafactory.models.PublicNetworkAccess;
import com.azure.resourcemanager.datafactory.models.PurviewConfiguration;
import com.azure.resourcemanager.datafactory.models.UserAccessPolicy;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;

public final class FactoryImpl implements Factory, Factory.Definition, Factory.Update {
    private FactoryInner innerObject;

    private final com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager;

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

    public FactoryIdentity identity() {
        return this.innerModel().identity();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public Map<String, Object> additionalProperties() {
        Map<String, Object> inner = this.innerModel().additionalProperties();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public OffsetDateTime createTime() {
        return this.innerModel().createTime();
    }

    public String version() {
        return this.innerModel().version();
    }

    public PurviewConfiguration purviewConfiguration() {
        return this.innerModel().purviewConfiguration();
    }

    public FactoryRepoConfiguration repoConfiguration() {
        return this.innerModel().repoConfiguration();
    }

    public Map<String, GlobalParameterSpecification> globalParameters() {
        Map<String, GlobalParameterSpecification> inner = this.innerModel().globalParameters();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public EncryptionConfiguration encryption() {
        return this.innerModel().encryption();
    }

    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerModel().publicNetworkAccess();
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

    public FactoryInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.datafactory.DataFactoryManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String factoryName;

    private String createIfMatch;

    private FactoryUpdateParameters updateFactoryUpdateParameters;

    public FactoryImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public Factory create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFactories()
                .createOrUpdateWithResponse(
                    resourceGroupName, factoryName, this.innerModel(), createIfMatch, Context.NONE)
                .getValue();
        return this;
    }

    public Factory create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFactories()
                .createOrUpdateWithResponse(resourceGroupName, factoryName, this.innerModel(), createIfMatch, context)
                .getValue();
        return this;
    }

    FactoryImpl(String name, com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager) {
        this.innerObject = new FactoryInner();
        this.serviceManager = serviceManager;
        this.factoryName = name;
        this.createIfMatch = null;
    }

    public FactoryImpl update() {
        this.updateFactoryUpdateParameters = new FactoryUpdateParameters();
        return this;
    }

    public Factory apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFactories()
                .updateWithResponse(resourceGroupName, factoryName, updateFactoryUpdateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public Factory apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFactories()
                .updateWithResponse(resourceGroupName, factoryName, updateFactoryUpdateParameters, context)
                .getValue();
        return this;
    }

    FactoryImpl(FactoryInner innerObject, com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.factoryName = Utils.getValueFromIdByName(innerObject.id(), "factories");
    }

    public Factory refresh() {
        String localIfNoneMatch = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFactories()
                .getByResourceGroupWithResponse(resourceGroupName, factoryName, localIfNoneMatch, Context.NONE)
                .getValue();
        return this;
    }

    public Factory refresh(Context context) {
        String localIfNoneMatch = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFactories()
                .getByResourceGroupWithResponse(resourceGroupName, factoryName, localIfNoneMatch, context)
                .getValue();
        return this;
    }

    public Response<GitHubAccessTokenResponse> getGitHubAccessTokenWithResponse(
        GitHubAccessTokenRequest gitHubAccessTokenRequest, Context context) {
        return serviceManager
            .factories()
            .getGitHubAccessTokenWithResponse(resourceGroupName, factoryName, gitHubAccessTokenRequest, context);
    }

    public GitHubAccessTokenResponse getGitHubAccessToken(GitHubAccessTokenRequest gitHubAccessTokenRequest) {
        return serviceManager
            .factories()
            .getGitHubAccessToken(resourceGroupName, factoryName, gitHubAccessTokenRequest);
    }

    public Response<AccessPolicyResponse> getDataPlaneAccessWithResponse(UserAccessPolicy policy, Context context) {
        return serviceManager
            .factories()
            .getDataPlaneAccessWithResponse(resourceGroupName, factoryName, policy, context);
    }

    public AccessPolicyResponse getDataPlaneAccess(UserAccessPolicy policy) {
        return serviceManager.factories().getDataPlaneAccess(resourceGroupName, factoryName, policy);
    }

    public FactoryImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public FactoryImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public FactoryImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateFactoryUpdateParameters.withTags(tags);
            return this;
        }
    }

    public FactoryImpl withIdentity(FactoryIdentity identity) {
        if (isInCreateMode()) {
            this.innerModel().withIdentity(identity);
            return this;
        } else {
            this.updateFactoryUpdateParameters.withIdentity(identity);
            return this;
        }
    }

    public FactoryImpl withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.innerModel().withAdditionalProperties(additionalProperties);
        return this;
    }

    public FactoryImpl withPurviewConfiguration(PurviewConfiguration purviewConfiguration) {
        this.innerModel().withPurviewConfiguration(purviewConfiguration);
        return this;
    }

    public FactoryImpl withRepoConfiguration(FactoryRepoConfiguration repoConfiguration) {
        this.innerModel().withRepoConfiguration(repoConfiguration);
        return this;
    }

    public FactoryImpl withGlobalParameters(Map<String, GlobalParameterSpecification> globalParameters) {
        this.innerModel().withGlobalParameters(globalParameters);
        return this;
    }

    public FactoryImpl withEncryption(EncryptionConfiguration encryption) {
        this.innerModel().withEncryption(encryption);
        return this;
    }

    public FactoryImpl withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        if (isInCreateMode()) {
            this.innerModel().withPublicNetworkAccess(publicNetworkAccess);
            return this;
        } else {
            this.updateFactoryUpdateParameters.withPublicNetworkAccess(publicNetworkAccess);
            return this;
        }
    }

    public FactoryImpl withIfMatch(String ifMatch) {
        this.createIfMatch = ifMatch;
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
