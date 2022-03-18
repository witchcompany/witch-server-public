package io.witchwitch.core.domain.point

import io.witchwitch.core.domain.order.Item
import io.witchwitch.core.domain.payment.PayType
import io.witchwitch.core.web.rest.vm.WitItemVM
import io.witchwitch.core.web.rest.vm.WitOrderVM
import java.util.Optional

enum class WitAmount(val quantity: Int, val price: Int, val dollarPrice: Double, val productId: String) {

    companion object {
        private fun findByProductId(productId: String): Optional<WitAmount> {
        }

        fun findTotalQuantityByItems(items: List<Item>): Long {
        }

        fun getTotalAmount(items: List<WitItemVM>, payType: PayType): String {
        }

        fun witItemToItemConverter(orderVM: WitOrderVM): List<Item> {
        }
    }
}
