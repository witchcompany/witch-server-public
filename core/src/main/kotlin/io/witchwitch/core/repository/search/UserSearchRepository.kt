package io.witchwitch.core.repository.search

import io.witchwitch.core.domain.User
import org.springframework.data.domain.Pageable
import org.springframework.data.elasticsearch.core.ReactiveElasticsearchTemplate
import org.springframework.data.elasticsearch.repository.ReactiveElasticsearchRepository
import reactor.core.publisher.Flux

interface UserSearchRepository : ReactiveElasticsearchRepository<User, String>, UserSearchRepositoryInternal

interface UserSearchRepositoryInternal {
}

class UserSearchRepositoryInternalImpl(
    private val reactiveElasticsearchTemplate: ReactiveElasticsearchTemplate
) : UserSearchRepositoryInternal {

    override fun search(query: String, pageable: Pageable): Flux<User> {
    }
}
