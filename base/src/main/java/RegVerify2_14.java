import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

/**
 * @Author:wsz
 * @Date: 2022/12/29 22:20
 * @Description:验证字符串
 * @Version: 1.0
 * @Since: 1.0
 */
public class RegVerify2_14 {
    public static void main(String[] args) {

        String content="https://www.bilibili.com/video/BV1Eq4y1E79W/?p=17&spm_id_from=pageDriver&vd_source=0cf6d44f5e3a070238da6af72caf88b9";
        Pattern pattern = compile("^((http|https)://)?([\\w-]+\\.)+[\\w-]+(\\/[\\w-?=#&/%.]*)?$");
        Matcher matcher = pattern.matcher(content);
        if (matcher.find()){
            System.out.println("满足！");
        }else {
            System.out.println("不满足！");
        }


    }
}
