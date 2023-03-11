package mao;

import java.io.File;

/**
 * Project name(项目名称)：java实现自动化
 * Package(包名): mao
 * Class(类名): RobotTest2
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/3/11
 * Time(创建时间)： 13:00
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class RobotTest2
{
    public static void main(String[] args)
    {
        File file = RobotUtils.getScreenImg("./test.jpg");
        System.out.println(file.getPath());
    }
}
