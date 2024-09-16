public class Fraction implements Comparable<Fraction>
{
    private final long top;
    private final long bottom;

    public Fraction(long numerator, long denominator) {
        top = numerator;
        bottom = denominator;
    }

    @Override
    public int hashCode() { return 17 * Long.hashCode(top) + Long.hashCode(bottom); }    
    @Override
    public boolean equals(Object o) { return compareTo((Fraction)o) == 0; }    
    @Override
    public int compareTo(Fraction f2){ return Long.compare(top * f2.bottom, f2.top * bottom); }
    
    // Your work here!

    //Add two fractions
    public Fraction add(Fraction f2) {
      long newTop = (this.top * f2.bottom) + (f2.top * this.bottom);
      long newBottom = this.bottom * f2.bottom;
      Fraction newFrac = new Fraction(newTop, newBottom);
      return simplify(newFrac);
    }
    
    public Fraction simplify(Fraction frac) {
      for (long i = frac.bottom; i > 0; i -= 1) {
        if (frac.top % i == 0 && frac.bottom % i == 0) {
          long newTop = frac.top / i;
          long newBottom = frac.bottom / i;
          return new Fraction(newTop, newBottom);
        }
      }
      return frac;
    }
    
    //...and make this class string representable
    public String toString() {
      StringBuilder str = new StringBuilder();
      str.append(this.top);
      str.append("/");
      str.append(this.bottom);
      return str.toString();
    }
}
