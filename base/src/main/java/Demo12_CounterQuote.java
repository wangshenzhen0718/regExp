import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

/**
 * @Author:wsz
 * @Date: 2022/12/31 10:51
 * @Description:反向引用
 * @Version: 1.0
 * @Since: 1.0
 */
public class Demo12_CounterQuote {
    public static void main(String[] args) {

        String content="fdhdfha12321-999666333ffff";
        //匹配2个连续相同的数字
        //String regex="(\\d)\\1";
        //匹配5个连续相同的数字,相当于(\\d)\\1\\1\\1\\1"
        //String regex="(\\d)\\1{4}";
        //匹配4位回文数如：1221
        //String regex="(\\d)(\\d)\\2\\1";
        String regex="\\d{5}-(\\d)\\1{2}(\\d)\\2{2}(\\d)\\3{2}";

        Pattern pattern = compile(regex);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()){
            System.out.println(matcher.group(0));
        }
    }
}
