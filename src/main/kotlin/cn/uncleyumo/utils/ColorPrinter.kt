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

object ColorPrinter {

    // 不换行打印不同字体颜色
    fun printFontBlack(text: String) = MetaPrinter.addFontColor(FrontColorEnum.BLACK).print(text)
    fun printFontRed(text: String) = MetaPrinter.addFontColor(FrontColorEnum.RED).print(text)
    fun printFontGreen(text: String) = MetaPrinter.addFontColor(FrontColorEnum.GREEN).print(text)
    fun printFontYellow(text: String) = MetaPrinter.addFontColor(FrontColorEnum.YELLOW).print(text)
    fun printFontBlue(text: String) = MetaPrinter.addFontColor(FrontColorEnum.BLUE).print(text)
    fun printFontPurple(text: String) = MetaPrinter.addFontColor(FrontColorEnum.PURPLE).print(text)
    fun printFontCyan(text: String) = MetaPrinter.addFontColor(FrontColorEnum.CYAN).print(text)
    fun printFontWhite(text: String) = MetaPrinter.addFontColor(FrontColorEnum.WHITE).print(text)

    // 不换行打印所有背景颜色
    fun printBackgroundBlack(text: String) = MetaPrinter.addBackgroundColor(BackGroundColorEnum.BLACK).print(text)
    fun printBackgroundRed(text: String) = MetaPrinter.addBackgroundColor(BackGroundColorEnum.RED).print(text)
    fun printBackgroundGreen(text: String) = MetaPrinter.addBackgroundColor(BackGroundColorEnum.GREEN).print(text)
    fun printBackgroundYellow(text: String) = MetaPrinter.addBackgroundColor(BackGroundColorEnum.YELLOW).print(text)
    fun printBackgroundBlue(text: String) = MetaPrinter.addBackgroundColor(BackGroundColorEnum.BLUE).print(text)
    fun printBackgroundPurple(text: String) = MetaPrinter.addBackgroundColor(BackGroundColorEnum.PURPLE).print(text)
    fun printBackgroundCyan(text: String) = MetaPrinter.addBackgroundColor(BackGroundColorEnum.CYAN).print(text)
    fun printBackgroundWhite(text: String) = MetaPrinter.addBackgroundColor(BackGroundColorEnum.WHITE).print(text)

    // 换行打印不同字体颜色
    fun printlnFontBlack(text: String) = MetaPrinter.addFontColor(FrontColorEnum.BLACK).println(text)
    fun printlnFontRed(text: String) = MetaPrinter.addFontColor(FrontColorEnum.RED).println(text)
    fun printlnFontGreen(text: String) = MetaPrinter.addFontColor(FrontColorEnum.GREEN).println(text)
    fun printlnFontYellow(text: String) = MetaPrinter.addFontColor(FrontColorEnum.YELLOW).println(text)
    fun printlnFontBlue(text: String) = MetaPrinter.addFontColor(FrontColorEnum.BLUE).println(text)
    fun printlnFontPurple(text: String) = MetaPrinter.addFontColor(FrontColorEnum.PURPLE).println(text)
    fun printlnFontCyan(text: String) = MetaPrinter.addFontColor(FrontColorEnum.CYAN).println(text)
    fun printlnFontWhite(text: String) = MetaPrinter.addFontColor(FrontColorEnum.WHITE).println(text)

    // 换行打印所有背景颜色
    fun printlnBackgroundBlack(text: String) = MetaPrinter.addBackgroundColor(BackGroundColorEnum.BLACK).println(text)
    fun printlnBackgroundRed(text: String) = MetaPrinter.addBackgroundColor(BackGroundColorEnum.RED).println(text)
    fun printlnBackgroundGreen(text: String) = MetaPrinter.addBackgroundColor(BackGroundColorEnum.GREEN).println(text)
    fun printlnBackgroundYellow(text: String) = MetaPrinter.addBackgroundColor(BackGroundColorEnum.YELLOW).println(text)
    fun printlnBackgroundBlue(text: String) = MetaPrinter.addBackgroundColor(BackGroundColorEnum.BLUE).println(text)
    fun printlnBackgroundPurple(text: String) = MetaPrinter.addBackgroundColor(BackGroundColorEnum.PURPLE).println(text)
    fun printlnBackgroundCyan(text: String) = MetaPrinter.addBackgroundColor(BackGroundColorEnum.CYAN).println(text)
    fun printlnBackgroundWhite(text: String) = MetaPrinter.addBackgroundColor(BackGroundColorEnum.WHITE).println(text)

    // 黑色字体与不同背景颜色的组合
    fun printBlackRed(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLACK).addBackgroundColor(BackGroundColorEnum.RED).print(text)

