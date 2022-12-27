package ch.madskills.clickhouseJdbcTesting.config

import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.DependsOn
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate
import javax.annotation.PostConstruct

/**
 * sample text
 */
@Configuration
@DependsOn("jdbcTemplate")
class DatabaseConnectionTest(private val namedParameterJdbcTemplate: NamedParameterJdbcTemplate) {

    @PostConstruct
    fun checkConnection() {
        namedParameterJdbcTemplate.query("SELECT 1") {}
    }
}