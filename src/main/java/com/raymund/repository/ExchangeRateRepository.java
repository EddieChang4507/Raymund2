package com.raymund.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raymund.entity.ExchangeRate;

public interface ExchangeRateRepository extends JpaRepository<ExchangeRate, Long> {

}
