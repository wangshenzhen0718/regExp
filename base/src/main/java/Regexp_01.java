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
public class Regexp_01 {

    public static void main(String[] args) {
        String content = "1995年，互联网的蓬勃发展给了Oak机会。业界为了使死板、单调的静态网页能够“灵活”起来，" +
                "急需一种软件技术来开发一种程序，这种程序可以通过网络传播并且能够跨平台运行。于是，世界各大IT企业为" +
                "此纷纷投入了大量的人力、物力和财力。这个时候，Sun公司想起了那个被搁置起来很久的Oak，并且重新审视了那" +
                "个用软件编写的试验平台，由于它是按照嵌入式系统硬件平台体系结构进行编写的，所以非常小，特别适用于网络上的" +
                "传输系统，而Oak也是一种精简的语言，程序非常小，适合在网络上传输。Sun公司首先推出了可以嵌入网页并且可以随同" +
                "网页在网络上传输的Applet（Applet是一种将小程序嵌入到网页中进行执行的技术），并将Oak更名为Java。5" +
                "月23日，Sun公司在Sun world会议上正式发布Java和HotJava浏览器。IBM、Apple、DEC、Adobe、HP、Or" +
                "acle、Netscape和微软等各大公司都纷纷停止了自己的相关开发项目，竞相购买了Java使用许可证，并为自己的产品开" +
                "发了相应的Java平台。";
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
