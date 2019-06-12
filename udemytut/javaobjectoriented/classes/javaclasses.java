public class javaclasses {
    private String name;
    //private -modifer String -type name-varname
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public static void main(String[] args){
        javaclasses javaclasses1= new javaclasses();
        //java object creation
        //class name // object name = new class constructor
        javaclasses1.setName("Khushi");
        System.out.println(javaclasses1.getName());
    }
}

//an object is an instance of a class
// there can be any number of objects to a class at a given time
// a class defines the data and methods to work on that data
//when programs are written, all program data is wrapped in a class
// a class is a template from which objects are created
// the class is a logical entity
// classes are declared using the "class" keyword
// classes do not allocate memory when created
