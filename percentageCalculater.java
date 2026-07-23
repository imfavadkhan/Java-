class percentageCalculater{
     public static void main(String[] args){
    
     calculatePercentage();  
    }

    public static void calculatePercentage(){
        int subj1 = 89;
        int subj2 = 56;
        int subj3 = 97;
        int subj4 = 83;
        int subj5 = 40;
        int sum = subj1+subj2+subj3+subj4+subj5;
        float percentage = sum/500.0f*100;
        System.out.println("The percentage of the student in five subjects is :"+percentage+"%");
    }
}

