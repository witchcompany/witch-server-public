package io.witchwitch.craft.web.rest

import io.swagger.v3.oas.annotations.Parameter
import io.witchwitch.core.domain.product.ProductType
import io.witchwitch.core.service.dto.ProductDTO
import io.witchwitch.core.web.rest.vm.OrderVM
import io.witchwitch.core.web.rest.vm.PaymentVM
import org.springdoc.core.converters.models.PageableAsQueryParam
import org.springframework.data.domain.Pageable
import org.springframework.http.server.reactive.ServerHttpResponse
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import javax.validation.Valid

@RestController
@RequestMapping("/api")
class ProductResource(
) {

    @PageableAsQueryParam
    @GetMapping("/products")
    fun getProducts(
        @RequestParam("collection_id", required = false) collectionId: String?,
        @Parameter(hidden = true) pageable: Pageable
    ): Flux<ProductDTO> {
        }
    }

    @GetMapping("/products/{id}")
    fun getProduct(@PathVariable id: String): Mono<ProductDTO> {
    }

    @PostMapping("/products/order")
    @Transactional
    fun createProductOrder(@Valid @RequestBody orderVM: OrderVM): Mono<String> {
    }

    @PostMapping("/products/payment/complete")
    fun paymentComplete(@Valid @RequestBody paymentVM: PaymentVM): Flux<ProductDTO> {
    }

    @GetMapping("/products/type/{type}")
    @PageableAsQueryParam
    fun getProductsByType(
        @PathVariable type: ProductType,
        @Parameter(hidden = true) pageable: Pageable,
        response: ServerHttpResponse
    ): Flux<ProductDTO> {
    }

    @GetMapping("/products/type/{type}/search")
    @PageableAsQueryParam
    fun searchByProducts(
        @PathVariable type: ProductType,
        @RequestParam(value = "query", required = false) query: String?,
        @RequestParam(value = "tag_type", required = false) tagType: String?,
        @Parameter(hidden = true) pageable: Pageable,
        response: ServerHttpResponse
    ): Flux<ProductDTO> {
    }
}
