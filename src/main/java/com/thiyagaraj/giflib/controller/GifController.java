package com.thiyagaraj.giflib.controller;

import com.thiyagaraj.giflib.data.GitRepository;
import com.thiyagaraj.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by thiyagarajt on 26/03/17.
 */
@Controller
public class GifController {

    @Autowired
    private GitRepository gifRepository;

    @RequestMapping("/")
    public String listGifs(ModelMap modelMap){
        List<Gif> allGifs = gifRepository.getAllGifs() ;
        modelMap.put("gifs",allGifs) ;
       return "home" ;

    }
    @RequestMapping("/gif/{name}")
    public  String gifDetails(@PathVariable String name,  ModelMap modelMap){
        Gif gif = gifRepository.findByName(name) ;
        modelMap.put("gif",gif) ;
        return  "gif-details";
    }


}
