// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.generated;

import com.azure.resourcemanager.redisenterprise.models.ImportClusterParameters;
import java.util.Arrays;

/** Samples for Databases ImportMethod. */
public final class DatabasesImportMethodSamples {
    /*
     * x-ms-original-file: specification/redisenterprise/resource-manager/Microsoft.Cache/preview/2023-03-01-preview/examples/RedisEnterpriseDatabasesImport.json
     */
    /**
     * Sample code: RedisEnterpriseDatabasesImport.
     *
     * @param manager Entry point to RedisEnterpriseManager.
     */
    public static void redisEnterpriseDatabasesImport(
        com.azure.resourcemanager.redisenterprise.RedisEnterpriseManager manager) {
        manager
            .databases()
            .importMethod(
                "rg1",
                "cache1",
                "default",
                new ImportClusterParameters()
                    .withSasUris(
                        Arrays
                            .asList(
                                "https://contosostorage.blob.core.window.net/urltoBlobFile1?sasKeyParameters",
                                "https://contosostorage.blob.core.window.net/urltoBlobFile2?sasKeyParameters")),
                com.azure.core.util.Context.NONE);
    }
}
