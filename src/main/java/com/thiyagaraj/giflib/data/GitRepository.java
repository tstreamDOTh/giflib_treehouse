package com.thiyagaraj.giflib.data;

import com.thiyagaraj.giflib.model.Gif;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

/**
 * Created by thiyagarajt on 26/03/17.
 */
@Component
public class GitRepository {

    private  static  final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explosion", LocalDate.of(2015,2,13), "Chris Ramacciotti", true),
            new Gif("ben-and-mike", LocalDate.of(2015,10,30), "Ben Jakuben", true),
            new Gif("book-dominos", LocalDate.of(2015,9,15), "Craig Dennis", false),
            new Gif("compiler-bot", LocalDate.of(2015,2,13), "Ada Lovelace", true),
            new Gif("cowboy-coder", LocalDate.of(2015,2,13), "Grace Hopper", false),
            new Gif("infinite-andrew", LocalDate.of(2015,8,23), "Marissa Mayer", true)
    );

    public  Gif findByName(String name)
    {
        for(Gif gif : ALL_GIFS){
            if(gif.getName().equals(name))
            {
                return gif;
            }


        }
        return null ;
    }

    public List<Gif> getAllGifs(){
        return  ALL_GIFS ;
    }
}
