public class dog{
    String name;
    String breed;
    int age;
    String color;

    public dog(String name, String breed, int age, String color){
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
        //constructors for the class 
    }

    public String getName(){
        return name;
    }

    public String getBreed(){
        return breed;
    }

    public int getAge(){
        return age;
    }

    public String getColor(){
        return color;
    }

    public static void main(String[] args){
        dog tuffy = new dog("Khushi", "pomeranian/maltest", 3, "white");
        System.out.println(tuffy.getName());
    }
}

//initializing an object