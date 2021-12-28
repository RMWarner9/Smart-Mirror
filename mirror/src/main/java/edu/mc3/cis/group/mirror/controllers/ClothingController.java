package edu.mc3.cis.group.mirror.controllers;
import edu.mc3.cis.group.mirror.exceptions.MagicMirrorException;
import edu.mc3.cis.group.mirror.models.Clothing;
import edu.mc3.cis.group.mirror.services.ClothingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * ClothingController is a controller that is called to return JSON representation of the Clothing object
 */
@RestController
@RequestMapping("clothing")
public class ClothingController{

    @Autowired
    private ClothingService service;

    /**
     * getClothingRecs is a method implementing HTTPGet responses in order to return a clothing recommendation
     * @return Clothing object holding the recommendations for clothes
     */
    @GetMapping(path = "/clothingRecommendations", produces = "application/json")
    public Clothing getClothingRecs() {

        try {
            System.out.println();
            return service.getClothing();
        }catch (Exception exception)
        {
            throw new MagicMirrorException(HttpStatus.INTERNAL_SERVER_ERROR, new Throwable().getCause(), "Unable to retrieve Clothing object");
        }
    }
}
