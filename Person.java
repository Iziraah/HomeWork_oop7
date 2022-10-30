
class Person implements People{
    private String Name;
    Sex sex;
    
    public String setName(){
        return Name;
    }
    
    public String getName() {
        return Name;
    }
      
    public Person(String Name, Sex sex) {
        this.Name = Name;
        this.sex = sex;
    }
      
    @Override
    public String toString() {
        return String.format("(%s)", this.Name);
    }
}
      
enum Relationship {
    PARENT,
    CHILDREN,
    SPOUSE
  }
  
  enum Sex {
    MALE,
    FEMALE
  }
