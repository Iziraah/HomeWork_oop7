import java.util.ArrayList;

interface Tree {
    public void append(Person parent, Person children);
    public void appendSpouse(Person parent, Person spouse);
    public ArrayList<Node> getTree();
}
