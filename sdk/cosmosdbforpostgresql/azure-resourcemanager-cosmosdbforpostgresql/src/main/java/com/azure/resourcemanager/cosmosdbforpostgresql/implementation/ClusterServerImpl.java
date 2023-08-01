// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmosdbforpostgresql.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.cosmosdbforpostgresql.fluent.models.ClusterServerInner;
import com.azure.resourcemanager.cosmosdbforpostgresql.models.ClusterServer;
import com.azure.resourcemanager.cosmosdbforpostgresql.models.ServerRole;

public final class ClusterServerImpl implements ClusterServer {
    private ClusterServerInner innerObject;

    private final com.azure.resourcemanager.cosmosdbforpostgresql.CosmosDBForPostgreSqlManager serviceManager;

    ClusterServerImpl(
        ClusterServerInner innerObject,
        com.azure.resourcemanager.cosmosdbforpostgresql.CosmosDBForPostgreSqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String fullyQualifiedDomainName() {
        return this.innerModel().fullyQualifiedDomainName();
    }

    public ServerRole role() {
        return this.innerModel().role();
    }

    public String state() {
        return this.innerModel().state();
    }

    public String haState() {
        return this.innerModel().haState();
    }

    public String availabilityZone() {
        return this.innerModel().availabilityZone();
    }

    public String postgresqlVersion() {
        return this.innerModel().postgresqlVersion();
    }

    public String citusVersion() {
        return this.innerModel().citusVersion();
    }

    public String serverEdition() {
        return this.innerModel().serverEdition();
    }

    public Integer storageQuotaInMb() {
        return this.innerModel().storageQuotaInMb();
    }

    public Integer vCores() {
        return this.innerModel().vCores();
    }

    public Boolean enableHa() {
        return this.innerModel().enableHa();
    }

    public Boolean enablePublicIpAccess() {
        return this.innerModel().enablePublicIpAccess();
    }

    public Boolean isReadOnly() {
        return this.innerModel().isReadOnly();
    }

    public String administratorLogin() {
        return this.innerModel().administratorLogin();
    }

    public ClusterServerInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.cosmosdbforpostgresql.CosmosDBForPostgreSqlManager manager() {
        return this.serviceManager;
    }
}
