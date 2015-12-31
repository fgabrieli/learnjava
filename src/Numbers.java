import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class BubbleSort implements MySort {
  private int[] recursiveSort(int[] numbers) {
    int idx = 0;
    boolean swapped = false;
    
    while(idx < numbers.length - 1) {
      if (numbers[idx] > numbers[idx + 1]) {
        int temp = numbers[idx];
        numbers[idx] = numbers[idx + 1];
        numbers[idx + 1] = temp;
        
        // swap
        swapped = true;
      }
      
      idx ++;
    }
    
    if (swapped) {
      numbers = recursiveSort(numbers);
    }

    return numbers;
  }
  
  public int[] sort(int[] numbers) {
    System.out.println("Using BubbleSort");
    
    return recursiveSort(numbers);
  }
}

class InsertSort implements MySort {
  public int[] sort(int[] numbers) {
    System.out.println("Using InsertSort");
    
    List<Integer> sorted = new LinkedList<Integer>();
    
    for (int i = 0 ; i < numbers.length; i++) {
      Iterator<Integer> listIterator = sorted.iterator();
      if (sorted.size() == 0) {
        sorted.add(Integer.valueOf(numbers[i]));
      } else {
        int pos = 0;
        while (listIterator.hasNext()) {
          Integer number = listIterator.next();
          if (Integer.valueOf(numbers[i]) <= number) {
            break;
          }
          
          pos++;
        }
        
        Integer newNumber = Integer.valueOf(numbers[i]);
        sorted.add(pos, newNumber);
      }
    }

    int sortedInts[] = new int[sorted.size()];
    Iterator<Integer> it = sorted.iterator();
    int i = 0;
    while(it.hasNext()) {
      sortedInts[i++] = it.next();
    }
    
    return sortedInts;
  }
}


class Numbers {
  private static MySort sorter = new InsertSort();
  
  private static int[] createNumbers() {
    int[] myNumbers = new int[6];
    
    myNumbers[0] = 10;
    myNumbers[1] = 12;
    myNumbers[2] = 4;
    myNumbers[3] = 1;
    myNumbers[4] = 3;
    myNumbers[5] = 5;

    return myNumbers;
  }
  
  private static void runSort() {
    int[] myNumbers = createNumbers();

//    InsertSort sorter = new InsertSort();
    int[] sortedNumbers = sorter.sort(myNumbers);
    
    for (int i = 0; i < sortedNumbers.length; i++) {
      System.out.println(sortedNumbers[i]);
    }
  }
  
  public static void main(String[] args) {
    runSort();
  }
}