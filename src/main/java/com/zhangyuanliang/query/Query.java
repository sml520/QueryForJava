package com.zhangyuanliang.query;

import java.util.*;

/**
 * @author 张元亮
 * @date 2020/9/16
 */
public class Query {

    /**
     * 数据查询
     *
     * @param data
     * @param where
     * @param orderBy
     * @param groupBy
     * @param limit
     * @return
     */
    List<Object> query(List<Object> data, Where where, OrderBy orderBy, GroupBy groupBy, Limit limit) {
        if (data == null) {
            System.out.println("表数据为空");
            return null;
        }

        Map dataList = (Map) data.stream()
                .filter(where.getPredicate())
                .sorted(orderBy.getComparing())
                .limit(limit.getLimit())
                .collect(groupBy.getCollector());

        System.out.println(dataList);

        return null;
    }


}
