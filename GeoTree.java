import java.util.ArrayList;

class GeoTree implements Tree{
    private ArrayList<Node> tree = new ArrayList<>();
  
    public ArrayList<Node> getTree() {
      return tree;
    }
  
    public void append(Person parent, Person children) {
      tree.add(new Node(parent, Relationship.PARENT, children));
      tree.add(new Node(children, Relationship.CHILDREN, parent));
    }
    public void appendSpouse(Person parent, Person spouse){
      tree.add(new Node(parent, Relationship.SPOUSE, spouse));
  }

  }
  