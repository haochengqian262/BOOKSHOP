package cn.edu.bit.bookstore.bookstore_android.common;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPool {
    public static ThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(6);
    public static void clearExecut(){
        executor.getQueue().clear();
    }
}
