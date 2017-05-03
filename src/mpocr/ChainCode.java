class ChainCode extends FeatureSet
{
  static int width;
  static int height;
  public int Sheight,Swidth;
  private double [] code;
  public Segment s;
  public enum direction {NORTH,SOUTH,EAST,WEST,NORTHEAST,NORTHWEST,SOUTHEAST,SOUTHWEST};
  int [][3] mask;
  public ChainCode(Segment s)
  {
    this.s=s;
    Swidth=s.getWidth();
    Sheight=s.getHeight();
    getChainCode(s);    
}
public void getChainCode()
for(int i=1;i<Sheight;i++){
  for(int j=1;j<Swidth;j++){
      
  
  }
}



}
