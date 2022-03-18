package io.witchwitch.core.util

import org.slf4j.LoggerFactory
import java.time.Instant
import java.time.LocalDate

private val log = LoggerFactory.getLogger(LocalDate::class.java)

fun LocalDate.withFirstDayOfYear(year: Int): LocalDate {
}

fun LocalDate.withFirstDayOfNextYear(year: Int): LocalDate {
}

fun LocalDate.toUTCInstant(): Instant {
}

fun LocalDate.toInstant(): Instant {
}

fun LocalDate.toInstant(timeZone: String?): Instant {
}
