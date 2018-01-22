

public class Internet
{
    //instance variables
    private boolean netNeutrality;
    //uses FccChairman as instance variable
    private FccChairman chairman;
    
    //constructor
    public Internet(FccChairman chair, boolean nn)
    {
        //innitializes instsance variables 
        this.netNeutrality = nn;
    }
    
    //setter for netNeutrality
    public void setNetNeut(boolean bool){
        this.netNeutrality = bool;
    }
    
    
}

