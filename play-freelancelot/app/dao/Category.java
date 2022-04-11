package dao;

/** Represents category of a project.
 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
 * @version 1.0
 * @since 1.0
*/
public class Category {
	public int id;
    public String name;
    
    
    /** gets id of the category.
	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
	 * @version 1.0
	 * @return id of the category
	 * @since 1.0
	*/
	public int getId() {
		return id;
	}
	
	 /** sets id of the category.
		 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
		 * @version 1.0
		 * @param id of the category
		 * @since 1.0
		*/
	public void setId(int id) {
		this.id = id;
	}
	
	 /** gets name of the category.
		 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
		 * @version 1.0
		 * @return name of the category
		 * @since 1.0
		*/
	public String getName() {
		return name;
	}
	
	 /** sets nmae of the category.
		 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
		 * @version 1.0
		 * @param name of the category
		 * @since 1.0
		*/
	public void setName(String name) {
		this.name = name;
	}
}
