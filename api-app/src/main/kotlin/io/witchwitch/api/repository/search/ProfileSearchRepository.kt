package io.witchwitch.core.repository.search

import io.witchwitch.api.domain.Profile
import org.springframework.data.elasticsearch.core.ReactiveElasticsearchTemplate
import org.springframework.data.elasticsearch.repository.ReactiveElasticsearchRepository

interface ProfileSearchRepository : ReactiveElasticsearchRepository<Profile, String>, ProfileSearchRepositoryInternal

interface ProfileSearchRepositoryInternal {
}

class ProfileSearchRepositoryInternalImpl(
    private val reactiveElasticsearchTemplate: ReactiveElasticsearchTemplate
) : ProfileSearchRepositoryInternal {

}
