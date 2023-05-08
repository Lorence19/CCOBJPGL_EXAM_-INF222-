package Tourists;


import Locations.*;

public class Lorence implements Tourist {

    static int budget = 1000;


    public void visit() {
        System.out.print("enjoy my rest day");
    }

    public void visit(Boracay boracay) {
        System.out.println("my budget is" + getBudget());

        if ( budget > boracay.airFare  ){
            System.out.println("tara gala" );
            budget -= boracay.airFare;

        }else{
            System.out.println("omg wala nako pera");
        }

      checkBudget();

    }

    public void visit(Bohol bohol) {

        if(budget >bohol.airFare){
            System.out.println("lets go to bohol");
            budget -= bohol.airFare;
        }else{
            System.out.println("I have no money left");
        }

        checkBudget();
    }
    public void visit(Cebu cebu) {
        if(budget >cebu.airFare){
            System.out.println("lets go to cebu!");
            budget -= cebu.airFare;
        }else{
            System.out.println("im broke na");
        }

        checkBudget();
    }

    public void visit(Palawan palawan) {
        if(budget >palawan.airFare){
            System.out.println("lets g palawan!");
            budget -= palawan.airFare;
        }else{
            System.out.println("ubos na money ko");
        }

        checkBudget();
    }

    public void visit(Siargao siargao) {
        if(budget >siargao.airFare){
            System.out.println("lets go to siargao!");
            budget -= siargao.airFare;
        }else{
            System.out.println("shesh im broke na");
        }

        checkBudget();
    }

    public void visit(Vigan vigan) {
        if(budget >vigan.airFare){
            System.out.println("lets go to vigan! ");
            budget -= vigan.airFare;
        }else{
            System.out.println("wala na me money huhu");
        }

        checkBudget();
    }

    public void checkBudget() {
        System.out.println("my budget is " + budget);
    }

    public static int getBudget() {
        return budget;
    }


}