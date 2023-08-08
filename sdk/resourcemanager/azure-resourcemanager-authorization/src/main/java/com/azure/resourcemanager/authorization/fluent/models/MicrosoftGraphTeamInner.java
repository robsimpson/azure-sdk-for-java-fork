// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** team. */
@Fluent
public final class MicrosoftGraphTeamInner extends MicrosoftGraphEntity {
    /*
     * An optional label. Typically describes the data or business sensitivity of the team. Must match one of a
     * pre-configured set in the tenant's directory.
     */
    @JsonProperty(value = "classification")
    private String classification;

    /*
     * An optional description for the team.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The name of the team.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * teamFunSettings
     */
    @JsonProperty(value = "funSettings")
    private MicrosoftGraphTeamFunSettings funSettings;

    /*
     * teamGuestSettings
     */
    @JsonProperty(value = "guestSettings")
    private MicrosoftGraphTeamGuestSettings guestSettings;

    /*
     * A unique ID for the team that has been used in a few places such as the audit log/Office 365 Management Activity
     * API.
     */
    @JsonProperty(value = "internalId")
    private String internalId;

    /*
     * Whether this team is in read-only mode.
     */
    @JsonProperty(value = "isArchived")
    private Boolean isArchived;

    /*
     * teamMemberSettings
     */
    @JsonProperty(value = "memberSettings")
    private MicrosoftGraphTeamMemberSettings memberSettings;

    /*
     * teamMessagingSettings
     */
    @JsonProperty(value = "messagingSettings")
    private MicrosoftGraphTeamMessagingSettings messagingSettings;

    /*
     * teamSpecialization
     */
    @JsonProperty(value = "specialization")
    private MicrosoftGraphTeamSpecialization specialization;

    /*
     * teamVisibilityType
     */
    @JsonProperty(value = "visibility")
    private MicrosoftGraphTeamVisibilityType visibility;

    /*
     * A hyperlink that will go to the team in the Microsoft Teams client. This is the URL that you get when you
     * right-click a team in the Microsoft Teams client and select Get link to team. This URL should be treated as an
     * opaque blob, and not parsed.
     */
    @JsonProperty(value = "webUrl")
    private String webUrl;

    /*
     * schedule
     */
    @JsonProperty(value = "schedule")
    private MicrosoftGraphSchedule schedule;

    /*
     * The collection of channels & messages associated with the team.
     */
    @JsonProperty(value = "channels")
    private List<MicrosoftGraphChannel> channels;

    /*
     * group
     *
     * Represents an Azure Active Directory object. The directoryObject type is the base type for many other directory
     * entity types.
     */
    @JsonProperty(value = "group")
    private MicrosoftGraphGroupInner group;

    /*
     * The apps installed in this team.
     */
    @JsonProperty(value = "installedApps")
    private List<MicrosoftGraphTeamsAppInstallation> installedApps;

    /*
     * Members and owners of the team.
     */
    @JsonProperty(value = "members")
    private List<MicrosoftGraphConversationMember> members;

    /*
     * The async operations that ran or are running on this team.
     */
    @JsonProperty(value = "operations")
    private List<MicrosoftGraphTeamsAsyncOperation> operations;

    /*
     * channel
     */
    @JsonProperty(value = "primaryChannel")
    private MicrosoftGraphChannel primaryChannel;

    /*
     * teamsTemplate
     */
    @JsonProperty(value = "template")
    private MicrosoftGraphTeamsTemplate template;

    /*
     * team
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /** Creates an instance of MicrosoftGraphTeamInner class. */
    public MicrosoftGraphTeamInner() {
    }

    /**
     * Get the classification property: An optional label. Typically describes the data or business sensitivity of the
     * team. Must match one of a pre-configured set in the tenant's directory.
     *
     * @return the classification value.
     */
    public String classification() {
        return this.classification;
    }

    /**
     * Set the classification property: An optional label. Typically describes the data or business sensitivity of the
     * team. Must match one of a pre-configured set in the tenant's directory.
     *
     * @param classification the classification value to set.
     * @return the MicrosoftGraphTeamInner object itself.
     */
    public MicrosoftGraphTeamInner withClassification(String classification) {
        this.classification = classification;
        return this;
    }

    /**
     * Get the description property: An optional description for the team.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: An optional description for the team.
     *
     * @param description the description value to set.
     * @return the MicrosoftGraphTeamInner object itself.
     */
    public MicrosoftGraphTeamInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the displayName property: The name of the team.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The name of the team.
     *
     * @param displayName the displayName value to set.
     * @return the MicrosoftGraphTeamInner object itself.
     */
    public MicrosoftGraphTeamInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the funSettings property: teamFunSettings.
     *
     * @return the funSettings value.
     */
    public MicrosoftGraphTeamFunSettings funSettings() {
        return this.funSettings;
    }

    /**
     * Set the funSettings property: teamFunSettings.
     *
     * @param funSettings the funSettings value to set.
     * @return the MicrosoftGraphTeamInner object itself.
     */
    public MicrosoftGraphTeamInner withFunSettings(MicrosoftGraphTeamFunSettings funSettings) {
        this.funSettings = funSettings;
        return this;
    }

