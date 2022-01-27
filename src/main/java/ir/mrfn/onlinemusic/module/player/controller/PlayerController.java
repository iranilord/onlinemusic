package ir.mrfn.onlinemusic.module.player.controller;

import ir.mrfn.onlinemusic.module.player.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PlayerController {

    private final PlayerService playerService;
    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("")
    public String index(Model model){
        String json = playerService.getMusicList(25);
        model.addAttribute("musicList", json);
        return "index";
    }

    @GetMapping("/api/getMusic/{size}")
    public @ResponseBody String getListMusic(@PathVariable int size){
        return playerService.getMusicList(size);
    }

}
