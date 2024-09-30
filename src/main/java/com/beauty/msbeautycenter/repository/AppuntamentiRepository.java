package com.beauty.msbeautycenter.repository;

import com.beauty.msbeautycenter.model.Appuntamenti;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppuntamentiRepository extends JpaRepository<Appuntamenti, Integer> {
}