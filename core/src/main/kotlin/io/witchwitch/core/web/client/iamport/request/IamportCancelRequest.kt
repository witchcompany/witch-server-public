package io.witchwitch.core.web.client.iamport.request

import io.witchwitch.core.domain.payment.CancelRequest

data class IamportCancelRequest(

) : CancelRequest(payType = payType)
