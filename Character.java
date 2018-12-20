// character class
// name, level, armor bonus,

public class Character {

    String charName;
    int level;
    classType charClass;
    raceType charRace;
    int armorBonus;
    int headgearBonus;
    int footgearBonus;
    int handBonus1;
    int handBonus2;
    int twoHandBonus;
    int bigItemBonus;
    int miscBonus;
    int potionBonus;

    Character(String cName, int cLevel, classType c, raceType r) {
        charName = cName;
        level = cLevel;
        charClass = c;
        charRace = r;
        armorBonus = 0;
        headgearBonus = 0;
        footgearBonus = 0;
        handBonus1 = 0;
        handBonus2 = 0;
        twoHandBonus = 0;
        bigItemBonus = 0;
        miscBonus = 0;
        potionBonus = 0;

    }

    Character() {

    }

    // get methods
    String getName() {
        return charName;
    }

    int getLevel() {
        return level;
    }

    classType getClassType() {
        return charClass;
    }

    raceType getRaceType() {
        return charRace;
    }

    // set methods, in case we need to update a player
    void setLevel(int l) {
        level = l;
    }

    void setClass(classType c) {
        charClass = c;
    }

    void setRace(raceType r) {
        charRace = r;
    }

    void setArmorBonus(int ab) {
        armorBonus = ab;
    }

    void setHeadgearBonus(int hb) {
        headgearBonus = hb;
    }

    void setFootgearBonus(int fb) {
        footgearBonus = fb;
    }

    void setHandBonus1(int hb1) {
        handBonus1 = hb1;
    }

    void setHandBonus2(int hb2) {
        handBonus2 = hb2;
    }

    void setTwoHandBonus(int thb) {
        twoHandBonus = thb;
    }

    void setBigItemBonus(int bib) {
        bigItemBonus = bib;
    }

    void setMiscBonus(int mib) {
        miscBonus = mib;
    }

    // should also call this to set potionBonus to 0
    // after all potions have been used in a fight
    void setPotionBonus(int pb) {
        potionBonus = pb;
    }

    // bc you can use multiple potions
    void addPotionBonus(int pb){
        potionBonus += pb;
    }

    int getEffectiveLevel() {
        return (level + armorBonus + headgearBonus + footgearBonus + handBonus1 + handBonus2 + twoHandBonus
                + bigItemBonus + miscBonus + potionBonus);
    }
}
