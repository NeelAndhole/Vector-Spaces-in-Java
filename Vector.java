/**
 * Generic interface that defines the types of objects that can be held within vector spaces.
 * 
 * @author Neel R Andhole
 */
public interface Vector {
  /**
   * checks for equality
   * @param other
   * @return
   */
  @Override
  public boolean equals(Object other);
  
  /**
   * Generates a random vector for testing purposes
   * 
   * @return - a random vector
   */
  public Vector randomVector();
}
