package io.witchwitch.core.config.dbmigrations

import com.github.cloudyrock.mongock.ChangeLog
import com.github.cloudyrock.mongock.ChangeSet
import com.github.cloudyrock.mongock.driver.mongodb.springdata.v3.decorator.impl.MongockTemplate
import org.springframework.core.env.Environment

@ChangeLog(order = "001")
@Suppress("unused")
class InitialSetupMigration {

    @ChangeSet(order = "01", author = "initiator", id = "01-addAuthorities")
    fun addAuthorities(mongoTemplate: MongockTemplate) {
    }

    @ChangeSet(order = "02", author = "initiator", id = "02-addShardKey")
    fun addShardKey(mongoTemplate: MongockTemplate, environment: Environment) {
    }

    @ChangeSet(order = "03", author = "initiator", id = "03-addUpdateVersionSettings")
    fun addUpdateVersionSettings(mongoTemplate: MongockTemplate) {
    }
}
