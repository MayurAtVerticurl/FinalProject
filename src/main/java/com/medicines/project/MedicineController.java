package com.medicines.project;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController

public class MedicineController {
	
	@RequestMapping("hello")
	public String hello() {
		return "Hello World!";
	}
	
	@Autowired
	private MedicineService MedicineService;

	@RequestMapping("/medicines")
	public List<Medicine> getMedicines() {
		return MedicineService.getMedicines();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/medicines")
	public void addmedicine(@RequestBody Medicine medicine) {
		MedicineService.addMedicine(medicine);
	}
	
	@RequestMapping("/medicines/{id}")
	public  Optional<Medicine> getmedicine(@PathVariable String id){
		System.out.println("Inside getmedicine");
		return MedicineService.getMedicine(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/medicines/{id}")
	public void updatemedicine(@RequestBody Medicine medicine, @PathVariable String id) {
		System.out.println("inside updatemedicine");
		MedicineService.updateMedicine(id, medicine);
	}


	@RequestMapping(method=RequestMethod.DELETE, value="/medicines/{id}")
	public void deletemedicine(@PathVariable String id){
		System.out.println("Inside deletemedicine");
		MedicineService.deleteMedicine(id);
	}

}
