package com.ty.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ty.dto.Person;

@Controller
public class PersonController {
	@Autowired
	EntityManager manager;

	@RequestMapping("/loadperson")
	public ModelAndView loadPerson(ModelAndView view) {
		view.addObject("p", new Person());
		view.setViewName("register.jsp");
		return view;
	}

	@RequestMapping("/register")
	public void insertPerson(@ModelAttribute Person person) {
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.persist(person);
		transaction.commit();
	}
}
