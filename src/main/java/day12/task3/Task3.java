package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("AAA", 1980);
        MusicBand band2 = new MusicBand("BBB", 1985);
        MusicBand band3 = new MusicBand("CCC", 1989);
        MusicBand band4 = new MusicBand("DDD", 1999);
        MusicBand band5 = new MusicBand("FGR", 2020);
        MusicBand band6 = new MusicBand("POP", 2001);
        MusicBand band7 = new MusicBand("GROT", 1977);
        MusicBand band8 = new MusicBand("LOLA", 2009);
        MusicBand band9 = new MusicBand("NEMO", 1991);
        MusicBand band10 = new MusicBand("MKS", 2005);

        List<MusicBand> bands = new ArrayList<>();

        bands.add(band1);
        bands.add(band2);
        bands.add(band3);
        bands.add(band4);
        bands.add(band5);
        bands.add(band6);
        bands.add(band7);
        bands.add(band8);
        bands.add(band9);
        bands.add(band10);

        System.out.println(bands);

        Collections.shuffle(bands);
        System.out.println(bands);

        System.out.println(groupsAfter2000(bands));
    }
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> bandsAfter2000 = new ArrayList<>();
        for (MusicBand band : bands) {
            if (band.getYear() > 2000) {
                bandsAfter2000.add(band);
            }
        }
        return bandsAfter2000;
    }
}
