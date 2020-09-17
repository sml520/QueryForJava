package com.zhangyuanliang.query;


import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 *
 * @author 张元亮
 * @date 2020/9/17
 */
public class UserGroupBy implements GroupBy {

    @Override
    public Collector getCollector() {
        return Collectors.groupingBy(User::getCity, Collectors.groupingBy(User::getAge));
    }

}
