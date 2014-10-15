package dih;

public class Solution11 {

	/**
	 * @Method Name    : main
	 * @작성일         : 2014. 10. 15.
	 * @작성자         : HeoMinWook
	 * @Method 설명    :
	 *N개의 정수가 주어졌을 때 그 차가 K인 정수 쌍의 수를 구하시오 

	입력
	첫째 줄에 N, K를 입력받는다. (스페이스로 구분) 
	두번째 줄부터 N개의 정수를 입력받는다. 단, 모든 정수는 그 값이 서로 달라야 한다. (스페이스로 구분)
	
	출력 
	차가 K인 정수 쌍의 수를 출력한다. 
	
	제한 
	N <= 10^5
	0 < K < 10^9 
	각 정수는 0보다 크고 2^31 - 1 보다 작다. 
	
	예제 입력 #1
	5 2 
	1 5 3 4 2 
	
	예제 출력 #1
	3
	
	예제 입력 #2
	10 1 
	363374326 364147530 61825163 1073065718 1281246024 1399469912 428047635 491595254 879792181 1069262793 
	
	예제 출력 #2
	0
	
	Advanced
	
	이 문제는 위에서 풀었던 문제와 동일하다. 
	단 아래의 조건을 추가한다. 
	
	N개의 정수를 입력받았을 때 각각의 차가 K인것을 체크하려면 N^2의 비교가 필요하고 N이 커질수록 처리속도가 급격히 증가하게 된다. 
	이를 해결하기 위해 Time Complecity가 O(N log N)이거나 이보다 효율적으로 구현하도록 한다. Hint) 이진 트리 검색나 해쉬테이블을 이용. 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
