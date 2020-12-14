package com.cristobal.escalab.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristobal.escalab.models.entity.Day;

public interface IDayRepository extends JpaRepository<Day, Integer> {

}
