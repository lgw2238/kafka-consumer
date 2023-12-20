package org.lgw.kafka

import mu.KotlinLogging
import org.lgw.kafka.config.Consumer
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.kafka.annotation.EnableKafka

private val logger = KotlinLogging.logger {}
@SpringBootApplication
@EnableKafka
class KafkaApplication(private val consumer: Consumer,): ApplicationRunner {
    override fun run(args: ApplicationArguments?) {
        consumer.consume("test", "A") {
            logger.debug { ">> in message A: ${it}  " }
        }
        consumer.consume("test", "B") {
            logger.debug { ">> in message B: ${it}  " }
        }
        logger.debug{ ">> consumer application ready " }
    }
}

fun main(args: Array<String>) {
    runApplication<KafkaApplication>(*args)
}
