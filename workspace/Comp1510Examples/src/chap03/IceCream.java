package chap03;

/**
 * Demonstrates the use of enumerated types.
 * 
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class IceCream {
    /** Enumeration type representing some flavours of ice cream. */
    enum Flavor {
        /** plain vanilla flavour. */
        vanilla, 
        /** smooth chocolate flavour. */
        chocolate, 
        /** smooth strawberry flavour. */
        strawberry, 
        /** fudge flavour with fudge pieces. */
        fudgeRipple, 
        /** light coffee flavour. */
        coffee, 
        /** chocolate, nuts, marshmallow flavour. */
        rockyRoad, 
        /** mint flavour with chocolate chip. */
        mintChocolateChip, 
        /** chocolate chip cookie dough in vanilla flavour. */
        cookieDough
    }

    /**
     * Creates and uses variables of the Flavor type.
     * @param args unused
     */
    public static void main(String[] args) {
        Flavor cone1;
        Flavor cone2;
        Flavor cone3;

        cone1 = Flavor.rockyRoad;
        cone2 = Flavor.chocolate;

        System.out.println("cone1 value: " + cone1);
        System.out.println("cone1 ordinal: " + cone1.ordinal());
        System.out.println("cone1 name: " + cone1.name());

        System.out.println();
        System.out.println("cone2 value: " + cone2);
        System.out.println("cone2 ordinal: " + cone2.ordinal());
        System.out.println("cone2 name: " + cone2.name());

        cone3 = cone1;

        System.out.println();
        System.out.println("cone3 value: " + cone3);
        System.out.println("cone3 ordinal: " + cone3.ordinal());
        System.out.println("cone3 name: " + cone3.name());
    }
}
