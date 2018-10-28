package cn.linkbook.registry.biz.util;


/**
 * @author 王琦 <1124602935@qq.com>
 * @DATE 2018/10/28 16:24.
 * @Description
 */
public class IDGen {


    public static String generateID(){
        return generateID("");
    }

    public static String generateID(String prefix){
        String UUID = java.util.UUID.randomUUID().toString().replaceAll("-","");
        return prefix.concat(UUID);
    }

}
