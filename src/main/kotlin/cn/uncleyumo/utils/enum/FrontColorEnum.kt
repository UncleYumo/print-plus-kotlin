package cn.uncleyumo.utils.enum

/**
 * 前景色枚举类
 *
 * 此枚举类定义了一组前景色及其对应的 ANSI 颜色码，用于在终端中以不同的颜色打印文本。
 *
 * @author uncle_yumo
 * @fileName FrontColorEnum
 * @createDate 2024/11/21
 * @school 无锡学院
 * @studentID 22344131
 */
enum class FrontColorEnum(val color: String) {

    /**
     * 黑色前景色，ANSI 颜色码为 30。
     */
    BLACK("30"),

    /**
     * 红色前景色，ANSI 颜色码为 31。
     */
    RED("31"),

    /**
     * 绿色前景色，ANSI 颜色码为 32。
     */
    GREEN("32"),

    /**
     * 黄色前景色，ANSI 颜色码为 33。
     */
    YELLOW("33"),

    /**
     * 蓝色前景色，ANSI 颜色码为 34。
     */
    BLUE("34"),

    /**
     * 紫色前景色，ANSI 颜色码为 35。
     */
    PURPLE("35"),

    /**
     * 青色前景色，ANSI 颜色码为 36。
     */
    CYAN("36"),

    /**
     * 白色前景色，ANSI 颜色码为 37。
     */
    WHITE("37"),

    /**
     * 默认前景色，ANSI 颜色码为 39。
     */
    DEFAULT("39");
}
