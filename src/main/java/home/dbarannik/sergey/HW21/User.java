package home.dbarannik.sergey.HW21;

import home.dbarannik.sergey.HW20.Address;
import home.dbarannik.sergey.HW20.Company;

public class User {
    private Integer id;
    private String name;
    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "id = " + id + " name = " + name + " age = " + age + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || obj.getClass() != this.getClass())
            return false;

        User user = (User) obj;
        return (user.name.equals(this.name));
    }
}