package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

@SpringBootTest
@Sql("../../../../resources/data-test.sql")
class SimpleApplicationTests {

	@Test
	void contextLoads() {
	}

}
