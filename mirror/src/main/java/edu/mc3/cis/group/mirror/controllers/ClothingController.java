package edu.mc3.cis.group.mirror.controllers;

import edu.mc3.cis.group.mirror.exceptions.MagicMirrorException;
import edu.mc3.cis.group.mirror.models.Clothing;
import edu.mc3.cis.group.mirror.services.ClothingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("clothing")
public class ClothingController{

    @Autowired
    private ClothingService service;

    @GetMapping(path = "/clothingRecommendations", produces = "application/json")
    public Clothing getClothingRecs() {

        try {
            System.out.println();
            return service.getClothing();
        }catch (IOException exception)
        {
            throw new MagicMirrorException(HttpStatus.INTERNAL_SERVER_ERROR, new Throwable().getCause(), "Unable to retrieve Clothing object");
        }
    }
}