    fun printBlackGreen(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLACK).addBackgroundColor(BackGroundColorEnum.GREEN).print(text)

    fun printBlackYellow(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLACK).addBackgroundColor(BackGroundColorEnum.YELLOW).print(text)

    fun printBlackBlue(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLACK).addBackgroundColor(BackGroundColorEnum.BLUE).print(text)

    fun printBlackPurple(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLACK).addBackgroundColor(BackGroundColorEnum.PURPLE).print(text)

    fun printBlackCyan(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLACK).addBackgroundColor(BackGroundColorEnum.CYAN).print(text)

    fun printBlackWhite(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLACK).addBackgroundColor(BackGroundColorEnum.WHITE).print(text)

    // 红色字体与不同背景颜色的组合
    fun printRedBlack(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.RED).addBackgroundColor(BackGroundColorEnum.BLACK).print(text)

    fun printRedGreen(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.RED).addBackgroundColor(BackGroundColorEnum.GREEN).print(text)

    fun printRedYellow(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.RED).addBackgroundColor(BackGroundColorEnum.YELLOW).print(text)

    fun printRedBlue(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.RED).addBackgroundColor(BackGroundColorEnum.BLUE).print(text)

    fun printRedPurple(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.RED).addBackgroundColor(BackGroundColorEnum.PURPLE).print(text)

    fun printRedCyan(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.RED).addBackgroundColor(BackGroundColorEnum.CYAN).print(text)

    fun printRedWhite(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.RED).addBackgroundColor(BackGroundColorEnum.WHITE).print(text)

    // 绿色字体与不同背景颜色的组合
    fun printGreenBlack(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.GREEN).addBackgroundColor(BackGroundColorEnum.BLACK).print(text)

    fun printGreenYellow(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.GREEN).addBackgroundColor(BackGroundColorEnum.YELLOW).print(text)

    fun printGreenBlue(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.GREEN).addBackgroundColor(BackGroundColorEnum.BLUE).print(text)

    fun printGreenPurple(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.GREEN).addBackgroundColor(BackGroundColorEnum.PURPLE).print(text)

    fun printGreenCyan(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.GREEN).addBackgroundColor(BackGroundColorEnum.CYAN).print(text)

    fun printGreenWhite(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.GREEN).addBackgroundColor(BackGroundColorEnum.WHITE).print(text)

    // 黄色字体与不同背景颜色的组合
    fun printYellowBlack(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.YELLOW).addBackgroundColor(BackGroundColorEnum.BLACK).print(text)

    fun printYellowRed(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.YELLOW).addBackgroundColor(BackGroundColorEnum.RED).print(text)

    fun printYellowGreen(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.YELLOW).addBackgroundColor(BackGroundColorEnum.GREEN).print(text)

    fun printYellowBlue(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.YELLOW).addBackgroundColor(BackGroundColorEnum.BLUE).print(text)

    fun printYellowPurple(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.YELLOW).addBackgroundColor(BackGroundColorEnum.PURPLE).print(text)

    fun printYellowCyan(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.YELLOW).addBackgroundColor(BackGroundColorEnum.CYAN).print(text)

    fun printYellowWhite(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.YELLOW).addBackgroundColor(BackGroundColorEnum.WHITE).print(text)

    // 蓝色字体与不同背景颜色的组合
    fun printBlueBlack(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLUE).addBackgroundColor(BackGroundColorEnum.BLACK).print(text)

    fun printBlueRed(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLUE).addBackgroundColor(BackGroundColorEnum.RED).print(text)

    fun printBlueGreen(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLUE).addBackgroundColor(BackGroundColorEnum.GREEN).print(text)

    fun printBlueYellow(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLUE).addBackgroundColor(BackGroundColorEnum.YELLOW).print(text)

    fun printBluePurple(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLUE).addBackgroundColor(BackGroundColorEnum.PURPLE).print(text)

    fun printBlueCyan(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLUE).addBackgroundColor(BackGroundColorEnum.CYAN).print(text)

    fun printBlueWhite(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLUE).addBackgroundColor(BackGroundColorEnum.WHITE).print(text)

    // 紫色字体与不同背景颜色的组合
    fun printPurpleBlack(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.PURPLE).addBackgroundColor(BackGroundColorEnum.BLACK).print(text)

    fun printPurpleRed(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.PURPLE).addBackgroundColor(BackGroundColorEnum.RED).print(text)

    fun printPurpleGreen(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.PURPLE).addBackgroundColor(BackGroundColorEnum.GREEN).print(text)

    fun printPurpleYellow(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.PURPLE).addBackgroundColor(BackGroundColorEnum.YELLOW).print(text)

    fun printPurpleBlue(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.PURPLE).addBackgroundColor(BackGroundColorEnum.BLUE).print(text)

