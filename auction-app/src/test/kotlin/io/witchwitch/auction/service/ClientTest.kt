package io.witchwitch.auction.service

import com.fasterxml.jackson.databind.JsonNode
import io.witchwitch.auction.AuctionApp
import io.witchwitch.auction.client.EtherscanClient
import org.junit.jupiter.api.Test
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(classes = [AuctionApp::class])
class ClientTest {

    @Autowired
    private lateinit var secretsManagerResponse: JsonNode

    @Autowired
    private lateinit var etherscanClient: EtherscanClient

    private var log = LoggerFactory.getLogger(javaClass)

    @Test
    internal fun secretsManager() {
    }

    @Test
    internal fun etherScan() {
        }
    }

    @Test
    internal fun getGasInfo() {
    }

    @Test
    internal fun getWitchContract() {
    }
}
