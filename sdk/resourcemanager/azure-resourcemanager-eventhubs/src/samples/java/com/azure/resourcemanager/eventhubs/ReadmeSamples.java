// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.eventhubs;

import com.azure.core.credential.TokenCredential;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.identity.DefaultAzureCredentialBuilder;

/**
 * Code samples for the README.md
 */
public class ReadmeSamples {

    public void authenticate() {
        // BEGIN: readme-sample-authenticate
        AzureProfile profile = new AzureProfile(AzureEnvironment.AZURE);
        TokenCredential credential = new DefaultAzureCredentialBuilder()
            .authorityHost(profile.getEnvironment().getActiveDirectoryEndpoint())
            .build();
        EventHubsManager manager = EventHubsManager
            .authenticate(credential, profile);
        // END: readme-sample-authenticate
    }
}
