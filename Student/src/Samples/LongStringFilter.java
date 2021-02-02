package Samples;

class LongStringFilter implements Filter {
@Override
public boolean accept(String x) {
   return x.length() > 5;
   }
}
