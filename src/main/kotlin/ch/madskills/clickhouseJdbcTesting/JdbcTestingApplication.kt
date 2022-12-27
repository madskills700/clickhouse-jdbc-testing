package ch.madskills.clickhouseJdbcTesting

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * Sample app
 */
@SpringBootApplication(scanBasePackages = ["ch.madskills.clickhouseJdbcTesting"])
class JdbcTestingApplication {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            runApplication<JdbcTestingApplication>(*args)
        }
    }
}