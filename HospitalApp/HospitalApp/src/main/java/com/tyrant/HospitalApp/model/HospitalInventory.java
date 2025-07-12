package com.tyrant.HospitalApp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HospitalInventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // primary key

    private String srNo;
    private String location;

    @Column(name = "hospital_name")
    private String hospitalName;

    private String state;
    private String district;

    private int availableBeds;
    private int oxygenCylinders;
    private int bloodBags;
    private Double latitude;
    private Double longitude;

}
