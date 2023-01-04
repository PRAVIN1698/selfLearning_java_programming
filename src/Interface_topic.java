public class Interface_topic implements ittelephone_interfacetopic{


    private int number;
    private boolean isRinging;

    public Interface_topic(int number) {
        this.number = number;
    }





    @Override
    public void poweron() {
        System.out.println("No action taken,desk phone does not have a power button");

    }

    @Override
    public void dial(int phonenumber) {
     System.out.println("Now Ringing" + phonenumber+" on deskphone");

    }

    @Override
    public void answer() {
             if(isRinging){
                 System.out.println("Answering the desk phone");
                 isRinging=false;

             }
    }

    @Override
    public boolean callphone(int phonenumber) {
        if(phonenumber== number){
            isRinging=true;
            System.out.println("Ring ring");
        }else{
            isRinging=false;
        }

        return isRinging;

    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}















