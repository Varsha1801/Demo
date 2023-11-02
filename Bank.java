package day2;
class Banks {
    int Reg_no;
    String Loc;
    
    //method to print info
    public void printInfo(){
        System.out.println(this.Reg_no);
        System.out.println(this.Loc);
    }
}

public class Bank {

	public static void main(String[] args) {
		Banks e1 = new Banks();
        e1.Reg_no=101;
        e1.Loc="Bangalore";
 
        //method call
        e1.printInfo();

	}

}
