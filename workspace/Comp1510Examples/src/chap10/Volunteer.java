package chap10;

/**
 * Represents a staff member that works as a volunteer.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class Volunteer extends StaffMember {

    /**
     * No argument constructor. For creating components to be initialized
     * from a Scanner
     */
    public Volunteer() {
    }

    /**
    * Constructor: Sets up this volunteer using the specified
    * information.
    * @param eName employee name
    * @param eAddress employee address
    * @param ePhone employee phone
    */
    public Volunteer(String eName, String eAddress, String ePhone) {
        super(eName, eAddress, ePhone);
    }

    /**
    * Returns a zero pay value for this volunteer.
    * @return amount paid a volunteer, 0.0
    */
    public double pay() {
        return 0.0;
    }
}
