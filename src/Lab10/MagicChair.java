package Lab10;

public class MagicChair implements Chair {

    public void doMagic() {
        System.out.println("Magic!");
    }

    @Override
    public String toString() {
        return "Magic chair";
    }
}