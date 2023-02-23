package com.example.homework18_spingstart.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

public class FirstController {
    @GetMapping("/path")
    public String helloWorld() {
        return "Приложение запущено";
    }

    @GetMapping("/info")
    public String getInfo(@RequestParam("name") String name,
                          @RequestParam("nameProject") String nameProject,
                          @RequestParam("localDate") LocalDate localDate,
                          @RequestParam("infoProject") String infoProject) {
        String result = "Name " + name + ", ";
        result += "BudgetApp " + nameProject + ", ";
        result += "Date " + localDate.toString() + ", ";
        result += "Info " + infoProject;
        return result;
    }

    @GetMapping("/info/test")
    public String getInfo2(@RequestParam(name = "name", defaultValue = "Vlad") String name,
                           @RequestParam(name = "nameProject", defaultValue = "BudgetApp") String nameProject,
                           @RequestParam(name = "localDate", defaultValue = "2023-02-23") LocalDate localDate,
                           @RequestParam(name = "infoProject", defaultValue = "SomeInfo") String infoProject) {
        String result = name + ", ";
        result += nameProject + ", ";
        result += "Date " + localDate.toString() + ", ";
        result += "Info " + infoProject;
        return result;
    }
}
