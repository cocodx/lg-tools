package io.github.cocodex.string;

/**
 * @author amazfit
 * @date 2022-07-02 下午2:48
 **/
public class StringUtils {

    public static boolean isEmpty(Object object){
        if(object!=null && !object.equals("")) return false;
        return true;
    }
}
