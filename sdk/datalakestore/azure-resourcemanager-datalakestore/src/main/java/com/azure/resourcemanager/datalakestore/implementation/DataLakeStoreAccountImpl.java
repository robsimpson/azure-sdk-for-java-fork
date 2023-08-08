// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakestore.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.datalakestore.fluent.models.DataLakeStoreAccountInner;
import com.azure.resourcemanager.datalakestore.fluent.models.FirewallRuleInner;
import com.azure.resourcemanager.datalakestore.fluent.models.TrustedIdProviderInner;
import com.azure.resourcemanager.datalakestore.fluent.models.VirtualNetworkRuleInner;
import com.azure.resourcemanager.datalakestore.models.CreateDataLakeStoreAccountParameters;
import com.azure.resourcemanager.datalakestore.models.CreateFirewallRuleWithAccountParameters;
import com.azure.resourcemanager.datalakestore.models.CreateTrustedIdProviderWithAccountParameters;
import com.azure.resourcemanager.datalakestore.models.CreateVirtualNetworkRuleWithAccountParameters;
import com.azure.resourcemanager.datalakestore.models.DataLakeStoreAccount;
import com.azure.resourcemanager.datalakestore.models.DataLakeStoreAccountState;
import com.azure.resourcemanager.datalakestore.models.DataLakeStoreAccountStatus;
import com.azure.resourcemanager.datalakestore.models.EncryptionConfig;
import com.azure.resourcemanager.datalakestore.models.EncryptionIdentity;
import com.azure.resourcemanager.datalakestore.models.EncryptionProvisioningState;
import com.azure.resourcemanager.datalakestore.models.EncryptionState;
import com.azure.resourcemanager.datalakestore.models.FirewallAllowAzureIpsState;
import com.azure.resourcemanager.datalakestore.models.FirewallRule;
import com.azure.resourcemanager.datalakestore.models.FirewallState;
import com.azure.resourcemanager.datalakestore.models.TierType;
import com.azure.resourcemanager.datalakestore.models.TrustedIdProvider;
import com.azure.resourcemanager.datalakestore.models.TrustedIdProviderState;
import com.azure.resourcemanager.datalakestore.models.UpdateDataLakeStoreAccountParameters;
import com.azure.resourcemanager.datalakestore.models.UpdateEncryptionConfig;
import com.azure.resourcemanager.datalakestore.models.UpdateFirewallRuleWithAccountParameters;
import com.azure.resourcemanager.datalakestore.models.UpdateTrustedIdProviderWithAccountParameters;
import com.azure.resourcemanager.datalakestore.models.UpdateVirtualNetworkRuleWithAccountParameters;
import com.azure.resourcemanager.datalakestore.models.VirtualNetworkRule;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

