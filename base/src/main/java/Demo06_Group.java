import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

/**
 * @Author:wsz
 * @Date: 2022/12/29 20:55
 * @Description:捕获分组
 * @Version: 1.0
 * @Since: 1.0
 */
public class Demo06_Group {
    public static void main(String[] args) {

        String content="laohan wo1999 aih2000anni";

        /*自定义组名（?<组名>）*/
        Pattern pattern = compile("(?<ggg1>\\d\\d)(\\d)(\\d)");
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()){
            String group = matcher.group(0);
            String group_name = matcher.group("ggg1");
            String group1 = matcher.group(1);
            String group2 = matcher.group(2);
            String group3 = matcher.group(3);
            System.out.println("找到："+group);
            System.out.println("第一组："+group1);
            System.out.println("第一组："+group_name);
            System.out.println("第二组："+group2);
            System.out.println("第3组："+group3);
        }

    }
}
