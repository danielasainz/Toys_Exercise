package com.Sainz.demo;

/*
Create a main page with the following links:
- List. On the list page, you should have options for adding new devices.
- You should be able to see a list of devices once they are added
- You should also be able to see options to modify and delete each device once it is listed.

Change this to work with an H2 database.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


public class MainController {

    @Autowired
    ToyRepository toyList;

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("toys", toyList.findAll());
        return "list";
    }

    @RequestMapping("/addform")
    public String addToy(Model model) {
        model.addAttribute("theToy", new Toy());
        return "addform";
    }

    @RequestMapping("/addmethod")
    public String saveDevice(@ModelAttribute("theToy") Toy toy) {

        toyList.save(toy);
        return "redirect:/";
    }
}

