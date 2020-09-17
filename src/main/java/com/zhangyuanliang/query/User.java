package com.zhangyuanliang.query;

/**
 * User实体类
 *
 * @author 张元亮
 * @date 2020/9/16
 */
public class User {

    private Integer id;

    private String name;

    private String phone;

    private String city;

    private Integer age;

    public User() {
    }

    public User(Integer id, String name, String phone, String city, Integer age) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.city = city;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                '}';
    }
}
