// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.ApplicationGatewayConnectionDraining;
import com.azure.resourcemanager.network.models.ApplicationGatewayCookieBasedAffinity;
import com.azure.resourcemanager.network.models.ApplicationGatewayProtocol;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of Backend address pool settings of an application gateway. */
@Fluent
public final class ApplicationGatewayBackendHttpSettingsPropertiesFormat {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(ApplicationGatewayBackendHttpSettingsPropertiesFormat.class);

    /*
     * The destination port on the backend.
     */
    @JsonProperty(value = "port")
    private Integer port;

    /*
     * The protocol used to communicate with the backend. Possible values are
     * 'Http' and 'Https'.
     */
    @JsonProperty(value = "protocol")
    private ApplicationGatewayProtocol protocol;

    /*
     * Cookie based affinity.
     */
    @JsonProperty(value = "cookieBasedAffinity")
    private ApplicationGatewayCookieBasedAffinity cookieBasedAffinity;

    /*
     * Request timeout in seconds. Application Gateway will fail the request if
     * response is not received within RequestTimeout. Acceptable values are
     * from 1 second to 86400 seconds.
     */
    @JsonProperty(value = "requestTimeout")
    private Integer requestTimeout;

    /*
     * Probe resource of an application gateway.
     */
    @JsonProperty(value = "probe")
    private SubResource probe;

    /*
     * Array of references to application gateway authentication certificates.
     */
    @JsonProperty(value = "authenticationCertificates")
    private List<SubResource> authenticationCertificates;

    /*
     * Array of references to application gateway trusted root certificates.
     */
    @JsonProperty(value = "trustedRootCertificates")
    private List<SubResource> trustedRootCertificates;

    /*
     * Connection draining of the backend http settings resource.
     */
    @JsonProperty(value = "connectionDraining")
    private ApplicationGatewayConnectionDraining connectionDraining;

    /*
     * Host header to be sent to the backend servers.
     */
    @JsonProperty(value = "hostName")
    private String hostname;

    /*
     * Whether to pick host header should be picked from the host name of the
     * backend server. Default value is false.
     */
    @JsonProperty(value = "pickHostNameFromBackendAddress")
    private Boolean pickHostnameFromBackendAddress;

    /*
     * Cookie name to use for the affinity cookie.
     */
    @JsonProperty(value = "affinityCookieName")
    private String affinityCookieName;

    /*
     * Whether the probe is enabled. Default value is false.
     */
    @JsonProperty(value = "probeEnabled")
    private Boolean probeEnabled;

    /*
     * Path which should be used as a prefix for all HTTP requests. Null means
     * no path will be prefixed. Default value is null.
     */
    @JsonProperty(value = "path")
    private String path;

