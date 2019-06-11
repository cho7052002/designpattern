import prototype.BerryCookie;
import prototype.ChocolateCookie;
import prototype.IcecreamSandwich;
import prototype.PrototypeCookie;

public class Main {
    public static void main(String[] args) {
        CookieFactory cookieFactory = new CookieFactory();
        PrototypeCookie temp;

        /////////////////////////////////////////////////////////////////////////////////////////////
        ChocolateCookie chocolateCookie = new ChocolateCookie();
        chocolateCookie.setFlavor("Dark Chocolate");

        cookieFactory.setPrototypeCookie(chocolateCookie);
        System.out.println("1");
        temp = cookieFactory.copyCookie();
        System.out.println("\tflavor:\t" + temp.getFlavor());
        System.out.println("\tclass:\t" + temp.getClass().getSimpleName());


        System.out.println("2");
        temp = cookieFactory.copyCookie();
        System.out.println("\tflavor:\t" + temp.getFlavor());
        System.out.println("\tclass:\t" + temp.getClass().getSimpleName());

        /////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("changing cookie...");

        chocolateCookie = new ChocolateCookie();
        chocolateCookie.setFlavor("White Chocolate");

        cookieFactory.setPrototypeCookie(chocolateCookie);
        System.out.println("3");
        temp = cookieFactory.copyCookie();
        System.out.println("\tflavor:\t" + temp.getFlavor());
        System.out.println("\tclass:\t" + temp.getClass().getSimpleName());

        System.out.println("4");
        temp = cookieFactory.copyCookie();
        System.out.println("\tflavor:\t" + temp.getFlavor());
        System.out.println("\tclass:\t" + temp.getClass().getSimpleName());

        /////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("changing cookie...");

        BerryCookie berryCookie = new BerryCookie();
        berryCookie.setFlavor("Strawberry");

        cookieFactory.setPrototypeCookie(berryCookie);
        System.out.println("5");
        temp = cookieFactory.copyCookie();
        System.out.println("\tflavor:\t" + temp.getFlavor());
        System.out.println("\tclass:\t" + temp.getClass().getSimpleName());

        System.out.println("6");
        temp = cookieFactory.copyCookie();
        System.out.println("\tflavor:\t" + temp.getFlavor());
        System.out.println("\tclass:\t" + temp.getClass().getSimpleName());

        /////////////////////////////////////////////////////////////////////////////////////////////
        IcecreamSandwich icecreamSandwich = new IcecreamSandwich();
        icecreamSandwich.setFlavor("vanilla");
        icecreamSandwich.setUpperCookie(chocolateCookie);
        icecreamSandwich.setLowerCookie(berryCookie);

        cookieFactory.setPrototypeCookie(icecreamSandwich);

        System.out.println("7");
        temp = cookieFactory.copyCookie();
        System.out.println("\tflavor:\t" + temp.getFlavor());
        System.out.println("\tclass:\t" + temp.getClass().getSimpleName());

        IcecreamSandwich tempIcecreamSandwich = (IcecreamSandwich) temp;
        System.out.println("\tflavor:\t" + tempIcecreamSandwich.getUpperCookie().getFlavor());
        System.out.println("\tflavor:\t" + tempIcecreamSandwich.getLowerCookie().getFlavor());
    }
}
