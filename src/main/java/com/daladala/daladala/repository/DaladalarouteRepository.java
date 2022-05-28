package com.daladala.daladala.repository;

import com.daladala.daladala.tables.Daladalaroute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DaladalarouteRepository extends JpaRepository<Daladalaroute,Integer> {
//  @Query (value="SELECT `id`, `expire`, `receipt_no`, `route_id`, `start`, `status`, `daladala_id` FROM `daladalaroute` WHERE `daladala_id`= ?1",nativeQuery = true)
//    public Daladalaroute getByDaladalaId(String daladala_id);

}
