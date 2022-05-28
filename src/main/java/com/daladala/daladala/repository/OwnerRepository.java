package com.daladala.daladala.repository;

import com.daladala.daladala.tables.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OwnerRepository extends JpaRepository<Owner,String>{
    @Query(value = "SELECT `id`, `address`, `age`, `date_record`, `dob`, `gender`, `id_type`, `name`, `occupation`, `phone_no`, `email` FROM `owner` WHERE email=?1",nativeQuery = true)
    public Owner getownerById(String email);
}
