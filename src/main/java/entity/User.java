package entity;

import java.util.Date;

public class User {
    // for consistency with database table,
    // we use phone_number but not phoneNumber
    private Integer id;
    private String name;
    private String password;
    private String email;
    private Integer phone_number;
    private Date create_time;
    private Date update_time;

    // you should not give this class a constructor
    // with args, or it will misleading MyBatis.

    // If you want to set value for any fields,
    // you can use setter/getter methods.

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(Integer phone_number) {
        this.phone_number = phone_number;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }
}

