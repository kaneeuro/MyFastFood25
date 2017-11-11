package com.sadic.myfastfood.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sadic.myfastfood.dao.ServeurRepository;
import com.sadic.myfastfood.entities.Serveur;

@RestController
public class ServeurController {

	@Autowired
	ServeurRepository serveurRepository;

	@RequestMapping(value="/serveurs", method=RequestMethod.GET)
	public List<Serveur> findAll() {
		return serveurRepository.findAll();
	}
	
	@RequestMapping(value="/serveurs/{id}", method=RequestMethod.GET)
	public Serveur findOne(@PathVariable Long id) {
		return serveurRepository.findOne(id);
	}
	
	@RequestMapping(value="/serveurs", method=RequestMethod.POST)
	public Serveur save(@RequestBody Serveur serveur) {
		return serveurRepository.save(serveur);
	}
	
	@RequestMapping(value="/serveurs/{id}", method=RequestMethod.PUT)
	public Serveur update(@PathVariable Long id, @RequestBody Serveur serveur) {
		serveur.setIdServeur(id);
		return serveurRepository.save(serveur);
	}
	
	@RequestMapping(value="/serveurs/{id}", method=RequestMethod.DELETE)
	public boolean delete(@PathVariable Long id) {
		try {
			serveurRepository.delete(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
