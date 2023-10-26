package com.medicines.project;

import org.springframework.data.repository.CrudRepository;
public interface MedicineDAORepository extends CrudRepository<Medicine, String> {

}
