package com.company.signupform.Service;

import com.company.signupform.Model.Form;
import com.company.signupform.Repository.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FormService {
    @Autowired
    private FormRepository formRepository;
    List<Form> students = new ArrayList<>();

    public List<Form> getAllforms() {
        List<Form> forms = new ArrayList<>();
        formRepository.findAll().forEach(form ->  forms.add(form));
        return forms;
    }


    public Optional<Form> getFormInfo(String email){
        return formRepository.findById(email);
    }


    public Form addForm(Form form)
    {
        formRepository.save(form);
        return form;
    }
  public Optional<Form> editForm(Form form , String email)
  {
      formRepository.deleteById(email);
      formRepository.save(form);
      return formRepository.findById(email);

  }
    public Optional<Form> deleteStudent(String email) {
        Optional<Form> form = formRepository.findById(email);
        formRepository.deleteById(email);
        return form;
    }

}
