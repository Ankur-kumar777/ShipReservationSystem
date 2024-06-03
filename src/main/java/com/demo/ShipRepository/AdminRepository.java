package com.demo.ShipRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin,Long> {
     Admin getAdminByAdminId(String adminId);
}
