package com.cnc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cnc.domain.Shift;

public interface ShiftRepository extends JpaRepository<Shift, Integer> {

}
