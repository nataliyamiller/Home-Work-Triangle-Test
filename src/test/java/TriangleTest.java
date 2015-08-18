import org.junit.*;
import static org.junit.Assert.*;

public class TriangleTest {

  @Test
  public void newTriangle_instantiatesCorrectly() {
    Triangle testTriangle = new Triangle(4, 4, 3);
    assertEquals(true, testTriangle instanceof Triangle);
  }

  @Test
  public void newTriangle_setsLength() {
    Triangle testTriangle = new Triangle (2, 3, 4);
    assertEquals(2, testTriangle.getLength());
  }

  @Test
  public void newTriangle_setsWidth() {
    Triangle testTriangle = new Triangle (2, 3, 4);
    assertEquals(3, testTriangle.getWidth());
  }

  @Test
  public void newTriangle_setsHeight() {
    Triangle testTriangle = new Triangle (2, 3, 4);
    assertEquals(4, testTriangle.getHeight());
  }

  @Test
  public void newTriangle_isActuallyATriangle_false() {
    Triangle testTriangle = new Triangle(2, 2, 8);
    assertEquals(false, testTriangle.isTriangle());
  }

  @Test
  public void newTriangle_isActuallyATriangle_true() {
    Triangle testTriangle = new Triangle(2, 2, 3);
    assertEquals(true, testTriangle.isTriangle());
  }

  @Test
  public void newTriangle_isEquilateral_true() {
    Triangle testTriangle = new Triangle (2, 2, 2);
    assertEquals(true, testTriangle.isEquilateral());
  }

  @Test
  public void newTriangle_isEquilateral_false() {
    Triangle testTriangle = new Triangle (3, 3, 4);
    assertEquals(false, testTriangle.isEquilateral());
  }

  @Test
  public void newTriangle_isIsoceles_true() {
    Triangle testTriangle = new Triangle (2, 2, 3);
    assertEquals(true, testTriangle.isIsosceles());
  }

  @Test
  public void newTriangle_isIsoceles_false() {
    Triangle testTriangle = new Triangle (2, 2, 2);
    assertEquals(false, testTriangle.isIsosceles());
  }

  @Test
  public void newTriangle_isAnIsoceles_false() {
    Triangle testTriangle = new Triangle (2, 2, 8);
    assertEquals(false, testTriangle.isIsosceles());
  }

  @Test
  public void newTriangle_isScalene_false() {
    Triangle testTriangle = new Triangle (2, 2, 8);
    assertEquals(false, testTriangle.isScalene());
  }

  @Test
  public void newTriangle_isAScalene_false() {
    Triangle testTriangle = new Triangle (2, 2, 2);
    assertEquals(false, testTriangle.isScalene());
  }

  @Test
  public void newTriangle_isActuallyAScalene_true() {
    Triangle testTriangle = new Triangle (2, 3, 4);
    assertEquals(true, testTriangle.isScalene());
  }



}
