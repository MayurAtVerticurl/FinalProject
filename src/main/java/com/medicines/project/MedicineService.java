package com.medicines.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicineService {
	@Autowired
	private MedicineDAORepository MedicineDAORepository;
	
	public List<Medicine> getMedicines(){
		List<Medicine> medicineList = new ArrayList<Medicine>();
		MedicineDAORepository.findAll().forEach(medicineList::add);
		return medicineList;

	}
	
	public Optional<Medicine> getMedicine(String id) {
		return MedicineDAORepository.findById(id);
	}
	
	public void updateMedicine(String name, Medicine Medicine) {
		MedicineDAORepository.save(Medicine);
	}

	public void deleteMedicine(String id) {
		MedicineDAORepository.deleteById(id);
	}

	
	public void addMedicine(Medicine Medicine) {
		MedicineDAORepository.save(Medicine);
	}

}
