package com.prim.kit_library.log.formatter;

/**
 * @author prim
 * @version 1.0.0
 * @desc 线程日志格式化
 * @time 2020/6/2 - 11:31 PM
 * @contact https://jakeprim.cn
 * @name AKitDemo
 */
public class ThreadFormatter implements LogFormatter<Thread> {
    @Override
    public String format(Thread thread) {
        return "Thread:" + thread.getName();
    }
}
