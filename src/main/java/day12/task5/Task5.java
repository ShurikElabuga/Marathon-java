package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {

        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Danny Groov", 45));
        members1.add(new MusicArtist("Dona Doun", 49));
        members1.add(new MusicArtist("Mila Yovovich", 51));
        members1.add(new MusicArtist("Greg Duda", 49));

        MusicBand band1 = new MusicBand("DoReMi", 2001, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Mikki Salivan", 39));
        members2.add(new MusicArtist("Dora Braiyan", 41));
        members2.add(new MusicArtist("Gosha Kucenko", 52));
        members2.add(new MusicArtist("Din Braun", 44));

        MusicBand band2 = new MusicBand("MyRok", 1999, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1, band2);

        band1.printMembers();
        band2.printMembers();
    }
}
