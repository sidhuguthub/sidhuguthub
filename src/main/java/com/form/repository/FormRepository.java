package com.form.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.form.entity.Form;

public interface FormRepository extends JpaRepository<Form, Long> {

}
