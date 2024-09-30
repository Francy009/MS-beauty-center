package com.beauty.msbeautycenter.repository;

import com.beauty.msbeautycenter.model.Servizi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiziRepository extends JpaRepository<Servizi, Integer> {
}