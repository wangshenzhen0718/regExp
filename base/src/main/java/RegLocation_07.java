import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

/**
 * @Author:wsz
 * @Date: 2022/12/28 21:25
 * @Description:定位符
 * @Version: 1.0
 * @Since: 1.0
 */
public class RegLocation_07 {
    public static void main(String[] args) {
        //String content="18322456793";
        String content="laohan wo aihanni";
        //Pattern pattern = compile("^[0-9]+[a-z]*");
        //Pattern pattern = compile("^[0-9]+[a-z]+$");
        Pattern pattern = compile("han\\B");
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()){
            String group = matcher.group(0);
            System.out.println("找到："+group);
        }

    }
}
