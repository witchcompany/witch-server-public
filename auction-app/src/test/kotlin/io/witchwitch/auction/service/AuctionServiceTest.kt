package io.witchwitch.auction.service

import io.witchwitch.auction.AuctionApp
import io.witchwitch.auction.repository.auction.AuctionRepository
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(classes = [AuctionApp::class])
class AuctionServiceTest {

    @Autowired
    private lateinit var auctionRepository: AuctionRepository

    @Autowired
    private lateinit var auctionService: AuctionService

    private var log = LoggerFactory.getLogger(javaClass)

    @BeforeEach
    internal fun setUp() {
    }

    @AfterEach
    internal fun teardown() {
    }

    @Test
    internal fun findAllUpcoming() {
    }

    @Test
    internal fun findAllOngoing() {
    }

    @Test
    internal fun findAllClosed() {
    }

    @Test
    internal fun createAuction() {
    }

    @Test
    internal fun createUserAuction() {
    }
}
