package com.cnc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cnc.domain.Machine;

public interface MachineRepository extends JpaRepository<Machine, Integer> {

}
