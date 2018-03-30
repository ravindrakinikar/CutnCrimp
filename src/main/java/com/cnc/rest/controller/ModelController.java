package com.cnc.rest.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cnc.domain.Model;
import com.cnc.domain.View;
import com.cnc.service.ModelService;
import com.fasterxml.jackson.annotation.JsonView;

@RestController
@RequestMapping("model")
public class ModelController {

	@Inject
	private ModelService modelService;

	@RequestMapping(method = RequestMethod.POST, produces = "application/json")
	@JsonView(View.Model.class)
	@ResponseBody
	public Model addModel(@RequestBody Model model) {
		return modelService.saveModel(model);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
	@JsonView(View.Model.class)
	@ResponseBody
	public Model getModelById(@PathVariable("id") int id) {
		return modelService.getModelById(id);
	}

	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	@JsonView(View.Model.class)
	@ResponseBody
	public List<Model> getAllModels() {
		return modelService.getAllModels();
	}

}
