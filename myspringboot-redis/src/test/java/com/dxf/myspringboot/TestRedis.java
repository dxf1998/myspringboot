package com.dxf.myspringboot;
import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

//import com.dxf.myspringboot.model.Member;
@SpringBootTest(classes = StartSpringBootMain.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class TestRedis {
	@Resource
	private RedisTemplate<String, Object> redisTemplate;
	@Test 
	public void testGet() {
		this.redisTemplate.opsForValue().set("wukonglai","www.wukonglai.com");
		System.out.println(this.redisTemplate.opsForValue().get("wukoglai"));
	}
	
}
