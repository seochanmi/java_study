package test.main;

public class MainClass01 {
	public static void main(String[] args) {
		// int type 5 개를 저장하고 있는 배열 객체 생성해서 참조값을 nums 라는 지역 변수에 담기
		int[] nums = {10, 20, 30, 40 , 50};
		// double type 5 개를 저장하고 있는 배열 객체 생성해서 참조값을 nums2 라는 지역 변수에 담아 보세요
		double[] nums2 = {1.5, 2.3, 3.3, 4.5, 8.9};
		// boolean type 5 개를 저장하고 있는 배열
		boolean[] truth = {true, false, true, false, false};
		// String type (참조데이터 type) 5개를 저장하고 있는 배열
		String[] names = {"오징어","강아지","고양이","물","우유"};
		//배열 객체의 복제본 얻어내기
		int[] result=nums.clone(); //클론:다른물건을 쓰는데 안에 저장된 내용은 같음
		int[] result2=nums;//참조값만 복사해줌. 사물함에 넣어두고 키 값만 넣어두는 것이다. 같은 물건을 같이 쓴다
		
		//배열의 크기 얻어내기
		int size=nums.length;
		//배열은 순서가 있는 데이터 이다. 특정 index 의 item 참조하는 방법
		int first=nums[0];
		int second=nums[1];
		int third=nums[2];
	}
}
