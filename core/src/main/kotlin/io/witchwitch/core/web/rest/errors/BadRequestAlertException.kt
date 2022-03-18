package io.witchwitch.core.web.rest.errors

import org.zalando.problem.AbstractThrowableProblem
import org.zalando.problem.Exceptional
import java.net.URI

open class BadRequestAlertException() :
    AbstractThrowableProblem(
    ) {

    constructor() :

    override fun getCause(): Exceptional? = super.cause

    companion object {

        private const val serialVersionUID = 1L

        private fun getAlertParameters() =
    }
}
