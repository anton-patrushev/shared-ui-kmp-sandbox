package com.thelostpatrick.fullysharedhelloworld

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform