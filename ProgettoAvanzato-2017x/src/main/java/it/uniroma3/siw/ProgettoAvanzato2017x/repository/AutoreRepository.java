package it.uniroma3.siw.ProgettoAvanzato2017x.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import it.uniroma3.siw.ProgettoAvanzato2017x.model.Autore;

public interface AutoreRepository extends CrudRepository<Autore, Long>{
	
	  List<Autore> findAll();
	  List<Autore> findByCognome(String cognome);
	  List<Autore> findByNazionalita(String nazionalita);
	  List<Autore> findByDataNascita(Date dataNascita);
	  List<Autore> findByDataMorte(Date dataMorte);
}
