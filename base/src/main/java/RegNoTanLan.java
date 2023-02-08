import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

/**
 * @Author:wsz
 * @Date: 2022/12/29 20:55
 * @Description:非贪婪分组 匹配pattern但不捕获该匹配的子表达式
 * @Version: 1.0
 * @Since: 1.0
 */
public class RegNoTanLan {
    public static void main(String[] args) {

        String content="hello11111111\n";
        Pattern pattern = compile("\\d+?");//非贪婪匹配
        Matcher matcher = pattern.matcher(content);
        int count=0;
        while (matcher.find()){
            count++;
            String group = matcher.group(0);
            System.out.println("第0组："+group);
        }
        System.out.println(count);


    }
}
