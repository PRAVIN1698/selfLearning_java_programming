public class Constructor {



    private String song;
    private double creditlimit;

    public Constructor(String song,Double creditlimit) {
        this.song = song;
        this.creditlimit=creditlimit;

    }



    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public double getCreditlimit() {
        return creditlimit;
    }

    public void setCreditlimit(double creditlimit) {
        this.creditlimit = creditlimit;
    }









}
