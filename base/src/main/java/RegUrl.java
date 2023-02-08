import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author:wsz
 * @Date: 2022/12/31 17:37
 * @Description:获取url信息
 * @Version: 1.0
 * @Since: 1.0
 */
public class RegUrl {
    public static void main(String[] args) {

        String content="http://www.sohu.com:8080/abc/kkk/index.html";
        String regex="^([a-zA-Z]+)://([a-zA-Z.]+):(\\d+)([\\w-/]*/)([\\w.]+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(content);
        if (matcher.matches()){
            System.out.println("协议："+matcher.group(1));
            System.out.println("域名："+matcher.group(2));
            System.out.println("端口号："+matcher.group(3));
            System.out.println("路径："+matcher.group(4));
            System.out.println("文件名："+matcher.group(5));
        }

    }
}
