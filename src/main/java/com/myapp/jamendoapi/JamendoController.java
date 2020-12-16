package com.myapp.jamendoapi;

import com.myapp.jamendoapi.models.artist.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.io.IOException;

@RestController
@RequestMapping("/api")
public class JamendoController {

    @Autowired
    private RetrofitService retrofitService;

    @GetMapping("/artists")
    public Artist getArtists(@PathParam("name") String name) {
        try {
            System.out.println("---Controller---");
            System.out.println("Name: "+name);
            return retrofitService.getArtists(name);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
