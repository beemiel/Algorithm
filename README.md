# Algorithm
R고리thm

> [완주하지 못한 선수](https://programmers.co.kr/learn/courses/30/lessons/42576)  

배열을 정렬한 다음 두 배열을 비교
<pre><code>
    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        for(int i = 0; i < completion.length; i++){
            if (!participant[i].equals(completion[i])){
                return participant[i];
            }else {
                answer = participant[completion.length];
            }
        }

        return answer;
    }
</code></pre>
***

> [정수 뒤집기](https://leetcode.com/problems/reverse-integer/)  

먼저 input값이 음수일 경우 양수로 변환한 다음 String으로 변환한다.  
그리고 문자열을 뒤집어 준 다음 int로 변환해서 부호를 곱해 반환한다. 
<pre><code>
    public static int reverse(int x) {
        String inputToString ="";
        String returnString = "";
        int minus = 1;

        if(x<0){
            minus = -1;
            x *= -1;
        }

        inputToString = Integer.toString(x);
        returnString = "";

        for(int stringChar=inputToString.length(); stringChar>0; stringChar--){
            returnString += inputToString.charAt(stringChar-1);
        }

        return (Integer.parseInt(returnString)*minus);
    }
</code></pre>

***

> [K번째수](https://programmers.co.kr/learn/courses/30/lessons/42748)  

1. 반복문으로 이중배열 commands에 있는 명령어들을 뺀다  
2. 배열을 잘라준다  
3. 정렬해준다  
4. k번째 수를 찾아서 반환할 배열에 담아준다  
<pre><code>
    public int[] k(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i"<"commands.length; i++){
            int[] command = commands[i];

            //자른 배열
            int[] newArray = Arrays.copyOfRange(array, command[0]-1, command[1]);

            //정렬
            Arrays.sort(newArray);

            //K번째 수
            int index = command[2]-1;
            answer[i] = newArray[index];

        }

        return answer;
    }
</code></pre>

***

> [수 정렬하기 3](https://www.acmicpc.net/problem/10989)  

중간 값을 정한 후 큰 수와 작은 수들만 각각 모아서 좌우로 정렬한 다음 
low와 high의 값이 같거나 low가 클 때까지 재귀적으로 sort함수를 호출한다  

<pre><code>
public class QuickSort {

    public static void quickSort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private static void sort(int[] arr, int low, int high) {
        if (low >= high) return;
 
        int mid = partition(arr, low, high);
        sort(arr, low, mid - 1);
        sort(arr, mid, high);
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[(low + high) / 2];
        while (low <= high) {
            while (arr[low] < pivot) low++;
            while (arr[high] > pivot) high--;
            if (low <= high) {
                swap(arr, low, high);
                low++;
                high--;
            }
        }
        return low;
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = {0,6,3,5,8,2,9,1,4,7};
        Arrays.stream(arr).forEach(System.out::print);
        System.out.println();
        QuickSort.quickSort(arr);
        Arrays.stream(arr).forEach(System.out::print);
    }

}
</code></pre>