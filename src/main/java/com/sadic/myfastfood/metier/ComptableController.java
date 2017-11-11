package com.sadic.myfastfood.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sadic.myfastfood.dao.ComptableRepository;
import com.sadic.myfastfood.entities.Comptable;

@RestController
public class ComptableController {

	@Autowired
	ComptableRepository comptableRepository;

	@RequestMapping(value="/comptables", method=RequestMethod.GET)
	public List<Comptable> findAll() {
		return comptableRepository.findAll();
	}
	
	@RequestMapping(value="/comptables/{id}", method=RequestMethod.GET)
	public Comptable findOne(@PathVariable Long id) {
		return comptableRepository.findOne(id);
	}
	
	@RequestMapping(value="/comptables", method=RequestMethod.POST)
	public Comptable save(@RequestBody Comptable comptable) {
		return comptableRepository.save(comptable);
	}
	
	@RequestMapping(value="/comptables/{id}", method=RequestMethod.PUT)
	public Comptable update(@PathVariable Long id, @RequestBody Comptable comptable) {
		comptable.setIdComptable(id);
		return comptableRepository.save(comptable);
	}
	
	@RequestMapping(value="/comptables/{id}", method=RequestMethod.DELETE)
	public boolean delete(@PathVariable Long id) {
		try {
			comptableRepository.delete(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
