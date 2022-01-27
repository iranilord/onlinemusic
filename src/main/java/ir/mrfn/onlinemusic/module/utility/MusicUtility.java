package ir.mrfn.onlinemusic.module.utility;

import ir.mrfn.onlinemusic.module.player.model.Music;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MusicUtility {
    public static List<Music> musicList = new ArrayList<>();

    private  Music elemetParser(Music music , Element element,int count){
        try {
            String artist = element.text().split("-")[0].trim();
            String name = element.text().split("-")[1].split("\\(")[0].trim();
            String src = element.attr("abs:href");

            music.setArtist(artist);
            music.setName(name);
            music.setSrc(src);
            music.setId(music.getId()+count);
        }catch (Exception e){
        }
        return music;
    }

    public  void getMusics()  {
        Document document = null;
         int count =1 ;
        try {
            document = Jsoup.connect("https://dls.music-fa.com/tagdl/ati/").get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Elements links = document.select("a[href]");


        System.out.println("link size is :"+links.size());
        for (Element element : links){
            if (element.attr("abs:href").contains("128")) {
                musicList.add(elemetParser(new Music(),element,count++));
            }
        }
    }



}
