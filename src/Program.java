import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {
        var nata = new Person("Наталья", 63);
        var gleb = new Person("Глеб", 41);
        var olya = new Person("Ольга", 39);
        var stas = new Person("Стас", 9);
        var yan = new Person("Ян", 13);

        GeoTree gt = new GeoTree();
        gt.append(nata, gleb, nata, yan);
        gt.append(nata, olya, nata, stas);
        gt.append(gleb, yan, nata, yan);
        gt.append(olya, stas, nata, stas);

        System.out.println(new Research(gt).spend(stas, Relationships.GRANDSONS));

    }
}
