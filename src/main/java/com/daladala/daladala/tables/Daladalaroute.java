package com.daladala.daladala.tables;


import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Data
public class Daladalaroute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date start;
    private Date expire;
    private int receipt_no;
    private Boolean status;
    private int route_id;
    private String daladala_id;
}
