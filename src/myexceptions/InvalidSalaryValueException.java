package myexceptions;

public class InvalidSalaryValueException extends Exception {
    public InvalidSalaryValueException(String message) {
        super(message);
    }
}

/*
try {
            System.out.println(askAge(17));
        }catch (My1UncheckedException e){
            System.out.println(e.toString());
        }
    }


    public static int divide(int a, int b) throws My1CheckedException {
        if (b==1)
            throw new My1CheckedException("impossible My1CheckedException");

        return a/b;
    }
 */
