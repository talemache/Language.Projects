class Motorcycle{
    String make;
    String color;
    boolean engineState;

// checks engine state or turns on engine
void startEngine(){
    if (engineState == true)
        System.out.println("the engine is already on.");
    else{
        engineState = true;
        System.out.println("The engine is now on.");
    }
}

// shows the color and make and whether it is on or off
void showAtts(){
    System.out.println("This motorcycle is a "
        + color + " " + make);
    if (engineState == true)
        System.out.println("The engine is one.");
    else{
        System.out.println("The engine is off.");
    }
}

}


public static void main (Stirng args[]){
    Motorcycle m = new Motorcycle();
    
    m.make = "Yamaha RZ350";
    m.color = "yellow";
    
    System.out.println("Calling showAtts...");
    m.showAtts();
    System.out.println(".......");
    
    System.out.println("Starting engine...");
    m.startEngine();
    System.out.println(".......");
    
    System.out.println("Calling showAtts...");
    m.showAtts();
    System.out.println(".......");
    
    System.out.println("Starting engine...");
    m.startEngine();
}
