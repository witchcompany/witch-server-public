package io.witchwitch.api.domain

import java.io.Serializable

data class UserEmotion(
) : Serializable {


    data class Key(
    )

    enum class TargetType {
    }

}

enum class Emotion(val emoji: String) {
}
