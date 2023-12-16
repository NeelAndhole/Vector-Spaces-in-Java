/**
 * the vector space of R^n
 */
public class VectorSpaceRn implements InnerProductSpace<Vector> {

  int dimension;// the n in R^n


  /**
   * constructs a new vector space in Rn object
   * 
   * @param dim - the number of dimensions in the vector space
   */
  public VectorSpaceRn(int dim) {
    if (dimension < 0) {
      throw new IllegalArgumentException("Dimension is not valid");
    }
    dimension = dim;
  }

  /**
   * Multiplies the vector by the scalar using normal vector multiplication rules
   * 
   * @param scalar - a number in R1 that scales the vector
   * @param vector - the vector being scaled
   * @return new vector scaled by the scalar
   * @throws Illegal argument exception when the vector does not fit the space
   */
  public Vector scalarMultiplication(double scalar, Vector vector) {
    if (vector.size() != this.dimension) {
      throw new IllegalArgumentException("Vector does not belong in this space");
    }
    Vector newVector = new Vector(new double[vector.size()]);
    for (int i = 1; i <= vector.size(); i++) {
      newVector.setEntry(i, scalar * vector.getEntry(i));
    }
    return newVector;
  }

  /**
   * Adds two vectors together that belong to this vector space
   * 
   * @param vector1 - the first vector
   * @param vector2 - the second vector being added to the first
   * @return the addition of the two vectors
   * @throws Illegal argument exception if either vector does not fit in the space
   */
  public Vector vectorAddition(Vector vector1, Vector vector2) {
    if (vector1.size() != this.dimension || vector2.size() != this.dimension) {
      throw new IllegalArgumentException("Vectors cannot be added in this space");
    }
    Vector newVector = new Vector(new double[this.dimension]);
    for (int i = 1; i <= this.dimension; i++) {
      newVector.setEntry(i, vector1.getEntry(i) + vector2.getEntry(i));
    }
    return newVector;
  }

  /**
   * returns the 0 vector within the vector space
   * 
   * @return the 0 vector
   */
  public Vector get0vector() {
    return new Vector(new double[this.dimension]);
  }

  
  /**
   * Returns the inner product of two vectors in this space, This is the standard dot product
   * 
   * @return the inner product of the two vectors
   * @throws IllegalArgumentException if either vector does not work
   */
  public double innerProduct(Vector vector1, Vector vector2) {
    if (vector1.size() != this.dimension || vector2.size() != this.dimension) {
      throw new IllegalArgumentException("Vectors cannot be added in this space");
    }
    double sum = 0;
    for(int i=1; i<=this.dimension;i++) {
      sum += vector1.getEntry(i) * vector2.getEntry(i);
    }
    return sum;
  }

}
