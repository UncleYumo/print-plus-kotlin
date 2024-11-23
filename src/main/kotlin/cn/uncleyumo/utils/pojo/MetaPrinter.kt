package cn.uncleyumo.utils.pojo

import cn.uncleyumo.utils.enum.BackGroundColorEnum
import cn.uncleyumo.utils.enum.FontStyleEnum
import cn.uncleyumo.utils.enum.FrontColorEnum

/**
 * 单例样式打印器，提供便捷的方式来打印带有特定字体颜色、背景颜色和字体样式的文本。
 *
 * @author uncle_yumo
 * @fileName MetaPrinter
 * @createDate 2024/11/21 November
 * @school 无锡学院
 * @studentID 22344131
 * @description 单例样式打印器
 */
object MetaPrinter {
    private var fontColor: String = FrontColorEnum.DEFAULT.color
    private var backgroundColor: String = BackGroundColorEnum.DEFAULT.color
    private var fontStyle: String = FontStyleEnum.BOLD.style

    /**
     * 设置字体颜色。
     *
     * @param fc 字体颜色枚举值
     * @return 返回当前的 MetaPrinter 实例，以便进行链式调用
     */
    fun addFontColor(fc: FrontColorEnum): MetaPrinter {
        fontColor = fc.color
        return this
    }

    /**
     * 设置背景颜色。
     *
     * @param bc 背景颜色枚举值
     * @return 返回当前的 MetaPrinter 实例，以便进行链式调用
     */
    fun addBackgroundColor(bc: BackGroundColorEnum): MetaPrinter {
        backgroundColor = bc.color
        return this
    }

    /**
     * 设置字体样式。
     *
     * @param fs 字体样式枚举值
     * @return 返回当前的 MetaPrinter 实例，以便进行链式调用
     */
    fun addFontStyle(fs: FontStyleEnum): MetaPrinter {
        fontStyle = fs.style
        return this
    }

    /**
     * 获取处理后的字符串，带有指定的字体样式和颜色设置。
     *
     * @param text 要处理的文本
     * @return 带有样式和颜色的处理后文本字符串
     */
    fun getProcessedString(text: String): String {
        val processedString = "\u001B[$fontStyle;$fontColor;${backgroundColor}m$text\u001B[0m"
        resetAllStyles()
        return processedString
    }

    /**
     * 打印带样式的文本到控制台，并换行。
     *
     * @param text 要打印的文本
     */
    fun println(text: String) {
        kotlin.io.println(getProcessedString(text))
    }

    /**
     * 打印带样式的文本到控制台，但不换行。
     *
     * @param text 要打印的文本
     */
    fun print(text: String) {
        kotlin.io.print(getProcessedString(text))
    }

    /**
     * 重置所有样式设置为默认值。
     */
    private fun resetAllStyles() {
        fontColor = FrontColorEnum.DEFAULT.color
        backgroundColor = BackGroundColorEnum.DEFAULT.color
        fontStyle = FontStyleEnum.BOLD.style
    }
}
