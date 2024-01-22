import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

public class Demo01_Exp {

    public static void main(String[] args) {
        String content = "1998年12月8日，第二代Java平台的企业版J2EE发布。1999年6月，Sun公司发布了\" +\n" +
                "                \"第二代Java平台（简称为Java2）的3个版本：J2ME（Java2 Micro Edition，Java2平台的微型\" +\n" +
                "                \"版），应用于移动、无线及有限资源的环境；J2SE（Java 2 Standard Edition，Java 2平台的\" +\n" +
                "                \"标准版），应用于桌面环境；J2EE（Java 2Enterprise Edition，Java 2平台的企业版），应\" +\n" +
                "                \"用3443于基于Java的应用服务器。Java 2平台的发布，是Java发展过程中最重要的一个\" +\n" +
                "                \"里程碑，标志着Java的应用开始普及9889\n" +
                "————————————————\n" +
                "版权声明：本文为CSDN博主「一颗毛李子」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。\n" +
                "原文链接：https://blog.csdn.net/LW_20180806/article/details/125607656";
        //1．先创建一个Pattern对象﹐模式对象，可以理解成就是一个正则表达式对象
        //Pattern pattern = compile("[a-zA-Z]+");
        //Pattern pattern = compile("[0-9]+");
        Pattern pattern = compile("([0-9]+)|([a-zA-Z]+)");
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
