package cn.uncleyumo.utils.pojo

import cn.uncleyumo.utils.enum.BackGroundColorEnum
import cn.uncleyumo.utils.enum.FontStyleEnum
import cn.uncleyumo.utils.enum.FrontColorEnum

/**
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

    fun addFontColor(fc: FrontColorEnum): MetaPrinter {
        fontColor = fc.color
        return this
    }

    fun addBackgroundColor(bc: BackGroundColorEnum): MetaPrinter {
        backgroundColor = bc.color
        return this
    }

    fun addFontStyle(fs: FontStyleEnum): MetaPrinter {
        fontStyle = fs.style
        return this
    }

    fun getProcessedString(text: String): String {
        val processedString = "\u001B[$fontStyle;$fontColor;${backgroundColor}m$text\u001B[0m"
        resetAllStyles()
        return processedString
    }

    fun println(text: String) {
        kotlin.io.println(getProcessedString(text))
    }

    fun print(text: String) {
        kotlin.io.print(getProcessedString(text))
    }
    private fun resetAllStyles() {
        fontColor = FrontColorEnum.DEFAULT.color
        backgroundColor = BackGroundColorEnum.DEFAULT.color
        fontStyle = FontStyleEnum.BOLD.style
    }

}