package mao;

import java.awt.*;

/**
 * Project name(项目名称)：java实现自动化
 * Package(包名): mao
 * Class(类名): RobotTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/3/11
 * Time(创建时间)： 12:37
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class RobotTest
{
    public static void main(String[] args)
    {
        RobotUtils.beep();
        Point point = RobotUtils.getMouseLocation();
        System.out.println(point);
        Dimension dimension = RobotUtils.getScreenSize();
        System.out.println(dimension);
    }
}
