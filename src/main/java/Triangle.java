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

  public boolean isEquilateral() {
    if(isTriangle()) {
      return ((mLen == mWid) && (mWid == mHgt));
    }
    else {
      return false;
    }
  }

    public boolean isIsosceles() {
      if(!isTriangle()) {
        return false;
      } else {
        if (isEquilateral()) {
          return false;
        } else {
          return ((mLen == mWid) || (mLen == mHgt) || (mWid == mHgt));
        }
      }
    }

    public boolean isScalene() {
      if(!isTriangle()) {
        return false;
      } else {
        if (isEquilateral() || isIsosceles()) {
          return false;
        } else {
          return true;
        }
      }
    }

}
