package com.dtchin2.npr.controller;

import com.dtchin2.npr.entity.Patient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PatientController {

    // go to patients page
    @GetMapping("/viewPatient")
    public String viewPatient(){
        return "components/viewPatient";
    }

    // go to add patient page
    @GetMapping("/addPatient")
    public String addPatient(){
        return "components/addPatient";
    }

}
