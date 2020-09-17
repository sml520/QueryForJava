package com.zhangyuanliang.query;

import java.util.Map;
import java.util.function.Predicate;

/**
 * @author 张元亮
 * @date 2020/9/17
 */
public class UserWhere implements Where {

    private Map<String, Object> param;


    @Override
    public Predicate<User> getPredicate() {

        Predicate<User> userPredicate = u -> {

            int id = -1;
            boolean isCondition = true;
            if (param == null || param.isEmpty()) {
                return isCondition;
            }
            Object idObj = param.get("id");
            if (idObj != null) {
                id = Integer.parseInt(idObj.toString());
                isCondition = u.getId() == id;
            }
            Object nameObj = param.get("name");
            if (nameObj != null) {
                String name = nameObj.toString();
                if (id > 0) {
                    isCondition = u.getId() == id && u.getName().equals(name);
                } else {
                    isCondition = u.getName().equals(name);
                }
            }
            return isCondition;
        };

        return userPredicate;
    }

    @Override
    public void setParam(Map param) {
        this.param = param;
    }


}
