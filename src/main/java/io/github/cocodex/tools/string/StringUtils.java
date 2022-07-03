package io.github.cocodex.tools.string;

import java.util.HashSet;

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
