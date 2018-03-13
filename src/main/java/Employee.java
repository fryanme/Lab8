/**
 * Class implementing an employee.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/10/">Lab 10 Description</a>
 */
public class Employee {

    /**
     *
     */
    private String name;
    /**
     *
     */
    private String manager;

    /**
     * Constructor for initialization.
     * @param setName name.
     * @param setManager manager.
     */
    public Employee(final String setName, final String setManager) {
        this.name = setName;
        this.manager = setManager;
    }

    /**
     * Getter for name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name.
     * @param setName name.
     */
    public void setName(final String setName) {
        this.name = name;
    }

    /**
     * Getter for manager.
     * @return manager
     */
    public String getManager() {
        return manager;
    }

    /**
     * Setter for manager.
     * @param setManager manager.
     */
    public void setManager(final String setManager) {
        this.manager = manager;
    }
}
