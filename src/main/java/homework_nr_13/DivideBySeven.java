package homework_nr_13;


public class DivideBySeven {

    int inferiorLimit;
    int superiorLimit;

    public DivideBySeven(int inferiorLimit, int superiorLimit) throws DivideException {
        this.superiorLimit = superiorLimit;
        this.inferiorLimit = inferiorLimit;
        if (this.inferiorLimit > this.superiorLimit)
            throw new DivideException("Superior limit can not be less then inferior, please retype");
    }

    public static class DivideException extends Exception {
        public DivideException(String message) {
            super(message);
        }
    }

    public static DivideBySeven countDivisionBySevenNumbers(int inferiorLimit, int superiorLimit) throws DivideException {
        if (inferiorLimit > superiorLimit)
            throw new DivideException("Superior limit can not be less then inferior, please retype");
        {
            int j = 0;
            for (int i = inferiorLimit; i <= superiorLimit; i++) {
                if ((i % 7) == 0)
                {
                    j++;
                    System.out.println(i);
                }
            }
            System.out.println("There is total " + j + " numbers in given range that divided by 7 ");
            return null;
        }
    }

    public static void main(String[] args) throws DivideException {
        DivideBySeven d1 = countDivisionBySevenNumbers(-5, -50);
        DivideBySeven d2 = countDivisionBySevenNumbers(20, 400);
    }
}