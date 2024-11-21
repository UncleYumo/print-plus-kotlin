package on.uncleyumo.utils

import on.uncleyumo.utils.pojo.MetaPrinter
import on.uncleyumo.utils.enum.*
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

/**
 * @author uncle_yumo
 * @fileName LogPrinter
 * @createDate 2024/11/21 November
 * @school 无锡学院
 * @studentID 22344131
 * @description 基于MetaPrinter的彩色日志打印工具类，带时间戳
 */

object LogPrinter {

    private val dateTimeFormatter: DateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss")

    // 获取当前时间的时分秒字符串
    private fun getCurrentTime(): String {
        return LocalDateTime.now().format(dateTimeFormatter)
    }

    // INFO level log with blue text
    fun info(message: String) {
        MetaPrinter.addFontColor(FrontColorEnum.BLUE)
            .addFontStyle(FontStyleEnum.NORMAL)
            .println("[${getCurrentTime()}][INFO]\t $message")
    }

    // DEBUG level log with cyan text
    fun debug(message: String) {
        MetaPrinter.addFontColor(FrontColorEnum.CYAN)
            .addFontStyle(FontStyleEnum.NORMAL)
            .println("[${getCurrentTime()}][DEBUG]\t $message")
    }

    // WARN level log with yellow text and bold style
    fun warn(message: String) {
        MetaPrinter.addFontColor(FrontColorEnum.YELLOW)
            .addFontStyle(FontStyleEnum.BOLD)
            .println("[${getCurrentTime()}][WARN]\t $message")
    }

    // ERROR level log with red text and bold style
    fun error(message: String) {
        MetaPrinter.addFontColor(FrontColorEnum.RED)
            .addFontStyle(FontStyleEnum.BOLD)
            .println("[${getCurrentTime()}][ERROR]\t $message")
    }

    fun showAllLoger() {
        info("info message")
        debug("debug message")
        warn("warn message")
        error("error message")
    }
}