package org.lgw.kafka.consumer

import mu.KotlinLogging
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service

private val logger = KotlinLogging.logger {}

class TestConsumer {
    @KafkaListener(
        topics = ["test"],
        groupId = "A"
    )
    fun consumeA(message:String?){
        logger.debug{ ">> in message A: $message"}
    }
//    @KafkaListener(
//        topics = ["test"],
//        groupId = "B"
//    )
//    fun consumeB(message:String?){
//        logger.debug{ ">> in message: $message"}
//    }
//
//    @KafkaListener(
//        topics = ["test"],
//        groupId = "C"
//    )
//    fun consumeC(message:String?){
//        logger.debug{ ">> in message: $message"}
//    }
}