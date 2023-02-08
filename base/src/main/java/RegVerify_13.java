import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

/**
 * @Author:wsz
 * @Date: 2022/12/29 22:20
 * @Description:验证字符串
 * @Version: 1.0
 * @Since: 1.0
 */
public class RegVerify_13 {
    public static void main(String[] args) {

        //String content="韩顺平教育";
        //String content="123400";
        //String content="153474100";
        String content="18322456791";
        //Pattern pattern = compile("^[\u0391-\uff95]+$");//汉字
        //Pattern pattern = compile("^[1-9]\\d{5}$");//1-9开头的6位数
        //Pattern pattern = compile("^[1-9]\\d{4,9}$");//1-9开头的5位到10位数
        //Pattern pattern = compile("^1(?:3|4|5|8)\\d{9}$");//13,14,15,18开头的11位数
        Pattern pattern = compile("^1[3458]\\d{9}$");//13,14,15,18开头的11位数
        Matcher matcher = pattern.matcher(content);
        if (matcher.find()){
            System.out.println("满足！");
        }else {
            System.out.println("不满足！");
        }


    }
}
