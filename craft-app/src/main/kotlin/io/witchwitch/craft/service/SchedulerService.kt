package io.witchwitch.craft.service

import io.witchwitch.core.service.dto.ProductDTO
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import reactor.core.publisher.Flux
import javax.annotation.PostConstruct

@Service
class SchedulerService(
) {

    @PostConstruct
    fun auctionFinishJob() {
    }

    fun auctionFinishTask() {
    }

    @Transactional
    fun onPaymentComplete(): Flux<ProductDTO> {
    }

    fun getInitialExecutionTime(): Long {
    }
}
