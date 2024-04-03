package org.example;
import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Ceiling ceiling = new Ceiling(100, PaintColor.RED);
        Wall wall1 = new Wall("Kuzey");
        Wall wall2 = new Wall("Güney");
        Wall wall3 = new Wall("Doğu");
        Wall wall4 = new Wall("Batı");
        Bed bed = new Bed("Çift Kişilik",150,150,15,20);
        Lamp lamp = new Lamp(LampType.NEON,true,5);
        Wardrobe wardrobe = new Wardrobe(200,200,50);
        Carpet carpet = new Carpet(75,75,PaintColor.GREEN);

        Bedroom bedroom = new Bedroom("yeni",wall1,wall2,wall3,wall4, ceiling, bed, lamp, wardrobe, carpet);
        System.out.println("Hello world!");
        System.out.println(bedroom);

    }

}