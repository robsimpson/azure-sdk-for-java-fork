// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.resourcemanager.apimanagement.fluent.models.ApiManagementServiceGetSsoTokenResultInner;

/** An immutable client-side representation of ApiManagementServiceGetSsoTokenResult. */
public interface ApiManagementServiceGetSsoTokenResult {
    /**
     * Gets the redirectUri property: Redirect URL to the Publisher Portal containing the SSO token.
     *
     * @return the redirectUri value.
     */
    String redirectUri();

    /**
     * Gets the inner com.azure.resourcemanager.apimanagement.fluent.models.ApiManagementServiceGetSsoTokenResultInner
     * object.
     *
     * @return the inner object.
     */
    ApiManagementServiceGetSsoTokenResultInner innerModel();
}
