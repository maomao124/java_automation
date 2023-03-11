package mao;

import java.awt.event.KeyEvent;

/**
 * Project name(项目名称)：java实现自动化
 * Package(包名): mao
 * Class(类名): RobotTest8
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/3/11
 * Time(创建时间)： 13:18
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class RobotTest8
{
    public static void main(String[] args)
    {
        int[] keys = new int[]{KeyEvent.VK_WINDOWS, KeyEvent.VK_TAB};
        RobotUtils.keys(keys);
        RobotUtils.sleep(1000);
        RobotUtils.keys(keys);
        RobotUtils.sleep(1000);
        RobotUtils.keys(keys);
        RobotUtils.sleep(1000);
        RobotUtils.keys(keys);
        keys = new int[]{KeyEvent.VK_ALT, KeyEvent.VK_TAB};
        RobotUtils.sleep(1000);
        RobotUtils.keys(keys);
        RobotUtils.sleep(1000);
        RobotUtils.keys(keys);
    }
}
