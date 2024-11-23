package cn.uncleyumo.utils

import cn.uncleyumo.utils.enum.BackGroundColorEnum
import cn.uncleyumo.utils.enum.FrontColorEnum
import cn.uncleyumo.utils.pojo.MetaPrinter

/**
 * @author uncle_yumo
 * @fileName colorPrinter
 * @createDate 2024/11/21 November
 * @school 无锡学院
 * @studentID 22344131
 * @description
 */

/**
 * 提供颜色打印功能的工具类。
 * 此类包含多个方法，用于以不同的字体颜色和背景颜色打印文本。
 */
object ColorPrinter {


    /**
     * 使用黑色字体打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printFontBlack(text: String) = MetaPrinter.addFontColor(FrontColorEnum.BLACK).print(text)

    /**
     * 使用红色字体打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printFontRed(text: String) = MetaPrinter.addFontColor(FrontColorEnum.RED).print(text)

    /**
     * 使用绿色字体打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printFontGreen(text: String) = MetaPrinter.addFontColor(FrontColorEnum.GREEN).print(text)

    /**
     * 使用黄色字体打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printFontYellow(text: String) = MetaPrinter.addFontColor(FrontColorEnum.YELLOW).print(text)

    /**
     * 使用蓝色字体打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printFontBlue(text: String) = MetaPrinter.addFontColor(FrontColorEnum.BLUE).print(text)

    /**
     * 使用紫色字体打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printFontPurple(text: String) = MetaPrinter.addFontColor(FrontColorEnum.PURPLE).print(text)

    /**
     * 使用青色字体打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printFontCyan(text: String) = MetaPrinter.addFontColor(FrontColorEnum.CYAN).print(text)

    /**
     * 使用白色字体打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printFontWhite(text: String) = MetaPrinter.addFontColor(FrontColorEnum.WHITE).print(text)


    /**
     * 使用黑色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printBackgroundBlack(text: String) = MetaPrinter.addBackgroundColor(BackGroundColorEnum.BLACK).print(text)

    /**
     * 使用红色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printBackgroundRed(text: String) = MetaPrinter.addBackgroundColor(BackGroundColorEnum.RED).print(text)

    /**
     * 使用绿色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printBackgroundGreen(text: String) = MetaPrinter.addBackgroundColor(BackGroundColorEnum.GREEN).print(text)

    /**
     * 使用黄色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printBackgroundYellow(text: String) = MetaPrinter.addBackgroundColor(BackGroundColorEnum.YELLOW).print(text)

    /**
     * 使用蓝色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printBackgroundBlue(text: String) = MetaPrinter.addBackgroundColor(BackGroundColorEnum.BLUE).print(text)

    /**
     * 使用紫色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printBackgroundPurple(text: String) = MetaPrinter.addBackgroundColor(BackGroundColorEnum.PURPLE).print(text)

    /**
     * 使用青色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printBackgroundCyan(text: String) = MetaPrinter.addBackgroundColor(BackGroundColorEnum.CYAN).print(text)

    /**
     * 使用白色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printBackgroundWhite(text: String) = MetaPrinter.addBackgroundColor(BackGroundColorEnum.WHITE).print(text)

    // 换行打印不同字体颜色
    /**
     * 使用黑色字体打印文本并换行。
     *
     * @param text 要打印的文本内容。
     */
    fun printlnFontBlack(text: String) = MetaPrinter.addFontColor(FrontColorEnum.BLACK).println(text)

    /**
     * 使用红色字体打印文本并换行。
     *
     * @param text 要打印的文本内容。
     */
    fun printlnFontRed(text: String) = MetaPrinter.addFontColor(FrontColorEnum.RED).println(text)

    /**
     * 使用绿色字体打印文本并换行。
     *
     * @param text 要打印的文本内容。
     */
    fun printlnFontGreen(text: String) = MetaPrinter.addFontColor(FrontColorEnum.GREEN).println(text)

    /**
     * 使用黄色字体打印文本并换行。
     *
     * @param text 要打印的文本内容。
     */
    fun printlnFontYellow(text: String) = MetaPrinter.addFontColor(FrontColorEnum.YELLOW).println(text)

