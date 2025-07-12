package com.tyrant.HospitalApp.service;

import com.tyrant.HospitalApp.model.HospitalInventory;
import com.tyrant.HospitalApp.repo.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalService {

    @Autowired
    private HospitalRepository hospitalRepository;

    public List<HospitalInventory> getByStateAndDistrict(String state, String district) {
        return hospitalRepository.findByStateAndDistrict(state, district);
    }

    public HospitalInventory getHospitalById(Long id) {
        return hospitalRepository.findById(id).orElse(null);
    }
}
