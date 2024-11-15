public class Knot {
    String name;

    public Knot(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }
    public boolean isEqualTo(String value){
        return name.compareTo(value)==0;
    }
}
