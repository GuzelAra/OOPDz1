public enum Relationships {

    PARENT("Родители"),

    CHILDREN("Дети"),

    GRANDPARENT("Бабушка"),

    GRANDSONS("Внуки");

    private String description;

    Relationships(String description) {this.description = description;}
}
