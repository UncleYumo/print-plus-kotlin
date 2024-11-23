package cn.uncleyumo.utils.enum

import cn.uncleyumo.utils.pojo.MetaPrinter

/**
 * 枚举类 QuickTemplateEnum 用于定义程序的基本信息和信息展示功能。
 *
 * @author uncle_yumo
 * @fileName quickTemplate
 * @createDate 2024/11/21 November
 * @school 无锡学院
 * @studentID 22344131
 * @description QuickTemplateEnum
 */
enum class QuickTemplateEnum(val value: String) {
    /**
     * 程序版本号。
     */
    PROGRAM_VERSION("1.1.0"),

    /**
     * 程序作者名称。
     */
    PROGRAM_AUTHOR("uncle_yumo"),

    /**
     * 程序作者邮箱。
     */
    PROGRAM_AUTHOR_EMAIL("uncleyumo@163.com"),

    /**
     * 程序名称。
     */
    PROGRAM_NAME("print-plus-kotlin"),

    /**
     * 程序开始时的提示信息。
     */
    PROGRAM_START("-------------------------- program start --------------------------\n"),

    /**
     * 程序结束时的提示信息。
     */
    PROGRAM_END("--------------------------- program end ---------------------------"),

    /**
     * 程序版本信息，包括程序名、版本号、作者及邮箱。
     */
    VERSION_INFO(
        "Welcome to use " +
                MetaPrinter
                    .addFontColor(FrontColorEnum.CYAN)
                    .addFontStyle(FontStyleEnum.BOLD)
                    .getProcessedString(PROGRAM_NAME.value) +
                "\nversion: ${PROGRAM_VERSION.value}\n" +
                "author: ${PROGRAM_AUTHOR.value}\n" +
                "Email: ${PROGRAM_AUTHOR_EMAIL.value}\n"
    );

    /**
     * 显示程序信息，包括开始信息、版本信息和结束信息。
     *
     * 通过调用此方法，可以在控制台输出程序的基本信息。
     */
    fun showProgramInfo() {
        println(PROGRAM_START.value)
        println(VERSION_INFO.value)
        println(PROGRAM_END.value)
    }

    /**
     * 打印当前枚举值到控制台。
     *
     * 通过调用此方法，打印出当前枚举项的值。
     */
    fun print() {
        print(value)
    }

    /**
     * 打印当前枚举值并换行，输出到控制台。
     *
     * 通过调用此方法，打印出当前枚举项的值，并在输出后换行。
     */
    fun println() {
        println(value)
    }
}
