package com.example.gitlabtool.controller;

import com.example.gitlabtool.Service.GroupService;
import com.example.gitlabtool.domain.Group;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;


@RestController
public class RepositoryController {
    private final GroupService groupService;

    public RepositoryController(GroupService groupService) {
        this.groupService = groupService;
    }

    @GetMapping(path = "/groups", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    @CrossOrigin(origins = "http://localhost:8080")
    public Flux<Group> getGroups() {
        return groupService.findAllWhenRoleDev();
    }
}
