
package com.unpri.charactermanager.model;

import java.util.Locale;

public class Character {

    private String name;
    private int level;
    private CharacterType type;
    private int hp;
    private int attack;
    private int mana;

    private static int totalCharacterCreated = 0;

    public Character(String name, int level, CharacterType type) {
        this(name, level, type, 50);
    }

    public Character(String name, int level,
                     CharacterType type, int mana) {

        setName(name);
        setLevel(level);
        setType(type);
        setMana(mana);

        recalculateStats();
        totalCharacterCreated++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "Nama karakter tidak boleh kosong."
            );
        }

        this.name = name.trim();
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level < 1) {
            throw new IllegalArgumentException(
                "Level minimal adalah 1."
            );
        }

        this.level = level;
        recalculateStats();
    }

    public CharacterType getType() {
        return type;
    }

    public void setType(CharacterType type) {
        if (type == null) {
            throw new IllegalArgumentException(
                "Tipe karakter tidak boleh null."
            );
        }

        this.type = type;
        recalculateStats();
    }

    public int getHp() {
        return hp;
    }

    public int getAttack() {
        return attack;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        if (mana < 0) {
            throw new IllegalArgumentException(
                "Mana tidak boleh negatif."
            );
        }

        this.mana = mana;
    }

    public static int getTotalCharacterCreated() {
        return totalCharacterCreated;
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public void levelUp() {
        level++;
        recalculateStats();
    }

    private void recalculateStats() {
        if (level > 0 && type != null) {
            hp = 100 + (level * 10);
            attack = 10 + (level * 3);

            if (type == CharacterType.WARRIOR) {
                hp += 20;
            } else if (type == CharacterType.MAGE) {
                attack += 5;
            } else if (type == CharacterType.ARCHER) {
                attack += 3;
            }
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Character)) {
            return false;
        }

        Character other = (Character) obj;

        return name.equalsIgnoreCase(other.name);
    }

    @Override
    public int hashCode() {
        return name.toLowerCase(Locale.ROOT).hashCode();
    }

    @Override
    public String toString() {
        return String.format(
            "Character{name='%s', level=%d, type=%s, "
            + "HP=%d, attack=%d, mana=%d}",
            name, level, type, hp, attack, mana
        );
    }
}
