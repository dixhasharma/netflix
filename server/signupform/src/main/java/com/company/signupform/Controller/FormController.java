package com.company.signupform.Controller;

import com.company.signupform.Model.Form;
import com.company.signupform.Service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
public class FormController {
    @Autowired
    FormService formService;


    @RequestMapping(method = RequestMethod.GET,value = "/forms")
    public List<Form> getAllUsers()
    {
        return formService.getAllforms();

    }
//    @RequestMapping(method = RequestMethod.GET,value = "/users/{email}")
//    public Optional<Form> getFormInfo(@PathVariable String email)
//    {
//        return formService.getFormInfo(email);



    @RequestMapping("/forms/{email}")
    public Optional<Form> getFormInfo(@PathVariable String email) {
        return formService.getFormInfo(email) ;
    }

    @RequestMapping(method = RequestMethod.POST , value = "/forms")
    public Form addForm(@RequestBody Form form) {
        return formService.addForm(form);
    }
    @RequestMapping(method = RequestMethod.DELETE , value = "/forms/{email}")
    public Optional<Form> deleteform(@PathVariable String rno) {

        return formService.deleteStudent(rno);
    }
}
