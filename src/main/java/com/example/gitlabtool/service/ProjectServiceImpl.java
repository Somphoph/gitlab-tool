package com.example.gitlabtool.service;

import com.example.gitlabtool.domain.Project;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
@Service
public class ProjectServiceImpl implements ProjectService {
    @Value("${app.gitlab.url}")
    private String gitlabUrl;
    @Value("${app.gitlab.personal-access-token}")
    private String personalAccessToken;
    @Override
    public Flux<Project> findByGroup(String groupid) {
        WebClient client = WebClient.builder().baseUrl(gitlabUrl).build();
        return client.get().uri("/projects").headers(h -> h.setBearerAuth(personalAccessToken))
                .retrieve().bodyToFlux(Project.class);
    }
}
