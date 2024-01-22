/**
 * @description:
 * @author：wsz
 * @date: 2024/1/21
 */
public class Demo15_StringSplit {
    public static void main(String[] args) {
        //要求按照 # 或者 - 或者 ~ 或者 数字 来分割
        System.out.println("===================");
        String content = "hello#abc-jack12smith~北京";
        String[] split = content.split("#|-|~|\\d+");
        for (String s : split) {
            System.out.println(s);
        }

    }
}
