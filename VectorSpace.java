


/**
 * Generic interface that represents a Vector space
 * 
 * Sources:
 * 
 * https://www.math.ucla.edu/~tao/resource/general/121.1.00s/vector_axioms.html
 * 
 * the source of the vector space axioms
 * 
 * @param <T> - the vectors in question
 * @author Neel R Andhole
 */
public interface VectorSpace<T extends GenericVector> {

  /**
   * 
   * This defines the vector addition according to the specifications of the specific space
   * 
   * <pre>
   * Additive axioms : given x y and z are vectors in Vector Space 
   *  + represents vector addition and * represents scalar Multiplication
   * 
   *  x + y = y + x
   *  (x + y) + z = x + (y+z)
   *  0 + x = x + 0 = x
   *  (-1 * x) + x = x + (-1 * x) = 0
   *  
   *  Distributive axioms : given x and y in the vector space and c and d are scalars
   *  c * ( x + y ) = c * x + c * y
   *  ( c + d ) * x = c * x + d * x
   * 
   * </pre>
   * 
   * @param vector1 - the first vector
   * @param vector2 - the second vector
   * @return a new vector, the addition of the two vectors within the vector space
   */
  public T vectorAddition(T vector1, T vector2);


  /**
   * This defines the scalar multiplication property of the vector space.
   * 
   * <pre>
   * Multiplicative axioms : given x and y are vectors in Vector Space and real number scalars c 
   * and d
   *  + represents vector addition and * represents scalar Multiplication
   *  0 * x = 0
   *  1 * x = x
   *  (cd) * x = c * (d * x)
   *  
   *  Distributive axioms : given x and y in the vector space and c and d are scalars
   *  c * ( x + y ) = c * x + c * y
   *  ( c + d ) * x = c * x + d * x
   * 
   * </pre>
   * 
   * @param scalar - the multiplier
   * @param vector - the vector being scaled
   * @return a new vector, the scalar multiplication
   */
  public T scalarMultiplication(double scalar, T vector);

  /**
   * defines the 0 vector within the type
   * 
   * @return the 0 vector
   */
  public T get0vector();

  
  
}
