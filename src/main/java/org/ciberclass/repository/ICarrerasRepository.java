package org.ciberclass.repository;

import org.ciberclass.model.Carreras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICarrerasRepository extends JpaRepository<Carreras, Integer> {

	//Crud
	
}
