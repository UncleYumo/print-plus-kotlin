# Print-Plus-Kotlin

## 版本信息

- **项目名称**: print-plus-kotlin
- **版本**: 1.1.0
- **作者**: uncle_yumo
- **邮箱**: uncleyumo@163.com
- **开源协议**: Apache License 2.0

## 项目简介

`Print-Plus-Kotlin` 是一个基于 Kotlin 的彩色打印工具库，旨在为开发者提供便捷的日志记录和文本输出功能。该工具库支持多种字体颜色、背景颜色和字体样式，并且可以通过简单的 API 调用来实现复杂的样式组合。

## 使用说明

### 添加依赖(暂时不行，项目太LOW中央仓库可能不收🥲)

首先，你需要将 `print-plus-kotlin` 添加到你的项目依赖中。如果你使用的是 Maven，可以在 `pom.xml` 中添加以下依赖：

```xml
<dependency>
    <groupId>on.uncleyumo.utils</groupId>
    <artifactId>print-plus-kotlin</artifactId>
    <version>1.1.0</version>
</dependency>
```

### 基本用法

#### 日志打印

`LogPrinter` 类提供了不同级别的日志打印方法，包括 `info`, `debug`, `warn`, 和 `error`。这些方法会自动添加时间戳和相应的颜色样式。

```kotlin
import on.uncleyumo.utils.LogPrinter

fun main() {
    LogPrinter.info("This is an info message.")
    LogPrinter.debug("This is a debug message.")
    LogPrinter.warn("This is a warning message.")
    LogPrinter.error("This is an error message.")
}
```

#### 自定义样式打印

`ColorPrinter` 类提供了多种颜色和背景颜色的打印方法，可以用于自定义文本的显示效果。

```kotlin
import on.uncleyumo.utils.ColorPrinter

fun main() {
    ColorPrinter.printlnFontRed("This text is red.")
    ColorPrinter.printlnBackgroundGreen("This text has a green background.")
    ColorPrinter.printlnRedBlack("This text is red with a black background.")
}
```

### 高级用法

#### 使用 `MetaPrinter` 进行自定义样式组合

`MetaPrinter` 是一个单例类，允许你通过链式调用的方法来自定义字体颜色、背景颜色和字体样式。以下是一个示例：

```kotlin
import on.uncleyumo.utils.pojo.MetaPrinter
import on.uncleyumo.utils.enum.*

fun main() {
    MetaPrinter
        .addFontColor(FrontColorEnum.YELLOW)
        .addBackgroundColor(BackGroundColorEnum.BLUE)
        .addFontStyle(FontStyleEnum.BOLD)
        .println("This text is yellow with a blue background and bold style.")
}
```

### 枚举类

`print-plus-kotlin` 提供了多个枚举类来简化样式设置：

- **`FrontColorEnum`**: 定义了字体颜色。
- **`BackGroundColorEnum`**: 定义了背景颜色。
- **`FontStyleEnum`**: 定义了字体样式。

```kotlin
enum class FrontColorEnum(val code: String) {
    BLACK("30"),
    RED("31"),
    GREEN("32"),
    YELLOW("33"),
    BLUE("34"),
    PURPLE("35"),
    CYAN("36"),
    WHITE("37"),
    DEFAULT("39");
}

enum class BackGroundColorEnum(val code: String) {
    BLACK("40"),
    RED("41"),
    GREEN("42"),
    YELLOW("43"),
    BLUE("44"),
    PURPLE("45"),
    CYAN("46"),
    WHITE("47"),
    DEFAULT("49");
}

enum class FontStyleEnum(val code: String) {
    NORMAL("0"),
    BOLD("1"),
    FAINT("2"),
    ITALIC("3"),
    UNDERLINE("4"),
    SLOW_BLINK("5"),
    RAPID_BLINK("6"),
    REVERSE_COLOR("7"),
    HIDDEN("8"),
    STRIKETHROUGH("9"),
    DEFAULT("10");
}
```

### 项目结构

```
print-plus-kotlin/
├── src/
│   ├── main/
│   │   ├── kotlin/
│   │   │   └── on.uncleyumo.utils/
│   │   │       ├── LogPrinter.kt
│   │   │       ├── ColorPrinter.kt
│   │   │       └── pojo/
│   │   │           └── MetaPrinter.kt
│   │   └── resources/
│   └── test/
│       └── kotlin/
│           └── on.uncleyumo.utils/
│               └── LogPrinterTest.kt
├── pom.xml
└── README.md
```

### 实现细节

- **`LogPrinter`**: 提供了不同级别的日志打印方法，内部使用 `MetaPrinter` 来处理颜色和样式。
- **`ColorPrinter`**: 提供了多种颜色和背景颜色的打印方法，方便用户快速使用预定义的样式。
- **`MetaPrinter`**: 单例类，通过链式调用的方法来自定义字体颜色、背景颜色和字体样式。
- **`FrontColorEnum`**: 定义了字体颜色的枚举类。
- **`BackGroundColorEnum`**: 定义了背景颜色的枚举类。
- **`FontStyleEnum`**: 定义了字体样式的枚举类。

### 注意事项

- **终端支持**: 该工具库依赖于终端对 ANSI 转义序列的支持。大多数现代终端（如 Windows Terminal, iTerm2, GNOME Terminal）都支持这些序列，但在某些旧的或非标准的终端中可能无法正常显示。
- **性能考虑**: 大量使用彩色打印可能会对性能产生一定影响，特别是在高频率的日志记录场景中。建议在生产环境中谨慎使用。

### 示例代码

以下是一个完整的示例，展示了如何使用 `print-plus-kotlin` 进行日志记录和自定义样式打印：

```kotlin
import on.uncleyumo.utils.LogPrinter
import on.uncleyumo.utils.ColorPrinter
import on.uncleyumo.utils.pojo.MetaPrinter
import on.uncleyumo.utils.enum.*

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
```

#### 问题反馈

如果在使用过程中遇到任何问题或有改进建议，欢迎提交 Issue 或 Pull Request
到 [GitHub 仓库](https://github.com/UncleYumo/print-plus-kotlin)。

### 联系作者

- **作者**: uncle_yumo
- **邮箱**: uncleyumo@163.com

### 许可证

`print-plus-kotlin` 采用 Apache License 2.0 许可证，详情请参见 [LICENSE](LICENSE) 文件。

---

希望这份 README.md 文档能够帮助你更好地理解和使用 `print-plus-kotlin`。如果有任何疑问或建议，欢迎随时联系作者。感谢你的支持！
