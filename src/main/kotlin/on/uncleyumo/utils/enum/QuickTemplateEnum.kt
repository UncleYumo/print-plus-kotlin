package on.uncleyumo.utils.enum

import on.uncleyumo.utils.pojo.MetaPrinter

/**
 * @author uncle_yumo
 * @fileName quickTemplate
 * @createDate 2024/11/21 November
 * @school 无锡学院
 * @studentID 22344131
 * @description QuickTemplateEnum
 */

enum class QuickTemplateEnum(val value: String) {
    PROGRAM_VERSION("1.1.0"),
    PROGRAM_AUTHOR("uncle_yumo"),
    PROGRAM_AUTHOR_EMAIL("uncleyumo@163.com"),
    PROGRAM_NAME("print-plus-kotlin"),
    PROGRAM_START("-------------------------- program start --------------------------\n"),
    PROGRAM_END("--------------------------- program end ---------------------------"),
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

    fun showProgramInfo() {
        println(PROGRAM_START.value)
        println(VERSION_INFO.value)
        println(PROGRAM_END.value)
    }

    fun print() {
        print(value)
    }

    fun println() {
        println(value)
    }
}