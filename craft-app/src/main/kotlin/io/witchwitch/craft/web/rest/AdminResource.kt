package io.witchwitch.craft.web.rest

import io.swagger.v3.oas.annotations.Parameter
import io.witchwitch.core.security.ADMIN
import io.witchwitch.core.service.dto.ProductDTO
import io.witchwitch.core.web.rest.vm.ProductVM
import io.witchwitch.craft.service.dto.BannerDTO
import io.witchwitch.craft.service.dto.CollectionDTO
import io.witchwitch.craft.web.rest.vm.BannerVM
import io.witchwitch.craft.web.rest.vm.CollectionVM
import org.springdoc.core.converters.models.PageableAsQueryParam
import org.springframework.data.domain.Pageable
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import javax.validation.Valid

@RestController
@RequestMapping("/api/admin")
@PreAuthorize("hasRole('$ADMIN')")
class AdminResource(
) {

    @PageableAsQueryParam
    @GetMapping("/products")
    fun getProducts(
        @RequestParam("collection_id", required = false) collectionId: String?,
        @Parameter(hidden = true) pageable: Pageable
    ): Flux<ProductDTO> {
    }

    @GetMapping("/products/{id}")
    fun getProduct(@PathVariable id: String): Mono<ProductDTO> {
    }

    @PostMapping("/products")
    fun createProduct(@Valid @RequestBody productVM: ProductVM): Mono<ProductDTO> {
    }

    @PutMapping("/products/{id}")
    fun updateProduct(@PathVariable id: String, @Valid @RequestBody productVM: ProductVM): Mono<ProductDTO> {
    }

    @DeleteMapping("/products/{id}")
    fun deleteProduct(@PathVariable id: String): Mono<Void> {
    }

    @PutMapping("/products/{id}/visible")
    fun flipProductVisible(@PathVariable id: String, @RequestParam visible: Boolean): Mono<Void> {
    }

    @PageableAsQueryParam
    @GetMapping("/collections")
    fun getCollections(@Parameter(hidden = true) pageable: Pageable): Flux<CollectionDTO> {
    }

    @GetMapping("/collections/{id}")
    fun getCollection(@PathVariable id: String): Mono<CollectionDTO> {
    }

    @PostMapping("/collections")
    fun createCollection(@Valid @RequestBody collectionVM: CollectionVM): Mono<CollectionDTO> {
    }

    @PutMapping("/collections/{id}")
    fun updateCollection(
        @PathVariable id: String,
        @Valid @RequestBody collectionVM: CollectionVM
    ): Mono<CollectionDTO> {
    }

    @PutMapping("/collections/{id}/visible")
    fun flipCollectionVisible(@PathVariable id: String, @RequestParam visible: Boolean): Mono<Void> {
    }

    @PageableAsQueryParam
    @GetMapping("/banners")
    fun getBanners(@Parameter(hidden = true) pageable: Pageable): Flux<BannerDTO> {
    }

    @GetMapping("/banners/{id}")
    fun getBanner(@PathVariable id: String): Mono<BannerDTO> {
    }

    @PostMapping("/banners")
    fun createBanner(@Valid @RequestBody bannerVM: BannerVM): Mono<BannerDTO> {
    }

    @PutMapping("/banners/{id}")
    fun updateBanner(@PathVariable id: String, @Valid @RequestBody bannerVM: BannerVM): Mono<BannerDTO> {
    }

    @PutMapping("/banners/{id}/visible")
    fun flipBannerVisible(@PathVariable id: String, @RequestParam visible: Boolean): Mono<Void> {
    }
}
