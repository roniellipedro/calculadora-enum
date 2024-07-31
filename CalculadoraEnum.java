package groner.calculadoraEnum;

public class CalculadoraEnum {

    public enum OperacaoMatematica {

        SOMAR('+') {
            @Override
            public double executarOperacao(double x, double y) {
                return x + y;
            }
        }, SUBTRAIR('-') {
            @Override
            public double executarOperacao(double x, double y) {
                return x - y;
            }
        }, MULTIPLICAR('*') {
            @Override
            public double executarOperacao(double x, double y) {
                return x * y;
            }
        }, DIVIDIR('/') {
            @Override
            public double executarOperacao(double x, double y) {
                return x / y;
            }
        };

        private final char SIMBOLO;

        OperacaoMatematica(char SIMBOLO) {
            this.SIMBOLO = SIMBOLO;
        }

        public static void main(String[] args) {

            for (OperacaoMatematica operacao : OperacaoMatematica.values()) {
                double x = 32;
                double y = 58;

                System.out.print(x + " " + operacao + " " + y + " = ");
                System.out.println(operacao.executarOperacao(x, y));
            }

        }

        public abstract double executarOperacao(double x, double y);

        @Override
        public String toString() {
            return String.valueOf(SIMBOLO);
        }


    }
}