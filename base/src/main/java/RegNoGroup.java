import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

/**
 * @Author:wsz
 * @Date: 2022/12/29 20:55
 * @Description:非捕获分组 匹配pattern但不捕获该匹配的子表达式
 * @Version: 1.0
 * @Since: 1.0
 */
public class RegNoGroup {
    public static void main(String[] args) {

        String content="hello韩顺平教育jack韩顺平老师韩顺平同学hello\n";


        //Pattern pattern = compile("韩顺平(?:教育|老师|同学)");
        Pattern pattern = compile("韩顺平(?=教育|老师)");
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
