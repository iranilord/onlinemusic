package ir.mrfn.onlinemusic.module.player.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import ir.mrfn.onlinemusic.module.utility.MusicUtility;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class PlayerService {

    public String getMusicList(int size){
        ObjectMapper objectMapper = new ObjectMapper();
        Collections.shuffle(MusicUtility.musicList);
        String json="";
        try {
            json = objectMapper
                    .writeValueAsString(MusicUtility.musicList.subList(0,size));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return json;
    }



}