    fun printPurpleCyan(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.PURPLE).addBackgroundColor(BackGroundColorEnum.CYAN).print(text)

    fun printPurpleWhite(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.PURPLE).addBackgroundColor(BackGroundColorEnum.WHITE).print(text)

    // 青色字体与不同背景颜色的组合
    fun printCyanBlack(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.CYAN).addBackgroundColor(BackGroundColorEnum.BLACK).print(text)

    fun printCyanRed(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.CYAN).addBackgroundColor(BackGroundColorEnum.RED).print(text)

    fun printCyanGreen(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.CYAN).addBackgroundColor(BackGroundColorEnum.GREEN).print(text)

    fun printCyanYellow(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.CYAN).addBackgroundColor(BackGroundColorEnum.YELLOW).print(text)

    fun printCyanBlue(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.CYAN).addBackgroundColor(BackGroundColorEnum.BLUE).print(text)

    fun printCyanPurple(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.CYAN).addBackgroundColor(BackGroundColorEnum.PURPLE).print(text)

    fun printCyanWhite(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.CYAN).addBackgroundColor(BackGroundColorEnum.WHITE).print(text)

    // 白色字体与不同背景颜色的组合
    fun printWhiteBlack(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.WHITE).addBackgroundColor(BackGroundColorEnum.BLACK).print(text)

    fun printWhiteRed(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.WHITE).addBackgroundColor(BackGroundColorEnum.RED).print(text)

    fun printWhiteGreen(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.WHITE).addBackgroundColor(BackGroundColorEnum.GREEN).print(text)

    fun printWhiteYellow(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.WHITE).addBackgroundColor(BackGroundColorEnum.YELLOW).print(text)

    fun printWhiteBlue(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.WHITE).addBackgroundColor(BackGroundColorEnum.BLUE).print(text)

    fun printWhitePurple(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.WHITE).addBackgroundColor(BackGroundColorEnum.PURPLE).print(text)

    fun printWhiteCyan(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.WHITE).addBackgroundColor(BackGroundColorEnum.CYAN).print(text)

    // 黑色字体与不同背景颜色的组合-换行
    fun printlnBlackRed(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLACK).addBackgroundColor(BackGroundColorEnum.RED).println(text)

    fun printlnBlackGreen(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLACK).addBackgroundColor(BackGroundColorEnum.GREEN).println(text)

    fun printlnBlackYellow(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLACK).addBackgroundColor(BackGroundColorEnum.YELLOW).println(text)

    fun printlnBlackBlue(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLACK).addBackgroundColor(BackGroundColorEnum.BLUE).println(text)

    fun printlnBlackPurple(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLACK).addBackgroundColor(BackGroundColorEnum.PURPLE).println(text)

    fun printlnBlackCyan(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLACK).addBackgroundColor(BackGroundColorEnum.CYAN).println(text)

    fun printlnBlackWhite(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLACK).addBackgroundColor(BackGroundColorEnum.WHITE).println(text)

    // 红色字体与不同背景颜色的组合-换行
    fun printlnRedBlack(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.RED).addBackgroundColor(BackGroundColorEnum.BLACK).println(text)

    fun printlnRedGreen(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.RED).addBackgroundColor(BackGroundColorEnum.GREEN).println(text)

    fun printlnRedYellow(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.RED).addBackgroundColor(BackGroundColorEnum.YELLOW).println(text)

    fun printlnRedBlue(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.RED).addBackgroundColor(BackGroundColorEnum.BLUE).println(text)

    fun printlnRedPurple(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.RED).addBackgroundColor(BackGroundColorEnum.PURPLE).println(text)

    fun printlnRedCyan(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.RED).addBackgroundColor(BackGroundColorEnum.CYAN).println(text)

    fun printlnRedWhite(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.RED).addBackgroundColor(BackGroundColorEnum.WHITE).println(text)

    // 绿色字体与不同背景颜色的组合-换行
    fun printlnGreenBlack(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.GREEN).addBackgroundColor(BackGroundColorEnum.BLACK).println(text)

    fun printlnGreenYellow(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.GREEN).addBackgroundColor(BackGroundColorEnum.YELLOW).println(text)

    fun printlnGreenBlue(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.GREEN).addBackgroundColor(BackGroundColorEnum.BLUE).println(text)

    fun printlnGreenPurple(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.GREEN).addBackgroundColor(BackGroundColorEnum.PURPLE).println(text)

    fun printlnGreenCyan(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.GREEN).addBackgroundColor(BackGroundColorEnum.CYAN).println(text)

    fun printlnGreenWhite(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.GREEN).addBackgroundColor(BackGroundColorEnum.WHITE).println(text)

