class Main {
  public static int variable(int varable, int vargh){
    double varr = Math.floor(Math.random()*(vargh-varable));
    int vaar = (int) varr+varable;
    if(vaar==127||vaar==173||vaar==129||vaar==141||vaar==143||vaar==144||vaar==157||vaar==160||vaar==129){
      return (int) 126;
    }else{
      return (int) varr+varable;
    }
  }
  public static String varyiable(int v){
    return String.valueOf(Character.toChars(v));
  }
  public static void main(String[] args) {
    String input="pekoe{ruby_black_39k8ds}";
    String varible="";
    for(int i=0; i<input.length(); i++){
      varible+=input.charAt(i)+varyiable(variable(32,250));
    }
    input=varible;
    varible="";
    for(int i=0; i<input.length(); i++){
      varible+=varyiable((int) input.charAt(i)+3);
    }
    System.out.println(varible);
  }
}