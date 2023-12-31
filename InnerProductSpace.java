/**
 * Generic interface that represents a Vector space with an inner product
 * @author Neel R Andhole
 * 
 * @param <T> - the vectors in question
 */
public interface InnerProductSpace<T extends GenericVector> extends VectorSpace<T> {

  /**
   * This function takes two vectors and gives a scalar as the result.
   * <pre>
   * 
   * x, y, z are generic vectors in the space, c is a scalar
   * 
   * <x,y> is innerproduct(x,y)
   * 1. <x,y> = <y,x>
   * 2. <x,y+z> = <x,y> + <x,z>
   * 3. <cx,y> = c<x,y>
   * 4. <x,x> > = 0 && <x,x> == 0 IFF x = zero vector
   * 
   * </pre>
   * 
   * @param vector1
   * @param vector2
   * @return - a scalar that results from the defined inner product
   */
  public double innerProduct(T vector1, T vector2);
  
  
  /**
   * this function returns the norm of the vector parameter
   * 
   * @param vector1 - the vector whose norm/length needs to be found
   * @return the scalar that results from getting the norm of the vector.
   */
  public default double norm(T vector1) {
    return Math.sqrt(innerProduct(vector1, vector1));
  }

  /**
   * takes two vectors and returns the "angle" between the vectors follows the formula
   * 
   * <pre>
   * 
   *                   <v, w>
   * cosine( x ) = _____________
   *               ||v|| * ||w||
   * 
   * </pre>
   * 
   * @param vector1
   * @param vector2
   * @return - the angle between the two vectors between 0 and pi
   */
  public default double angleBetween(T vector1, T vector2) {
    return Math.acos(innerProduct(vector1, vector2) / (norm(vector1) * norm(vector2)));
  }
  
  /**
   * 
   * @param vector1
   * @param vector2
   * @return
   */
  public default boolean isOrthogonal(T vector1, T vector2) {
    return innerProduct(vector1,vector2) == 0;
  }

}
