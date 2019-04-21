package com.example.keajaibandunia;

import java.util.ArrayList;

public class KeajaibanDuniaData {
    public static String[][] data = new String[][]{
            {"Tembok Besar Tiongkok", "Tiongkok", "https://upload.wikimedia.org/wikipedia/commons/1/16/GreatWallNearBeijingWinter.jpg"},
            {"Petra", "Yordania", "https://upload.wikimedia.org/wikipedia/commons/f/f5/Petra_Jordan_BW_21.JPG"},
            {"Patung Kristus Penebus", "Brasil", "https://upload.wikimedia.org/wikipedia/commons/8/87/Cristo_Redentor_-_Rio_de_Janeiro%2C_Brasil.jpg"},
            {"Machu Picchu", "Perú", "https://upload.wikimedia.org/wikipedia/commons/4/43/Peru_Machu_Picchu_Sunrise.jpg"},
            {"Chichén Itzá", "Mexico", "https://upload.wikimedia.org/wikipedia/commons/e/ea/El_Castillo%2C_Chich%C3%A9n_Itz%C3%A1.jpg"},
            {"Colosseum", "Italia", "https://upload.wikimedia.org/wikipedia/commons/5/53/Colosseum_in_Rome%2C_Italy_-_April_2007.jpg"},
            {"Taj Mahal", "India", "https://upload.wikimedia.org/wikipedia/commons/4/4d/TajMahalbyAmalMongia.jpg"},
            {"Piramid Giza", "Mesir", "https://upload.wikimedia.org/wikipedia/commons/d/d1/Gizeh_Cheops_BW_1.jpg"},
    };

    public static ArrayList<KeajaibanDunia> getListData(){
        KeajaibanDunia keajaibanDunia = null;
        ArrayList<KeajaibanDunia> list = new ArrayList<>();
        for (String[] aData : data) {
            keajaibanDunia = new KeajaibanDunia();
            keajaibanDunia.setName(aData[0]);
            keajaibanDunia.setRemarks(aData[1]);
            keajaibanDunia.setPhoto(aData[2]);

            list.add(keajaibanDunia);
        }

        return list;
    }
}
