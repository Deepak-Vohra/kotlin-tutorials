package com.baeldung.logging

import io.github.oshai.kotlinlogging.KotlinLogging

private val logger = KotlinLogging.logger {}

fun main() {
    logger.debug { "This is debug log" }
    logger.info { "This is info log" }
    logger.warn { "This is warn log" }
    logger.error { "This is error log" }
}
