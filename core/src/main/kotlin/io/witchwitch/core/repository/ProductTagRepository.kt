package io.witchwitch.core.repository

import io.witchwitch.core.domain.product.ProductTag
import org.springframework.data.mongodb.core.ReactiveMongoTemplate
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Mono

@Repository
interface ProductTagRepository : ReactiveMongoRepository<ProductTag, String>, ProductTagRepositoryInternal

interface ProductTagRepositoryInternal {
}

class ProductTagRepositoryInternalImpl(
    private val reactiveMongoTemplate: ReactiveMongoTemplate
) : ProductTagRepositoryInternal {
}
