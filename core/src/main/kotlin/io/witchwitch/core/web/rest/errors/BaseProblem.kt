package io.witchwitch.core.web.rest.errors

import org.zalando.problem.AbstractThrowableProblem
import org.zalando.problem.Exceptional

abstract class BaseProblem(
) :
    AbstractThrowableProblem(
    ) {

    companion object {
    }

    override fun getCause(): Exceptional? {
    }
}
