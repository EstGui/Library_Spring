package com.personalStudies.Library_Manager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.personalStudies.Library_Manager.entities.Client;
import com.personalStudies.Library_Manager.services.ClientService;

import jakarta.validation.Valid;


@Controller
public class ClientController {
    
    // @GetMapping ("/inicio")
    // public ModelAndView index() {
    //     ModelAndView mv = new ModelAndView("index");

    //     return mv;
    // }

    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping ("/inicio")
    public String index() {

        return "index";
    }

    @GetMapping ("/login")
    public String entering() {

        return "login";
    }

    @GetMapping ("/register")
    public String register() {

        return "register";
    }

    @PostMapping("/client/register")
    public String registerClient(@Valid Client client, BindingResult result, RedirectAttributes redirect) {

        if (result.hasErrors()) {
            redirect.addFlashAttribute("message", "Verifique os campos obrigatórios");            
            return "redirect:/register";
        }

        clientService.registerClient(client);

        return "redirect:/login";
    }
}