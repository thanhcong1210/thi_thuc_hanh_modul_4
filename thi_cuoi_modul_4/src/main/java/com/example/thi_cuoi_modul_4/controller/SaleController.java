package com.example.thi_cuoi_modul_4.controller;

import com.example.thi_cuoi_modul_4.model.Sale;
import com.example.thi_cuoi_modul_4.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/sales")
public class SaleController {

    @Autowired
    private SaleService saleService;

    @GetMapping
    public String sales(Model model) {
        saleService.getAllSales();
        model.addAttribute("sales", saleService.getAllSales());
        return "list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("sales", new Sale());
        return "create";
    }

    @PostMapping("/create")
    public String save(@ModelAttribute("sales") Sale sale) {
        System.out.println(sale);
        saleService.save(sale);
        return "redirect:/sales";
    }

    @PostMapping("/delete/{id}")
    public String deleteDiscount(@PathVariable Long id) {
        saleService.deleteById(id);
        return "redirect:/sales";
    }

//    @GetMapping("/search")
//    public String search(@RequestParam String name, Model model) {
//        model.addAttribute("sales", saleService.getAllSales());
//
//    }

}