    /**
     * 使用蓝色字体打印文本并换行。
     *
     * @param text 要打印的文本内容。
     */
    fun printlnFontBlue(text: String) = MetaPrinter.addFontColor(FrontColorEnum.BLUE).println(text)

    /**
     * 使用紫色字体打印文本并换行。
     *
     * @param text 要打印的文本内容。
     */
    fun printlnFontPurple(text: String) = MetaPrinter.addFontColor(FrontColorEnum.PURPLE).println(text)

    /**
     * 使用青色字体打印文本并换行。
     *
     * @param text 要打印的文本内容。
     */
    fun printlnFontCyan(text: String) = MetaPrinter.addFontColor(FrontColorEnum.CYAN).println(text)

    /**
     * 使用白色字体打印文本并换行。
     *
     * @param text 要打印的文本内容。
     */
    fun printlnFontWhite(text: String) = MetaPrinter.addFontColor(FrontColorEnum.WHITE).println(text)

    // 换行打印所有背景颜色
    /**
     * 使用黑色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     */
    fun printlnBackgroundBlack(text: String) = MetaPrinter.addBackgroundColor(BackGroundColorEnum.BLACK).println(text)

    /**
     * 使用红色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     */
    fun printlnBackgroundRed(text: String) = MetaPrinter.addBackgroundColor(BackGroundColorEnum.RED).println(text)

    /**
     * 使用绿色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     */
    fun printlnBackgroundGreen(text: String) = MetaPrinter.addBackgroundColor(BackGroundColorEnum.GREEN).println(text)

    /**
     * 使用黄色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     */
    fun printlnBackgroundYellow(text: String) = MetaPrinter.addBackgroundColor(BackGroundColorEnum.YELLOW).println(text)

    /**
     * 使用蓝色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     */
    fun printlnBackgroundBlue(text: String) = MetaPrinter.addBackgroundColor(BackGroundColorEnum.BLUE).println(text)

    /**
     * 使用紫色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     */
    fun printlnBackgroundPurple(text: String) = MetaPrinter.addBackgroundColor(BackGroundColorEnum.PURPLE).println(text)

    /**
     * 使用青色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     */
    fun printlnBackgroundCyan(text: String) = MetaPrinter.addBackgroundColor(BackGroundColorEnum.CYAN).println(text)

    /**
     * 使用白色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     */
    fun printlnBackgroundWhite(text: String) = MetaPrinter.addBackgroundColor(BackGroundColorEnum.WHITE).println(text)


