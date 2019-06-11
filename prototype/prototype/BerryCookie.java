package prototype;

public class BerryCookie implements PrototypeCookie{
    String flavor;

    @Override
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
    @Override
    public String getFlavor() {
        return flavor;
    }

    @Override
    public PrototypeCookie copy() {
        BerryCookie copy = new BerryCookie();
        copy.setFlavor(flavor);
        return copy;
    }
}
