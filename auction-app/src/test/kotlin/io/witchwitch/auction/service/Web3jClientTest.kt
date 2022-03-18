package io.witchwitch.auction.service

import io.witchwitch.auction.AuctionApp
import io.witchwitch.auction.client.Web3jClient
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(classes = [AuctionApp::class])
class Web3jClientTest {
    @Autowired
    private lateinit var web3jService: Web3jClient

    @Test
    internal fun transferFrom() {
    }

    @Test
    internal fun getTokenURI() {
    }

    @Test
    internal fun getSymbol() {
    }

    @Test
    internal fun getTransactionByHash() {
    }

    @Test
    internal fun getWitchBalance() {
    }

    @Test
    internal fun getTransactionFlowable() {
    }

    @Test
    internal fun getTokenItem() {
    }
}
