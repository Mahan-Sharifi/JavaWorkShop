package com.company;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) {
	    Scanner scanner=new Scanner(System.in);
	    int i;
	    double sum=0;
	    InstituteQuiz user=new InstituteQuiz();
		List <Object> list=new ArrayList<>();
		int O=0;
	    for(i=1;i<=3;i++){
			System.out.format("Enter the %dth firstname :",i);
			System.out.println();
	        user.setFirstName(scanner.next());
	        list.add(user.getFirstName());

			System.out.format("Enter the %dth lastname :",i);
			System.out.println();
			user.setLastName(scanner.next());
			list.add(user.getLastName());

			System.out.format("Enter the %dth nationalCode :",i);
			System.out.println();
	        user.setNationalCode(scanner.nextInt());
	        list.add(user.getNationalCode());

			System.out.format("Enter the %dth taraz :",i);
			System.out.println();
	        user.setTaraz(scanner.nextDouble());
	        list.add(user.getTaraz());

			System.out.format("Enter the %dth educationString :",i);
			System.out.println();
			user.setEducationString(scanner.next());
			list.add(user.getEducationString());
        }
        for (Object s : list ) {
            System.out.println(s);
        }
    }
}
