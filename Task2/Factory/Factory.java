package Task2.Factory;

import Task2.ClassesTree.*;

public class Factory {

    public static Developer createPerson(Level level) {
        Developer developer;
        switch (level){
        case JUNIOR:
            developer = new Junior();
          developer.setExperience(((int)(Math.random()*2)+1));
            int random = (int)(Math.random()*2);
            if (random == 1){
                developer.setEducation("Degree in Computer Science or Equivalent");

            } else {
                developer.setEducation("No Degree in Computer Science");
            }
            break;
        case MIDDLE:
            developer = new Middle();
            developer.setExperience((int)(2+ Math.random()*4)+1);
            random = (int)(Math.random()*2);
            if (random == 1){
                developer.setEducation("Degree in Computer Science or Equivalent");

            } else {
                developer.setEducation("No Degree in Computer Science");
            }
            break;
        case SENIOR:
            developer = new Senior();
            developer.setExperience((int)(4+ Math.random()*6)+1);
            random = (int)(Math.random()*2);
            if (random == 1){
                developer.setEducation("Degree in Computer Science or Equivalent");

            } else {
                developer.setEducation("No Degree in Computer Science");
            }
            break;
        default:
            developer =  new Developer();
    }
    return developer;
    }
}
