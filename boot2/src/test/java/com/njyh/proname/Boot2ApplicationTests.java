package com.njyh.proname;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Boot2ApplicationTests {

	@Test
	public void contextLoads() {
		Assert.assertEquals(1, 1);
	}

}
