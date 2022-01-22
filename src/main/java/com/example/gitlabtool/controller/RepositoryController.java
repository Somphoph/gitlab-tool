package com.example.gitlabtool.controller;

import com.example.gitlabtool.Service.GroupService;
import com.example.gitlabtool.domain.Group;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;


@RestController
public class RepositoryController {
    private final GroupService groupService;

    public RepositoryController(GroupService groupService) {
        this.groupService = groupService;
    }

    @GetMapping(path = "/groups")
    @CrossOrigin(origins = "http://localhost:8080")
    public List<Group> getGroups() {
        List<Group> groups = new ArrayList<>();
        groupService.findAllWhenRoleDev().subscribe(groups::add);
        return groups;
    }
}
