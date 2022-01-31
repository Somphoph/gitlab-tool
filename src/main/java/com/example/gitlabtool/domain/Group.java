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
