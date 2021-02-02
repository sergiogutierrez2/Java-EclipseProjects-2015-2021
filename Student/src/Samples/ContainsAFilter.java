package Samples;

class ContainsAFilter implements Filter {
@Override
public boolean accept(String x) {
   return x.contains("a") || x.contains("A");
   }
}
