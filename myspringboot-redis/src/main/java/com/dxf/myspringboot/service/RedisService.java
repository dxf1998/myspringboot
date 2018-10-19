package com.dxf.myspringboot.service;

import javax.annotation.Resource;
/*
 * @author 独善其身的狗
 * @date   2018年10月19日
 * 
 */

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
@Service
public class RedisService {
	 @Resource
	    private RedisTemplate<String,Object> redisTemplate; //stringRedisTemplate只能缓存key-value的String类型


	    public void set(String key, Object value) {
	        ValueOperations<String,Object> vo = redisTemplate.opsForValue();
	        vo.set(key, value);
	    }


	    public Object get(String key) {
	        ValueOperations<String,Object> vo = redisTemplate.opsForValue();
	        return vo.get(key);
	    }
}
