package com.rk.springbootdemo.Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModelService {
	
		@Autowired
		private ModelRepository modelRepository;	
	
		private List<Models> models = new ArrayList<>( Arrays.asList(
						new Models("Model S" , "electric", "v7" , "$3000"),
						new Models("Model T" , "electric", "v5" , "$2000"),
						new Models("Model X" , "Nitrogen", "v3" , "$4040")
						));
		public List<Models> getAllModels(){
			//return models;
			List<Models> models = new ArrayList<>();
			modelRepository.findAll().forEach(models::add);
			return models;
		}
		public Models getModel(String id) {
			//return models.stream().filter(m -> m.getName().equals(id)).findFirst().get();
			return modelRepository.findById(id).orElse(null);
			
		}
		public void addModel(Models model) {
			//models.add(model);
			modelRepository.save(model);
			
		}
		public void  delModel(String id ) {
			//models.removeIf(m -> m.getName().equals(id));
			modelRepository.deleteById(id);
			
		}
		public void updateModel(Models model, String id) {
			/*for(int i=0; i<models.size() ; i++) {
				Models m = models.get(i);
				if(m.getName().equals(id)) {
					models.set(i, model);
				}
				
			}*/
			
			modelRepository.save(model);
		}
}
