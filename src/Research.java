import java.util.ArrayList;

public class Research {

    ArrayList<Node> tree;


    public Research(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public ArrayList<Person> spend(Person person, Relationships relationships) {
        ArrayList<Person> result = new ArrayList<>();
        for (Node t : tree) {
            if (t.p1.getName() == person.getName() && t.re == relationships) {
                result.add(t.p2);
            }

        }
        return result;
    }
}
