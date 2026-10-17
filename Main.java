
package com.unpri.charactermanager;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterManager;
import com.unpri.charactermanager.model.CharacterType;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        CharacterManager manager = new CharacterManager();

        Character arya = new Character(
            "Arya", 5, CharacterType.WARRIOR, 30
        );

        Character luna = new Character(
            "Luna", 8, CharacterType.MAGE, 100
        );

        Character robin = new Character(
            "Robin", 4, CharacterType.ARCHER, 40
        );

        System.out.println("=== TAMBAH KARAKTER ===");

        System.out.println(
            "Arya ditambahkan: "
            + manager.addCharacter(arya)
        );

        System.out.println(
            "Luna ditambahkan: "
            + manager.addCharacter(luna)
        );

        System.out.println(
            "Robin ditambahkan: "
            + manager.addCharacter(robin)
        );

        System.out.println(
            "Tambah nama duplikat Arya: "
            + manager.addCharacter(
                new Character(
                    "arya", 2, CharacterType.HEALER
                )
            )
        );

        System.out.println("\n=== UJI EQUALS ===");

        System.out.println(
            "Arya sama dengan arya: "
            + arya.equals(
                new Character(
                    "arya", 2, CharacterType.HEALER
                )
            )
        );

        System.out.println("\n=== DAFTAR KARAKTER ===");

        for (Character character : manager.getAllCharacters()) {
            System.out.println(character);
        }

        System.out.println(
            "\nTotal karakter: "
            + manager.getTotalCharacters()
        );

        System.out.println(
            "Cari Luna: "
            + manager.findByName("Luna")
        );

        System.out.printf(
            "Rata-rata level: %.2f%n",
            manager.getAverageLevel()
        );

        System.out.println("\n=== CARI TIPE MAGE ===");

        for (Character character :
                manager.findByType(CharacterType.MAGE)) {
            System.out.println(character);
        }

        System.out.println("\n=== KARAKTER TERKUAT ===");

        System.out.println(manager.findStrongest());

        System.out.println("\n=== UJI SALINAN ARRAYLIST ===");

        ArrayList<Character> copy = manager.getAllCharacters();

        copy.clear();

        System.out.println(
            "Ukuran salinan setelah clear(): "
            + copy.size()
        );

        System.out.println(
            "Jumlah karakter asli: "
            + manager.getTotalCharacters()
        );

        System.out.println("\n=== UJI REFERENCE ===");

        Character a = new Character(
            "TestRef", 3, CharacterType.WARRIOR
        );

        Character b = a;

        b.setLevel(8);

        System.out.println(
            "Level a setelah level b diubah: "
            + a.getLevel()
        );

        System.out.println("a == b: " + (a == b));

        System.out.println("\n=== UJI STATIC ===");

        System.out.println(
            "Total objek Character dibuat: "
            + Character.getTotalCharacterCreated()
        );

        System.out.println("\n=== HAPUS KARAKTER ===");

        System.out.println(
            "Arya berhasil dihapus: "
            + manager.removeCharacter("Arya")
        );

        System.out.println(
            "Total setelah penghapusan: "
            + manager.getTotalCharacters()
        );

        System.out.println("\n=== UJI MANAGER KOSONG ===");

        CharacterManager emptyManager =
            new CharacterManager();

        System.out.println(
            "Rata-rata level saat kosong: "
            + emptyManager.getAverageLevel()
        );
    }
}
