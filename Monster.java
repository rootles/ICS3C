// monster class
// name, path to image
// level, treasures, witty comment

public class Monster {
    String monsterName;
    String imageFilePath;
    int level;
    int treasures;
    String wittyComment;

    String getImage(){
        return imageFilePath;
    }
    String getName() {
        return monsterName;
    }
    int  getLevel() {
        return level;
    }
    int getNumberOfTreasures(){
        return treasures;
    }
    String getWittyComment(){
        return wittyComment;
    }

    Monster() {

    }

    Monster(String mName, int mLevel, int numTreasures, String comment) {
        monsterName = mName;
        level = mLevel;
        treasures = numTreasures;
        wittyComment = comment;
    }

}