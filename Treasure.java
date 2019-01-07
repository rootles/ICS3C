// treasure class
// name, path to image
// bonus value, bonus type
// class restriction, race restriction
// class exclusion, race exclusion

public class Treasure {
    String treasureName;
    String imageFilePath;
    int bonusValue;
    bonusType bType;
    classType cRestrict;
    raceType rRestrict;
    classType cExclusion;
    raceType rExclusion;

    void setAll(String tName, int bValue, bonusType b, classType c, raceType r, classType eC, raceType eR) {
        treasureName = tName;
        bonusValue = bValue;
        bType = b;
        cRestrict = c;
        rRestrict = r;
        cExclusion = eC;
        rExclusion = eR;
    }

    String getImage() {
        return imageFilePath;
    }

    String getName() {
        return treasureName;
    }

    int getBonus() {
        return bonusValue;
    }

    bonusType getBonusType() {
        return bType;
    }

    classType getClassRestriction() {
        return cRestrict;
    }

    raceType getRaceRestriction() {
        return rRestrict;
    }

    classType getClassExclusion() {
        return cExclusion;
    }

    raceType getRaceExclusion() {
        return rExclusion;
    }

    Treasure() {

    }

    Treasure(String tName, String imgPath, int bValue, bonusType b, classType c, raceType r, classType eC, raceType eR) {
        treasureName = tName;
        imageFilePath = imgPath;
        bonusValue = bValue;
        bType = b;
        cRestrict = c;
        rRestrict = r;
        cExclusion = eC;
        rExclusion = eR;
    }


}
