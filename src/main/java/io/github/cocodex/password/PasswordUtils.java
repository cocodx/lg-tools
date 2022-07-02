package io.github.cocodex.password;

/**
 * @author amazfit
 * @date 2022-07-02 上午2:12
 * 密码常用工具
 **/
public class PasswordUtils {

    /**
     * 它有至少 8个字符。
     * 至少包含 一个小写英文字母。
     * 至少包含 一个大写英文字母。
     * 至少包含 一个数字。
     * 至少包含 一个特殊字符。特殊字符为："!@#$%^&*()-+"中的一个。
     * 它 不包含2个连续相同的字符（比方说"aab"不符合该条件，但是"aba"符合该条件）。
     *
     * @param password
     * @return
     */
    public static boolean isStrongPassword(String password){
        int len = password.length();
        int a1=0;
        int A1=0;
        int num=0;
        int ch1=0;

        if(len<8) return false;
        for(int i=0;i<len;i++){
            char ch = password.charAt(i);
            if(ch>='a' && ch<='z'){
                a1++;
            }
            else if(ch>='A' && ch<='Z'){
                A1++;
            }
            else if(ch>='0' && ch<='9'){
                num++;
            }else{
                ch1++;
            }
            if(i>0 && password.charAt(i)==password.charAt(i-1)){
                return false;
            }

        }
        return a1>0 && A1>0 && num>0 && ch1>0;
    }
}
