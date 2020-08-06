package com.example.daocloud;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DaocloudApplicationTests {

	@Autowired
	MyService myService;


	@Test
	void add() {
		int res = myService.add(777,11);
		assert res == 788;
	}

	@Test
	void add1() {
		int res = myService.add(766,10);
		assert res == 776;
	}

}



