package koschei.models;

public class Island2 {

    private final Wood3 WOOD;

    public Island2(Wood3 wood) {
        this.WOOD = wood;
    }

    @Override
    public String toString() {
        return ", на острове дерево " + WOOD.toString();
    }
}
