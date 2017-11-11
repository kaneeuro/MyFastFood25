package com.sadic.myfastfood.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sadic.myfastfood.dao.FactureRepository;
import com.sadic.myfastfood.entities.Facture;

@RestController
public class FactureController {

	@Autowired
	FactureRepository factureRepository;

	@RequestMapping(value="/factures", method=RequestMethod.GET)
	public List<Facture> findAll() {
		return factureRepository.findAll();
	}
	
	@RequestMapping(value="/factures/{id}", method=RequestMethod.GET)
	public Facture findOne(@PathVariable Long id) {
		return factureRepository.findOne(id);
	}
	
	@RequestMapping(value="/factures", method=RequestMethod.POST)
	public Facture save(@RequestBody Facture facture) {
		return factureRepository.save(facture);
	}
	
	@RequestMapping(value="/factures/{id}", method=RequestMethod.PUT)
	public Facture update(@PathVariable Long id, @RequestBody Facture facture) {
		facture.setIdFacture(id);
		return factureRepository.save(facture);
	}
	
	@RequestMapping(value="/factures/{id}", method=RequestMethod.DELETE)
	public boolean delete(@PathVariable Long id) {
		try {
			factureRepository.delete(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
