/**
 * @Author:wsz
 * @Date: 2022/12/31 17:37
 * @Description:验证邮箱
 * @Version: 1.0
 * @Since: 1.0
 */
public class Demo19_Email {
    public static void main(String[] args) {

        String content="153474100@163.com";
        String regex="[\\w-]+@([a-zA-Z0-9]+\\.)[a-zA-Z]+";
        boolean matches = content.matches(regex);
        System.out.println(matches);

    }
}