    /**
     * 使用黑色字体和红色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printBlackRed(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLACK).addBackgroundColor(BackGroundColorEnum.RED).print(text)

    /**
     * 使用黑色字体和绿色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printBlackGreen(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLACK).addBackgroundColor(BackGroundColorEnum.GREEN).print(text)

    /**
     * 使用黑色字体和黄色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printBlackYellow(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLACK).addBackgroundColor(BackGroundColorEnum.YELLOW).print(text)

    /**
     * 使用黑色字体和蓝色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printBlackBlue(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLACK).addBackgroundColor(BackGroundColorEnum.BLUE).print(text)

    /**
     * 使用黑色字体和紫色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printBlackPurple(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLACK).addBackgroundColor(BackGroundColorEnum.PURPLE).print(text)

    /**
     * 使用黑色字体和青色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printBlackCyan(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLACK).addBackgroundColor(BackGroundColorEnum.CYAN).print(text)

    /**
     * 使用黑色字体和白色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printBlackWhite(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLACK).addBackgroundColor(BackGroundColorEnum.WHITE).print(text)

    // 红色字体与不同背景颜色的组合
    /**
     * 使用红色字体和黑色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printRedBlack(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.RED).addBackgroundColor(BackGroundColorEnum.BLACK).print(text)

    /**
     * 使用红色字体和绿色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printRedGreen(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.RED).addBackgroundColor(BackGroundColorEnum.GREEN).print(text)

    /**
     * 使用红色字体和黄色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printRedYellow(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.RED).addBackgroundColor(BackGroundColorEnum.YELLOW).print(text)

    /**
     * 使用红色字体和蓝色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printRedBlue(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.RED).addBackgroundColor(BackGroundColorEnum.BLUE).print(text)

    /**
     * 使用红色字体和紫色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printRedPurple(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.RED).addBackgroundColor(BackGroundColorEnum.PURPLE).print(text)

    /**
     * 使用红色字体和青色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printRedCyan(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.RED).addBackgroundColor(BackGroundColorEnum.CYAN).print(text)

    /**
     * 使用红色字体和白色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printRedWhite(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.RED).addBackgroundColor(BackGroundColorEnum.WHITE).print(text)

    // 绿色字体与不同背景颜色的组合
    /**
     * 使用绿色字体和黑色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printGreenBlack(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.GREEN).addBackgroundColor(BackGroundColorEnum.BLACK).print(text)

    /**
     * 使用绿色字体和黄色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printGreenYellow(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.GREEN).addBackgroundColor(BackGroundColorEnum.YELLOW).print(text)

    /**
     * 使用绿色字体和蓝色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printGreenBlue(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.GREEN).addBackgroundColor(BackGroundColorEnum.BLUE).print(text)

    /**
     * 使用绿色字体和紫色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printGreenPurple(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.GREEN).addBackgroundColor(BackGroundColorEnum.PURPLE).print(text)

    /**
     * 使用绿色字体和青色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printGreenCyan(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.GREEN).addBackgroundColor(BackGroundColorEnum.CYAN).print(text)

    /**
     * 使用绿色字体和白色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printGreenWhite(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.GREEN).addBackgroundColor(BackGroundColorEnum.WHITE).print(text)


    /**
     * 使用黄色字体和黑色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printYellowBlack(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.YELLOW).addBackgroundColor(BackGroundColorEnum.BLACK).print(text)

    /**
     * 使用黄色字体和红色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printYellowRed(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.YELLOW).addBackgroundColor(BackGroundColorEnum.RED).print(text)

    /**
     * 使用黄色字体和绿色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printYellowGreen(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.YELLOW).addBackgroundColor(BackGroundColorEnum.GREEN).print(text)

    /**
     * 使用黄色字体和蓝色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printYellowBlue(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.YELLOW).addBackgroundColor(BackGroundColorEnum.BLUE).print(text)

    /**
     * 使用黄色字体和紫色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printYellowPurple(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.YELLOW).addBackgroundColor(BackGroundColorEnum.PURPLE).print(text)

    /**
     * 使用黄色字体和青色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printYellowCyan(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.YELLOW).addBackgroundColor(BackGroundColorEnum.CYAN).print(text)

    /**
     * 使用黄色字体和白色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printYellowWhite(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.YELLOW).addBackgroundColor(BackGroundColorEnum.WHITE).print(text)

// 蓝色字体与不同背景颜色的组合

    /**
     * 使用蓝色字体和黑色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printBlueBlack(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLUE).addBackgroundColor(BackGroundColorEnum.BLACK).print(text)

    /**
     * 使用蓝色字体和红色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printBlueRed(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLUE).addBackgroundColor(BackGroundColorEnum.RED).print(text)

    /**
     * 使用蓝色字体和绿色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printBlueGreen(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLUE).addBackgroundColor(BackGroundColorEnum.GREEN).print(text)

    /**
     * 使用蓝色字体和黄色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printBlueYellow(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLUE).addBackgroundColor(BackGroundColorEnum.YELLOW).print(text)

    /**
     * 使用蓝色字体和紫色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printBluePurple(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLUE).addBackgroundColor(BackGroundColorEnum.PURPLE).print(text)

    /**
     * 使用蓝色字体和青色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printBlueCyan(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLUE).addBackgroundColor(BackGroundColorEnum.CYAN).print(text)

    /**
     * 使用蓝色字体和白色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printBlueWhite(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLUE).addBackgroundColor(BackGroundColorEnum.WHITE).print(text)

// 紫色字体与不同背景颜色的组合

    /**
     * 使用紫色字体和黑色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printPurpleBlack(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.PURPLE).addBackgroundColor(BackGroundColorEnum.BLACK).print(text)

    /**
     * 使用紫色字体和红色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printPurpleRed(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.PURPLE).addBackgroundColor(BackGroundColorEnum.RED).print(text)

    /**
     * 使用紫色字体和绿色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printPurpleGreen(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.PURPLE).addBackgroundColor(BackGroundColorEnum.GREEN).print(text)

    /**
     * 使用紫色字体和黄色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printPurpleYellow(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.PURPLE).addBackgroundColor(BackGroundColorEnum.YELLOW).print(text)

    /**
     * 使用紫色字体和蓝色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printPurpleBlue(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.PURPLE).addBackgroundColor(BackGroundColorEnum.BLUE).print(text)

    /**
     * 使用紫色字体和青色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printPurpleCyan(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.PURPLE).addBackgroundColor(BackGroundColorEnum.CYAN).print(text)

    /**
     * 使用紫色字体和白色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printPurpleWhite(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.PURPLE).addBackgroundColor(BackGroundColorEnum.WHITE).print(text)

// 青色字体与不同背景颜色的组合

    /**
     * 使用青色字体和黑色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printCyanBlack(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.CYAN).addBackgroundColor(BackGroundColorEnum.BLACK).print(text)

    /**
     * 使用青色字体和红色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printCyanRed(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.CYAN).addBackgroundColor(BackGroundColorEnum.RED).print(text)

    /**
     * 使用青色字体和绿色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printCyanGreen(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.CYAN).addBackgroundColor(BackGroundColorEnum.GREEN).print(text)

    /**
     * 使用青色字体和黄色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printCyanYellow(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.CYAN).addBackgroundColor(BackGroundColorEnum.YELLOW).print(text)

    /**
     * 使用青色字体和蓝色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printCyanBlue(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.CYAN).addBackgroundColor(BackGroundColorEnum.BLUE).print(text)

    /**
     * 使用青色字体和紫色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printCyanPurple(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.CYAN).addBackgroundColor(BackGroundColorEnum.PURPLE).print(text)

    /**
     * 使用青色字体和白色背景打印文本。
     *
     * @param text 要打印的文本内容。
     */
    fun printCyanWhite(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.CYAN).addBackgroundColor(BackGroundColorEnum.WHITE).print(text)

