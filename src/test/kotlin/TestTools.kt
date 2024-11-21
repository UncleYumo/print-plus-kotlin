import cn.uncleyumo.utils.LogPrinter
import cn.uncleyumo.utils.ColorPrinter
import cn.uncleyumo.utils.enum.BackGroundColorEnum
import cn.uncleyumo.utils.enum.FontStyleEnum
import cn.uncleyumo.utils.enum.FrontColorEnum
import cn.uncleyumo.utils.pojo.MetaPrinter
import cn.uncleyumo.utils.enum.*

fun main() {
    // 日志打印
    LogPrinter.info("This is an info message.")
    LogPrinter.debug("This is a debug message.")
    LogPrinter.warn("This is a warning message.")
    LogPrinter.error("This is an error message.")

    // 自定义样式打印
    ColorPrinter.printlnFontRed("This text is red.")
    ColorPrinter.printlnBackgroundPurple("This text has a green background.")
    ColorPrinter.printlnRedBlack("This text is red with a black background.")

    // 使用 MetaPrinter 进行自定义样式组合
    MetaPrinter
        .addFontColor(FrontColorEnum.YELLOW)
        .addBackgroundColor(BackGroundColorEnum.BLUE)
        .addFontStyle(FontStyleEnum.BOLD)
        .println("This text is yellow with a blue background and bold font.")
}
