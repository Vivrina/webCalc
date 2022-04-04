package ru.itis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.itis.services.CalculateService;

@Controller
@RequestMapping("/calculate")
public class CalculateController {
    private final CalculateService calculateService;

    @Autowired
    public CalculateController(CalculateService calculateService) {
        this.calculateService = calculateService;
    }

    @GetMapping(value = "/{valueOne}/{operator}/{valueTwo}")
    public String calculate(@PathVariable("valueOne") String valueOne, @PathVariable("valueTwo") String valueTwo,
                            @PathVariable("operator") String operator, Model model) {
        String op = operator.toLowerCase();
        switch (op) {
            case "plus":
                op = "+";
                break;
            case "minus":
                op = "-";
                break;
            case "divide":
                op = "/";
                break;
            case "multiply":
                op = "*";
                break;

        }
        String resultOfCalculation = calculateService.calculate(new String[]{valueOne, op, valueTwo});
        model.addAttribute("result", resultOfCalculation);
        return "resultPage";
    }

}

