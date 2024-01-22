import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @description:转义字符
 * @author：wsz
 * @date: 2024/1/18
 */
public class Demo03_EscapeCharacters {
    public static void main(String[] args) {
        String content = "abc$(a.bc(123( )";
        String regStr="\\(";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()){
            System.out.println("找到:"+ matcher.group(0));
        }
    }

}
