/**
 * @description:
 * @author：wsz
 * @date: 2024/1/21
 */
public class Demo14_StringMatches {
    public static void main(String[] args) {
        String content = "13888889999";
        if (content.matches("1(38|39)\\d{8}")) {
            System.out.println("验证成功");
        } else {
            System.out.println("验证失败");
        }

    }
}
