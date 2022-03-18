package io.witchwitch.core.domain.payment

enum class PayGroup(
) {

    fun hasPayCode(payType: PayType): Boolean {
    }

    companion object {
        fun findByPayType(payType: PayType): PayGroup {
        }
    }
}
