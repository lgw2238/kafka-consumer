package org.lgw.kafka.consumer

import mu.KotlinLogging
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service

private val logger = KotlinLogging.logger {}

@Service
class TestConsumer {

    @KafkaListener(
        topics = ["test"],
    )
    fun consume(message:String?){
        logger.debug{ ">> in message: $message"}
    }
}