package ch10;

public class TypeConversionTest {

	public static void main(String[] args) {
//			byte bNum = 125;
//			int iNum=bNum;
//			
//			int iNum2 = 255;
//			byte bNum2= (byte)iNum2;
//			//255는 한 바이트로 표현될 수 없는 range의 값.  결과값이 이상하게 나옴. 
//			
//			System.out.println(bNum2);
//			
//			double dNum = 3.14;
//			int inum = (int)dNum;
//			
//			System.out.println(inum);
//			
		double dNum = 1.2;
		float fNum = 0.9F;
		
		int iNum1 = (int)dNum + (int)fNum;
		int iNum2 = (int)(dNum + fNum);
		float dNum2 = (float)dNum+ fNum;
		System.out.println(iNum1);
		System.out.println(iNum2);
		System.out.println(dNum2);
	}

}
