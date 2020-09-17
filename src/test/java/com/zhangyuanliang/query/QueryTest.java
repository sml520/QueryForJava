package com.zhangyuanliang.query;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 张元亮 on 2020/9/17.
 */
public class QueryTest {

    @Test
    public void test(){
        User user1 = new User(1, "张三", "15211111111", "成都", 25);
        User user2 = new User(2, "李四", "18100000000", "成都", 24);
        User user3 = new User(3, "王五", "15300000000", "重庆", 24);
        List<Object> data = new ArrayList<>();
        data.add(user1);
        data.add(user2);
        data.add(user3);

        Where where = new UserWhere();
        Map<String, Object> param = new LinkedHashMap<>();
//        param.put("id", 1);
//        param.put("name", "张三");
        where.setParam(param);

        OrderBy orderBy = new UserOrderBy();

        GroupBy groupBy = new UserGroupBy();

        Limit limit = new Limit(10);
        List<Object> list = new Query().query(data, where, orderBy, groupBy, limit);

        System.out.println(list);
    }


}
