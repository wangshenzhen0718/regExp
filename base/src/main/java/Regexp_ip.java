import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

/**
 * @Author:wsz
 * @Date: 2022/12/26 21:03
 * @Description:
 * @Version: 1.0
 * @Since: 1.0
 */
public class Regexp_ip {

    public static void main(String[] args) {
        String content ="A类 10.0.0.0--10.255.255.255\n" +
                "B类 172.16.0.0--172.31.255.255\n" +
                "C类 192.168.0.0--192.168.255.255";
        //1．先创建一个Pattern对象﹐模式对象，可以理解成就是一个正则表达式对象
        //Pattern pattern = compile("[a-zA-Z]+");"card_title":"刘强东痛批中高层拿PPT欺骗自己"
        //Pattern pattern = compile("[0-9]+");
        Pattern pattern = compile("\\d+\\.\\d+\\.\\d+\\.\\d+");
        //2。创建一个匹配器对象
        //理解:就是 matcher匹配器按照 pattern(模式/样式)，到 content 文本中去匹配,找到就返回true，否则就返回false
        Matcher matcher = pattern.matcher(content);
        //3。可以开始循环匹配
        while (matcher.find()){
            //匹配内容,文本,放到matcher.group(0)
            String group = matcher.group(0);
            System.out.println(group);

        }


    }
}
