package com.atlante.site.video;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/")
public class VideoController {

    @GetMapping(value = "show-video")
    private String getVideo(String video){
        return "<a href=\"https://youtu.be/tQ2DoGhcl1s\">Plaisir de Fin de Journée en AVATA (spécial Golden Hour)</a>";
    }

    @DeleteMapping(value = "delete-video")
    public String deleteVideo(String video){
        return null;
    }

    @PostMapping(value = "create-video")
    public String postVideo(String video){
        return null;
    }

    @PutMapping(value = "")
    public String putVideo(String video){
        return null;
    }

    @PatchMapping(value = "")
    public String patchVideo(Video video){
        return null;
    }



}
