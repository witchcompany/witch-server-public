package io.witchwitch.api.repository

import io.witchwitch.api.domain.Device
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface DeviceRepository : ReactiveMongoRepository<Device, String> {
}
