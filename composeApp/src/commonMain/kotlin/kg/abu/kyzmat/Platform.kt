package kg.abu.kyzmat

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform