package org.dclar.h2e;

import com.lambdaworks.redis.RedisClient;
import com.lambdaworks.redis.RedisConnection;
import com.lambdaworks.redis.RedisURI;

public class Jedis {

    public static void main(String[] args) {


        String key = "featureIndexKey";

        RedisClient redisClient = new RedisClient(
                RedisURI.create("redis://10.0.47.63:6379"));
        RedisConnection<String, String> connection = redisClient.connect();

        System.out.println("Connected to Redis");

        System.out.println("第一次");
        long start = System.currentTimeMillis();
        long end = 0L;
        System.out.println(start);
        System.out.println("====start====");

        connection.get(key);

        System.out.println("====end====");
        end = System.currentTimeMillis();
        System.out.println(end);
        System.out.println("用时：" + (end - start) / 1000);

        System.out.println();
        System.out.println("+++++++++++++++++");

        System.out.println("第二次");
        end = 0L;
        start = System.currentTimeMillis();
        System.out.println(start);
        System.out.println("====start====");
        String str =  connection.get(key);
        System.out.println("====end====");
        end = System.currentTimeMillis();
        System.out.println(end);
        System.out.println("用时：" + (end - start) / 1000);

        System.out.println();
        System.out.println("+++++++++++++++++");



        System.out.println("放入模型");
        start = System.currentTimeMillis();
        System.out.println(start);
        System.out.println("====start====");
        connection.set("crfKey_yanglu", str);
        System.out.println("====end====");
        end = System.currentTimeMillis();
        System.out.println(end);
        System.out.println("用时：" + (end - start) / 1000);

        System.out.println();
        System.out.println("+++++++++++++++++");

        System.out.println("第三次");
        end = 0L;
        start = System.currentTimeMillis();
        System.out.println(start);
        System.out.println("====start====");
        connection.get("crfKey_yanglu");
        System.out.println("====end====");
        end = System.currentTimeMillis();
        System.out.println(end);
        System.out.println("用时：" + (end - start) / 1000);


        connection.close();
        redisClient.shutdown();

    }
}
