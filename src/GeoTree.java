

import java.util.ArrayList;

public class GeoTree {
    private ArrayList<Node> tree = new ArrayList<>();

    public void append(Person parent, Person children, Person grandparent, Person grandsons) {
        tree.add(new Node(parent, Relationships.PARENT, children));
        tree.add(new Node(children, Relationships.CHILDREN, parent));
        tree.add(new Node(grandparent, Relationships.GRANDPARENT, grandsons));
        tree.add(new Node(grandsons, Relationships.GRANDSONS, grandparent));;
        }

    public ArrayList<Node> getTree() {
        return tree;
    }
}
