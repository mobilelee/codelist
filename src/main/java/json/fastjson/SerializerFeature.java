package json.fastjson;

import com.alibaba.fastjson.JSON;

import java.util.Date;

public class SerializerFeature {

    public static void main(String[] args) {
        User user = new User();
        user.setId(11L);
        user.setName("西安");
        user.setCreateTime(new Date());
        String jsonString = JSON.toJSONString(user, com.alibaba.fastjson.serializer.SerializerFeature.PrettyFormat,
                com.alibaba.fastjson.serializer.SerializerFeature.WriteNullStringAsEmpty,
                com.alibaba.fastjson.serializer.SerializerFeature.UseSingleQuotes);
        System.out.println(jsonString);
    }
}
