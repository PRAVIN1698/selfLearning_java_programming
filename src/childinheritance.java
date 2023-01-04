public class childinheritance extends parentInteritance {


    childinheritance(int i) {
        super(i);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void type()
    {
        parentInteritance p= new parentInteritance(8);
        p.moo();

    }


}
