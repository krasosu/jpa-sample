package de.krasosu.jpa.controller;

import de.krasosu.jpa.model.Evani;
import de.krasosu.jpa.model.Frelan;
import de.krasosu.jpa.model.Intira;
import de.krasosu.jpa.model.Renwick;
import de.krasosu.jpa.service.RenwickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class RenwickController {

    @Autowired
    RenwickService renwickService;

    @PostMapping("/renwick")
    @ResponseBody
    public Renwick createRenwick(@RequestBody Renwick renwick) {
        return this.renwickService.saveRenwick(renwick);
    }

    @PostMapping("/renwick/sample")
    @ResponseBody
    public Renwick createRenwickSample() {

        Frelan frelan1 = new Frelan();
        frelan1.setData("14400");
        Frelan frelan2 = new Frelan();
        frelan2.setData("29900");

        Evani evani1 = new Evani();
        evani1.setData("dolor sit amet");
        evani1.setFrelan(frelan1);
        Evani evani2 = new Evani();
        evani2.setData("sadipscing elitr");
        evani2.setFrelan(frelan1);
        Evani evani3 = new Evani();
        evani3.setData("eirmod tempor invidunt");
        evani3.setFrelan(frelan2);

        Intira intira = new Intira();
        intira.setData("lorem ipsum intira 1");
        intira.setFrelans(List.of(frelan1, frelan2));
        intira.setEvanis(List.of(evani1, evani2, evani3));

        Renwick renwick = new Renwick();
        renwick.setData("lorem ipsum");
        renwick.setIntiras(List.of(intira));

        return this.renwickService.saveRenwick(renwick);
    }
}