public final class DataLakeStoreAccountImpl
    implements DataLakeStoreAccount, DataLakeStoreAccount.Definition, DataLakeStoreAccount.Update {
    private DataLakeStoreAccountInner innerObject;

    private final com.azure.resourcemanager.datalakestore.DataLakeStoreManager serviceManager;

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

    public EncryptionIdentity identity() {
        return this.innerModel().identity();
    }

    public String defaultGroup() {
        return this.innerModel().defaultGroup();
    }

    public EncryptionConfig encryptionConfig() {
        return this.innerModel().encryptionConfig();
    }

    public EncryptionState encryptionState() {
        return this.innerModel().encryptionState();
    }

    public EncryptionProvisioningState encryptionProvisioningState() {
        return this.innerModel().encryptionProvisioningState();
    }

    public List<FirewallRule> firewallRules() {
        List<FirewallRuleInner> inner = this.innerModel().firewallRules();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new FirewallRuleImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public List<VirtualNetworkRule> virtualNetworkRules() {
        List<VirtualNetworkRuleInner> inner = this.innerModel().virtualNetworkRules();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new VirtualNetworkRuleImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public FirewallState firewallState() {
        return this.innerModel().firewallState();
    }

    public FirewallAllowAzureIpsState firewallAllowAzureIps() {
        return this.innerModel().firewallAllowAzureIps();
    }

    public List<TrustedIdProvider> trustedIdProviders() {
        List<TrustedIdProviderInner> inner = this.innerModel().trustedIdProviders();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new TrustedIdProviderImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public TrustedIdProviderState trustedIdProviderState() {
        return this.innerModel().trustedIdProviderState();
    }

    public TierType newTier() {
        return this.innerModel().newTier();
    }

    public TierType currentTier() {
        return this.innerModel().currentTier();
    }

    public UUID accountId() {
        return this.innerModel().accountId();
    }

    public DataLakeStoreAccountStatus provisioningState() {
        return this.innerModel().provisioningState();
    }

    public DataLakeStoreAccountState state() {
        return this.innerModel().state();
    }

    public OffsetDateTime creationTime() {
        return this.innerModel().creationTime();
    }

    public OffsetDateTime lastModifiedTime() {
        return this.innerModel().lastModifiedTime();
    }

    public String endpoint() {
        return this.innerModel().endpoint();
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

    public DataLakeStoreAccountInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.datalakestore.DataLakeStoreManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private CreateDataLakeStoreAccountParameters createParameters;

    private UpdateDataLakeStoreAccountParameters updateParameters;

    public DataLakeStoreAccountImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public DataLakeStoreAccount create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAccounts()
                .create(resourceGroupName, accountName, createParameters, Context.NONE);
        return this;
    }

    public DataLakeStoreAccount create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAccounts()
                .create(resourceGroupName, accountName, createParameters, context);
        return this;
    }

    DataLakeStoreAccountImpl(String name, com.azure.resourcemanager.datalakestore.DataLakeStoreManager serviceManager) {
        this.innerObject = new DataLakeStoreAccountInner();
        this.serviceManager = serviceManager;
        this.accountName = name;
        this.createParameters = new CreateDataLakeStoreAccountParameters();
    }

    public DataLakeStoreAccountImpl update() {
        this.updateParameters = new UpdateDataLakeStoreAccountParameters();
        return this;
    }

    public DataLakeStoreAccount apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAccounts()
                .update(resourceGroupName, accountName, updateParameters, Context.NONE);
        return this;
    }

    public DataLakeStoreAccount apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAccounts()
                .update(resourceGroupName, accountName, updateParameters, context);
        return this;
    }

    DataLakeStoreAccountImpl(
        DataLakeStoreAccountInner innerObject,
        com.azure.resourcemanager.datalakestore.DataLakeStoreManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = Utils.getValueFromIdByName(innerObject.id(), "accounts");
    }

    public DataLakeStoreAccount refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAccounts()
                .getByResourceGroupWithResponse(resourceGroupName, accountName, Context.NONE)
                .getValue();
        return this;
    }

    public DataLakeStoreAccount refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAccounts()
                .getByResourceGroupWithResponse(resourceGroupName, accountName, context)
                .getValue();
        return this;
    }

    public Response<Void> enableKeyVaultWithResponse(Context context) {
        return serviceManager.accounts().enableKeyVaultWithResponse(resourceGroupName, accountName, context);
    }

    public void enableKeyVault() {
        serviceManager.accounts().enableKeyVault(resourceGroupName, accountName);
    }

    public DataLakeStoreAccountImpl withRegion(Region location) {
        this.createParameters.withLocation(location.toString());
        return this;
    }

    public DataLakeStoreAccountImpl withRegion(String location) {
        this.createParameters.withLocation(location);
        return this;
    }

    public DataLakeStoreAccountImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.createParameters.withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public DataLakeStoreAccountImpl withIdentity(EncryptionIdentity identity) {
        this.createParameters.withIdentity(identity);
        return this;
    }

    public DataLakeStoreAccountImpl withDefaultGroup(String defaultGroup) {
        if (isInCreateMode()) {
            this.createParameters.withDefaultGroup(defaultGroup);
            return this;
        } else {
            this.updateParameters.withDefaultGroup(defaultGroup);
            return this;
        }
    }

    public DataLakeStoreAccountImpl withEncryptionConfig(EncryptionConfig encryptionConfig) {
        this.createParameters.withEncryptionConfig(encryptionConfig);
        return this;
    }

    public DataLakeStoreAccountImpl withEncryptionState(EncryptionState encryptionState) {
        this.createParameters.withEncryptionState(encryptionState);
        return this;
    }

    public DataLakeStoreAccountImpl withFirewallRules(List<CreateFirewallRuleWithAccountParameters> firewallRules) {
        this.createParameters.withFirewallRules(firewallRules);
        return this;
    }

    public DataLakeStoreAccountImpl withVirtualNetworkRules(
        List<CreateVirtualNetworkRuleWithAccountParameters> virtualNetworkRules) {
        this.createParameters.withVirtualNetworkRules(virtualNetworkRules);
        return this;
    }

    public DataLakeStoreAccountImpl withFirewallState(FirewallState firewallState) {
        if (isInCreateMode()) {
            this.createParameters.withFirewallState(firewallState);
            return this;
        } else {
            this.updateParameters.withFirewallState(firewallState);
            return this;
        }
    }

    public DataLakeStoreAccountImpl withFirewallAllowAzureIps(FirewallAllowAzureIpsState firewallAllowAzureIps) {
        if (isInCreateMode()) {
            this.createParameters.withFirewallAllowAzureIps(firewallAllowAzureIps);
            return this;
        } else {
            this.updateParameters.withFirewallAllowAzureIps(firewallAllowAzureIps);
            return this;
        }
    }

    public DataLakeStoreAccountImpl withTrustedIdProviders(
        List<CreateTrustedIdProviderWithAccountParameters> trustedIdProviders) {
        this.createParameters.withTrustedIdProviders(trustedIdProviders);
        return this;
    }

    public DataLakeStoreAccountImpl withTrustedIdProviderState(TrustedIdProviderState trustedIdProviderState) {
        if (isInCreateMode()) {
            this.createParameters.withTrustedIdProviderState(trustedIdProviderState);
            return this;
        } else {
            this.updateParameters.withTrustedIdProviderState(trustedIdProviderState);
            return this;
        }
    }

    public DataLakeStoreAccountImpl withNewTier(TierType newTier) {
        if (isInCreateMode()) {
            this.createParameters.withNewTier(newTier);
            return this;
        } else {
            this.updateParameters.withNewTier(newTier);
            return this;
        }
    }

    public DataLakeStoreAccountImpl withEncryptionConfig(UpdateEncryptionConfig encryptionConfig) {
        this.updateParameters.withEncryptionConfig(encryptionConfig);
        return this;
    }

    public DataLakeStoreAccountImpl withFirewallRulesForUpdate(
        List<UpdateFirewallRuleWithAccountParameters> firewallRules) {
        this.updateParameters.withFirewallRules(firewallRules);
        return this;
    }

    public DataLakeStoreAccountImpl withVirtualNetworkRulesForUpdate(
        List<UpdateVirtualNetworkRuleWithAccountParameters> virtualNetworkRules) {
        this.updateParameters.withVirtualNetworkRules(virtualNetworkRules);
        return this;
    }

    public DataLakeStoreAccountImpl withTrustedIdProvidersForUpdate(
        List<UpdateTrustedIdProviderWithAccountParameters> trustedIdProviders) {
        this.updateParameters.withTrustedIdProviders(trustedIdProviders);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
