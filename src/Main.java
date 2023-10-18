import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner leitura = new Scanner(System.in);
            int i = 0;
            while (i == 0) {
                System.out.println("Digite até 8 números de 0 a 1, que podem ser intercalados ou não");
                String numeros = leitura.next();
                    if (numeros.length() <= 8) {

                            try {
                                int decimal = Integer.parseInt(numeros, 2);
                                System.out.println(decimal);
                            } catch (Exception e) {
                                System.out.println("Caractere inválido");
                            }
                        }else{
                        System.out.println("Ultrapassou a quantidade de caracteres!");
                    }

                System.out.println("Gostaria de parar o programa? 2 para sim e 3 para não");
                Integer decisao = leitura.nextInt();
                if (decisao == 2){
                    break;
                }

            }
        System.out.println("Programa finalizado com sucesso!");

        }

    }
