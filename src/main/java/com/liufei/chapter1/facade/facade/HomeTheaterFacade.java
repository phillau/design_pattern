package com.liufei.chapter1.facade.facade;

import com.liufei.chapter1.facade.complexSystem.DvdPlayer;
import com.liufei.chapter1.facade.complexSystem.Light;
import com.liufei.chapter1.facade.complexSystem.MusicMachine;
import com.liufei.chapter1.facade.complexSystem.PopcornMachine;

public class HomeTheaterFacade {
    private DvdPlayer dvdPlayer;
    private Light light;
    private MusicMachine musicMachine;
    private PopcornMachine popcornMachine;

    public HomeTheaterFacade(DvdPlayer dvdPlayer, Light light, MusicMachine musicMachine, PopcornMachine popcornMachine) {
        this.dvdPlayer = dvdPlayer;
        this.light = light;
        this.musicMachine = musicMachine;
        this.popcornMachine = popcornMachine;
    }

    public void watchMovie(String movie){
        popcornMachine.makePopcorn();
        light.on();
        dvdPlayer.screenOn();
        musicMachine.turnOn();
        musicMachine.up();
        dvdPlayer.playMovie(movie);
    }
}
