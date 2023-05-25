package ProductDemo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.sql.SQLOutput;

@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer {
    int age() default 34;
    String country() default "India";
}

@CricketPlayer
class Virat {
    @CricketPlayer
    int runs;
    int innings;

    public int getRuns() {
        return runs;
    }

    @CricketPlayer(age=35, country="india")
    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getInnings() {
        return innings;
    }

    public void setInnings(int innings) {
        this.innings = innings;
    }
}
class LaunchAn {
    public static void main(String[] args) {
        Virat v = new Virat();
        v.setRuns(1500);
        v.setInnings(250);

        System.out.println(v.getRuns());
        System.out.println(v.getInnings());

        System.out.println("Fetching annotation values");
        Class c = v.getClass();
        CricketPlayer an = (CricketPlayer)c.getAnnotation(CricketPlayer.class);
        System.out.println("Age: " + an.age());
        System.out.println("Country: " + an.country());
    }
}
