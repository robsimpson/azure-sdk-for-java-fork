// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.GitHubRepositoryInner;
import com.azure.resourcemanager.security.models.DevOpsProvisioningState;
import com.azure.resourcemanager.security.models.GitHubRepositoryProperties;
import com.azure.resourcemanager.security.models.OnboardingState;
import org.junit.jupiter.api.Assertions;

public final class GitHubRepositoryInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GitHubRepositoryInner model = BinaryData.fromString(
            "{\"properties\":{\"provisioningStatusMessage\":\"dpuenxkgtlzlmtr\",\"provisioningStatusUpdateTimeUtc\":\"2021-08-11T14:35:37Z\",\"provisioningState\":\"Canceled\",\"repoId\":\"hzkbnbmx\",\"repoName\":\"mwt\",\"repoFullName\":\"eqzusitoqcahfs\",\"onboardingState\":\"NotOnboarded\",\"repoUrl\":\"lreesrfwsszvlcwl\",\"parentOwnerName\":\"olntfx\"},\"id\":\"crqmipfjwfoygi\",\"name\":\"mshxxba\",\"type\":\"zabulnvgsk\"}")
            .toObject(GitHubRepositoryInner.class);
        Assertions.assertEquals(DevOpsProvisioningState.CANCELED, model.properties().provisioningState());
        Assertions.assertEquals(OnboardingState.NOT_ONBOARDED, model.properties().onboardingState());
        Assertions.assertEquals("olntfx", model.properties().parentOwnerName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GitHubRepositoryInner model = new GitHubRepositoryInner()
            .withProperties(new GitHubRepositoryProperties().withProvisioningState(DevOpsProvisioningState.CANCELED)
                .withOnboardingState(OnboardingState.NOT_ONBOARDED)
                .withParentOwnerName("olntfx"));
        model = BinaryData.fromObject(model).toObject(GitHubRepositoryInner.class);
        Assertions.assertEquals(DevOpsProvisioningState.CANCELED, model.properties().provisioningState());
        Assertions.assertEquals(OnboardingState.NOT_ONBOARDED, model.properties().onboardingState());
        Assertions.assertEquals("olntfx", model.properties().parentOwnerName());
    }
}
