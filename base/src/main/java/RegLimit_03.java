import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

/**
 * @Author:wsz
 * @Date: 2022/12/28 21:25
 * @Description:选择限定符的使用 用于指定其前面的字符和组合项连续出现多少次
 * @Version: 1.0
 * @Since: 1.0
 */
public class RegLimit_03 {
    public static void main(String[] args) {
        String content = "111111111aaaaaaaahello";
        //String regStr="a{3}";//匹配aaa
        //String regStr="1{4}";//匹配1111
        //String regStr="\\d{2}";//匹配两位任意数字
        //String regStr="a{3,4}";//匹配aaa或aaaa
        //String regStr="1{4,5}";//匹配1111或11111
        String regStr="1+";//匹配1111或11111
        Pattern pattern = compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            String group = matcher.group(0);
            System.out.println("找到：" + group);
        }

    }
}
