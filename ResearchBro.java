import java.util.ArrayList;

class ResearchBro {
    ArrayList<Node> tree;
  
    public ResearchBro(GeoTree geoTree) {
      tree = geoTree.getTree();
    }
  
    public ArrayList<Person> spend(Person p) {
      Relationship reCh = Relationship.CHILDREN;
      Relationship reP = Relationship.PARENT;
      Sex x = Sex.FEMALE;
      Person p3 = new Person(null, x);
      ArrayList<Person> result = new ArrayList<>();
      for (Node t : tree) {
        if (t.p1.getName() == p.getName() && t.re == reCh) {
          if(t.p2.sex == x){
            p3 = t.p2;}}}
      for (Node t : tree) {      
        if (t.p1.getName() == p3.getName() && t.re == reP) {
          if(t.p2.getName() != p.getName()){
          result.add(t.p2);
        }} 
      }
      return result;
  }
  }
