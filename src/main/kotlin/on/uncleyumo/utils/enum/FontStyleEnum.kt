package on.uncleyumo.utils.enum

/**
 * @author uncle_yumo
 * @fileName FontStyleEnum
 * @createDate 2024/11/21 November
 * @school 无锡学院
 * @studentID 22344131
 * @description 字体样式枚举
 */

enum class FontStyleEnum(val style: String) {
    /*
     * 0：正常
     */
    NORMAL("0"),

    /*
     * 1：加粗
     */
    BOLD("1"),

    /*
    * 2：弱化 - 未广泛支持
    */
    FAINT("2"),

    /*
    * 3：斜体 - 未广泛支持
    */
    ITALIC("3"),

    /*
    * 4：下划线 - 未广泛支持
    */
    UNDERLINE("4"),

    /*
     * 5：缓慢闪烁 - 未广泛支持
     */
    SLOW_BLINK("5"),

    /*
     * 6：快速闪烁 - 未广泛支持
     */
    RAPID_BLINK("6"),

    /*
     * 7：反相 (前景色与背景色互换) - 未广泛支持
     */
    REVERSE_COLOR("7"),

    /*
     * 8：隐藏 - 未广泛支持
     */
    HIDDEN("8"),

    /*
     * 9： 删除线 - 未广泛支持
     */
    STRIKETHROUGH("9"),

    /*
     * 10：默认
     */
    DEFAULT("10");
}