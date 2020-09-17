package com.zhangyuanliang.query;


import java.util.Map;
import java.util.stream.Collector;

/**
 * @author 张元亮
 * @date 2020/9/16
 */
public interface GroupBy<T, K, D> {

    Collector<User, ?, Map<K, D>> getCollector();
}
