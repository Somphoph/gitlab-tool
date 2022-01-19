package com.example.gitlabtool.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Group {
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("path")
    private String path;
    @JsonProperty("description")
    private String description;
    @JsonProperty("visibility")
    private String visibility;
    @JsonProperty("share_with_group_lock")
    private Boolean shareWithGroupLock;
    @JsonProperty("require_two_factor_authentication")
    private Boolean requireTwoFactorAuthentication;
    @JsonProperty("two_factor_grace_period")
    private Integer twoFactorGracePeriod;
    @JsonProperty("project_creation_level")
    private String projectCreationLevel;
    @JsonProperty("auto_devops_enabled")
    private Object autoDevopsEnabled;
    @JsonProperty("subgroup_creation_level")
    private String subgroupCreationLevel;
    @JsonProperty("emails_disabled")
    private Object emailsDisabled;
    @JsonProperty("mentions_disabled")
    private Object mentionsDisabled;
    @JsonProperty("lfs_enabled")
    private Boolean lfsEnabled;
    @JsonProperty("default_branch_protection")
    private Integer defaultBranchProtection;
    @JsonProperty("avatar_url")
    private String avatarUrl;
    @JsonProperty("web_url")
    private String webUrl;
    @JsonProperty("request_access_enabled")
    private Boolean requestAccessEnabled;
    @JsonProperty("full_name")
    private String fullName;
    @JsonProperty("full_path")
    private String fullPath;
    @JsonProperty("file_template_project_id")
    private Integer fileTemplateProjectId;
    @JsonProperty("parent_id")
    private Object parentId;
    @JsonProperty("created_at")
    private String createdAt;
}
