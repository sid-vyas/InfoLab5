/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model.directories;

import java.util.ArrayList;
import model.dataModels.Hospital;

public class HospitalDirectory {
    ArrayList<Hospital> allHospitals;
    
    public HospitalDirectory() {
        this.allHospitals = new ArrayList<Hospital>();
        
        Hospital hospital1 = new Hospital();
        hospital1.setCommunity("Uptown");
        hospital1.setName("HealthPlus Hospital");
        hospital1.setNumberOfEmployees(25);
        this.allHospitals.add(hospital1);
        
        Hospital hospital2 = new Hospital();
        hospital2.setCommunity("Downtown");
        hospital2.setName("CareHealth Hospital");
        hospital2.setNumberOfEmployees(229);
        this.allHospitals.add(hospital2);
        
        Hospital hospital3 = new Hospital();
        hospital3.setCommunity("York");
        hospital3.setName("Plasma Hospital");
        hospital3.setNumberOfEmployees(56);
        this.allHospitals.add(hospital3);
    }
    
     public ArrayList<Hospital> getAllHospitals() {
        return allHospitals;
    }

    public void setAllHospitals(ArrayList<Hospital> allHospitals) {
        this.allHospitals = allHospitals;
    }
    
    public void addHospital(Hospital newHospital) {
        this.allHospitals.add(newHospital);
    }
    
    public void removeHospital(Hospital hospital) {
        this.allHospitals.remove(hospital);
    }
}
