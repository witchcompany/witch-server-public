package io.witchwitch.api.repository

import io.witchwitch.api.domain.Report
import org.springframework.data.mongodb.core.ReactiveMongoTemplate
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ReportRepository : ReactiveMongoRepository<Report, String>, CustomizedReportRepository {
}

interface CustomizedReportRepository {
}

class CustomizedReportRepositoryImpl(private val reactiveMongoTemplate: ReactiveMongoTemplate) :
    CustomizedReportRepository {
}
