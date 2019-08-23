package Task2;


import java.util.Random;

public class Application {

    public static void main(String[] args) {
        Application application = new Application();
        for (Developer developer:fill()) {
            System.out.println(developer);
        }
    }

public static Developer [] fill(){
        Developer[] developers = new Developer[100];
         Developer developer = null;
    Random random = new Random();
         for (int i = 0;i<developers.length;i++){
             int randomNumber = random.nextInt(3);
             switch (randomNumber){
                 case 1:
                     developer =Factory.createPerson(Level.JUNIOR);
                 break;
                 case 2:
                     developer =Factory.createPerson(Level.MIDDLE);
                 break;
                 case 3:
                     developer =Factory.createPerson(Level.SENIOR);;
                 break;
             }
         developers[i]= developer;
         }
return developers;
    }
}



