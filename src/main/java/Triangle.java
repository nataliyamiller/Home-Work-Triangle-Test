public class Triangle {

  private int mLen;
  private int mWid;
  private int mHgt;

  public Triangle (int length, int width, int height) {
    mLen = length;
    mWid = width;
    mHgt = height;
  }

  public int getLength() {
    return mLen;
  }

  public int getWidth() {
    return mWid;
  }

  public int getHeight() {
    return mHgt;
  }

  public boolean isTriangle() {
    return ((mLen + mWid > mHgt) && (mLen + mHgt > mWid) && (mWid + mHgt > mLen));
  }
}
