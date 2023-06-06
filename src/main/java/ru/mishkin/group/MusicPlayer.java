package ru.mishkin.group;

public class MusicPlayer {
    private Music music;    //зависимость

    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MusicPlayer() {
    }

    //IoC
    public MusicPlayer(Music music) {    //полиморфизм
        this.music = music;
    }
    public void playMusic(){
        System.out.println("Playing " + music.getSong());
    }

    public void setMusica(Music music) {
        this.music = music;
    }
}
