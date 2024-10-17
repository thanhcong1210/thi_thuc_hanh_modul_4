package com.example.thi_cuoi_modul_4.service;

import com.example.thi_cuoi_modul_4.model.Sale;
import com.example.thi_cuoi_modul_4.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleServiceImpl implements SaleService {
    @Autowired
    private SaleRepository saleRepository;

    @Override
    public List<Sale> getAllSales() {
        return saleRepository.findAll();
    }

    @Override
    public void save(Sale sale) {
        saleRepository.save(sale);
    }

    @Override
    public Object findById(Long id) {
        return saleRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        saleRepository.deleteById(id);
    }
}
