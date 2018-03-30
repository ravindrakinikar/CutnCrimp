package com.cnc.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.cnc.domain.Model;
import com.cnc.repository.ModelRepository;

@Service
public class ModelService {

	@Inject
	private ModelRepository modelRepository;

	public Model saveModel(Model model) {
		return modelRepository.save(model);

	}

	public Model getModelById(int id) {

		return modelRepository.getOne(id);
	}

	public List<Model> getAllModels() {
		return modelRepository.findAll();
	}

}
