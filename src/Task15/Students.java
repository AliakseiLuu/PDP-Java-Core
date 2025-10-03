package Task15;

public class Students {

    private String name;
    private int age;
    private float avgGradePoint;

    public Students(String name, int age, float avgGradePoint){
        this.name = name;
        this.age = age;
        this.avgGradePoint = avgGradePoint;
    }

    public String getName(){
        return name;
    }

    public float getAVG(){
        return avgGradePoint;
    }


    @Override
    public String toString() {
    return ("Name: " + name + "; Age: " + age + "; AVG point: " + avgGradePoint + ".");
    }
}
