package com.cristobal.escalab.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cristobal.escalab.models.entity.Enabled;

@Repository
public interface IEnabledRepository extends JpaRepository<Enabled, Integer> {

}
