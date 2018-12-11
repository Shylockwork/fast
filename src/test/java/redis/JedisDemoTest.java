package redis;

import org.junit.Before;
import org.junit.Test;


public class JedisDemoTest {
    JedisDemo jedisDemo = null;
    @Before
    public void setUp(){
        jedisDemo = new JedisDemo();
    }

    @Test
    public void jedisSingle() {

        jedisDemo.jedisSingle();
    }

    @Test
    public void testJedisPool(){
        jedisDemo.jedisPool();
    }



}