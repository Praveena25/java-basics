package inheritance;

public class Demotaxation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Gst gst=new Gst();
        int tax =gst.calculateTax(11000);
        System.out.println("tax is "+tax);
	}

}
