/**
 * @Author:wsz
 * @Date: 2022/12/31 17:37
 * @Description:验证数字
 * @Version: 1.0
 * @Since: 1.0
 */
public class RegNumber {
    public static void main(String[] args) {

        String content="0.001";
        String regex="^[-|+]?(([1-9]\\d*)|0)(\\.?\\d+)?$";
        boolean matches = content.matches(regex);
        System.out.println(matches);

    }
}
