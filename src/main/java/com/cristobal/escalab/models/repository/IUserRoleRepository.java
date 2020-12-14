package com.cristobal.escalab.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristobal.escalab.models.entity.PKUserRole;
import com.cristobal.escalab.models.entity.UserRole;

public interface IUserRoleRepository extends JpaRepository<UserRole, PKUserRole> {

}
