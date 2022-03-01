import java.util.Arrays;

/**
 * @invar | getArray() != null
 */
public class IntList {
	
	/**
	 * @invar | elements != null
	 * 
	 * @representationObject
	 */
	private int[] elements; 
	
	public IntList() {
		this.elements = new int[] {};
	}
	
	public int length() {return elements.length;}
	
	/**
	 * @pre | 0 <= index && index < getArray().length
	 */
	public int atIndex(int index) {return elements[index];}
	
	/**
	 * @creates | result
	 */
	public int[] getArray() {return elements.clone();}
	
	/**
	 * @post | getArray().length == old(getArray().length) + 1 
	 *  
	 * @mutates | this
	 */
	public void append(int number) {
		int[] result = new int[this.elements.length+1];
		for (int i = 0; i < this.elements.length; i++) {
			result[i] = this.elements[i];
		}
		result[result.length-1] = number;
		this.elements = result;
	}
	
	/**
	 * @post | getArray().length == old(getArray().length) - 1 
	 * 
	 * @mutates | this
	 */
	public void remove() {
		int[] result = new int[elements.length-1];
		for (int i = 0; i < elements.length-1; i++) {
			result[i] = this.elements[i];
		}
		this.elements = result;
	}
	
}
