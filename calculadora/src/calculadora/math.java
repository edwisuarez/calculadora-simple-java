package calculadora;

public class math {

    public math(){}

    protected int numeroUno;
    protected int numeroDos;

    public int sum(int numeroUno, int numeroDos)
    {
        return numeroUno + numeroDos;
    }
    public int rest(int numeroUno, int numeroDos)
    {
        return numeroUno - numeroDos;
    }

    public int div(int numeroUno, int numeroDos)
    {
       return numeroUno / numeroDos;
    }

    public int multiply(int numeroUno, int numeroDos)
    {
        return numeroUno * numeroDos;
    }

}
