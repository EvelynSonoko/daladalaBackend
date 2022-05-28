package dto;

import com.daladala.daladala.tables.Daladala;
import com.daladala.daladala.tables.Route;
import lombok.Data;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.sql.Date;

@Data
public class DaladalarouteDto {
    private Date start;
    private Date expire;
    private int receipt_no;
    private Boolean status;
    private int route_id;
    private String daladala_id;
}
