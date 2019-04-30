package json.fastjson;

import com.alibaba.fastjson.JSON;

import java.util.Date;

public class SimpleTest {

    /**
     * 将User对象转化为json字符串
     */
    public static void serialize(){
        User user = new User();
        user.setId(11L);
        user.setName("西安");
        user.setCreateTime(new Date());
        String jsonString = JSON.toJSONString(user);
        System.out.println(jsonString);
    }

    /**
     * 将json字符串转化为User对象
     */
    public static void deserialize(){
        String jsonString = "{\"createTime\":\"2018-08-17 14:38:38\",\"id\":11,\"name\":\"西安\"}";
        User user = JSON.parseObject(jsonString,User.class);
        System.out.println(user.getId());
        System.out.println(user.getName());
        System.out.println(user.getCreateTime());

    }

    public static void main(String[] args) {
        serialize();
        deserialize();
    }
}
