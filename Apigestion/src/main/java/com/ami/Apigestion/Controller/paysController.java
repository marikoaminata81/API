package com.ami.Apigestion.Controller;

import com.ami.Apigestion.Entity.NombrePopulation;
import com.ami.Apigestion.Entity.Pays;
import com.ami.Apigestion.Services.paysService;
import com.ami.Apigestion.Services.populationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@Api(value = "hello", description = "Sample hello world application")
@RequestMapping(path = "/api/pays")
@AllArgsConstructor
public class paysController {
    private paysService paysService;

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @PostMapping("/createPays")
    public Pays CreatePays(@RequestBody Pays Pays){
        return paysService.creerPays(Pays);
    }

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @GetMapping("/readPays")
    public List<Pays> readPays(){
        return paysService.lirePays();
    }

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @PutMapping("/updatePays/{IdPays}")
    public Pays updatePays(@PathVariable int IdPays,@RequestBody Pays Pays){
        return paysService.modifierPays(IdPays,Pays);
    }

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @DeleteMapping("/deletePays")
    public String deletePays(@PathVariable int IdPays){
        return paysService.supprimerPays(IdPays);
    }


}
