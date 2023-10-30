package homework_nr_12;

import java.util.function.Predicate;

    public enum CheckInteger {


        CHECK_IF_ODD((x) -> (Integer) (x % 2) != 0),
        CHECK_IF_EVEN((x) -> (Integer) (x % 2) == 0),
        CHECK_IF_POSITIVE((x) -> (Integer) (x) > 0),
        CHECK_IF_NEGATIVE((x) -> (Integer) (x) < 0);


        private final Predicate <Integer> checker;


        CheckInteger(Predicate<Integer> checker) {
            this.checker = checker;
        }

        public Predicate<Integer> getChecker() {
            return checker;
        }

        public static void main(String... args) {
            int x = -2;

            checkNumberAndPrint(x, CheckInteger.CHECK_IF_ODD);
            checkNumberAndPrint(x, CheckInteger.CHECK_IF_EVEN);
            checkNumberAndPrint(x, CheckInteger.CHECK_IF_POSITIVE);
            checkNumberAndPrint(x, CheckInteger.CHECK_IF_NEGATIVE);

        }
            public static void checkNumberAndPrint ( int x, CheckInteger checker ){
                System.out.println("The result of testing number for " + checker + " is: " + checker.getChecker().test(x));
            }
        }
