package generics;

// Using this notation, you can predefine on instancing the Class of the attributes of this class
public class Container<F,S> {
    F item1;
    S item2;

    public Container(F item1, S item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    public F getItem1() {
        return item1;
    }

    public void setItem1(F item1) {
        this.item1 = item1;
    }

    public S getItem2() {
        return item2;
    }

    public void setItem2(S item2) {
        this.item2 = item2;
    }
}
