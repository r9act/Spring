package ru.mishkin.group;

public class ClassicalMusic implements Music{
    @Override
    public String getSong() {
        return "ClassicalSong.mp3";
    }

    public void doMyInit(){
        System.out.println("Doing initialization...");
    }

    public void doMyDestroy(){
        System.out.println("Doing my destroy!!!");
    }
}
