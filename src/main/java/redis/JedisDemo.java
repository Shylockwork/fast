package redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisDemo {


    public void jedisSingle(){
        //设置ip地址和端口
        Jedis jedis = new Jedis("127.0.0.1",6379);
        //设置数据
        jedis.set("name","itheima");
        //获得数据
        String name = jedis.get("name");
        System.out.println(name);
        //释放资源
        jedis.close();
    }


    public void jedisPool(){
        //获得连接池配置对象,设置配置项
        JedisPoolConfig config = new JedisPoolConfig();
        //最大连接数
        config.setMaxTotal(30);
        //设置最大空闲数
        config.setMaxIdle(10);

        //获得连接池
        JedisPool jedisPool = new JedisPool("127.0.0.1",6379);

        //获得核心对象
        Jedis jedis = null;
        try {

            jedis = jedisPool.getResource();
            //设置数据
            jedis.set("name", "itcast");
            //获得数据
            String name = jedis.get("name");
            System.out.println(name);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(jedis!=null);{
                jedis.close();
                System.out.println("jedis 关闭");
            }
            //虚拟机关闭时释放pool资源
            if(jedisPool!=null){
                jedisPool.close();
                System.out.println("pool 关闭");
            }
        }

    }
}
