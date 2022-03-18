package io.witchwitch.core.repository

import io.witchwitch.core.domain.product.Product
import org.springframework.data.mongodb.core.ReactiveMongoTemplate
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository : ReactiveMongoRepository<Product, String>, ProductRepositoryInternal {
}

interface ProductRepositoryInternal {
}

class ProductRepositoryInternalImpl(
    private val reactiveMongoTemplate: ReactiveMongoTemplate
) : ProductRepositoryInternal {
}
