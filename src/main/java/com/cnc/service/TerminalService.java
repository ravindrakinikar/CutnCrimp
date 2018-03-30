package com.cnc.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.cnc.domain.Terminal;
import com.cnc.repository.TerminalRepository;

@Service
public class TerminalService {

	@Inject
	private TerminalRepository terminalRepository;
	
	public List<Terminal> getAllTerminals()
	{
		return terminalRepository.findAll();
	}
}
