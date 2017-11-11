package com.sadic.myfastfood.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sadic.myfastfood.dao.CuisinierRepository;
import com.sadic.myfastfood.entities.Cuisinier;

@RestController
public class CuisinierController {

	@Autowired
	CuisinierRepository cuisinierRepository;

	@RequestMapping(value="/cuisiniers", method=RequestMethod.GET)
	public List<Cuisinier> findAll() {
		return cuisinierRepository.findAll();
	}
	
	@RequestMapping(value="/cuisiniers/{id}", method=RequestMethod.GET)
	public Cuisinier findOne(@PathVariable Long id) {
		return cuisinierRepository.findOne(id);
	}
	
	@RequestMapping(value="/cuisiniers", method=RequestMethod.POST)
	public Cuisinier save(@RequestBody Cuisinier cuisinier) {
		return cuisinierRepository.save(cuisinier);
	}
	
	@RequestMapping(value="/cuisiniers/{id}", method=RequestMethod.PUT)
	public Cuisinier update(@PathVariable Long id, @RequestBody Cuisinier cuisinier) {
		cuisinier.setIdCuisinier(id);
		return cuisinierRepository.save(cuisinier);
	}
	
	@RequestMapping(value="/cuisiniers/{id}", method=RequestMethod.DELETE)
	public boolean delete(@PathVariable Long id) {
		try {
			cuisinierRepository.delete(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
