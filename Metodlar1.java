
public class Metodlar1 {

	public static void main(String[] args) {
		sayiBulmaca();
	}
	
	public static void sayiBulmaca() {
		int[] sayilar = new int[] {1,3,7,8,10};
		int aranacak = 10;
		boolean varMi = false;
		for (int sayi : sayilar) {
			if(sayi==aranacak) {
				varMi = true;
				break;
			}
		}
		
		if(varMi) {
			mesajVer("Sayi mevcuttur :" + aranacak);
		}else {
			mesajVer("Sayı mevcut değildir: " + aranacak);
		}
 	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
