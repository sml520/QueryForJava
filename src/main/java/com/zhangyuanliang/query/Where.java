package com.zhangyuanliang.query;

import java.util.Map;
import java.util.function.Predicate;

/**
 * @author 张元亮
 * @date 2020/9/16
 */
public interface Where<T> {

    /**
     * 获取查询参数
     *
     * @param
     * @return
     */
    Predicate<T> getPredicate();


    void setParam(Map<String, Object> param);
}
