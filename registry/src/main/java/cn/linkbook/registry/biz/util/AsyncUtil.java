package cn.linkbook.registry.biz.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author 王琦 <1124602935@qq.com>
 * @DATE 2018/10/28 3:28.
 * @Description 异步调用工具类
 */
public class AsyncUtil {

    private static Logger LOGGER = LoggerFactory.getLogger(AsyncUtil.class);
    private static Integer corePoolSize = Runtime.getRuntime().availableProcessors() * 20;
    private static ExecutorService executor = Executors.newFixedThreadPool(corePoolSize);

    public static void execute(Runnable command){
        LOGGER.info("execute command : {}", command);
        executor.execute(command);
    }

    public static Future submit(Runnable command){
        LOGGER.info("submit command : {}", command);
        return executor.submit(command);
    }

    public static Future submit(Callable task){
        LOGGER.info("submit task : {}", task);
        return executor.submit(task);
    }

    public static <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) throws InterruptedException {
        try {
            return executor.invokeAll(tasks);
        } catch (InterruptedException e) {
            throw e;
        }
    }

//    public static void shutDown(){
//        executor.shutdown();
//    }

}
