package mao;

/**
 * Project name(项目名称)：java实现自动化
 * Package(包名): mao
 * Class(类名): RobotTest4
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/3/11
 * Time(创建时间)： 13:05
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class RobotTest4
{
    public static void main(String[] args)
    {
        RobotUtils.setClipboard("123456789");
        String clipboard = RobotUtils.getClipboard();
        System.out.println(clipboard);
    }
}
