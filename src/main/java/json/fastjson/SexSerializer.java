package json.fastjson;

import com.alibaba.fastjson.serializer.JSONSerializable;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.ObjectSerializer;

import java.io.IOException;
import java.lang.reflect.Type;

public class SexSerializer implements ObjectSerializer {


    public void write(JSONSerializer serializer,
                      Object object,
                      Object fieldName,
                      Type fieldType,
                      int features) throws IOException {
        Boolean vaule = (Boolean) object;
        String text = "女";
        if(vaule !=null && vaule==true){
            text = "男";
        }
        serializer.write(text);


    }
}
