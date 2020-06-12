package com.rk.springbootdemo.Model;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModelController {
	
	@Autowired
	private ModelService modelservice;
	
	
	@RequestMapping("/Models")
	public List<Models> getAllModels(){
		return modelservice.getAllModels();
	}
	
	
	@RequestMapping("/Models/{id}")
	public Models getModel(@PathVariable String id) {
		return modelservice.getModel(id);
	}
	@RequestMapping(method = RequestMethod.POST, value = "/Models")
	public void addModel(@RequestBody Models model) {
		modelservice.addModel(model);
	}
	@RequestMapping(method = RequestMethod.DELETE, value = "/Models/{id}")
	public void delModel(@PathVariable String id) {
		modelservice.delModel(id);
	}
	@RequestMapping(method= RequestMethod.PUT, value= "/Models/{id}")
	public void updatemodel(@RequestBody Models model ,@PathVariable String id) {
		modelservice.updateModel(model, id);	}
	

}
