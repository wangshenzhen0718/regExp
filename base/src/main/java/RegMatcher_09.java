import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

/**
 * @Author:wsz
 * @Date: 2022/12/31 9:58
 * @Description:
 * @Version: 1.0
 * @Since: 1.0
 */
public class RegMatcher_09 {
    public static void main(String[] args) {

        String content="hello dbbk hello";
        String regex="hello";
        Pattern pattern = compile(regex);
        Matcher matcher = pattern.matcher(content);
        /*while (matcher.find()){
            System.out.println(matcher.start());
            System.out.println(matcher.end());
            System.out.println(matcher.matches());
        }*/
        //返回的是替换后的字符串 原来的没有变化
        String wsz = matcher.replaceAll("wsz");
        System.out.println(wsz);
    }
}
