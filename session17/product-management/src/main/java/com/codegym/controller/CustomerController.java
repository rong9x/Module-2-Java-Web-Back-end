package com.codegym.controller;

import com.codegym.model.Customer;
import com.codegym.service.CustomerService;
import com.codegym.service.ICustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CustomerController {
    private ICustomerService customerService = new CustomerService();

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("customers", customerService.findAll());
        return "index";
    }

    @GetMapping("/customer/create")
    public String create(Model model){
        model.addAttribute("customer", new Customer());
        return "create";
    }

    @PostMapping("/customer/save")
    public String save(Customer customer, RedirectAttributes redirectAttributes){
        customer.setId((int) (Math.random() * 96) + 5);
        customerService.save(customer);
        redirectAttributes.addFlashAttribute("success", "Saved customer successfully!");
        return "redirect:/";
    }

    @GetMapping("/customer/{id}/edit")
    public String edit(@PathVariable int id, Model model){
        model.addAttribute("customer", customerService.findById(id));
        return "edit";
    }

    @PostMapping("customer/update")
    public String update(Customer customer, RedirectAttributes redirect) {
        customerService.update(customer.getId(), customer);
        redirect.addFlashAttribute("success", "Updated customer successfully!");
        return "redirect:/";
    }

    @GetMapping("/customer/{id}/delete")
    public String deleteForm(@PathVariable int id, Model model) {
        model.addAttribute("customer", customerService.findById(id));
        return "delete";
    }

    @PostMapping("customer/delete")
    public String delete(Customer customer, RedirectAttributes redirect){
        customerService.remove(customer.getId());
        redirect.addFlashAttribute("success", "Deleted customer successfully!");
        return "redirect:/";
    }

    @GetMapping("customer/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("customer", customerService.findById(id));
        return "view";
    }
}
