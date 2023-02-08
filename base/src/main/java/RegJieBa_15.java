import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

/**
 * @Author:wsz
 * @Date: 2022/12/31 11:34
 * @Description:结巴去重
 * @Version: 1.0
 * @Since: 1.0
 */
public class RegJieBa_15 {
    public static void main(String[] args) {
        /*分组、捕获、反向引用
        要解决前面的问题,我们需要了解正则表达式的几个概念:
        1．分组
        我们可以用圆括号组成一个比较复杂的匹配模式，那么一个圆括号的部分我们可以看作是一个子表达式一个分组。
        2.捕获
        把正则表达式中子表达式/分组匹配的内容，保存到内存中以数字编号或显式命名的组里，方便后面引用，从左向右，以分组的左括号为标志，第一个出现的分组的组号为1，第二个为2，以此类推。组0代表的是整个正则式
        3.反向引用
        圆括号的内容被捕获后，可以在这个括号后被使用，从而写出一个比较实用的匹配模式，这个我们称为反向引用，这种引用既可以是在正则表达式内部，也可以是在正则表达式外部，内部反向引用\\分组号，外部反向引用$分组号
*/

        String content="我...我要....学学学学....编程java!";
        String regex="\\.";
        Pattern pattern = compile(regex);
        Matcher matcher = pattern.matcher(content);
        content = matcher.replaceAll("");
        System.out.println("去除点后的："+content);
        /*pattern = compile("(.)\\1+");
        matcher = pattern.matcher(content);
        while (matcher.find()){
            System.out.println(matcher.group(0));
        }
        content = matcher.replaceAll("$1");*/
        //我我要学学学学编程java! $1是捕获到的分组 我 替换为匹配到的我我，因为内部会记录上一次匹配的位置 一次执行查到所有匹配的 重复替换
        content = compile("(.)\\1+").matcher(content).replaceAll("$1");
        System.out.println(content);



    }
}
