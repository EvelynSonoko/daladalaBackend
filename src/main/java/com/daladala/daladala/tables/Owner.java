package com.daladala.daladala.tables;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;


@Entity
@Data
@Table(name="owner")
public class Owner {
    @Id
    private String id;
    private String name;
    private String address;
    private int age;
    private String gender;
    private String dob;
    private String phone_no;
    private Date date_record;
    private String occupation;
    private String id_type;
    private String email;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id")
    private List<Daladala> daladalaList;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id")
    private List<Driver> driverList;
}
