import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

/**
 * @Author:wsz
 * @Date: 2022/12/27 22:55
 * @Description:正则字符匹配
 * @Version: 1.0
 * @Since: 1.0
 */
public class RegCharacterSign_06 {
    public static void main(String[] args) {
        String content="ab c1\n1c 8ABC";
        //1 \d 表示一个任意的数字
        //2。创建模式对象[即正则表达式对象]
        //忽略大小写
        //Pattern pattern = compile("(?i)abc");
        //Pattern pattern = compile("abc",Pattern.CASE_INSENSITIVE);
        //非小写字母
        Pattern pattern = compile(".");
        //3．创建匹配器
        //说明:创建匹配器matcher，按照正则表达式的规则去匹配 content字符串
        Matcher matcher = pattern.matcher(content);

        while (matcher.find()){
            String group = matcher.group(0);
            System.out.println("找到："+group);
        }

        int i = Runtime.getRuntime().availableProcessors();
        System.out.println(i);

    }

}
