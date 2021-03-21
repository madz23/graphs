package graphs;

public class Person implements Visitable{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }


}
