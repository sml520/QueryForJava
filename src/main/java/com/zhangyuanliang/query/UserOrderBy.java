package com.zhangyuanliang.query;

import java.util.Comparator;

/**
 *
 * @author 张元亮
 * @date 2020/9/17
 */
public class UserOrderBy implements OrderBy {

    @Override
    public Comparator getComparing() {
        return Comparator.comparing(User::getId,Comparator.reverseOrder());
    }
}
