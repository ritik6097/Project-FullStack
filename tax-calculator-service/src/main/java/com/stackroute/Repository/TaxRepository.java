package com.stackroute.Repository;

import com.stackroute.TaxModel.CalculatedTax;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxRepository extends JpaRepository<CalculatedTax, Long> {
}
