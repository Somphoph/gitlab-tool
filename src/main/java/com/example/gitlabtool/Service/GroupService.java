package com.example.gitlabtool.Service;

import com.example.gitlabtool.domain.Group;
import reactor.core.publisher.Flux;

public interface GroupService {
    Flux<Group> findAllWhenRoleDev();
}
