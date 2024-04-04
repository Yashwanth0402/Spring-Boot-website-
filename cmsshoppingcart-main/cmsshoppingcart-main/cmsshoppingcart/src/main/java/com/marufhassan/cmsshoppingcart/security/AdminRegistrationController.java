package com.marufhassan.cmsshoppingcart.security;

import javax.validation.Valid;

import com.marufhassan.cmsshoppingcart.models.AdminRepository;
import com.marufhassan.cmsshoppingcart.models.data.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/adminregister")
public class AdminRegistrationController {
    @Autowired
    private AdminRepository adminRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping
    public String register(Admin admin) {
        return "adminregister";
    }

    @PostMapping
    public String register(@Valid @ModelAttribute("admin")Admin admin, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "adminregister";
        }
        admin.setPassword(passwordEncoder.encode(admin.getPassword()));
        adminRepo.save(admin);

        return "redirect:/login";
    }
}
