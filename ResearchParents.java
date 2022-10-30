import java.util.ArrayList;

class ResearchParents {
    ArrayList<Node> tree;
  
    public ResearchParents(GeoTree geoTree) {
      tree = geoTree.getTree();
    }
  
    public ArrayList<Person> spend(Person p, Relationship re) {
      ArrayList<Person> result = new ArrayList<>();
      for (Node t : tree) {
        if (t.p1.getName() == p.getName() && t.re == re) {
          result.add(t.p2);
        }
      }
      return result;
    }
  }