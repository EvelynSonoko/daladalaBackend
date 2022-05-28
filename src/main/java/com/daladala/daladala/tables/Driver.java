package com.daladala.daladala.tables;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;


@Entity
@Data
@Table (name= "driver")
public class Driver {
    @Id
   private String id;
   private String driver_name;
   private String address;
   private int age;
   private String lis_no;
   private String tel_no;
   private Date dob;
   private String gender;
   private String lis_type;
   private Date ex_date;
   private String owner_id;
   @OneToOne
   @JoinColumn(name = "driver_id")
   private Daladala daladalaList;
}
