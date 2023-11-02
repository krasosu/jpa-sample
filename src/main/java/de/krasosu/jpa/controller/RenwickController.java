package de.krasosu.jpa.controller;

import de.krasosu.jpa.model.*;
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

        Evani evani1 = new Evani();
        evani1.setData("dolor sit amet");
        Evani evani2 = new Evani();
        evani2.setData("sadipscing elitr");
        Evani evani3 = new Evani();
        evani3.setData("eirmod tempor invidunt");

        Frelan frelan1 = new Frelan();
        frelan1.setData("14400");
        frelan1.setEvani(List.of(evani1,evani2));
        Frelan frelan2 = new Frelan();
        frelan2.setData("29900");
        frelan2.setEvani(List.of(evani3));

        Intira intira = new Intira();
        intira.setData("lorem ipsum intira 1");
        intira.setFrelans(List.of(frelan1, frelan2));
        intira.setEvanis(List.of(evani1, evani2, evani3));

        Disnov disnov = new Disnov();
        disnov.setData("Isiro arus aed");

        evani1.setDisnovs(List.of(disnov));
        evani2.setDisnovs(List.of(disnov));

        Renwick renwick = new Renwick();
        renwick.setData("lorem ipsum");
        renwick.setIntiras(List.of(intira));
        renwick.setDisnovs(List.of(disnov));

        return this.renwickService.saveRenwick(renwick);
    }
}
