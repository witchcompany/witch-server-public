package io.witchwitch.core.config

// Regex for acceptable logins
const val LOGIN_REGEX: String =
    "^(?>[a-zA-Z0-9!$&*+=?^_`{|}~.-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*)|(?>[_.@A-Za-z0-9-]+)$"
const val NICKNAME_REGEX: String = "^[A-Za-z0-9가-힣_]{3,10}\$"
const val CRAFT_NICKNAME_REGEX: String = "^[A-Za-z0-9가-힣]{2,10}\$"
const val WORLD_NICKNAME_REGEX: String = "^[A-Za-z0-9가-힣]{2,10}\$"
const val PRICE_REGEX: String = "^[0-9](.?){0,1}([0-9])*\$"
const val SYSTEM_ACCOUNT: String = "system"
const val ANONYMOUS_USER: String = "anonymoususer"
const val DEFAULT_LANGUAGE: String = "en"
const val SPRING_PROFILE_LOCAL = "local"
const val SPRING_PROFILE_DEVELOPMENT = "dev"
const val SPRING_PROFILE_TEST = "test"
const val SPRING_PROFILE_PRODUCTION = "prod"
const val SPRING_PROFILE_CLOUD = "cloud"
const val SPRING_PROFILE_HEROKU = "heroku"
const val SPRING_PROFILE_AWS_ECS = "aws-ecs"
const val SPRING_PROFILE_AZURE = "azure"
const val SPRING_PROFILE_API_DOCS = "api-docs"
const val SPRING_PROFILE_NO_LIQUIBASE = "no-liquibase"
const val SPRING_PROFILE_K8S = "k8s"

const val DEFAULT_PRIVATE_KEY = "0"
