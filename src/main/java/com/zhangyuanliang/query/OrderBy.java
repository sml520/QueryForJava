package com.zhangyuanliang.query;


import java.util.Comparator;

/**
 * @author 张元亮
 * @date 2020/9/16
 */
public interface OrderBy<T> {

    Comparator<T> getComparing();

}
