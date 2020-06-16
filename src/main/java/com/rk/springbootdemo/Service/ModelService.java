package com.rk.springbootdemo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rk.springbootdemo.Model.Models;
import com.rk.springbootdemo.Repository.ModelRepository;

@Service
public class ModelService {
	
		@Autowired
		private ModelRepository modelRepository;		
		public List<Models> getAllModels(){
			List<Models> models = new ArrayList<>();
			modelRepository.findAll().forEach(models::add);
			return models;
		}
		public Models getModel(String id) {
			return modelRepository.findById(id).orElse(null);
			
		}
		public void addModel(Models model) {
			modelRepository.save(model);
			
		}
		public void  delModel(String id ) {
			
			modelRepository.deleteById(id);	
		}
		public void updateModel(Models model, String id) {
			modelRepository.save(model);
		}
}
