package com.daladala.daladala.tables;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "route")
public class Route {
    @Id
    private int id;
    private String route_name;
    private String route_type;
    private int route_fees;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name="route_id",referencedColumnName = "id")
    private List<Daladalaroute> daladalarouteList;
}
