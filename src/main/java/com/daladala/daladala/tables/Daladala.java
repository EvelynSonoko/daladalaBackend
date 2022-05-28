package com.daladala.daladala.tables;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name="daladala")
public class Daladala {
    @Id
    private String daladala_id;
    private String id_mark;
    private String model;
    private int no_pas;
    private String owner_id;
    private String insurance_no;
    private String lis_no;
    private String place;
    private String driver_id;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name="daladala_id",referencedColumnName = "daladala_id")
    private List<Daladalaroute> daladalarouteList;





}
