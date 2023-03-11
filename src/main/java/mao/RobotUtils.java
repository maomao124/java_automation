package mao;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Project name(项目名称)：java实现自动化
 * Package(包名): mao
 * Class(类名): RobotUtils
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/3/11
 * Time(创建时间)： 12:41
 * Version(版本): 1.0
 * Description(描述)： 工具类
 */

public class RobotUtils
{
    private static Robot robot = null;

    static
    {
        try
        {
            robot = new Robot();
        }
        catch (AWTException e)
        {
            e.printStackTrace();
        }
    }


    /**
     * 鼠标左键点击
     *
     * @param x 要点击的位置的x轴
     * @param y 要点击的位置的Y轴
     */
    public static void leftClick(int x, int y)
    {
        //移动到当前位置
        robot.mouseMove(x, y);
        //左键按压
        robot.mousePress(16);
        //10毫秒
        sleep(10L);
        //左键释放
        robot.mouseRelease(16);
    }


    /**
     * 鼠标右键键点击
     *
     * @param x 要点击的位置的x轴
     * @param y 要点击的位置的Y轴
     */
    public static void rightClick(int x, int y)
    {
        //移动到当前位置
        robot.mouseMove(x, y);
        //右键按压
        robot.mousePress(8);
        //10毫秒
        sleep(10L);
        //右键释放
        robot.mouseRelease(8);
    }


    /**
     * 按下一个键盘的按键
     *
     * @param keyCode 键盘按键code
     */
    public static void key(int keyCode)
    {
        //键盘按键按压
        robot.keyPress(keyCode);
        //等待10毫秒
        sleep(10L);
        //键盘按键释放
        robot.keyRelease(keyCode);
    }


    /**
     * 按下键盘的组合键
     *
     * @param keyCodes 键盘按键code数组
     */
    public static void keys(int[] keyCodes)
    {
        //逐步按下所有键
        for (int keyCode : keyCodes)
        {
            robot.keyPress(keyCode);
        }
        //等待10毫秒
        sleep(10L);
        //反序松开所有键
        for (int i = keyCodes.length - 1; i >= 0; i--)
        {
            robot.keyRelease(keyCodes[i]);
        }
    }


    /**
     * 得到鼠标光标的位置
     *
     * @return {@link Point}
     */
    public static Point getMouseLocation()
    {
        return MouseInfo.getPointerInfo().getLocation();
    }


    /**
     * 得到剪贴板内容
     *
     * @return {@link String}
     */
    public static String getClipboard()
    {
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable content = clipboard.getContents(null);
        if (content.isDataFlavorSupported(DataFlavor.stringFlavor))
        {
            try
            {
                return (String) content.getTransferData(DataFlavor.stringFlavor);
            }
            catch (UnsupportedFlavorException | IOException e)
            {
                e.printStackTrace();
            }
        }
        return null;
    }


    /**
     * 哔哔声音
     */
    public static void beep()
    {
        Toolkit.getDefaultToolkit().beep();
    }


    /**
     * 设置剪贴板内容
     *
     * @param data 数据
     */
    public static void setClipboard(String data)
    {
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection selection = new StringSelection(data);
        clipboard.setContents(selection, null);
    }


    /**
     * 鼠标移动监听
     *
     * @param mills 鼠标移动监听的毫秒数
     */
    public static void mouseMove(long mills)
    {
        //当前时间
        long time = System.currentTimeMillis();
        //得到当前光标位置
        Point p = getMouseLocation();
        while (System.currentTimeMillis() - time <= mills)
        {
            Point newp = getMouseLocation();
            if ((newp.x != p.x) || (newp.y != p.y))
            {
                System.out.println("( " + newp.x + ", " + newp.y + " )");
            }
            p = newp;
            sleep(100L);
        }
    }


    /**
     * 睡眠
     *
     * @param millis 毫秒数
     */
    public static void sleep(long millis)
    {
        try
        {
            Thread.sleep(millis);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }


    /**
     * 得到屏幕大小
     *
     * @return {@link Dimension}
     */
    public static Dimension getScreenSize()
    {
        return Toolkit.getDefaultToolkit().getScreenSize();
    }


    /**
     * 显示提示
     *
     * @param message 消息
     */
    public static void showTip(String message)
    {
        JOptionPane.showMessageDialog(null, message, "tip", JOptionPane.PLAIN_MESSAGE);
    }


    /**
     * 截取全屏并保存为图片
     *
     * @param imgPath img路径
     * @return {@link File}
     */
    public static File getScreenImg(String imgPath)
    {
        BufferedImage image = robot.createScreenCapture(new Rectangle(getScreenSize()));
        try
        {
            File imgFile = new File(imgPath);
            ImageIO.write(image, "JPG", imgFile);
            return imgFile;
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
