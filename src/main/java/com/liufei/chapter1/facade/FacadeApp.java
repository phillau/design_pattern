package com.liufei.chapter1.facade;

import com.liufei.chapter1.facade.complexSystem.DvdPlayer;
import com.liufei.chapter1.facade.complexSystem.Light;
import com.liufei.chapter1.facade.complexSystem.MusicMachine;
import com.liufei.chapter1.facade.complexSystem.PopcornMachine;
import com.liufei.chapter1.facade.facade.HomeTheaterFacade;

public class FacadeApp {
    public static void main(String[] args) {
        DvdPlayer dvdPlayer = new DvdPlayer();
        Light light = new Light();
        MusicMachine musicMachine = new MusicMachine();
        PopcornMachine popcornMachine = new PopcornMachine();
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(dvdPlayer, light, musicMachine, popcornMachine);
        homeTheaterFacade.watchMovie("forest run");
    }
}
