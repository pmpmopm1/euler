package dih;

public class Solution10 {

	/**
	 * @Method Name    : main
	 * @작성일         : 2014. 10. 15.
	 * @작성자         : HeoMinWook
	 * @Method 설명    :
	 *2차원 좌표계에서 원으로 생긴 도시가 있다. 그 도시의 중심점 좌표는 (0,0)이며 정사각형 격자형 구획위에 놓여져 있다. 각 구획의 크기는 1X1이다. (모눈종위 위에 그려진 원을 생각하면 된다.) 
	이 도시에는 경찰서가 하나 있는데 도시의 원에 완전히 포함되어 있는 구획에만 영향이 미친다. 즉 원형 도시의 테두리가 걸쳐있는 구획에는 영향을 미칠 수 가 없다. 
	그래서 k개의 파출소를 건설해서 영향이 미치지 않은 곳도 보호하려고 한다. 파출소는 자신이 위치한 하나의 구역만 보호할 수 있다. 
	도시의 반지름 r과 추가할 파출소의 수 k가 주어졌을 때 도시의 모든 구획을 보호 할 수 있는지 여부를 판단하는 프로그램을 작성한다. 
	
	입력 
	첫번째 줄에 테스트 케이스의 수 t를 입력받는다. 
	다음 줄 한줄에 r과 k를 스페이스로 구분해서 입력받는다. 
	
	제한 
	1 <= t <= 10^3 
	1 <= r <= 2 * 10 ^ 9 
	0 <= r <= 2 * 10 ^ 9 
	
	출력 
	각각의 테스트 케이스에 대해서 모든 구획을 보호 가능하면 "possible"을 출력, 그렇지 않으면 "impossible"을 출력 
	
	입력 예제 #1
	5
	1 3
	1 4
	4 4
	25 11
	25 12
	
	출력 예제 #1
	impossible
	possible
	possible
	impossible
	possible 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
