// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.generated;

import com.azure.resourcemanager.newrelicobservability.models.AccountCreationSource;
import com.azure.resourcemanager.newrelicobservability.models.AccountInfo;
import com.azure.resourcemanager.newrelicobservability.models.BillingCycle;
import com.azure.resourcemanager.newrelicobservability.models.ManagedServiceIdentity;
import com.azure.resourcemanager.newrelicobservability.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.newrelicobservability.models.NewRelicAccountProperties;
import com.azure.resourcemanager.newrelicobservability.models.NewRelicMonitorResource;
import com.azure.resourcemanager.newrelicobservability.models.NewRelicSingleSignOnProperties;
import com.azure.resourcemanager.newrelicobservability.models.OrgCreationSource;
import com.azure.resourcemanager.newrelicobservability.models.OrganizationInfo;
import com.azure.resourcemanager.newrelicobservability.models.PlanData;
import com.azure.resourcemanager.newrelicobservability.models.ProvisioningState;
import com.azure.resourcemanager.newrelicobservability.models.SingleSignOnStates;
import com.azure.resourcemanager.newrelicobservability.models.UsageType;
import com.azure.resourcemanager.newrelicobservability.models.UserAssignedIdentity;
import com.azure.resourcemanager.newrelicobservability.models.UserInfo;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

/** Samples for Monitors Update. */
public final class MonitorsUpdateSamples {
    /*
     * x-ms-original-file: specification/newrelic/resource-manager/NewRelic.Observability/stable/2022-07-01/examples/Monitors_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: Monitors_Update_MaximumSet_Gen.
     *
     * @param manager Entry point to NewRelicObservabilityManager.
     */
    public static void monitorsUpdateMaximumSetGen(
        com.azure.resourcemanager.newrelicobservability.NewRelicObservabilityManager manager) {
        NewRelicMonitorResource resource =
            manager
                .monitors()
                .getByResourceGroupWithResponse("rgNewRelic", "cdlymktqw", com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withTags(mapOf("key164", "jqakdrrmmyzytqu"))
            .withIdentity(
                new ManagedServiceIdentity()
                    .withType(ManagedServiceIdentityType.NONE)
                    .withUserAssignedIdentities(mapOf("key8903", new UserAssignedIdentity())))
            .withNewRelicAccountProperties(
                new NewRelicAccountProperties()
                    .withUserId("vcscxlncofcuduadesd")
                    .withAccountInfo(
                        new AccountInfo()
                            .withAccountId("xhqmg")
                            .withIngestionKey("fakeTokenPlaceholder")
                            .withRegion("ljcf"))
                    .withOrganizationInfo(new OrganizationInfo().withOrganizationId("k"))
                    .withSingleSignOnProperties(
                        new NewRelicSingleSignOnProperties()
                            .withSingleSignOnState(SingleSignOnStates.INITIAL)
                            .withEnterpriseAppId("kwiwfz")
                            .withSingleSignOnUrl("kvseueuljsxmfwpqctz")
                            .withProvisioningState(ProvisioningState.ACCEPTED)))
            .withUserInfo(
                new UserInfo()
                    .withFirstName("vdftzcggirefejajwahhwhyibutramdaotvnuf")
                    .withLastName("bcsztgqovdlmzfkjdrngidwzqsevagexzzilnlc")
                    .withEmailAddress("%6%@4-g.N1.3F-kI1.Ue-.lJso")
                    .withPhoneNumber("krf")
                    .withCountry("hslqnwdanrconqyekwbnttaetv"))
            .withPlanData(
                new PlanData()
                    .withUsageType(UsageType.PAYG)
                    .withBillingCycle(BillingCycle.YEARLY)
                    .withPlanDetails("tbbiaga")
                    .withEffectiveDate(OffsetDateTime.parse("2022-12-05T14:11:37.786Z")))
            .withOrgCreationSource(OrgCreationSource.LIFTR)
            .withAccountCreationSource(AccountCreationSource.LIFTR)
            .apply();
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
