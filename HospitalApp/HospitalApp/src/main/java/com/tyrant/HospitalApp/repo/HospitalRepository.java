package com.tyrant.HospitalApp.repo;

import com.tyrant.HospitalApp.model.HospitalInventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HospitalRepository extends JpaRepository<HospitalInventory, Long> {
    List<HospitalInventory> findByStateAndDistrict(String state, String district);
}
