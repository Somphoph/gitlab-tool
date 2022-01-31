package com.example.gitlabtool.service;

import com.example.gitlabtool.domain.Project;
import reactor.core.publisher.Flux;

public interface ProjectService {
    Flux<Project> findByGroup(String groupid);
}
