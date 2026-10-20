package InterviewQuestionPractice.ReuaseableUsingFunctionalInterface;

class Main {

    public static void main(String[] args) {
        CalculateUsingLemda calculateUsingLemda = new CalculateUsingLemda();
        System.out.println("Even Numbers");
        calculateUsingLemda.calculate(new int[] {1,2,4,5,6,7,7}, x->x%2 ==0);
        System.out.println();
        System.out.println("Odd No's");
        calculateUsingLemda.calculate(new int[] {2,4,6,3,4,57,4}, x->x%2!=0);

        System.out.println("Mapping into Calculator");
        CalculateUsingPremitiveLemdaMap.CalculateWithMap(new int[]{2,3,6,7,8,5,3,6,7,6,4},x->x%2==0, y->y*y);
    }
}