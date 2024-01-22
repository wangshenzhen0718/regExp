/**
 * @Author:wsz
 * @Date: 2022/12/31 11:34
 * @Description:replaceAll
 * @Version: 1.0
 * @Since: 1.0
 */
public class Demo13_StringReplaceAll {
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

        String content="J2EE1.4 J2EE1.4 大体上JDK1.3的框架和J2EE1.3是一致的，1.4增加了JDK1.4对Web服务的支持，主要是Web Service，JAX-RPC，SAAJ，JAXR，还对EJB的消息传递机制进行了完善（EJB2.1），部署与管理工具的增强（\n" +
                "        JMX），以及新版本的Servlet2.4和JSP2.0使得Web应用更加容易。";

        System.out.println(content.replaceAll("JDK1\\.[3,4]","JDK"));



    }
}
