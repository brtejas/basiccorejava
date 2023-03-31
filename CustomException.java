public class CustomException{
    public void validate(int age )throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Not Eligible for Voting");
        }
        else{
            System.out.println("Welcome to vote....!!!");
        }
    }
    public static void main(String[] args){
        try{
            CustomException ce=new CustomException();
            ce.validate(21);
        }catch(InvalidAgeException iae){
            System.out.println("Exception caught");
        }
    }


    }
