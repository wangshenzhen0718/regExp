/**
 * @Author:wsz
 * @Date: 2022/12/31 11:34
 * @Description:结巴去重
 * @Version: 1.0
 * @Since: 1.0
 */
public class RegStringMatches_12 {
    public static void main(String[] args) {

        String content="13688888888";
        System.out.println(content.matches("13[8|9](\\d){8}"));
        content="136#88-88#88&88";
        for (String s : content.split("#|-|&")) {
            System.out.println(s);
        }


    }
}
