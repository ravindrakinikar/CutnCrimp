package com.cnc.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.cnc.domain.Shift;
import com.cnc.repository.ShiftRepository;

@Service
public class ShiftService {

	@Inject
	private ShiftRepository shiftRepository; 
	
	public List<Shift> getAllShifts()
	{
		return shiftRepository.findAll();				
	}
}
