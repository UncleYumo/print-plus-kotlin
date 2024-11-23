package cn.uncleyumo.utils

import cn.uncleyumo.utils.enum.FontStyleEnum
import cn.uncleyumo.utils.enum.FrontColorEnum
import cn.uncleyumo.utils.pojo.MetaPrinter
import cn.uncleyumo.utils.enum.*
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

/**
 * LogPrinter 是一个用于打印彩色日志的工具类，基于 MetaPrinter 实现。
 * 该类提供不同级别的日志打印功能，包括信息、调试、警告和错误日志。
 * 所有日志均带有时间戳以便于查看日志输出的时间。
 *
 * @author uncle_yumo
 * @fileName LogPrinter
 * @createDate 2024/11/21 November
 * @school 无锡学院
 * @studentID 22344131
 * @description 基于MetaPrinter的彩色日志打印工具类，带时间戳
 */
object LogPrinter {

    private val dateTimeFormatter: DateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss")

    /**
     * 获取当前系统时间的字符串表示（格式为HH:mm:ss）。
     *
     * @return 当前时间的字符串
     */
    private fun getCurrentTime(): String {
        return LocalDateTime.now().format(dateTimeFormatter)
    }

    /**
     * 打印信息级别的日志，输出为蓝色文本。
     *
     * @param message 要打印的信息内容
     */
    fun info(message: String) {
        MetaPrinter.addFontColor(FrontColorEnum.BLUE)
            .addFontStyle(FontStyleEnum.NORMAL)
            .println("[${getCurrentTime()}][INFO]\t $message")
    }

    /**
     * 打印调试级别的日志，输出为青色文本。
     *
     * @param message 要打印的调试信息内容
     */
    fun debug(message: String) {
        MetaPrinter.addFontColor(FrontColorEnum.CYAN)
            .addFontStyle(FontStyleEnum.NORMAL)
            .println("[${getCurrentTime()}][DEBUG]\t $message")
    }

    /**
     * 打印警告级别的日志，输出为黄色文本并采用粗体样式。
     *
     * @param message 要打印的警告信息内容
     */
    fun warn(message: String) {
        MetaPrinter.addFontColor(FrontColorEnum.YELLOW)
            .addFontStyle(FontStyleEnum.BOLD)
            .println("[${getCurrentTime()}][WARN]\t $message")
    }

    /**
     * 打印错误级别的日志，输出为红色文本并采用粗体样式。
     *
     * @param message 要打印的错误信息内容
     */
    fun error(message: String) {
        MetaPrinter.addFontColor(FrontColorEnum.RED)
            .addFontStyle(FontStyleEnum.BOLD)
            .println("[${getCurrentTime()}][ERROR]\t $message")
    }

    /**
     * 打印所有日志级别的示例信息，依次调用 INFO、DEBUG、WARN 和 ERROR 方法。
     */
    fun showAllLoger() {
        info("info message")
        debug("debug message")
        warn("warn message")
        error("error message")
    }
}
