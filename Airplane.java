class Airplane{

  String name;
  String modell;
  int maxSpeed;


  public Airplane(){
    this.name = "Oldenburg";
    this.modell = "A380";
    this.maxSpeed = 500;
  }

  public Airplane(String name, String modell, int maxSpeed ){
    this.name = name;
    this.modell = modell;
    this.maxSpeed = maxSpeed;
  }

  public void fly(int speed){
    if(this.maxSpeed >= speed){
        printf("Flugzeug %s fliegt %d mph.", this.name, speed);
    } else{
        printf("Zu schnell! Flugzeug %s darf nur maximal %d mph fliegen.", this.name, this.maxSpeed);
    }
  }

  public static void flyAll(Airplane[] planes){
    for (int i = 0; i < planes.length; i++){
      if(planes[i] != null){
        planes[i].fly(1000);
        printf("\n");
      }
    }
  }

}
