package OOP_Lesson1;

import java.util.Objects;

public class Relations {
    public void relShow(Person pers1, Person pers2){
        if (Objects.isNull(pers1)||Objects.isNull(pers2)){
            System.out.println("Pleace, set your character!");
        }
        if (pers1.equals(father)&&pers2.equals(mother)){
            father.setStatus("Husbend");
            mother.setStatus("Wife");
            System.out.println(pers1 + "and" + pers2 + "is spouses");
            System.out.println(pers1 + "is" + pers1.getStatus());
            System.out.println(pers2 + "is" + pers2.getStatus());
        } else {
            System.out.println("Unknown");
        }
    }
}
