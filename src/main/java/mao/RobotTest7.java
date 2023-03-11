package mao;

/**
 * Project name(项目名称)：java实现自动化
 * Package(包名): mao
 * Class(类名): RobotTest7
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/3/11
 * Time(创建时间)： 13:15
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class RobotTest7
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 20; i++)
        {
            RobotUtils.key(65);
            RobotUtils.sleep(20);
        }
    }
}
