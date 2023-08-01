// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.cosmos.models.AnalyticalStorageConfiguration;
import com.azure.resourcemanager.cosmos.models.ApiProperties;
import com.azure.resourcemanager.cosmos.models.BackupPolicy;
import com.azure.resourcemanager.cosmos.models.Capability;
import com.azure.resourcemanager.cosmos.models.Capacity;
import com.azure.resourcemanager.cosmos.models.ConnectorOffer;
import com.azure.resourcemanager.cosmos.models.ConsistencyPolicy;
import com.azure.resourcemanager.cosmos.models.CorsPolicy;
import com.azure.resourcemanager.cosmos.models.CreateMode;
import com.azure.resourcemanager.cosmos.models.DatabaseAccountKeysMetadata;
import com.azure.resourcemanager.cosmos.models.DatabaseAccountOfferType;
import com.azure.resourcemanager.cosmos.models.FailoverPolicy;
import com.azure.resourcemanager.cosmos.models.IpAddressOrRange;
import com.azure.resourcemanager.cosmos.models.Location;
import com.azure.resourcemanager.cosmos.models.MinimalTlsVersion;
import com.azure.resourcemanager.cosmos.models.NetworkAclBypass;
import com.azure.resourcemanager.cosmos.models.PublicNetworkAccess;
import com.azure.resourcemanager.cosmos.models.RestoreParameters;
import com.azure.resourcemanager.cosmos.models.VirtualNetworkRule;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties for the database account. */
@Fluent
public final class DatabaseAccountGetProperties {
    /*
     * The status of the Cosmos DB account at the time the operation was called. The status can be one of following.
     * 'Creating' – the Cosmos DB account is being created. When an account is in Creating state, only properties that
     * are specified as input for the Create Cosmos DB account operation are returned. 'Succeeded' – the Cosmos DB
     * account is active for use. 'Updating' – the Cosmos DB account is being updated. 'Deleting' – the Cosmos DB
     * account is being deleted. 'Failed' – the Cosmos DB account failed creation. 'DeletionFailed' – the Cosmos DB
     * account deletion failed.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The connection endpoint for the Cosmos DB database account.
     */
    @JsonProperty(value = "documentEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String documentEndpoint;

    /*
     * The offer type for the Cosmos DB database account. Default value: Standard.
     */
    @JsonProperty(value = "databaseAccountOfferType", access = JsonProperty.Access.WRITE_ONLY)
    private DatabaseAccountOfferType databaseAccountOfferType;

    /*
     * List of IpRules.
     */
    @JsonProperty(value = "ipRules")
    private List<IpAddressOrRange> ipRules;

    /*
     * Flag to indicate whether to enable/disable Virtual Network ACL rules.
     */
    @JsonProperty(value = "isVirtualNetworkFilterEnabled")
    private Boolean isVirtualNetworkFilterEnabled;

    /*
     * Enables automatic failover of the write region in the rare event that the region is unavailable due to an
     * outage. Automatic failover will result in a new write region for the account and is chosen based on the failover
     * priorities configured for the account.
     */
    @JsonProperty(value = "enableAutomaticFailover")
    private Boolean enableAutomaticFailover;

    /*
     * The consistency policy for the Cosmos DB database account.
     */
    @JsonProperty(value = "consistencyPolicy")
    private ConsistencyPolicy consistencyPolicy;

    /*
     * List of Cosmos DB capabilities for the account
     */
    @JsonProperty(value = "capabilities")
    private List<Capability> capabilities;

    /*
     * An array that contains the write location for the Cosmos DB account.
     */
    @JsonProperty(value = "writeLocations", access = JsonProperty.Access.WRITE_ONLY)
    private List<Location> writeLocations;

    /*
     * An array that contains of the read locations enabled for the Cosmos DB account.
     */
    @JsonProperty(value = "readLocations", access = JsonProperty.Access.WRITE_ONLY)
    private List<Location> readLocations;

    /*
     * An array that contains all of the locations enabled for the Cosmos DB account.
     */
    @JsonProperty(value = "locations", access = JsonProperty.Access.WRITE_ONLY)
    private List<Location> locations;

    /*
     * An array that contains the regions ordered by their failover priorities.
     */
    @JsonProperty(value = "failoverPolicies", access = JsonProperty.Access.WRITE_ONLY)
    private List<FailoverPolicy> failoverPolicies;

    /*
     * List of Virtual Network ACL rules configured for the Cosmos DB account.
     */
    @JsonProperty(value = "virtualNetworkRules")
    private List<VirtualNetworkRule> virtualNetworkRules;

    /*
     * List of Private Endpoint Connections configured for the Cosmos DB account.
     */
    @JsonProperty(value = "privateEndpointConnections", access = JsonProperty.Access.WRITE_ONLY)
    private List<PrivateEndpointConnectionInner> privateEndpointConnections;

    /*
     * Enables the account to write in multiple locations
     */
    @JsonProperty(value = "enableMultipleWriteLocations")
    private Boolean enableMultipleWriteLocations;

    /*
     * Enables the cassandra connector on the Cosmos DB C* account
     */
    @JsonProperty(value = "enableCassandraConnector")
    private Boolean enableCassandraConnector;

    /*
     * The cassandra connector offer type for the Cosmos DB database C* account.
     */
    @JsonProperty(value = "connectorOffer")
    private ConnectorOffer connectorOffer;

    /*
     * Disable write operations on metadata resources (databases, containers, throughput) via account keys
     */
    @JsonProperty(value = "disableKeyBasedMetadataWriteAccess")
    private Boolean disableKeyBasedMetadataWriteAccess;

    /*
     * The URI of the key vault
     */
    @JsonProperty(value = "keyVaultKeyUri")
    private String keyVaultKeyUri;

    /*
     * The default identity for accessing key vault used in features like customer managed keys. The default identity
     * needs to be explicitly set by the users. It can be "FirstPartyIdentity", "SystemAssignedIdentity" and more.
     */
    @JsonProperty(value = "defaultIdentity")
    private String defaultIdentity;

    /*
     * Whether requests from Public Network are allowed
     */
    @JsonProperty(value = "publicNetworkAccess")
    private PublicNetworkAccess publicNetworkAccess;

    /*
     * Flag to indicate whether Free Tier is enabled.
     */
    @JsonProperty(value = "enableFreeTier")
    private Boolean enableFreeTier;

    /*
     * API specific properties.
     */
    @JsonProperty(value = "apiProperties")
    private ApiProperties apiProperties;

    /*
     * Flag to indicate whether to enable storage analytics.
     */
    @JsonProperty(value = "enableAnalyticalStorage")
    private Boolean enableAnalyticalStorage;

    /*
     * Analytical storage specific properties.
     */
    @JsonProperty(value = "analyticalStorageConfiguration")
    private AnalyticalStorageConfiguration analyticalStorageConfiguration;

    /*
     * A unique identifier assigned to the database account
     */
    @JsonProperty(value = "instanceId", access = JsonProperty.Access.WRITE_ONLY)
    private String instanceId;

    /*
     * Enum to indicate the mode of account creation.
     */
    @JsonProperty(value = "createMode")
    private CreateMode createMode;

    /*
     * Parameters to indicate the information about the restore.
     */
    @JsonProperty(value = "restoreParameters")
    private RestoreParameters restoreParameters;

    /*
     * The object representing the policy for taking backups on an account.
     */
    @JsonProperty(value = "backupPolicy")
    private BackupPolicy backupPolicy;

    /*
     * The CORS policy for the Cosmos DB database account.
     */
    @JsonProperty(value = "cors")
    private List<CorsPolicy> cors;

    /*
     * Indicates what services are allowed to bypass firewall checks.
     */
    @JsonProperty(value = "networkAclBypass")
    private NetworkAclBypass networkAclBypass;

    /*
     * An array that contains the Resource Ids for Network Acl Bypass for the Cosmos DB account.
     */
    @JsonProperty(value = "networkAclBypassResourceIds")
    private List<String> networkAclBypassResourceIds;

    /*
     * Opt-out of local authentication and ensure only MSI and AAD can be used exclusively for authentication.
     */
    @JsonProperty(value = "disableLocalAuth")
    private Boolean disableLocalAuth;

    /*
     * The object that represents all properties related to capacity enforcement on an account.
     */
    @JsonProperty(value = "capacity")
    private Capacity capacity;

    /*
     * The object that represents the metadata for the Account Keys of the Cosmos DB account.
     */
    @JsonProperty(value = "keysMetadata", access = JsonProperty.Access.WRITE_ONLY)
    private DatabaseAccountKeysMetadata keysMetadata;

    /*
     * Flag to indicate enabling/disabling of Partition Merge feature on the account
     */
    @JsonProperty(value = "enablePartitionMerge")
    private Boolean enablePartitionMerge;

    /*
     * Indicates the minimum allowed Tls version. The default is Tls 1.0, except for Cassandra and Mongo API's, which
     * only work with Tls 1.2.
     */
    @JsonProperty(value = "minimalTlsVersion")
    private MinimalTlsVersion minimalTlsVersion;

    /** Creates an instance of DatabaseAccountGetProperties class. */
    public DatabaseAccountGetProperties() {
    }

    /**
     * Get the provisioningState property: The status of the Cosmos DB account at the time the operation was called. The
     * status can be one of following. 'Creating' – the Cosmos DB account is being created. When an account is in
     * Creating state, only properties that are specified as input for the Create Cosmos DB account operation are
     * returned. 'Succeeded' – the Cosmos DB account is active for use. 'Updating' – the Cosmos DB account is being
     * updated. 'Deleting' – the Cosmos DB account is being deleted. 'Failed' – the Cosmos DB account failed creation.
     * 'DeletionFailed' – the Cosmos DB account deletion failed.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the documentEndpoint property: The connection endpoint for the Cosmos DB database account.
     *
     * @return the documentEndpoint value.
     */
    public String documentEndpoint() {
        return this.documentEndpoint;
    }

    /**
     * Get the databaseAccountOfferType property: The offer type for the Cosmos DB database account. Default value:
     * Standard.
     *
     * @return the databaseAccountOfferType value.
     */
    public DatabaseAccountOfferType databaseAccountOfferType() {
        return this.databaseAccountOfferType;
    }

    /**
     * Get the ipRules property: List of IpRules.
     *
     * @return the ipRules value.
     */
    public List<IpAddressOrRange> ipRules() {
        return this.ipRules;
    }

    /**
     * Set the ipRules property: List of IpRules.
     *
     * @param ipRules the ipRules value to set.
     * @return the DatabaseAccountGetProperties object itself.
     */
    public DatabaseAccountGetProperties withIpRules(List<IpAddressOrRange> ipRules) {
        this.ipRules = ipRules;
        return this;
    }

    /**
     * Get the isVirtualNetworkFilterEnabled property: Flag to indicate whether to enable/disable Virtual Network ACL
     * rules.
     *
     * @return the isVirtualNetworkFilterEnabled value.
     */
    public Boolean isVirtualNetworkFilterEnabled() {
        return this.isVirtualNetworkFilterEnabled;
    }

    /**
     * Set the isVirtualNetworkFilterEnabled property: Flag to indicate whether to enable/disable Virtual Network ACL
     * rules.
     *
     * @param isVirtualNetworkFilterEnabled the isVirtualNetworkFilterEnabled value to set.
     * @return the DatabaseAccountGetProperties object itself.
     */
    public DatabaseAccountGetProperties withIsVirtualNetworkFilterEnabled(Boolean isVirtualNetworkFilterEnabled) {
        this.isVirtualNetworkFilterEnabled = isVirtualNetworkFilterEnabled;
        return this;
    }

    /**
     * Get the enableAutomaticFailover property: Enables automatic failover of the write region in the rare event that
     * the region is unavailable due to an outage. Automatic failover will result in a new write region for the account
     * and is chosen based on the failover priorities configured for the account.
     *
     * @return the enableAutomaticFailover value.
     */
    public Boolean enableAutomaticFailover() {
        return this.enableAutomaticFailover;
    }

    /**
     * Set the enableAutomaticFailover property: Enables automatic failover of the write region in the rare event that
     * the region is unavailable due to an outage. Automatic failover will result in a new write region for the account
     * and is chosen based on the failover priorities configured for the account.
     *
     * @param enableAutomaticFailover the enableAutomaticFailover value to set.
     * @return the DatabaseAccountGetProperties object itself.
     */
    public DatabaseAccountGetProperties withEnableAutomaticFailover(Boolean enableAutomaticFailover) {
        this.enableAutomaticFailover = enableAutomaticFailover;
        return this;
    }

    /**
     * Get the consistencyPolicy property: The consistency policy for the Cosmos DB database account.
     *
     * @return the consistencyPolicy value.
     */
    public ConsistencyPolicy consistencyPolicy() {
        return this.consistencyPolicy;
    }

    /**
     * Set the consistencyPolicy property: The consistency policy for the Cosmos DB database account.
     *
     * @param consistencyPolicy the consistencyPolicy value to set.
     * @return the DatabaseAccountGetProperties object itself.
     */
    public DatabaseAccountGetProperties withConsistencyPolicy(ConsistencyPolicy consistencyPolicy) {
        this.consistencyPolicy = consistencyPolicy;
        return this;
    }

    /**
     * Get the capabilities property: List of Cosmos DB capabilities for the account.
     *
     * @return the capabilities value.
     */
    public List<Capability> capabilities() {
        return this.capabilities;
    }

    /**
     * Set the capabilities property: List of Cosmos DB capabilities for the account.
     *
     * @param capabilities the capabilities value to set.
     * @return the DatabaseAccountGetProperties object itself.
     */
    public DatabaseAccountGetProperties withCapabilities(List<Capability> capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * Get the writeLocations property: An array that contains the write location for the Cosmos DB account.
     *
     * @return the writeLocations value.
     */
    public List<Location> writeLocations() {
        return this.writeLocations;
    }

    /**
     * Get the readLocations property: An array that contains of the read locations enabled for the Cosmos DB account.
     *
     * @return the readLocations value.
     */
    public List<Location> readLocations() {
        return this.readLocations;
    }

    /**
     * Get the locations property: An array that contains all of the locations enabled for the Cosmos DB account.
     *
     * @return the locations value.
     */
    public List<Location> locations() {
        return this.locations;
    }

    /**
     * Get the failoverPolicies property: An array that contains the regions ordered by their failover priorities.
     *
     * @return the failoverPolicies value.
     */
    public List<FailoverPolicy> failoverPolicies() {
        return this.failoverPolicies;
    }

    /**
     * Get the virtualNetworkRules property: List of Virtual Network ACL rules configured for the Cosmos DB account.
     *
     * @return the virtualNetworkRules value.
     */
    public List<VirtualNetworkRule> virtualNetworkRules() {
        return this.virtualNetworkRules;
    }

    /**
     * Set the virtualNetworkRules property: List of Virtual Network ACL rules configured for the Cosmos DB account.
     *
     * @param virtualNetworkRules the virtualNetworkRules value to set.
     * @return the DatabaseAccountGetProperties object itself.
     */
    public DatabaseAccountGetProperties withVirtualNetworkRules(List<VirtualNetworkRule> virtualNetworkRules) {
        this.virtualNetworkRules = virtualNetworkRules;
        return this;
    }

    /**
     * Get the privateEndpointConnections property: List of Private Endpoint Connections configured for the Cosmos DB
     * account.
     *
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Get the enableMultipleWriteLocations property: Enables the account to write in multiple locations.
     *
     * @return the enableMultipleWriteLocations value.
     */
    public Boolean enableMultipleWriteLocations() {
        return this.enableMultipleWriteLocations;
    }

    /**
     * Set the enableMultipleWriteLocations property: Enables the account to write in multiple locations.
     *
     * @param enableMultipleWriteLocations the enableMultipleWriteLocations value to set.
     * @return the DatabaseAccountGetProperties object itself.
     */
    public DatabaseAccountGetProperties withEnableMultipleWriteLocations(Boolean enableMultipleWriteLocations) {
        this.enableMultipleWriteLocations = enableMultipleWriteLocations;
        return this;
    }

    /**
     * Get the enableCassandraConnector property: Enables the cassandra connector on the Cosmos DB C* account.
     *
     * @return the enableCassandraConnector value.
     */
    public Boolean enableCassandraConnector() {
        return this.enableCassandraConnector;
    }

    /**
     * Set the enableCassandraConnector property: Enables the cassandra connector on the Cosmos DB C* account.
     *
     * @param enableCassandraConnector the enableCassandraConnector value to set.
     * @return the DatabaseAccountGetProperties object itself.
     */
    public DatabaseAccountGetProperties withEnableCassandraConnector(Boolean enableCassandraConnector) {
        this.enableCassandraConnector = enableCassandraConnector;
        return this;
    }

    /**
     * Get the connectorOffer property: The cassandra connector offer type for the Cosmos DB database C* account.
     *
     * @return the connectorOffer value.
     */
    public ConnectorOffer connectorOffer() {
        return this.connectorOffer;
    }

    /**
     * Set the connectorOffer property: The cassandra connector offer type for the Cosmos DB database C* account.
     *
     * @param connectorOffer the connectorOffer value to set.
     * @return the DatabaseAccountGetProperties object itself.
     */
    public DatabaseAccountGetProperties withConnectorOffer(ConnectorOffer connectorOffer) {
        this.connectorOffer = connectorOffer;
        return this;
    }

    /**
     * Get the disableKeyBasedMetadataWriteAccess property: Disable write operations on metadata resources (databases,
     * containers, throughput) via account keys.
     *
     * @return the disableKeyBasedMetadataWriteAccess value.
     */
    public Boolean disableKeyBasedMetadataWriteAccess() {
        return this.disableKeyBasedMetadataWriteAccess;
    }

    /**
     * Set the disableKeyBasedMetadataWriteAccess property: Disable write operations on metadata resources (databases,
     * containers, throughput) via account keys.
     *
     * @param disableKeyBasedMetadataWriteAccess the disableKeyBasedMetadataWriteAccess value to set.
     * @return the DatabaseAccountGetProperties object itself.
     */
    public DatabaseAccountGetProperties withDisableKeyBasedMetadataWriteAccess(
        Boolean disableKeyBasedMetadataWriteAccess) {
        this.disableKeyBasedMetadataWriteAccess = disableKeyBasedMetadataWriteAccess;
        return this;
    }

    /**
     * Get the keyVaultKeyUri property: The URI of the key vault.
     *
     * @return the keyVaultKeyUri value.
     */
    public String keyVaultKeyUri() {
        return this.keyVaultKeyUri;
    }

    /**
     * Set the keyVaultKeyUri property: The URI of the key vault.
     *
     * @param keyVaultKeyUri the keyVaultKeyUri value to set.
     * @return the DatabaseAccountGetProperties object itself.
     */
    public DatabaseAccountGetProperties withKeyVaultKeyUri(String keyVaultKeyUri) {
        this.keyVaultKeyUri = keyVaultKeyUri;
        return this;
    }

    /**
     * Get the defaultIdentity property: The default identity for accessing key vault used in features like customer
     * managed keys. The default identity needs to be explicitly set by the users. It can be "FirstPartyIdentity",
     * "SystemAssignedIdentity" and more.
     *
     * @return the defaultIdentity value.
     */
    public String defaultIdentity() {
        return this.defaultIdentity;
    }

    /**
     * Set the defaultIdentity property: The default identity for accessing key vault used in features like customer
     * managed keys. The default identity needs to be explicitly set by the users. It can be "FirstPartyIdentity",
     * "SystemAssignedIdentity" and more.
     *
     * @param defaultIdentity the defaultIdentity value to set.
     * @return the DatabaseAccountGetProperties object itself.
     */
    public DatabaseAccountGetProperties withDefaultIdentity(String defaultIdentity) {
        this.defaultIdentity = defaultIdentity;
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Whether requests from Public Network are allowed.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: Whether requests from Public Network are allowed.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the DatabaseAccountGetProperties object itself.
     */
    public DatabaseAccountGetProperties withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the enableFreeTier property: Flag to indicate whether Free Tier is enabled.
     *
     * @return the enableFreeTier value.
     */
    public Boolean enableFreeTier() {
        return this.enableFreeTier;
    }

    /**
     * Set the enableFreeTier property: Flag to indicate whether Free Tier is enabled.
     *
     * @param enableFreeTier the enableFreeTier value to set.
     * @return the DatabaseAccountGetProperties object itself.
     */
    public DatabaseAccountGetProperties withEnableFreeTier(Boolean enableFreeTier) {
        this.enableFreeTier = enableFreeTier;
        return this;
    }

    /**
     * Get the apiProperties property: API specific properties.
     *
     * @return the apiProperties value.
     */
    public ApiProperties apiProperties() {
        return this.apiProperties;
    }

    /**
     * Set the apiProperties property: API specific properties.
     *
     * @param apiProperties the apiProperties value to set.
     * @return the DatabaseAccountGetProperties object itself.
     */
    public DatabaseAccountGetProperties withApiProperties(ApiProperties apiProperties) {
        this.apiProperties = apiProperties;
        return this;
    }

    /**
     * Get the enableAnalyticalStorage property: Flag to indicate whether to enable storage analytics.
     *
     * @return the enableAnalyticalStorage value.
     */
    public Boolean enableAnalyticalStorage() {
        return this.enableAnalyticalStorage;
    }

    /**
     * Set the enableAnalyticalStorage property: Flag to indicate whether to enable storage analytics.
     *
     * @param enableAnalyticalStorage the enableAnalyticalStorage value to set.
     * @return the DatabaseAccountGetProperties object itself.
     */
    public DatabaseAccountGetProperties withEnableAnalyticalStorage(Boolean enableAnalyticalStorage) {
        this.enableAnalyticalStorage = enableAnalyticalStorage;
        return this;
    }

    /**
     * Get the analyticalStorageConfiguration property: Analytical storage specific properties.
     *
     * @return the analyticalStorageConfiguration value.
     */
    public AnalyticalStorageConfiguration analyticalStorageConfiguration() {
        return this.analyticalStorageConfiguration;
    }

    /**
     * Set the analyticalStorageConfiguration property: Analytical storage specific properties.
     *
     * @param analyticalStorageConfiguration the analyticalStorageConfiguration value to set.
     * @return the DatabaseAccountGetProperties object itself.
     */
    public DatabaseAccountGetProperties withAnalyticalStorageConfiguration(
        AnalyticalStorageConfiguration analyticalStorageConfiguration) {
        this.analyticalStorageConfiguration = analyticalStorageConfiguration;
        return this;
    }

    /**
     * Get the instanceId property: A unique identifier assigned to the database account.
     *
     * @return the instanceId value.
     */
    public String instanceId() {
        return this.instanceId;
    }

    /**
     * Get the createMode property: Enum to indicate the mode of account creation.
     *
     * @return the createMode value.
     */
    public CreateMode createMode() {
        return this.createMode;
    }

    /**
     * Set the createMode property: Enum to indicate the mode of account creation.
     *
     * @param createMode the createMode value to set.
     * @return the DatabaseAccountGetProperties object itself.
     */
    public DatabaseAccountGetProperties withCreateMode(CreateMode createMode) {
        this.createMode = createMode;
        return this;
    }

    /**
     * Get the restoreParameters property: Parameters to indicate the information about the restore.
     *
     * @return the restoreParameters value.
     */
    public RestoreParameters restoreParameters() {
        return this.restoreParameters;
    }

    /**
     * Set the restoreParameters property: Parameters to indicate the information about the restore.
     *
     * @param restoreParameters the restoreParameters value to set.
     * @return the DatabaseAccountGetProperties object itself.
     */
    public DatabaseAccountGetProperties withRestoreParameters(RestoreParameters restoreParameters) {
        this.restoreParameters = restoreParameters;
        return this;
    }

    /**
     * Get the backupPolicy property: The object representing the policy for taking backups on an account.
     *
     * @return the backupPolicy value.
     */
    public BackupPolicy backupPolicy() {
        return this.backupPolicy;
    }

    /**
     * Set the backupPolicy property: The object representing the policy for taking backups on an account.
     *
     * @param backupPolicy the backupPolicy value to set.
     * @return the DatabaseAccountGetProperties object itself.
     */
    public DatabaseAccountGetProperties withBackupPolicy(BackupPolicy backupPolicy) {
        this.backupPolicy = backupPolicy;
        return this;
    }

    /**
     * Get the cors property: The CORS policy for the Cosmos DB database account.
     *
     * @return the cors value.
     */
    public List<CorsPolicy> cors() {
        return this.cors;
    }

    /**
     * Set the cors property: The CORS policy for the Cosmos DB database account.
     *
     * @param cors the cors value to set.
     * @return the DatabaseAccountGetProperties object itself.
     */
    public DatabaseAccountGetProperties withCors(List<CorsPolicy> cors) {
        this.cors = cors;
        return this;
    }

    /**
     * Get the networkAclBypass property: Indicates what services are allowed to bypass firewall checks.
     *
     * @return the networkAclBypass value.
     */
    public NetworkAclBypass networkAclBypass() {
        return this.networkAclBypass;
    }

    /**
     * Set the networkAclBypass property: Indicates what services are allowed to bypass firewall checks.
     *
     * @param networkAclBypass the networkAclBypass value to set.
     * @return the DatabaseAccountGetProperties object itself.
     */
    public DatabaseAccountGetProperties withNetworkAclBypass(NetworkAclBypass networkAclBypass) {
        this.networkAclBypass = networkAclBypass;
        return this;
    }

    /**
     * Get the networkAclBypassResourceIds property: An array that contains the Resource Ids for Network Acl Bypass for
     * the Cosmos DB account.
     *
     * @return the networkAclBypassResourceIds value.
     */
    public List<String> networkAclBypassResourceIds() {
        return this.networkAclBypassResourceIds;
    }

    /**
     * Set the networkAclBypassResourceIds property: An array that contains the Resource Ids for Network Acl Bypass for
     * the Cosmos DB account.
     *
     * @param networkAclBypassResourceIds the networkAclBypassResourceIds value to set.
     * @return the DatabaseAccountGetProperties object itself.
     */
    public DatabaseAccountGetProperties withNetworkAclBypassResourceIds(List<String> networkAclBypassResourceIds) {
        this.networkAclBypassResourceIds = networkAclBypassResourceIds;
        return this;
    }

    /**
     * Get the disableLocalAuth property: Opt-out of local authentication and ensure only MSI and AAD can be used
     * exclusively for authentication.
     *
     * @return the disableLocalAuth value.
     */
    public Boolean disableLocalAuth() {
        return this.disableLocalAuth;
    }

    /**
     * Set the disableLocalAuth property: Opt-out of local authentication and ensure only MSI and AAD can be used
     * exclusively for authentication.
     *
     * @param disableLocalAuth the disableLocalAuth value to set.
     * @return the DatabaseAccountGetProperties object itself.
     */
    public DatabaseAccountGetProperties withDisableLocalAuth(Boolean disableLocalAuth) {
        this.disableLocalAuth = disableLocalAuth;
        return this;
    }

    /**
     * Get the capacity property: The object that represents all properties related to capacity enforcement on an
     * account.
     *
     * @return the capacity value.
     */
    public Capacity capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity property: The object that represents all properties related to capacity enforcement on an
     * account.
     *
     * @param capacity the capacity value to set.
     * @return the DatabaseAccountGetProperties object itself.
     */
    public DatabaseAccountGetProperties withCapacity(Capacity capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Get the keysMetadata property: The object that represents the metadata for the Account Keys of the Cosmos DB
     * account.
     *
     * @return the keysMetadata value.
     */
    public DatabaseAccountKeysMetadata keysMetadata() {
        return this.keysMetadata;
    }

    /**
     * Get the enablePartitionMerge property: Flag to indicate enabling/disabling of Partition Merge feature on the
     * account.
     *
     * @return the enablePartitionMerge value.
     */
    public Boolean enablePartitionMerge() {
        return this.enablePartitionMerge;
    }

    /**
     * Set the enablePartitionMerge property: Flag to indicate enabling/disabling of Partition Merge feature on the
     * account.
     *
     * @param enablePartitionMerge the enablePartitionMerge value to set.
     * @return the DatabaseAccountGetProperties object itself.
     */
    public DatabaseAccountGetProperties withEnablePartitionMerge(Boolean enablePartitionMerge) {
        this.enablePartitionMerge = enablePartitionMerge;
        return this;
    }

    /**
     * Get the minimalTlsVersion property: Indicates the minimum allowed Tls version. The default is Tls 1.0, except for
     * Cassandra and Mongo API's, which only work with Tls 1.2.
     *
     * @return the minimalTlsVersion value.
     */
    public MinimalTlsVersion minimalTlsVersion() {
        return this.minimalTlsVersion;
    }

    /**
     * Set the minimalTlsVersion property: Indicates the minimum allowed Tls version. The default is Tls 1.0, except for
     * Cassandra and Mongo API's, which only work with Tls 1.2.
     *
     * @param minimalTlsVersion the minimalTlsVersion value to set.
     * @return the DatabaseAccountGetProperties object itself.
     */
    public DatabaseAccountGetProperties withMinimalTlsVersion(MinimalTlsVersion minimalTlsVersion) {
        this.minimalTlsVersion = minimalTlsVersion;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ipRules() != null) {
            ipRules().forEach(e -> e.validate());
        }
        if (consistencyPolicy() != null) {
            consistencyPolicy().validate();
        }
        if (capabilities() != null) {
            capabilities().forEach(e -> e.validate());
        }
        if (writeLocations() != null) {
            writeLocations().forEach(e -> e.validate());
        }
        if (readLocations() != null) {
            readLocations().forEach(e -> e.validate());
        }
        if (locations() != null) {
            locations().forEach(e -> e.validate());
        }
        if (failoverPolicies() != null) {
            failoverPolicies().forEach(e -> e.validate());
        }
        if (virtualNetworkRules() != null) {
            virtualNetworkRules().forEach(e -> e.validate());
        }
        if (privateEndpointConnections() != null) {
            privateEndpointConnections().forEach(e -> e.validate());
        }
        if (apiProperties() != null) {
            apiProperties().validate();
        }
        if (analyticalStorageConfiguration() != null) {
            analyticalStorageConfiguration().validate();
        }
        if (restoreParameters() != null) {
            restoreParameters().validate();
        }
        if (backupPolicy() != null) {
            backupPolicy().validate();
        }
        if (cors() != null) {
            cors().forEach(e -> e.validate());
        }
        if (capacity() != null) {
            capacity().validate();
        }
        if (keysMetadata() != null) {
            keysMetadata().validate();
        }
    }
}
