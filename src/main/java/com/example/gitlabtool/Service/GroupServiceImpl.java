package com.example.gitlabtool.Service;

import com.example.gitlabtool.domain.Group;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
@Service
public class GroupServiceImpl implements GroupService {
    @Value("${app.gitlab.url}")
    private String gitlabUrl;
    @Value("${app.gitlab.personal-access-token}")
    private String personalAccessToken;
    @Override
    public Flux<Group> findAllWhenRoleDev() {
        WebClient client = WebClient.builder().baseUrl(gitlabUrl).build();
        return client.get().uri("/groups").headers(h -> h.setBearerAuth(personalAccessToken))
                .retrieve().bodyToFlux(Group.class);
    }
}
