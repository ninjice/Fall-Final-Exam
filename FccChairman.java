

public class FccChairman
{
    //instance variables 
    private String name;
    private boolean bad;
    
    //static variable
    public static String organization = "Fcc";
    
    public FccChairman(String nm, boolean bd)
    {
        this.name = nm;
        this.bad = bd;
    }
    
    //setter for name
    public void changeName(String newName){
        this.name = newName;
    }
    
    //getter for name
    public String getName(){
        return name;
    }
    
    //setter for bad
    public void doSomething(boolean dumb){
        this.bad = dumb;
    }
    
    //getter for bad
    public boolean checkIfBad(){
        return bad;
    }
    
    public void endNetNeutrality(){
        this.bad = true;
    }
    
    public String insultToInjury(){
        return "7 Things You Can Still Do After Net Neutrality";
    }
    
    public String toString(){
        return(this.name + " is chairman of the " + organization + " and is " + this.bad);
    }
}
