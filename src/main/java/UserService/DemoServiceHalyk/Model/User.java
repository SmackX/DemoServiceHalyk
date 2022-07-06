package UserService.DemoServiceHalyk.Model;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.Date;


@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private Long per_num;
    @Column
    private String fullName;

    @Column
    private java.sql.Date birthDate;
    @Column
    private String role;

    public User(){}
    public User(long id, long per_num, String fullName, java.sql.Date birthDate, String role) {
        this.id = id;
        this.per_num = per_num;
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.role = role;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPer_num() {
        return per_num;
    }

    public void setPer_num(long per_num) {
        this.per_num = per_num;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public java.sql.Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(java.sql.Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


}