    /**
     * 使用白色字体和黑色背景打印文本。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printWhiteBlack(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.WHITE).addBackgroundColor(BackGroundColorEnum.BLACK).print(text)

    /**
     * 使用白色字体和红色背景打印文本。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printWhiteRed(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.WHITE).addBackgroundColor(BackGroundColorEnum.RED).print(text)

    /**
     * 使用白色字体和绿色背景打印文本。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printWhiteGreen(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.WHITE).addBackgroundColor(BackGroundColorEnum.GREEN).print(text)

    /**
     * 使用白色字体和黄色背景打印文本。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printWhiteYellow(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.WHITE).addBackgroundColor(BackGroundColorEnum.YELLOW).print(text)

    /**
     * 使用白色字体和蓝色背景打印文本。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printWhiteBlue(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.WHITE).addBackgroundColor(BackGroundColorEnum.BLUE).print(text)

    /**
     * 使用白色字体和紫色背景打印文本。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printWhitePurple(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.WHITE).addBackgroundColor(BackGroundColorEnum.PURPLE).print(text)

    /**
     * 使用白色字体和青色背景打印文本。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printWhiteCyan(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.WHITE).addBackgroundColor(BackGroundColorEnum.CYAN).print(text)

    /**
     * 使用黑色字体和红色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnBlackRed(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLACK).addBackgroundColor(BackGroundColorEnum.RED).println(text)

    /**
     * 使用黑色字体和绿色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnBlackGreen(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLACK).addBackgroundColor(BackGroundColorEnum.GREEN).println(text)

    /**
     * 使用黑色字体和黄色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnBlackYellow(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLACK).addBackgroundColor(BackGroundColorEnum.YELLOW).println(text)

    /**
     * 使用黑色字体和蓝色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnBlackBlue(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLACK).addBackgroundColor(BackGroundColorEnum.BLUE).println(text)

    /**
     * 使用黑色字体和紫色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnBlackPurple(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLACK).addBackgroundColor(BackGroundColorEnum.PURPLE).println(text)

    /**
     * 使用黑色字体和青色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnBlackCyan(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLACK).addBackgroundColor(BackGroundColorEnum.CYAN).println(text)

    /**
     * 使用黑色字体和白色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnBlackWhite(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLACK).addBackgroundColor(BackGroundColorEnum.WHITE).println(text)

    // 红色字体与不同背景颜色的组合-换行

    /**
     * 使用红色字体和黑色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnRedBlack(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.RED).addBackgroundColor(BackGroundColorEnum.BLACK).println(text)

    /**
     * 使用红色字体和绿色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnRedGreen(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.RED).addBackgroundColor(BackGroundColorEnum.GREEN).println(text)

    /**
     * 使用红色字体和黄色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnRedYellow(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.RED).addBackgroundColor(BackGroundColorEnum.YELLOW).println(text)

    /**
     * 使用红色字体和蓝色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnRedBlue(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.RED).addBackgroundColor(BackGroundColorEnum.BLUE).println(text)

    /**
     * 使用红色字体和紫色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnRedPurple(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.RED).addBackgroundColor(BackGroundColorEnum.PURPLE).println(text)

    /**
     * 使用红色字体和青色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnRedCyan(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.RED).addBackgroundColor(BackGroundColorEnum.CYAN).println(text)

    /**
     * 使用红色字体和白色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnRedWhite(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.RED).addBackgroundColor(BackGroundColorEnum.WHITE).println(text)

    // 绿色字体与不同背景颜色的组合-换行

    /**
     * 使用绿色字体和黑色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnGreenBlack(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.GREEN).addBackgroundColor(BackGroundColorEnum.BLACK).println(text)

    /**
     * 使用绿色字体和黄色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnGreenYellow(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.GREEN).addBackgroundColor(BackGroundColorEnum.YELLOW).println(text)

    /**
     * 使用绿色字体和蓝色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnGreenBlue(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.GREEN).addBackgroundColor(BackGroundColorEnum.BLUE).println(text)

    /**
     * 使用绿色字体和紫色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnGreenPurple(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.GREEN).addBackgroundColor(BackGroundColorEnum.PURPLE).println(text)

    /**
     * 使用绿色字体和青色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnGreenCyan(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.GREEN).addBackgroundColor(BackGroundColorEnum.CYAN).println(text)

    /**
     * 使用绿色字体和白色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnGreenWhite(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.GREEN).addBackgroundColor(BackGroundColorEnum.WHITE).println(text)

    // 黄色字体与不同背景颜色的组合-换行
    /**
     * 使用黄色字体和黑色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnYellowBlack(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.YELLOW).addBackgroundColor(BackGroundColorEnum.BLACK).println(text)

    /**
     * 使用黄色字体和红色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnYellowRed(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.YELLOW).addBackgroundColor(BackGroundColorEnum.RED).println(text)

    /**
     * 使用黄色字体和绿色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnYellowGreen(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.YELLOW).addBackgroundColor(BackGroundColorEnum.GREEN).println(text)

    /**
     * 使用黄色字体和蓝色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnYellowBlue(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.YELLOW).addBackgroundColor(BackGroundColorEnum.BLUE).println(text)

    /**
     * 使用黄色字体和紫色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnYellowPurple(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.YELLOW).addBackgroundColor(BackGroundColorEnum.PURPLE).println(text)

    /**
     * 使用黄色字体和青色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnYellowCyan(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.YELLOW).addBackgroundColor(BackGroundColorEnum.CYAN).println(text)

    /**
     * 使用黄色字体和白色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnYellowWhite(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.YELLOW).addBackgroundColor(BackGroundColorEnum.WHITE).println(text)

    // 蓝色字体与不同背景颜色的组合-换行
    /**
     * 使用蓝色字体和黑色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnBlueBlack(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLUE).addBackgroundColor(BackGroundColorEnum.BLACK).println(text)

    /**
     * 使用蓝色字体和红色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnBlueRed(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLUE).addBackgroundColor(BackGroundColorEnum.RED).println(text)

    /**
     * 使用蓝色字体和绿色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnBlueGreen(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLUE).addBackgroundColor(BackGroundColorEnum.GREEN).println(text)

    /**
     * 使用蓝色字体和黄色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnBlueYellow(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLUE).addBackgroundColor(BackGroundColorEnum.YELLOW).println(text)

    /**
     * 使用蓝色字体和紫色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnBluePurple(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLUE).addBackgroundColor(BackGroundColorEnum.PURPLE).println(text)

    /**
     * 使用蓝色字体和青色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnBlueCyan(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLUE).addBackgroundColor(BackGroundColorEnum.CYAN).println(text)

    /**
     * 使用蓝色字体和白色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnBlueWhite(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLUE).addBackgroundColor(BackGroundColorEnum.WHITE).println(text)

    // 紫色字体与不同背景颜色的组合-换行
    /**
     * 使用紫色字体和黑色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnPurpleBlack(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.PURPLE).addBackgroundColor(BackGroundColorEnum.BLACK).println(text)

    /**
     * 使用紫色字体和红色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnPurpleRed(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.PURPLE).addBackgroundColor(BackGroundColorEnum.RED).println(text)

    /**
     * 使用紫色字体和绿色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnPurpleGreen(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.PURPLE).addBackgroundColor(BackGroundColorEnum.GREEN).println(text)

    /**
     * 使用紫色字体和黄色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnPurpleYellow(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.PURPLE).addBackgroundColor(BackGroundColorEnum.YELLOW).println(text)

    /**
     * 使用紫色字体和蓝色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnPurpleBlue(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.PURPLE).addBackgroundColor(BackGroundColorEnum.BLUE).println(text)

    /**
     * 使用紫色字体和青色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnPurpleCyan(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.PURPLE).addBackgroundColor(BackGroundColorEnum.CYAN).println(text)

    /**
     * 使用紫色字体和白色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnPurpleWhite(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.PURPLE).addBackgroundColor(BackGroundColorEnum.WHITE).println(text)

    // 青色字体与不同背景颜色的组合-换行
    /**
     * 使用青色字体和黑色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnCyanBlack(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.CYAN).addBackgroundColor(BackGroundColorEnum.BLACK).println(text)

    /**
     * 使用青色字体和红色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnCyanRed(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.CYAN).addBackgroundColor(BackGroundColorEnum.RED).println(text)

    /**
     * 使用青色字体和绿色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnCyanGreen(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.CYAN).addBackgroundColor(BackGroundColorEnum.GREEN).println(text)

    /**
     * 使用青色字体和黄色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnCyanYellow(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.CYAN).addBackgroundColor(BackGroundColorEnum.YELLOW).println(text)

    /**
     * 使用青色字体和蓝色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnCyanBlue(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.CYAN).addBackgroundColor(BackGroundColorEnum.BLUE).println(text)

    /**
     * 使用青色字体和紫色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnCyanPurple(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.CYAN).addBackgroundColor(BackGroundColorEnum.PURPLE).println(text)

    /**
     * 使用青色字体和白色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnCyanWhite(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.CYAN).addBackgroundColor(BackGroundColorEnum.WHITE).println(text)

    // 白色字体与不同背景颜色的组合-换行
    /**
     * 使用白色字体和黑色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnWhiteBlack(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.WHITE).addBackgroundColor(BackGroundColorEnum.BLACK).println(text)

    /**
     * 使用白色字体和红色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnWhiteRed(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.WHITE).addBackgroundColor(BackGroundColorEnum.RED).println(text)

    /**
     * 使用白色字体和绿色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnWhiteGreen(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.WHITE).addBackgroundColor(BackGroundColorEnum.GREEN).println(text)

    /**
     * 使用白色字体和黄色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnWhiteYellow(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.WHITE).addBackgroundColor(BackGroundColorEnum.YELLOW).println(text)

    /**
     * 使用白色字体和蓝色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnWhiteBlue(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.WHITE).addBackgroundColor(BackGroundColorEnum.BLUE).println(text)

    /**
     * 使用白色字体和紫色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnWhitePurple(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.WHITE).addBackgroundColor(BackGroundColorEnum.PURPLE).println(text)

    /**
     * 使用白色字体和青色背景打印文本并换行。
     *
     * @param text 要打印的文本内容。
     * @return 返回打印操作的结果。
     */
    fun printlnWhiteCyan(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.WHITE).addBackgroundColor(BackGroundColorEnum.CYAN).println(text)
}
