// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.workflow.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public final class WorkflowCreateOrUpdateTests extends PurviewWorkflowClientTestBase {
    @Test
    @Disabled
    public void testWorkflowCreateOrUpdateTests() {
        BinaryData workflowCreateOrUpdateCommand =
                BinaryData.fromString(
                        "{\"name\":\"Create glossary term workflow\",\"description\":\"\",\"actionDag\":{\"actions\":{\"Condition\":{\"type\":\"If\",\"actions\":{\"Create glossary term\":{\"type\":\"CreateTerm\",\"runAfter\":{}},\"Send email notification\":{\"type\":\"EmailNotification\",\"inputs\":{\"parameters\":{\"emailMessage\":\"Your request for Glossary Term @{triggerBody()['request']['term']['name']} is approved.\",\"emailRecipients\":[\"@{triggerBody()['request']['requestor']}\"],\"emailSubject\":\"Glossary Term Create - APPROVED\"}},\"runAfter\":{\"Create glossary term\":[\"Succeeded\"]}}},\"else\":{\"actions\":{\"Send reject email notification\":{\"type\":\"EmailNotification\",\"inputs\":{\"parameters\":{\"emailMessage\":\"Your request for Glossary Term @{triggerBody()['request']['term']['name']} is rejected.\",\"emailRecipients\":[\"@{triggerBody()['request']['requestor']}\"],\"emailSubject\":\"Glossary Term Create - REJECTED\"}},\"runAfter\":{}}}},\"expression\":{\"and\":[{\"equals\":[\"@outputs('Start and wait for an approval')['body/outcome']\",\"Approved\"]}]},\"runAfter\":{\"Start and wait for an approval\":[\"Succeeded\"]}},\"Start and wait for an approval\":{\"type\":\"Approval\",\"inputs\":{\"parameters\":{\"approvalType\":\"PendingOnAll\",\"assignedTo\":[\"eece94d9-0619-4669-bb8a-d6ecec5220bc\"],\"title\":\"Approval Request for Create Glossary Term\"}},\"runAfter\":{}}}},\"isEnabled\":true,\"triggers\":[{\"type\":\"when_term_creation_is_requested\",\"underGlossaryHierarchy\":\"/glossaries/20031e20-b4df-4a66-a61d-1b0716f3fa48\"}]}");
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                purviewWorkflowClient.createOrReplaceWorkflowWithResponse(
                        "4afb5752-e47f-43a1-8ba7-c696bf8d2745", workflowCreateOrUpdateCommand, requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals(
                BinaryData.fromString(
                                "{\"name\":\"Create glossary term workflow\",\"description\":\"\",\"actionDag\":{\"actions\":{\"Condition\":{\"type\":\"If\",\"actions\":{\"Create glossary term\":{\"type\":\"CreateTerm\",\"runAfter\":{}},\"Send email notification\":{\"type\":\"EmailNotification\",\"inputs\":{\"parameters\":{\"emailMessage\":\"Your request for Glossary Term @{triggerBody()['request']['term']['name']} is approved.\",\"emailRecipients\":[\"@{triggerBody()['request']['requestor']}\"],\"emailSubject\":\"Glossary Term Create - APPROVED\"}},\"runAfter\":{\"Create glossary term\":[\"Succeeded\"]},\"runtimeConfiguration\":{\"secureInput\":false,\"secureOutput\":false}}},\"else\":{\"actions\":{\"Send reject email notification\":{\"type\":\"EmailNotification\",\"inputs\":{\"parameters\":{\"emailMessage\":\"Your request for Glossary Term @{triggerBody()['request']['term']['name']} is rejected.\",\"emailRecipients\":[\"@{triggerBody()['request']['requestor']}\"],\"emailSubject\":\"Glossary Term Create - REJECTED\"}},\"runAfter\":{},\"runtimeConfiguration\":{\"secureInput\":false,\"secureOutput\":false}}}},\"expression\":{\"and\":[{\"equals\":[\"@outputs('Start and wait for an approval')['body/outcome']\",\"Approved\"]}]},\"runAfter\":{\"Start and wait for an approval\":[\"Succeeded\"]}},\"Start and wait for an approval\":{\"type\":\"Approval\",\"inputs\":{\"parameters\":{\"approvalType\":\"PendingOnAll\",\"assignedTo\":[\"eece94d9-0619-4669-bb8a-d6ecec5220bc\"],\"title\":\"Approval Request for Create Glossary Term\"}},\"runAfter\":{}}}},\"createdBy\":\"eece94d9-0619-4669-bb8a-d6ecec5220bc\",\"createdTime\":\"2023-01-11T07:05:22.812901453Z\",\"id\":\"179682a4-917d-11ed-a1eb-0242ac120002\",\"isEnabled\":true,\"lastUpdateTime\":\"2023-01-11T07:05:22.812901453Z\",\"triggers\":[{\"type\":\"when_term_creation_is_requested\",\"underGlossaryHierarchy\":\"/glossaries/20031e20-b4df-4a66-a61d-1b0716f3fa48\"}],\"updatedBy\":\"eece94d9-0619-4669-bb8a-d6ecec5220bc\"}")
                        .toObject(Object.class),
                response.getValue().toObject(Object.class));
    }
}
