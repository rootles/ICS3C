public class Curse{

    String curseName;
    String imageFilePath;
    bonusType affectsBonus;
    int affectAmount;

    Curse (){

    }

    Curse (String cName, String imgPath, bonusType b, int amount){
        curseName = cName;
        imageFilePath = imgPath;
        affectsBonus = b;
        affectAmount = amount;
    }
}
