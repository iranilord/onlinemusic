package ir.mrfn.onlinemusic.module.player.model;

public class Music {

    private String name;
    private String artist;
    private String img = "musicimage";
    private String src;

    private String id="music-";

    public Music() {
    }

    public Music(String name, String artist, String img, String src,String id) {
        this.name = name;
        this.artist = artist;
        this.img = img;
        this.src = src;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Music{" +
                "name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                ", img='" + img + '\'' +
                ", src='" + src + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
