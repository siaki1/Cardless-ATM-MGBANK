package hbcu.stay.ready.domain;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import javax.validation.constraints.NotNull;


public class Person {
    private SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");

    private String id;

    @NotNull
    private String email;

    public SimpleDateFormat getDate() {
        return date;
    }

    public void setDate(SimpleDateFormat date) {
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    @NotNull
    private String name;
    @NotNull
    private String password;
    private Date birthday;
    private Date created;
    private Date modified;

    public Person(){
        this.id = UUID.randomUUID().toString().replaceAll("-", "");
        this.created = new Date();
        this.modified = new Date();
    }

    public Person(String email, String name, String password, String birthday) {
        this();
        this.email = email;
        this.name = name;
        this.password = password;

        try {
            this.birthday = date.parse(birthday);
        } catch (ParseException e) {
            this.birthday = null;
        }
    }

    public Person(String email, String name, String password, Date birthday) {
        this();
        this.email = email;
        this.name = name;
        this.password = password;
        this.birthday = birthday;
    }



}
