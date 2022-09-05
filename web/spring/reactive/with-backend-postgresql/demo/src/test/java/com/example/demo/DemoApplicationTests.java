package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties={
		"spring.profiles.active[0]=default",
		"spring.profiles.include[0]=test",
})
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

}
