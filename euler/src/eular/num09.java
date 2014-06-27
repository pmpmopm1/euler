package eular;

public class num09 {

	/**
	 * @작성일         : 2014. 6. 20.
	 * @작성자         : HeoMinWook
	 * @Method 설명    :
	 * 세 자연수 a, b, c 가 피타고라스 정리 a2 + b2 = c2 를 만족하면 피타고라스 수라고 부릅니다 (여기서 a < b < c ).
       예를 들면 32 + 42 = 9 + 16 = 25 = 52이므로 3, 4, 5는 피타고라스 수입니다.
       a + b + c = 1000 인 피타고라스 수 a, b, c는 한 가지 뿐입니다. 이 때, a × b × c 는 얼마입니까?
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1, j=1, k=1;

		for(i = 1 ; i<=998 ; i++){
			for(j = 2; j<=998-j ; j++){
				k = 1000-i-j;
				if(i*i + j*j == k*k && i<j){
					System.out.println("i, j, k = " + i+", "+j+", "+k+"  - 곱 : "+i*j*k);
				}
			}
		}
	}
}