    // 黄色字体与不同背景颜色的组合-换行
    fun printlnYellowBlack(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.YELLOW).addBackgroundColor(BackGroundColorEnum.BLACK).println(text)

    fun printlnYellowRed(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.YELLOW).addBackgroundColor(BackGroundColorEnum.RED).println(text)

    fun printlnYellowGreen(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.YELLOW).addBackgroundColor(BackGroundColorEnum.GREEN).println(text)

    fun printlnYellowBlue(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.YELLOW).addBackgroundColor(BackGroundColorEnum.BLUE).println(text)

    fun printlnYellowPurple(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.YELLOW).addBackgroundColor(BackGroundColorEnum.PURPLE).println(text)

    fun printlnYellowCyan(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.YELLOW).addBackgroundColor(BackGroundColorEnum.CYAN).println(text)

    fun printlnYellowWhite(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.YELLOW).addBackgroundColor(BackGroundColorEnum.WHITE).println(text)

    // 蓝色字体与不同背景颜色的组合-换行
    fun printlnBlueBlack(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLUE).addBackgroundColor(BackGroundColorEnum.BLACK).println(text)

    fun printlnBlueRed(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLUE).addBackgroundColor(BackGroundColorEnum.RED).println(text)

    fun printlnBlueGreen(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLUE).addBackgroundColor(BackGroundColorEnum.GREEN).println(text)

    fun printlnBlueYellow(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLUE).addBackgroundColor(BackGroundColorEnum.YELLOW).println(text)

    fun printlnBluePurple(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLUE).addBackgroundColor(BackGroundColorEnum.PURPLE).println(text)

    fun printlnBlueCyan(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLUE).addBackgroundColor(BackGroundColorEnum.CYAN).println(text)

    fun printlnBlueWhite(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.BLUE).addBackgroundColor(BackGroundColorEnum.WHITE).println(text)

    // 紫色字体与不同背景颜色的组合-换行
    fun printlnPurpleBlack(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.PURPLE).addBackgroundColor(BackGroundColorEnum.BLACK).println(text)

    fun printlnPurpleRed(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.PURPLE).addBackgroundColor(BackGroundColorEnum.RED).println(text)

    fun printlnPurpleGreen(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.PURPLE).addBackgroundColor(BackGroundColorEnum.GREEN).println(text)

    fun printlnPurpleYellow(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.PURPLE).addBackgroundColor(BackGroundColorEnum.YELLOW).println(text)

    fun printlnPurpleBlue(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.PURPLE).addBackgroundColor(BackGroundColorEnum.BLUE).println(text)

    fun printlnPurpleCyan(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.PURPLE).addBackgroundColor(BackGroundColorEnum.CYAN).println(text)

    fun printlnPurpleWhite(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.PURPLE).addBackgroundColor(BackGroundColorEnum.WHITE).println(text)

    // 青色字体与不同背景颜色的组合-换行
    fun printlnCyanBlack(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.CYAN).addBackgroundColor(BackGroundColorEnum.BLACK).println(text)

    fun printlnCyanRed(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.CYAN).addBackgroundColor(BackGroundColorEnum.RED).println(text)

    fun printlnCyanGreen(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.CYAN).addBackgroundColor(BackGroundColorEnum.GREEN).println(text)

    fun printlnCyanYellow(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.CYAN).addBackgroundColor(BackGroundColorEnum.YELLOW).println(text)

    fun printlnCyanBlue(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.CYAN).addBackgroundColor(BackGroundColorEnum.BLUE).println(text)

    fun printlnCyanPurple(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.CYAN).addBackgroundColor(BackGroundColorEnum.PURPLE).println(text)

    fun printlnCyanWhite(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.CYAN).addBackgroundColor(BackGroundColorEnum.WHITE).println(text)

    // 白色字体与不同背景颜色的组合-换行
    fun printlnWhiteBlack(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.WHITE).addBackgroundColor(BackGroundColorEnum.BLACK).println(text)

    fun printlnWhiteRed(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.WHITE).addBackgroundColor(BackGroundColorEnum.RED).println(text)

    fun printlnWhiteGreen(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.WHITE).addBackgroundColor(BackGroundColorEnum.GREEN).println(text)

    fun printlnWhiteYellow(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.WHITE).addBackgroundColor(BackGroundColorEnum.YELLOW).println(text)

    fun printlnWhiteBlue(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.WHITE).addBackgroundColor(BackGroundColorEnum.BLUE).println(text)

    fun printlnWhitePurple(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.WHITE).addBackgroundColor(BackGroundColorEnum.PURPLE).println(text)

    fun printlnWhiteCyan(text: String) =
        MetaPrinter.addFontColor(FrontColorEnum.WHITE).addBackgroundColor(BackGroundColorEnum.CYAN).println(text)
}