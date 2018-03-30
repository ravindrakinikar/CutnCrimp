package com.cnc.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.cnc.domain.Wire;
import com.cnc.repository.WireRepository;

@Service
public class WireService {
	@Inject
	private WireRepository wireRepository;
	
	public Wire saveWire(Wire wire)
	{
		return wireRepository.save(wire);
	}

	public Wire getWireById(int id)
	{
		return wireRepository.findOne(id);
	}
	
	public List<Wire> getAllWires()
	{
		return wireRepository.findAll();
	}
}

