// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventgrid.models.DataResidencyBoundary;
import com.azure.resourcemanager.eventgrid.models.DomainProvisioningState;
import com.azure.resourcemanager.eventgrid.models.EventTypeInfo;
import com.azure.resourcemanager.eventgrid.models.InboundIpRule;
import com.azure.resourcemanager.eventgrid.models.InputSchema;
import com.azure.resourcemanager.eventgrid.models.InputSchemaMapping;
import com.azure.resourcemanager.eventgrid.models.PublicNetworkAccess;
import com.azure.resourcemanager.eventgrid.models.TlsVersion;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of the Event Grid Domain Resource. */
@Fluent
public final class DomainProperties {
    /*
     * The privateEndpointConnections property.
     */
    @JsonProperty(value = "privateEndpointConnections", access = JsonProperty.Access.WRITE_ONLY)
    private List<PrivateEndpointConnectionInner> privateEndpointConnections;

    /*
     * Provisioning state of the Event Grid Domain Resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private DomainProvisioningState provisioningState;

    /*
     * Minimum TLS version of the publisher allowed to publish to this domain
     */
    @JsonProperty(value = "minimumTlsVersionAllowed")
    private TlsVersion minimumTlsVersionAllowed;

    /*
     * Endpoint for the Event Grid Domain Resource which is used for publishing the events.
     */
    @JsonProperty(value = "endpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String endpoint;

    /*
     * This determines the format that Event Grid should expect for incoming events published to the Event Grid Domain
     * Resource.
     */
    @JsonProperty(value = "inputSchema")
    private InputSchema inputSchema;

    /*
     * Event Type Information for the domain. This information is provided by the publisher and can be used by the
     * subscriber to view different types of events that are published.
     */
    @JsonProperty(value = "eventTypeInfo")
    private EventTypeInfo eventTypeInfo;

    /*
     * Information about the InputSchemaMapping which specified the info about mapping event payload.
     */
    @JsonProperty(value = "inputSchemaMapping")
    private InputSchemaMapping inputSchemaMapping;

    /*
     * Metric resource id for the Event Grid Domain Resource.
     */
    @JsonProperty(value = "metricResourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String metricResourceId;

    /*
     * This determines if traffic is allowed over public network. By default it is enabled.
     * You can further restrict to specific IPs by configuring <seealso
     * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.DomainProperties.InboundIpRules" />
     */
    @JsonProperty(value = "publicNetworkAccess")
    private PublicNetworkAccess publicNetworkAccess;

    /*
     * This can be used to restrict traffic from specific IPs instead of all IPs. Note: These are considered only if
     * PublicNetworkAccess is enabled.
     */
    @JsonProperty(value = "inboundIpRules")
    private List<InboundIpRule> inboundIpRules;

    /*
     * This boolean is used to enable or disable local auth. Default value is false. When the property is set to true,
     * only AAD token will be used to authenticate if user is allowed to publish to the domain.
     */
    @JsonProperty(value = "disableLocalAuth")
    private Boolean disableLocalAuth;

    /*
     * This Boolean is used to specify the creation mechanism for 'all' the Event Grid Domain Topics associated with
     * this Event Grid Domain resource.
     * In this context, creation of domain topic can be auto-managed (when true) or self-managed (when false). The
     * default value for this property is true.
     * When this property is null or set to true, Event Grid is responsible of automatically creating the domain topic
     * when the first event subscription is
     * created at the scope of the domain topic. If this property is set to false, then creating the first event
     * subscription will require creating a domain topic
     * by the user. The self-management mode can be used if the user wants full control of when the domain topic is
     * created, while auto-managed mode provides the
     * flexibility to perform less operations and manage fewer resources by the user. Also, note that in auto-managed
     * creation mode, user is allowed to create the
     * domain topic on demand if needed.
     */
    @JsonProperty(value = "autoCreateTopicWithFirstSubscription")
    private Boolean autoCreateTopicWithFirstSubscription;

    /*
     * This Boolean is used to specify the deletion mechanism for 'all' the Event Grid Domain Topics associated with
     * this Event Grid Domain resource.
     * In this context, deletion of domain topic can be auto-managed (when true) or self-managed (when false). The
     * default value for this property is true.
     * When this property is set to true, Event Grid is responsible of automatically deleting the domain topic when the
     * last event subscription at the scope
     * of the domain topic is deleted. If this property is set to false, then the user needs to manually delete the
     * domain topic when it is no longer needed
     * (e.g., when last event subscription is deleted and the resource needs to be cleaned up). The self-management
     * mode can be used if the user wants full
     * control of when the domain topic needs to be deleted, while auto-managed mode provides the flexibility to
     * perform less operations and manage fewer
     * resources by the user.
     */
    @JsonProperty(value = "autoDeleteTopicWithLastSubscription")
    private Boolean autoDeleteTopicWithLastSubscription;

    /*
     * Data Residency Boundary of the resource.
     */
    @JsonProperty(value = "dataResidencyBoundary")
    private DataResidencyBoundary dataResidencyBoundary;

    /** Creates an instance of DomainProperties class. */
    public DomainProperties() {
    }

    /**
     * Get the privateEndpointConnections property: The privateEndpointConnections property.
     *
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Get the provisioningState property: Provisioning state of the Event Grid Domain Resource.
     *
     * @return the provisioningState value.
     */
    public DomainProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the minimumTlsVersionAllowed property: Minimum TLS version of the publisher allowed to publish to this
     * domain.
     *
     * @return the minimumTlsVersionAllowed value.
     */
    public TlsVersion minimumTlsVersionAllowed() {
        return this.minimumTlsVersionAllowed;
    }

    /**
     * Set the minimumTlsVersionAllowed property: Minimum TLS version of the publisher allowed to publish to this
     * domain.
     *
     * @param minimumTlsVersionAllowed the minimumTlsVersionAllowed value to set.
     * @return the DomainProperties object itself.
     */
    public DomainProperties withMinimumTlsVersionAllowed(TlsVersion minimumTlsVersionAllowed) {
        this.minimumTlsVersionAllowed = minimumTlsVersionAllowed;
        return this;
    }

    /**
     * Get the endpoint property: Endpoint for the Event Grid Domain Resource which is used for publishing the events.
     *
     * @return the endpoint value.
     */
    public String endpoint() {
        return this.endpoint;
    }

    /**
     * Get the inputSchema property: This determines the format that Event Grid should expect for incoming events
     * published to the Event Grid Domain Resource.
     *
     * @return the inputSchema value.
     */
    public InputSchema inputSchema() {
        return this.inputSchema;
    }

    /**
     * Set the inputSchema property: This determines the format that Event Grid should expect for incoming events
     * published to the Event Grid Domain Resource.
     *
     * @param inputSchema the inputSchema value to set.
     * @return the DomainProperties object itself.
     */
    public DomainProperties withInputSchema(InputSchema inputSchema) {
        this.inputSchema = inputSchema;
        return this;
    }

    /**
     * Get the eventTypeInfo property: Event Type Information for the domain. This information is provided by the
     * publisher and can be used by the subscriber to view different types of events that are published.
     *
     * @return the eventTypeInfo value.
     */
    public EventTypeInfo eventTypeInfo() {
        return this.eventTypeInfo;
    }

    /**
     * Set the eventTypeInfo property: Event Type Information for the domain. This information is provided by the
     * publisher and can be used by the subscriber to view different types of events that are published.
     *
     * @param eventTypeInfo the eventTypeInfo value to set.
     * @return the DomainProperties object itself.
     */
    public DomainProperties withEventTypeInfo(EventTypeInfo eventTypeInfo) {
        this.eventTypeInfo = eventTypeInfo;
        return this;
    }

    /**
     * Get the inputSchemaMapping property: Information about the InputSchemaMapping which specified the info about
     * mapping event payload.
     *
     * @return the inputSchemaMapping value.
     */
    public InputSchemaMapping inputSchemaMapping() {
        return this.inputSchemaMapping;
    }

    /**
     * Set the inputSchemaMapping property: Information about the InputSchemaMapping which specified the info about
     * mapping event payload.
     *
     * @param inputSchemaMapping the inputSchemaMapping value to set.
     * @return the DomainProperties object itself.
     */
    public DomainProperties withInputSchemaMapping(InputSchemaMapping inputSchemaMapping) {
        this.inputSchemaMapping = inputSchemaMapping;
        return this;
    }

    /**
     * Get the metricResourceId property: Metric resource id for the Event Grid Domain Resource.
     *
     * @return the metricResourceId value.
     */
    public String metricResourceId() {
        return this.metricResourceId;
    }

    /**
     * Get the publicNetworkAccess property: This determines if traffic is allowed over public network. By default it is
     * enabled. You can further restrict to specific IPs by configuring &lt;seealso
     * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.DomainProperties.InboundIpRules" /&gt;.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: This determines if traffic is allowed over public network. By default it is
     * enabled. You can further restrict to specific IPs by configuring &lt;seealso
     * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.DomainProperties.InboundIpRules" /&gt;.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the DomainProperties object itself.
     */
    public DomainProperties withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the inboundIpRules property: This can be used to restrict traffic from specific IPs instead of all IPs. Note:
     * These are considered only if PublicNetworkAccess is enabled.
     *
     * @return the inboundIpRules value.
     */
    public List<InboundIpRule> inboundIpRules() {
        return this.inboundIpRules;
    }

    /**
     * Set the inboundIpRules property: This can be used to restrict traffic from specific IPs instead of all IPs. Note:
     * These are considered only if PublicNetworkAccess is enabled.
     *
     * @param inboundIpRules the inboundIpRules value to set.
     * @return the DomainProperties object itself.
     */
    public DomainProperties withInboundIpRules(List<InboundIpRule> inboundIpRules) {
        this.inboundIpRules = inboundIpRules;
        return this;
    }

    /**
     * Get the disableLocalAuth property: This boolean is used to enable or disable local auth. Default value is false.
     * When the property is set to true, only AAD token will be used to authenticate if user is allowed to publish to
     * the domain.
     *
     * @return the disableLocalAuth value.
     */
    public Boolean disableLocalAuth() {
        return this.disableLocalAuth;
    }

    /**
     * Set the disableLocalAuth property: This boolean is used to enable or disable local auth. Default value is false.
     * When the property is set to true, only AAD token will be used to authenticate if user is allowed to publish to
     * the domain.
     *
     * @param disableLocalAuth the disableLocalAuth value to set.
     * @return the DomainProperties object itself.
     */
    public DomainProperties withDisableLocalAuth(Boolean disableLocalAuth) {
        this.disableLocalAuth = disableLocalAuth;
        return this;
    }

    /**
     * Get the autoCreateTopicWithFirstSubscription property: This Boolean is used to specify the creation mechanism for
     * 'all' the Event Grid Domain Topics associated with this Event Grid Domain resource. In this context, creation of
     * domain topic can be auto-managed (when true) or self-managed (when false). The default value for this property is
     * true. When this property is null or set to true, Event Grid is responsible of automatically creating the domain
     * topic when the first event subscription is created at the scope of the domain topic. If this property is set to
     * false, then creating the first event subscription will require creating a domain topic by the user. The
     * self-management mode can be used if the user wants full control of when the domain topic is created, while
     * auto-managed mode provides the flexibility to perform less operations and manage fewer resources by the user.
     * Also, note that in auto-managed creation mode, user is allowed to create the domain topic on demand if needed.
     *
     * @return the autoCreateTopicWithFirstSubscription value.
     */
    public Boolean autoCreateTopicWithFirstSubscription() {
        return this.autoCreateTopicWithFirstSubscription;
    }

    /**
     * Set the autoCreateTopicWithFirstSubscription property: This Boolean is used to specify the creation mechanism for
     * 'all' the Event Grid Domain Topics associated with this Event Grid Domain resource. In this context, creation of
     * domain topic can be auto-managed (when true) or self-managed (when false). The default value for this property is
     * true. When this property is null or set to true, Event Grid is responsible of automatically creating the domain
     * topic when the first event subscription is created at the scope of the domain topic. If this property is set to
     * false, then creating the first event subscription will require creating a domain topic by the user. The
     * self-management mode can be used if the user wants full control of when the domain topic is created, while
     * auto-managed mode provides the flexibility to perform less operations and manage fewer resources by the user.
     * Also, note that in auto-managed creation mode, user is allowed to create the domain topic on demand if needed.
     *
     * @param autoCreateTopicWithFirstSubscription the autoCreateTopicWithFirstSubscription value to set.
     * @return the DomainProperties object itself.
     */
    public DomainProperties withAutoCreateTopicWithFirstSubscription(Boolean autoCreateTopicWithFirstSubscription) {
        this.autoCreateTopicWithFirstSubscription = autoCreateTopicWithFirstSubscription;
        return this;
    }

    /**
     * Get the autoDeleteTopicWithLastSubscription property: This Boolean is used to specify the deletion mechanism for
     * 'all' the Event Grid Domain Topics associated with this Event Grid Domain resource. In this context, deletion of
     * domain topic can be auto-managed (when true) or self-managed (when false). The default value for this property is
     * true. When this property is set to true, Event Grid is responsible of automatically deleting the domain topic
     * when the last event subscription at the scope of the domain topic is deleted. If this property is set to false,
     * then the user needs to manually delete the domain topic when it is no longer needed (e.g., when last event
     * subscription is deleted and the resource needs to be cleaned up). The self-management mode can be used if the
     * user wants full control of when the domain topic needs to be deleted, while auto-managed mode provides the
     * flexibility to perform less operations and manage fewer resources by the user.
     *
     * @return the autoDeleteTopicWithLastSubscription value.
     */
    public Boolean autoDeleteTopicWithLastSubscription() {
        return this.autoDeleteTopicWithLastSubscription;
    }

    /**
     * Set the autoDeleteTopicWithLastSubscription property: This Boolean is used to specify the deletion mechanism for
     * 'all' the Event Grid Domain Topics associated with this Event Grid Domain resource. In this context, deletion of
     * domain topic can be auto-managed (when true) or self-managed (when false). The default value for this property is
     * true. When this property is set to true, Event Grid is responsible of automatically deleting the domain topic
     * when the last event subscription at the scope of the domain topic is deleted. If this property is set to false,
     * then the user needs to manually delete the domain topic when it is no longer needed (e.g., when last event
     * subscription is deleted and the resource needs to be cleaned up). The self-management mode can be used if the
     * user wants full control of when the domain topic needs to be deleted, while auto-managed mode provides the
     * flexibility to perform less operations and manage fewer resources by the user.
     *
     * @param autoDeleteTopicWithLastSubscription the autoDeleteTopicWithLastSubscription value to set.
     * @return the DomainProperties object itself.
     */
    public DomainProperties withAutoDeleteTopicWithLastSubscription(Boolean autoDeleteTopicWithLastSubscription) {
        this.autoDeleteTopicWithLastSubscription = autoDeleteTopicWithLastSubscription;
        return this;
    }

    /**
     * Get the dataResidencyBoundary property: Data Residency Boundary of the resource.
     *
     * @return the dataResidencyBoundary value.
     */
    public DataResidencyBoundary dataResidencyBoundary() {
        return this.dataResidencyBoundary;
    }

    /**
     * Set the dataResidencyBoundary property: Data Residency Boundary of the resource.
     *
     * @param dataResidencyBoundary the dataResidencyBoundary value to set.
     * @return the DomainProperties object itself.
     */
    public DomainProperties withDataResidencyBoundary(DataResidencyBoundary dataResidencyBoundary) {
        this.dataResidencyBoundary = dataResidencyBoundary;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (privateEndpointConnections() != null) {
            privateEndpointConnections().forEach(e -> e.validate());
        }
        if (eventTypeInfo() != null) {
            eventTypeInfo().validate();
        }
        if (inputSchemaMapping() != null) {
            inputSchemaMapping().validate();
        }
        if (inboundIpRules() != null) {
            inboundIpRules().forEach(e -> e.validate());
        }
    }
}
