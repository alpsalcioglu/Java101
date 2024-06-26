public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;


    Match(Fighter f1,Fighter f2,int minWeight,int maxWeight){
        this.f1 =f1;
        this.f2 =f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;

    }

    void run(){
        if(isCheck()){
            while (this.f1.health > 0 && this.f2.health > 0){
                System.out.println("--------> New Round <--------");
                this.f2.health = this.f1.hit(f2);
                if(isWin()){
                    break;
                }
                this.f1.health = this.f2.hit(f1);
                if(isWin()){
                    break;
                }
                System.out.println("\t\t\tA Health: " + this.f1.health);
                System.out.println("\t\t\tB Health: " + this.f2.health);
                //System.out.println("-----------------------------");

            }
        }else{
            System.out.println("Weight of the fighters does not match!");
        }

    }

    boolean isCheck(){
        return(this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >=minWeight && this.f2.weight <= maxWeight);
    }
    boolean isWin(){
        if(this.f1.health == 0){
            System.out.println("-------> Match Result <------");
            System.out.println("\t " + this.f2.name + " has won the match!");
            return true;
        }
        if(this.f2.health ==0){
            System.out.println("-------> Match Result <------");
            System.out.println("\t " + this.f1.name + " has won the match!");
            return true;
        }else{
            return false;
        }
    }


}
