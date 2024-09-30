package com.beauty.msbeautycenter.repository;

import com.beauty.msbeautycenter.model.Clienti;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClientiRepository extends JpaRepository<Clienti, Integer> {
    Optional<Clienti> findClientiByIdCliente(Integer id);

    List<Clienti> findClientiByNomeIgnoreCaseAndCognomeIgnoreCase(String nome, String cognome);

   List<Clienti> findAll();

}