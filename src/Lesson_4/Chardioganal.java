package Lesson_4;

public class Chardioganal {
    public static void main(String[] args) {
        char[][] matrix = {{'A', 'B', 'C',},
                           {'D', 'E', 'F',},
                            {'G', 'H', 'I',}


        };
        System.out.println("Character matrix::");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");


            }

            System.out.println();
        }
        System.out.println("Diagonal character 1 ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }

        System.out.println();
        System.out.println("Diagonal Character 2::");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][matrix.length - 1 - i] + " ");
        }

    }


}

