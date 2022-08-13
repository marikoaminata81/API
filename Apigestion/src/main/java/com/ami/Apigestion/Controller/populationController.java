package com.ami.Apigestion.Controller;

import com.ami.Apigestion.Entity.NombrePopulation;
import com.ami.Apigestion.Entity.region;
import com.ami.Apigestion.Services.populationService;
import com.ami.Apigestion.Services.regionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping(path = "/api/population")
@Api(value = "hello", description = "Sample hello world application")
@AllArgsConstructor
public class populationController {

    private final populationService populationService;

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @PostMapping("/createPop")
    public NombrePopulation CreatePop(@RequestBody NombrePopulation NombrePopulation){
        return populationService.creerPop(NombrePopulation);
    }

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @GetMapping("/readPop")
    public List<NombrePopulation> readPop(){
        return populationService.lirePop();
    }

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @PutMapping("/updatePop/{id_pop}")
    public NombrePopulation updatePop(@PathVariable int id_pop,@RequestBody NombrePopulation NombrePopulation){
        return populationService.modifierPop(id_pop,NombrePopulation);
    }

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @DeleteMapping("/deletePop/{id}")
    public String deletePop(@PathVariable int id){

        return populationService.supprimerPop(id);
    }

}
