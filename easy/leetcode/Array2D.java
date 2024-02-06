package easy.leetcode;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

// 1 1 1 0 0 0
// 0 1 0 0 0 0
// 1 1 1 0 0 0
// 0 0 2 4 4 0
// 0 0 0 2 0 0
// 0 0 1 2 4 0

//  0 -4 -6  0 -7 -6
// -1 -2 -6 -8 -3 -1
// -8 -4 -2 -8 -8 -6
// -3 -1 -2 -5 -7 -4
// -3 -5 -3 -6 -6 -6
// -3 -6  0 -8 -6 -7

public class Array2D {

  public static int hourglassSum(final List<List<Integer>> arr) {
    int filtroLinhas = 3;
    int filtroColunas = 3;

    int arrLinhas = arr.size();
    int arrColunas = arr.get(0).size();

    int valorMaximo = 0;
    
    for (int i = 0; i <= arrLinhas - filtroLinhas; i++) {
      for (int j = 0; j <= arrColunas - filtroColunas; j++) {
        
        int somaValores = -10000;

        for (int ii = 0; ii < filtroLinhas; ii++) {
          for (int jj = 0; jj < filtroColunas; jj++) {

            int elemento = arr.get(i + ii).get(j + jj);

            if (!(ii == 1 && (jj == 0 || jj == 2))) {
              somaValores += elemento;
            }
          }
        }
        
        somaValores -= arr.get(i + 1).get(j) + arr.get(i + 1).get(j + 2);

        valorMaximo = Math.max(valorMaximo, somaValores);
      }
    }

    return valorMaximo;
  }

  public static void main(String[] args) throws IOException {
    final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    final BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    final List<List<Integer>> arr = new ArrayList<>();

    IntStream.range(0, 6).forEach(i -> {
      try {
        arr.add(
          Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList())
        );
      } catch (final IOException ex) {
        throw new RuntimeException(ex);
      }
    });

    final int result = hourglassSum(arr);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
  }
  
}
