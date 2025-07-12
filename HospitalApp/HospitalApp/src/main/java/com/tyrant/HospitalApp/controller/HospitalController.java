package com.tyrant.HospitalApp.controller;

import com.tyrant.HospitalApp.model.HospitalInventory;
import com.tyrant.HospitalApp.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/search")
    public String getHospitalsByLocation(@RequestParam String state,
                                         @RequestParam String district,
                                         Model model) {
        List<HospitalInventory> hospitals = hospitalService.getByStateAndDistrict(state, district);
        model.addAttribute("state", state);
        model.addAttribute("district", district);
        model.addAttribute("hospitals", hospitals);
        return "index";
    }

}
