package com.tat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tat.model.PersonalInfo;
@Repository
public interface PersonalInfoRepository extends JpaRepository<PersonalInfo, Integer> {

	
	
}
