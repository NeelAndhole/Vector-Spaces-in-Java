
/**
 * This models the vectors that we normally think of in R^n
 */
public class Vector implements GenericVector {

  private double[] entries; // the contents of the vector

  /**
   * constructs an object of type vector in r^n the size is determined by the length in the array
   * 
   * @param entries
   */
  public Vector(double[] entries) {
    for (int i = 0; i < entries.length; i++) {
      this.entries[i] = entries[i];
    }
  }



  /**
   * allows access to the contents of the Vector, uses the math precedent of the first entry being
   * entry 1
   * 
   * @param i - the index + 1 of the part of the vector in question, the entry subscript in math
   * @return the entry at the ith position in the vector
   * @throws illegalargument exception if the entry number is not valid
   */
  public double getEntry(int i) {
    if (i <= entries.length && i > 0) {
      return entries[i - 1];
    } else {
      throw new IllegalArgumentException("Index not allowed");
    }
  }

  /**
   * sets the value of the ith entry
   * 
   * @param i - the entry with 1 being the first entry
   * @param entry - the value being entered
   * @throws IllegalArgumentException if the entry number is not within bounds
   */
  public void setEntry(int i, double entry) {
    if (i <= entries.length && i > 0) {
      entries[i - 1] = entry;
    } else {
      throw new IllegalArgumentException("Index not allowed");
    }
  }

  /**
   * the number of entries in the vector, also the dimension
   * 
   * @return the number of entries in the 
   */
  public int size() {
    return entries.length;
  }


}
