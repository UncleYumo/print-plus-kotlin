package cn.uncleyumo.utils.enum

/**
 * 枚举类代表后台颜色选项。
 *
 * 此枚举类列出了各种颜色的背景代码，供选择和使用。每个颜色对应一个字符串值，
 * 可以用于终端输出或其他支持 ANSI 色彩代码的地方。
 *
 * @author uncle_yumo
 * @fileName BackGroundColorEnum
 * @createDate 2024/11/21 November
 * @school 无锡学院
 * @studentID 22344131
 * @description 背景颜色枚举
 */
enum class BackGroundColorEnum(val color: String) {

    /**
     * 黑色背景
     *
     * 使用此选项可设置输出背景为黑色。
     */
    BLACK("40"),

    /**
     * 红色背景
     *
     * 使用此选项可设置输出背景为红色。
     */
    RED("41"),

    /**
     * 绿色背景
     *
     * 使用此选项可设置输出背景为绿色。
     */
    GREEN("42"),

    /**
     * 黄色背景
     *
     * 使用此选项可设置输出背景为黄色。
     */
    YELLOW("43"),

    /**
     * 蓝色背景
     *
     * 使用此选项可设置输出背景为蓝色。
     */
    BLUE("44"),

    /**
     * 紫色背景
     *
     * 使用此选项可设置输出背景为紫色。
     */
    PURPLE("45"),

    /**
     * 青色背景
     *
     * 使用此选项可设置输出背景为青色。
     */
    CYAN("46"),

    /**
     * 白色背景
     *
     * 使用此选项可设置输出背景为白色。
     */
    WHITE("47"),

    /**
     * 默认背景
     *
     * 此选项可设置输出背景为默认颜色。
     */
    DEFAULT("49");
}
