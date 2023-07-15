package com.form.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.form.entity.Form;
import com.form.repository.FormRepository;
import com.form.service.FormService;

@Service
public class FormServiceImpl implements FormService {
	
	@Autowired
	FormRepository formRepo;

	@Override
	public void saveReg(Form form) {
		 
	formRepo.save(form);	
		
	}

	@Override
	public List<Form> readAllRecord() {
		
		List<Form> findAll = formRepo.findAll();
		
		return findAll;
	}

	@Override
	public void deleteARecord(long id) {
		
		formRepo.deleteById(id);
		
	}

}
