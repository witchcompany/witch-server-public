package io.witchwitch.api.web.rest

import io.witchwitch.api.domain.Ratio
import io.witchwitch.api.service.dto.WalletDTO
import io.witchwitch.api.service.dto.WalletLogDTO
import io.witchwitch.api.web.rest.vm.WithdrawVM
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import javax.validation.Valid

@RestController
@RequestMapping("/api/coin")
class CoinResource(
) {

    @GetMapping("/ratio")
    fun getWitchRatio(): Ratio {
    }

    @GetMapping("/wallet")
    fun getWallet(): Mono<WalletDTO> {
    }

    @GetMapping("/wallet/logs")
    fun getWalletHistory(): Flux<WalletLogDTO> {
    }

    @PutMapping("/withdraw")
    fun coinWithdraw(@Valid @RequestBody withdrawVM: WithdrawVM): Mono<WalletDTO> {
    }
}
