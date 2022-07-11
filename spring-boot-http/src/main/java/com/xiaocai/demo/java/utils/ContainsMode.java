package com.xiaocai.demo.java.utils;
/**
 * 搜索策略枚举
 */
public enum ContainsMode {

    FileNameContains("文件名中包含关键字"),

    FileNameEndWith("文件名以关键字结尾"),

    FileContentContains("文件内容中包含关键字"),

    FileContentRegExpStrategy("文件内容中正则匹配关键字");

    ContainsMode(String desc) {
    }
}
