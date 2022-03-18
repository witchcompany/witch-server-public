package io.witchwitch.core.web.rest.useragent

data class SemVer(
) : Comparable<SemVer> {

    constructor(seed: String) : this() {
    }

    override fun toString(): String {
    }

    override fun compareTo(other: SemVer): Int {
    }
}
