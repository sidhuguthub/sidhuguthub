package com.form.service;

import java.util.List;

import com.form.entity.Form;

public interface FormService {
	
	public void saveReg(Form form);


    public List<Form> readAllRecord();


	public void deleteARecord(long id);

}
