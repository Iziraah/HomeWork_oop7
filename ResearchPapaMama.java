import java.util.ArrayList;

class ResearchPapaMama {
    ArrayList<Node> tree;
  
    public ResearchPapaMama(GeoTree geoTree) {
      tree = geoTree.getTree();
    }
  
    public ArrayList<Person> spend(Person p, Relationship re, Sex s) {
      ArrayList<Person> result = new ArrayList<>();
      for (Node t : tree) {
        if (t.p1.getName() == p.getName() && t.re == re) {
          if(t.p2.sex == s){
          result.add(t.p2);
        }}
      }
      return result;
  }}