    /*
     * Provisioning state of the backend http settings resource. Possible
     * values are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "provisioningState")
    private String provisioningState;

    /**
     * Get the port property: The destination port on the backend.
     *
     * @return the port value.
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set the port property: The destination port on the backend.
     *
     * @param port the port value to set.
     * @return the ApplicationGatewayBackendHttpSettingsPropertiesFormat object itself.
     */
    public ApplicationGatewayBackendHttpSettingsPropertiesFormat withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Get the protocol property: The protocol used to communicate with the backend. Possible values are 'Http' and
     * 'Https'.
     *
     * @return the protocol value.
     */
    public ApplicationGatewayProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: The protocol used to communicate with the backend. Possible values are 'Http' and
     * 'Https'.
     *
     * @param protocol the protocol value to set.
     * @return the ApplicationGatewayBackendHttpSettingsPropertiesFormat object itself.
     */
    public ApplicationGatewayBackendHttpSettingsPropertiesFormat withProtocol(ApplicationGatewayProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the cookieBasedAffinity property: Cookie based affinity.
     *
     * @return the cookieBasedAffinity value.
     */
    public ApplicationGatewayCookieBasedAffinity cookieBasedAffinity() {
        return this.cookieBasedAffinity;
    }

    /**
     * Set the cookieBasedAffinity property: Cookie based affinity.
     *
     * @param cookieBasedAffinity the cookieBasedAffinity value to set.
     * @return the ApplicationGatewayBackendHttpSettingsPropertiesFormat object itself.
     */
    public ApplicationGatewayBackendHttpSettingsPropertiesFormat withCookieBasedAffinity(
        ApplicationGatewayCookieBasedAffinity cookieBasedAffinity) {
        this.cookieBasedAffinity = cookieBasedAffinity;
        return this;
    }

    /**
     * Get the requestTimeout property: Request timeout in seconds. Application Gateway will fail the request if
     * response is not received within RequestTimeout. Acceptable values are from 1 second to 86400 seconds.
     *
     * @return the requestTimeout value.
     */
    public Integer requestTimeout() {
        return this.requestTimeout;
    }

    /**
     * Set the requestTimeout property: Request timeout in seconds. Application Gateway will fail the request if
     * response is not received within RequestTimeout. Acceptable values are from 1 second to 86400 seconds.
     *
     * @param requestTimeout the requestTimeout value to set.
     * @return the ApplicationGatewayBackendHttpSettingsPropertiesFormat object itself.
     */
    public ApplicationGatewayBackendHttpSettingsPropertiesFormat withRequestTimeout(Integer requestTimeout) {
        this.requestTimeout = requestTimeout;
        return this;
    }

    /**
     * Get the probe property: Probe resource of an application gateway.
     *
     * @return the probe value.
     */
    public SubResource probe() {
        return this.probe;
    }

    /**
     * Set the probe property: Probe resource of an application gateway.
     *
     * @param probe the probe value to set.
     * @return the ApplicationGatewayBackendHttpSettingsPropertiesFormat object itself.
     */
    public ApplicationGatewayBackendHttpSettingsPropertiesFormat withProbe(SubResource probe) {
        this.probe = probe;
        return this;
    }

    /**
     * Get the authenticationCertificates property: Array of references to application gateway authentication
     * certificates.
     *
     * @return the authenticationCertificates value.
     */
    public List<SubResource> authenticationCertificates() {
        return this.authenticationCertificates;
    }

    /**
     * Set the authenticationCertificates property: Array of references to application gateway authentication
     * certificates.
     *
     * @param authenticationCertificates the authenticationCertificates value to set.
     * @return the ApplicationGatewayBackendHttpSettingsPropertiesFormat object itself.
     */
    public ApplicationGatewayBackendHttpSettingsPropertiesFormat withAuthenticationCertificates(
        List<SubResource> authenticationCertificates) {
        this.authenticationCertificates = authenticationCertificates;
        return this;
    }

    /**
     * Get the trustedRootCertificates property: Array of references to application gateway trusted root certificates.
     *
     * @return the trustedRootCertificates value.
     */
    public List<SubResource> trustedRootCertificates() {
        return this.trustedRootCertificates;
    }

    /**
     * Set the trustedRootCertificates property: Array of references to application gateway trusted root certificates.
     *
     * @param trustedRootCertificates the trustedRootCertificates value to set.
     * @return the ApplicationGatewayBackendHttpSettingsPropertiesFormat object itself.
     */
    public ApplicationGatewayBackendHttpSettingsPropertiesFormat withTrustedRootCertificates(
        List<SubResource> trustedRootCertificates) {
        this.trustedRootCertificates = trustedRootCertificates;
        return this;
    }

    /**
     * Get the connectionDraining property: Connection draining of the backend http settings resource.
     *
     * @return the connectionDraining value.
     */
    public ApplicationGatewayConnectionDraining connectionDraining() {
        return this.connectionDraining;
    }

    /**
     * Set the connectionDraining property: Connection draining of the backend http settings resource.
     *
     * @param connectionDraining the connectionDraining value to set.
     * @return the ApplicationGatewayBackendHttpSettingsPropertiesFormat object itself.
     */
    public ApplicationGatewayBackendHttpSettingsPropertiesFormat withConnectionDraining(
        ApplicationGatewayConnectionDraining connectionDraining) {
        this.connectionDraining = connectionDraining;
        return this;
    }

    /**
     * Get the hostname property: Host header to be sent to the backend servers.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Set the hostname property: Host header to be sent to the backend servers.
     *
     * @param hostname the hostname value to set.
     * @return the ApplicationGatewayBackendHttpSettingsPropertiesFormat object itself.
     */
    public ApplicationGatewayBackendHttpSettingsPropertiesFormat withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Get the pickHostnameFromBackendAddress property: Whether to pick host header should be picked from the host name
     * of the backend server. Default value is false.
     *
     * @return the pickHostnameFromBackendAddress value.
     */
    public Boolean pickHostnameFromBackendAddress() {
        return this.pickHostnameFromBackendAddress;
    }

    /**
     * Set the pickHostnameFromBackendAddress property: Whether to pick host header should be picked from the host name
     * of the backend server. Default value is false.
     *
     * @param pickHostnameFromBackendAddress the pickHostnameFromBackendAddress value to set.
     * @return the ApplicationGatewayBackendHttpSettingsPropertiesFormat object itself.
     */
    public ApplicationGatewayBackendHttpSettingsPropertiesFormat withPickHostnameFromBackendAddress(
        Boolean pickHostnameFromBackendAddress) {
        this.pickHostnameFromBackendAddress = pickHostnameFromBackendAddress;
        return this;
    }

    /**
     * Get the affinityCookieName property: Cookie name to use for the affinity cookie.
     *
     * @return the affinityCookieName value.
     */
    public String affinityCookieName() {
        return this.affinityCookieName;
    }

    /**
     * Set the affinityCookieName property: Cookie name to use for the affinity cookie.
     *
     * @param affinityCookieName the affinityCookieName value to set.
     * @return the ApplicationGatewayBackendHttpSettingsPropertiesFormat object itself.
     */
    public ApplicationGatewayBackendHttpSettingsPropertiesFormat withAffinityCookieName(String affinityCookieName) {
        this.affinityCookieName = affinityCookieName;
        return this;
    }

    /**
     * Get the probeEnabled property: Whether the probe is enabled. Default value is false.
     *
     * @return the probeEnabled value.
     */
    public Boolean probeEnabled() {
        return this.probeEnabled;
    }

    /**
     * Set the probeEnabled property: Whether the probe is enabled. Default value is false.
     *
     * @param probeEnabled the probeEnabled value to set.
     * @return the ApplicationGatewayBackendHttpSettingsPropertiesFormat object itself.
     */
    public ApplicationGatewayBackendHttpSettingsPropertiesFormat withProbeEnabled(Boolean probeEnabled) {
        this.probeEnabled = probeEnabled;
        return this;
    }

    /**
     * Get the path property: Path which should be used as a prefix for all HTTP requests. Null means no path will be
     * prefixed. Default value is null.
     *
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: Path which should be used as a prefix for all HTTP requests. Null means no path will be
     * prefixed. Default value is null.
     *
     * @param path the path value to set.
     * @return the ApplicationGatewayBackendHttpSettingsPropertiesFormat object itself.
     */
    public ApplicationGatewayBackendHttpSettingsPropertiesFormat withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the backend http settings resource. Possible values
     * are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Provisioning state of the backend http settings resource. Possible values
     * are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the ApplicationGatewayBackendHttpSettingsPropertiesFormat object itself.
     */
    public ApplicationGatewayBackendHttpSettingsPropertiesFormat withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (connectionDraining() != null) {
            connectionDraining().validate();
        }
    }
}
