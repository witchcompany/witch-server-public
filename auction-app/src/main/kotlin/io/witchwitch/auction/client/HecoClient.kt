package io.witchwitch.auction.client

import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class HecoClient(
) {

    fun getWitchBalance(address: String, key: String? = null): Mono<Map<String, String>> {
    }
}
