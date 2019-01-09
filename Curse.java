public class Curse{

    String curseName;
    String imageFilePath;
    bonusType affectsBonus;
    int affectAmount;

    String getImage() {
        return imageFilePath;
    }

    String getName() {
        return curseName;
    }

    int getAmount() {
        return affectAmount;
    }

    bonusType getBonus() {
        return affectsBonus;
    }
    
    Curse (){

    }

    Curse (String cName, String imgPath, bonusType b, int amount){
        curseName = cName;
        imageFilePath = imgPath;
        affectsBonus = b;
        affectAmount = amount;
    }
}
