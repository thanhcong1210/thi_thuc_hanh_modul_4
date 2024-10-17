package com.example.thi_cuoi_modul_4.service;

import com.example.thi_cuoi_modul_4.model.Sale;

import java.util.List;

public interface SaleService {
    List<Sale> getAllSales();

    void save(Sale sale);

    Object findById(Long id);

    void deleteById(Long id);
}
