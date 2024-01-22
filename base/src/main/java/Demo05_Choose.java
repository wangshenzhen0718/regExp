import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

/**
 * @Author:wsz
 * @Date: 2022/12/28 21:25
 * @Description:选择匹配符
 * @Version: 1.0
 * @Since: 1.0
 */
public class Demo05_Choose {
    public static void main(String[] args) {
        String content="中国是一个强大的民族哈哈";
        Pattern pattern = compile("中国|强大|民族");
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()){
            String group = matcher.group(0);
            System.out.println("找到："+group);
        }

    }
}
