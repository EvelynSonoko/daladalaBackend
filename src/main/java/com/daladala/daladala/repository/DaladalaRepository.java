package com.daladala.daladala.repository;

import com.daladala.daladala.tables.Daladala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DaladalaRepository extends JpaRepository<Daladala,String> {
    @Query(value = "SELECT * FROM `daladala` WHERE `owner_id` = ?1",nativeQuery = true)
    public Daladala getByOwnerId(String owner_id);
}
