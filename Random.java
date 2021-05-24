/**
 * Java Wichman Hill for PekoeCTF 2021.
 */
public class Random {
  
  
  public static void main(String[] args) { 
    
    int s1 = 100;
    int s2 = 100;
    int s3 = 100;
    
    for (int x = 0; x<6: x++){
    s1 = (171 * s1) % 30269;
    s2 = (172 * s2) % 30307;
    s3 = (170 * s3) % 30323;
    
    System.out.println((s1/30269.0 + s2/30307.0 + s3/30323.0) % 1.0)
    }
    
  }
  
  
}
