package com.ami.Apigestion.Controller;

import com.ami.Apigestion.Entity.region;
import com.ami.Apigestion.Services.regionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "hello", description = "Sample hello world application")
@RestController
@RequestMapping(path = "/api/region")
@AllArgsConstructor
public class regionController {

    private final regionService regionService;

    @ApiOperation(value = "My App Service get test1 API")
    @PostMapping("/create")
    public region Create(@RequestBody region region){
        return regionService.creer(region);
    }

    @ApiOperation(value = "My App Service get test1 API")
    @GetMapping("/read")
    public List<region> read(){
        return regionService.lire();
    }

    @ApiOperation(value = "My App Service get test1 API")
    @PutMapping("/update/{CodeRegion}")
    public region update(@PathVariable int CodeRegion,@RequestBody region region){
        return regionService.modifier(CodeRegion,region);}

    @ApiOperation(value = "My App Service get test1 API")
    @DeleteMapping("/delete")
    public String delete(@PathVariable int CodeRegion){
        return regionService.supprimer(CodeRegion);
    }
}

