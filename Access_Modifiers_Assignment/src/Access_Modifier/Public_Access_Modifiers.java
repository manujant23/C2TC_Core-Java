package Access_Modifier;



class Data1 {
    private String name;

    // getter method
    public String getName() {
        return this.name;
    }
    // setter method
    public void setName(String name) {
        this.name= name;
    }
}
public class Public_Access_Modifiers {
    public static void main(String[] main){
        Data1 d = new Data1();

        // access the private variable using the getter and setter
        d.setName("Programiz");
        System.out.println(d.getName());
    }
}

