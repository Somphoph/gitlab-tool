package com.example.gitlabtool.controller;

import com.example.gitlabtool.service.GroupService;
import com.example.gitlabtool.domain.Project;
import com.example.gitlabtool.domain.Group;
import com.example.gitlabtool.service.ProjectService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class RepositoryController {
    private final GroupService groupService;
    private final ProjectService projectService;

    public RepositoryController(GroupService groupService, ProjectService projectService) {
        this.groupService = groupService;
        this.projectService = projectService;
    }

    @GetMapping(path = "/groups")
    public List<Group> getGroups() {
        List<Group> groups = new ArrayList<>();
        groupService.findAllWhenRoleDev().subscribe(groups::add);
        return groups;
    }
    @GetMapping(path="/projects")
    public List<Project> getProjects() {
        List<Project> repositories = new ArrayList<>();
        projectService.findAll().subscribe(repositories::add);
        return repositories;
    }
}