    /**
     * Get the guestSettings property: teamGuestSettings.
     *
     * @return the guestSettings value.
     */
    public MicrosoftGraphTeamGuestSettings guestSettings() {
        return this.guestSettings;
    }

    /**
     * Set the guestSettings property: teamGuestSettings.
     *
     * @param guestSettings the guestSettings value to set.
     * @return the MicrosoftGraphTeamInner object itself.
     */
    public MicrosoftGraphTeamInner withGuestSettings(MicrosoftGraphTeamGuestSettings guestSettings) {
        this.guestSettings = guestSettings;
        return this;
    }

    /**
     * Get the internalId property: A unique ID for the team that has been used in a few places such as the audit
     * log/Office 365 Management Activity API.
     *
     * @return the internalId value.
     */
    public String internalId() {
        return this.internalId;
    }

    /**
     * Set the internalId property: A unique ID for the team that has been used in a few places such as the audit
     * log/Office 365 Management Activity API.
     *
     * @param internalId the internalId value to set.
     * @return the MicrosoftGraphTeamInner object itself.
     */
    public MicrosoftGraphTeamInner withInternalId(String internalId) {
        this.internalId = internalId;
        return this;
    }

    /**
     * Get the isArchived property: Whether this team is in read-only mode.
     *
     * @return the isArchived value.
     */
    public Boolean isArchived() {
        return this.isArchived;
    }

    /**
     * Set the isArchived property: Whether this team is in read-only mode.
     *
     * @param isArchived the isArchived value to set.
     * @return the MicrosoftGraphTeamInner object itself.
     */
    public MicrosoftGraphTeamInner withIsArchived(Boolean isArchived) {
        this.isArchived = isArchived;
        return this;
    }

    /**
     * Get the memberSettings property: teamMemberSettings.
     *
     * @return the memberSettings value.
     */
    public MicrosoftGraphTeamMemberSettings memberSettings() {
        return this.memberSettings;
    }

    /**
     * Set the memberSettings property: teamMemberSettings.
     *
     * @param memberSettings the memberSettings value to set.
     * @return the MicrosoftGraphTeamInner object itself.
     */
    public MicrosoftGraphTeamInner withMemberSettings(MicrosoftGraphTeamMemberSettings memberSettings) {
        this.memberSettings = memberSettings;
        return this;
    }

    /**
     * Get the messagingSettings property: teamMessagingSettings.
     *
     * @return the messagingSettings value.
     */
    public MicrosoftGraphTeamMessagingSettings messagingSettings() {
        return this.messagingSettings;
    }

    /**
     * Set the messagingSettings property: teamMessagingSettings.
     *
     * @param messagingSettings the messagingSettings value to set.
     * @return the MicrosoftGraphTeamInner object itself.
     */
    public MicrosoftGraphTeamInner withMessagingSettings(MicrosoftGraphTeamMessagingSettings messagingSettings) {
        this.messagingSettings = messagingSettings;
        return this;
    }

    /**
     * Get the specialization property: teamSpecialization.
     *
     * @return the specialization value.
     */
    public MicrosoftGraphTeamSpecialization specialization() {
        return this.specialization;
    }

    /**
     * Set the specialization property: teamSpecialization.
     *
     * @param specialization the specialization value to set.
     * @return the MicrosoftGraphTeamInner object itself.
     */
    public MicrosoftGraphTeamInner withSpecialization(MicrosoftGraphTeamSpecialization specialization) {
        this.specialization = specialization;
        return this;
    }

    /**
     * Get the visibility property: teamVisibilityType.
     *
     * @return the visibility value.
     */
    public MicrosoftGraphTeamVisibilityType visibility() {
        return this.visibility;
    }

