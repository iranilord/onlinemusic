package ir.mrfn.onlinemusic;

import ir.mrfn.onlinemusic.module.player.model.Music;
import ir.mrfn.onlinemusic.module.utility.MusicUtility;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class OnlinemusicApplication {

    public static void main(String[] args) {
        new MusicUtility().getMusics();
        SpringApplication.run(OnlinemusicApplication.class, args);
    }

}
