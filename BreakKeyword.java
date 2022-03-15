package Milestone1;

public class BreakKeyword {

	public static void main(String[] args) {
		int i=1;
		int n=4;
		
		for(i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i == 3){
					//return;
					break;
					
				}
				System.out.println(i);
			}
		}
		
//		for(i=1;i<=n;i++) {
//			if(i==4){
//				break;
//			}
//			System.out.println(i);
//		}
//		System.out.println("outside for loop");
	}

}