    /**
     * Set the visibility property: teamVisibilityType.
     *
     * @param visibility the visibility value to set.
     * @return the MicrosoftGraphTeamInner object itself.
     */
    public MicrosoftGraphTeamInner withVisibility(MicrosoftGraphTeamVisibilityType visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * Get the webUrl property: A hyperlink that will go to the team in the Microsoft Teams client. This is the URL that
     * you get when you right-click a team in the Microsoft Teams client and select Get link to team. This URL should be
     * treated as an opaque blob, and not parsed.
     *
     * @return the webUrl value.
     */
    public String webUrl() {
        return this.webUrl;
    }

    /**
     * Set the webUrl property: A hyperlink that will go to the team in the Microsoft Teams client. This is the URL that
     * you get when you right-click a team in the Microsoft Teams client and select Get link to team. This URL should be
     * treated as an opaque blob, and not parsed.
     *
     * @param webUrl the webUrl value to set.
     * @return the MicrosoftGraphTeamInner object itself.
     */
    public MicrosoftGraphTeamInner withWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    /**
     * Get the schedule property: schedule.
     *
     * @return the schedule value.
     */
    public MicrosoftGraphSchedule schedule() {
        return this.schedule;
    }

    /**
     * Set the schedule property: schedule.
     *
     * @param schedule the schedule value to set.
     * @return the MicrosoftGraphTeamInner object itself.
     */
    public MicrosoftGraphTeamInner withSchedule(MicrosoftGraphSchedule schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * Get the channels property: The collection of channels &amp; messages associated with the team.
     *
     * @return the channels value.
     */
    public List<MicrosoftGraphChannel> channels() {
        return this.channels;
    }

    /**
     * Set the channels property: The collection of channels &amp; messages associated with the team.
     *
     * @param channels the channels value to set.
     * @return the MicrosoftGraphTeamInner object itself.
     */
    public MicrosoftGraphTeamInner withChannels(List<MicrosoftGraphChannel> channels) {
        this.channels = channels;
        return this;
    }

    /**
     * Get the group property: group
     *
     * <p>Represents an Azure Active Directory object. The directoryObject type is the base type for many other
     * directory entity types.
     *
     * @return the group value.
     */
    public MicrosoftGraphGroupInner group() {
        return this.group;
    }

    /**
     * Set the group property: group
     *
     * <p>Represents an Azure Active Directory object. The directoryObject type is the base type for many other
     * directory entity types.
     *
     * @param group the group value to set.
     * @return the MicrosoftGraphTeamInner object itself.
     */
    public MicrosoftGraphTeamInner withGroup(MicrosoftGraphGroupInner group) {
        this.group = group;
        return this;
    }

    /**
     * Get the installedApps property: The apps installed in this team.
     *
     * @return the installedApps value.
     */
    public List<MicrosoftGraphTeamsAppInstallation> installedApps() {
        return this.installedApps;
    }

    /**
     * Set the installedApps property: The apps installed in this team.
     *
     * @param installedApps the installedApps value to set.
     * @return the MicrosoftGraphTeamInner object itself.
     */
    public MicrosoftGraphTeamInner withInstalledApps(List<MicrosoftGraphTeamsAppInstallation> installedApps) {
        this.installedApps = installedApps;
        return this;
    }

    /**
     * Get the members property: Members and owners of the team.
     *
     * @return the members value.
     */
    public List<MicrosoftGraphConversationMember> members() {
        return this.members;
    }

    /**
     * Set the members property: Members and owners of the team.
     *
     * @param members the members value to set.
     * @return the MicrosoftGraphTeamInner object itself.
     */
    public MicrosoftGraphTeamInner withMembers(List<MicrosoftGraphConversationMember> members) {
        this.members = members;
        return this;
    }

    /**
     * Get the operations property: The async operations that ran or are running on this team.
     *
     * @return the operations value.
     */
    public List<MicrosoftGraphTeamsAsyncOperation> operations() {
        return this.operations;
    }

    /**
     * Set the operations property: The async operations that ran or are running on this team.
     *
     * @param operations the operations value to set.
     * @return the MicrosoftGraphTeamInner object itself.
     */
    public MicrosoftGraphTeamInner withOperations(List<MicrosoftGraphTeamsAsyncOperation> operations) {
        this.operations = operations;
        return this;
    }

    /**
     * Get the primaryChannel property: channel.
     *
     * @return the primaryChannel value.
     */
    public MicrosoftGraphChannel primaryChannel() {
        return this.primaryChannel;
    }

    /**
     * Set the primaryChannel property: channel.
     *
     * @param primaryChannel the primaryChannel value to set.
     * @return the MicrosoftGraphTeamInner object itself.
     */
    public MicrosoftGraphTeamInner withPrimaryChannel(MicrosoftGraphChannel primaryChannel) {
        this.primaryChannel = primaryChannel;
        return this;
    }

    /**
     * Get the template property: teamsTemplate.
     *
     * @return the template value.
     */
    public MicrosoftGraphTeamsTemplate template() {
        return this.template;
    }

    /**
     * Set the template property: teamsTemplate.
     *
     * @param template the template value to set.
     * @return the MicrosoftGraphTeamInner object itself.
     */
    public MicrosoftGraphTeamInner withTemplate(MicrosoftGraphTeamsTemplate template) {
        this.template = template;
        return this;
    }

    /**
     * Get the additionalProperties property: team.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: team.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphTeamInner object itself.
     */
    public MicrosoftGraphTeamInner withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphTeamInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (funSettings() != null) {
            funSettings().validate();
        }
        if (guestSettings() != null) {
            guestSettings().validate();
        }
        if (memberSettings() != null) {
            memberSettings().validate();
        }
        if (messagingSettings() != null) {
            messagingSettings().validate();
        }
        if (schedule() != null) {
            schedule().validate();
        }
        if (channels() != null) {
            channels().forEach(e -> e.validate());
        }
        if (group() != null) {
            group().validate();
        }
        if (installedApps() != null) {
            installedApps().forEach(e -> e.validate());
        }
        if (members() != null) {
            members().forEach(e -> e.validate());
        }
        if (operations() != null) {
            operations().forEach(e -> e.validate());
        }
        if (primaryChannel() != null) {
            primaryChannel().validate();
        }
        if (template() != null) {
            template().validate();
        }
    }
}
